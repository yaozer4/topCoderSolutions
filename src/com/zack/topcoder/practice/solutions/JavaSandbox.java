package com.zack.topcoder.practice.solutions;

/**
 * Created by wz39rg on 3/10/16.
 */
public class JavaSandbox {
    public static void main(String[] args) {
//        ABBA abba = new ABBA();
//		System.out.println(abba.canObtain("BBBBABABBBBBBA", "BBBBABABBABBBBBBABABBBBBBBBABAABBBAA"));
//		ANewHope aNewHope = new ANewHope();
//		System.out.println(aNewHope.count(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}, 3));
		ABoardGame aBoardGame = new ABoardGame();
		System.out.println(aBoardGame.whoWins(new String[]{"B..ABAABBB", "B.........", "A..A.AA..B", "A.BBBAA..A", "B.AAAAB...", "A..BBBBB.A", "B..ABAABBA", "A......B.B", "B......A.A", "BA.AABBB.A"}));
	}
}
