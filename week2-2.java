import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> colorMeanings = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        
        colorMeanings.put("Red", "Symbolizes passion, energy, and love.");
        colorMeanings.put("Blue", "Represents calmness, stability, and wisdom.");
        colorMeanings.put("Green", "Signifies growth, harmony, and freshness.");
        colorMeanings.put("Yellow", "Denotes happiness, optimism, and creativity.");
        colorMeanings.put("Black", "Represents mystery, elegance, and power.");
        colorMeanings.put("White", "Symbolizes purity, simplicity, and peace.");

        System.out.println("Welcome to the Color Meaning Checker!");
        while (true) {
            System.out.print("Enter a color name (or 'exit' to stop): ");
            String color = scanner.nextLine().trim();

            if (color.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the application. Have a colorful day!");
                break;
            } else if (color.equalsIgnoreCase("list")) {
                System.out.println("Available colors: " + colorMeanings.keySet());
            } else if (colorMeanings.containsKey(color)) {
                System.out.println(color + " - " + colorMeanings.get(color));
            } else {
                System.out.print("Color not found. Would you like to add a meaning for it? (yes/no): ");
                String response = scanner.nextLine().trim();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.print("Enter the meaning for " + color + ": ");
                    String meaning = scanner.nextLine().trim();
                    colorMeanings.put(color, meaning);
                    System.out.println("New color meaning added!");
                }
            }
        }

        scanner.close();
    }
}