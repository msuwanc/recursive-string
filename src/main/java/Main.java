public class Main {
    public static void main(String[] args) {
        var someString = "abcdefg";

        Main.printRecursively(someString);
        Main.reverseString(someString);
        System.out.println();
        var someNewString = Main.reverseString2(someString, "");
        System.out.println(someNewString);
        var someNewString2 = Main.reverseString3(someString);
        System.out.println(someNewString2);
    }

    public static void printRecursively(String string) {
        if(string.length() > 0) {
            System.out.println(string);

            printRecursively(string.substring(0, string.length()-1));
        }
    }

    public static void reverseString(String string) {
        if(string.length() > 0) {
            reverseString(string.substring(1));

            System.out.print(string.charAt(0));
        }
    }

    public static String reverseString2(String string, String result) {
        if(string.length() > 0) {
            result = reverseString2(string.substring(1), result);

            result = result + string.charAt(0);
        }

        return result;
    }

    public static String reverseString3(String s) {
        String result = "";
        if(s.length() > 0) {
            result = reverseString3(s.substring(1));
            result = result + s.charAt(0);
        }
        return result;
    }
}
