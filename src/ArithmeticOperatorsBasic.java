public class ArithmeticOperatorsBasic {
    public static void main(String[] args) {
        int a = 17, b = 5;
        System.out.println("=== Arithmetic Operators Demo ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition       : " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction    : " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication : " + a + " * " + b + " = " + (a * b));
        System.out.println("Division       : " + a + " / " + b + " = " + (a / b) + " (integer division)");
        System.out.println("Modulus        : " + a + " % " + b + " = " + (a % b) + " (remainder)");
        System.out.println("Float division : " + a + " / " + b + " = " + ((double) a / b));

        // Increment / decrement
        int x = 10;
        System.out.println("\nBefore: x = " + x);
        System.out.println("x++ (post) = " + x++);
        System.out.println("After x++  = " + x);
        System.out.println("++x (pre)  = " + ++x);

        // Compound assignment
        int n = 100;
        n += 25;  System.out.println("\nn += 25 → " + n);
        n -= 10;  System.out.println("n -= 10 → " + n);
        n *= 2;   System.out.println("n *= 2  → " + n);
        n /= 3;   System.out.println("n /= 3  → " + n);
        n %= 7;   System.out.println("n %= 7  → " + n);

        // Real example: bill split
        double total = 127.50;
        int people   = 4;
        double each  = total / people;
        int tip      = (int)(total * 0.10);
        System.out.printf("%nBill: $%.2f | People: %d | Each: $%.2f | Tip: $%d%n",
            total, people, each, tip);
    }
}
