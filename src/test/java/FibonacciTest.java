
import org.example.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FibonacciTest {

    @Test
    void testThat0InputHandledCorrectly() {
        long actual = new Fibonacci().fibonacci(1);
        Assertions.assertEquals(1,actual);
    }

    @Test
    void testThat1InputHandledCorrectly() {
        long actual = new Fibonacci().fibonacci(2);
        Assertions.assertEquals(1,actual);
    }

    @Test
    void testThat2InputHandledCorrectly() {
        long actual = new Fibonacci().fibonacci(3);
        Assertions.assertEquals(2,actual);
    }

    @Test
    void testThat5InputHandledCorrectly() {
        long actual = new Fibonacci().fibonacci(5);
        Assertions.assertEquals(5,actual);
    }

    @Test
    void testThat6InputHandledCorrectly() {
        long actual = new Fibonacci().fibonacci(6);
        Assertions.assertEquals(8,actual);
    }
}