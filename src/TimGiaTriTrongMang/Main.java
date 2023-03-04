package TimGiaTriTrongMang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Hồng", "Long", "Minh", "thu", "Hà"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh: ");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("tên học sinh là: " + input_name + "ở vị trí thứ: " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not Found:" + input_name + "in the list");
        }
    }
}