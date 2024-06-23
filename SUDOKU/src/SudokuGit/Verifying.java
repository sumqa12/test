package SudokuGit;
import java.util.ArrayList;
public class Verifying {
	
	public boolean Verifying(ArrayList<String> str1, ArrayList<String> str2) {
		showBoard(str2, 1);
		showBoard(str1, 2);
		for(int i = 0;i < 81;i++) {
		if(!(str1.get(i).equals(str2.get(i)))) {
				System.out.println("残念！");
				return false;
			}
		}
		System.out.println("おめでとう！");
		return true;
	}
	private void showBoard(ArrayList<String> board, int c) {
		if(c == 1) {
		System.out.println("あなた");
		}else {
			System.out.println("答え");
		}
		int n = 1;
		for(int i = 0;i < 81;i++) {
			System.out.print(board.get(i) + "  ");
			if(n % 9 == 0) {
				System.out.println();
			}
			n++;
		}
	}
	
}