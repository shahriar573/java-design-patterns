public class Calculator {
    public int add(int a, int b) {
        System.out.println("Adding numbers in MAIN branch");
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("Subtracting numbers in MAIN branch");
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
