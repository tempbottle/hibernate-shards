/**
 * Copyright (C) 2007 Google Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */

package org.hibernate.shards.integration;

import org.hibernate.shards.PermutationHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * This test only exists to test the db setup/teardown functionality in the
 * base class.  Since we have multiple tests, a successful run here proves
 * that the teardown actually removes the in memory db.  If it didn't,
 * the setup for the second test would fail because the tables would already
 * exist.
 *
 * @author maxr@google.com (Max Ross)
 */
@RunWith(Parameterized.class)
public class BaseShardingIntegrationTestCasePermutedIntegrationTest extends BaseShardingIntegrationTestCase {

    public BaseShardingIntegrationTestCasePermutedIntegrationTest(final Permutation perm) {
        super(perm);
    }

    @Test
    public void testThatThing() {
    }

    @Test
    public void testThatOtherThing() {
    }

    @Parameterized.Parameters(name = "{index}: [{0}]")
    public static Iterable<Object[]> data() {
        return PermutationHelper.data();
    }
}
