package N20DCVT038_OOP_TH2_03;
import java.util.Scanner;
public class Baitap3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        String regex = "094-[0-9]{3}-[0-9]{4}";
        if (phoneNumber.matches(regex)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }

        scanner.close();
 
	}

}
