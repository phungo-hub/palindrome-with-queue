import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            Stack<Character> stack = new Stack();
            Queue<Character> queue = new LinkedList();
            String line = scanner.nextLine();

            if (line.toLowerCase().equals("quit"))
                break;

            for (int i = 0; i < line.length(); i++) {
                stack.push(line.toLowerCase().charAt(i));
            }

            for (int i = 0; i < line.length(); i++) {
                queue.add(line.toLowerCase().charAt(i));
            }

            boolean isPalindrome = true;
            while(!queue.isEmpty()) {
                if(queue.remove().equals(stack.pop()))
                    continue;
                else {
                    isPalindrome = false;
                    break;
                }

            }
            if (isPalindrome)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}