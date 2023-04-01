public class Calculator {
    public static void main(String[] args) {
        final int a = Integer.parseInt(args[0]);
        final String operator = args[1];
        final int b = Integer.parseInt(args[2]);
        
        final int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Неизвестный оператор");
        };
        
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}
