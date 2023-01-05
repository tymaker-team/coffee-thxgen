import java.util.Scanner;

public class Thxgen {
  public static void main(String[] args) {
    System.out.println("CoffeeThxgen by aarikpokras (That's me!)");
    System.out.println("On any of these questions, \033[1;31mplease\033[0m do not include a/an.");
    Scanner one = new Scanner(System.in);
    System.out.println("Who are you writing to?");
    String oneOut = one.nextLine();
    Scanner two = new Scanner(System.in);
    System.out.println("What gift did you get from " + oneOut + "? e.g.: 'shirt'");
    String twoOut = two.nextLine();
    Scanner three = new Scanner(System.in);
    System.out.println("What kind of party did you invite " + oneOut + " to? e.g.: birthday");
    String threeOut = three.nextLine();
    Scanner four = new Scanner(System.in);
    System.out.println("What is your name?");
    String fourOut = four.nextLine();
    Scanner five = new Scanner(System.in);
    System.out.println("What is " + oneOut + " to you? e.g.: friend");
    String fiveOut = five.nextLine();
    Scanner six = new Scanner(System.in);
    System.out.println("How would you describe your " + fiveOut + " " + oneOut + "? e.g.: unbelievable");
    String sixOut = six.nextLine();
    Scanner sev = new Scanner(System.in);
    System.out.println("What do you like doing with " + oneOut + "? e.g.: playing Chess");
    String sevOut = sev.nextLine();
    Scanner ent = new Scanner(System.in);
    System.out.println("Here is your letter so far. Press enter.");
    String forget = ent.nextLine();
    System.out.println("\033[1;31mDear " + oneOut + ",\r\nThank you so much for getting me my " + twoOut + "! Thank you for coming to my " + threeOut + "! I enjoy " + sevOut + " with you. You are a " + sixOut + " " + fiveOut + "!\r\nFrom,\r\n" + fourOut + "\033[0m");
    Scanner fyorn = new Scanner(System.in);
    System.out.println("Do you like your letter so far? (y/n)");
    String fyornReadable = fyorn.nextLine();
    if (fyornReadable.equals("y")) {
      System.out.println("Thank you!");
    }
    if (fyornReadable.equals("n")) {
      System.out.println("Welp, sorry.");
    }
}
}
