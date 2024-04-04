import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void assertSimpleQuadratic() {
        assertEquals(s.simpleQuadratic(2), 4);
        assertEquals(s.simpleQuadratic(2.5f), 6.25);
        assertEquals(s.simpleQuadratic(0), 0);
        assertEquals(s.simpleQuadratic(-2), 4);
        assertTrue(s.simpleQuadratic(-2) >= 0, "(-2)*(-2)>= 0");
        assertTrue(s.simpleQuadratic(-3) == s.simpleQuadratic(3));
    }

    /*
    @Test
    void testQuadratic() {
        if(s.simpleQuadratic(2) == 4) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    @Test
    void testQuadraticSymmetrical() {
        if(s.simpleQuadratic(-2) == s.simpleQuadratic(2)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    @Test
    void testQuadraticPositive() {
        if(s.simpleQuadratic(-2) >= 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    */
}