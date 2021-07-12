package rockpaperscissors;

import java.util.Random;

public class RPSGame {

	private Random rand = new Random();

	public RockPaperScissors call(RockPaperScissors call) {
		int rng = rand.nextInt(90);

		RockPaperScissors result = null;
		if (rng < 30) {
			result = RockPaperScissors.ROCK;
		} else if (rng < 60) {
			result = RockPaperScissors.PAPER;
		} else {
			result = RockPaperScissors.SCISSORS;
		}

		System.out.println("You called " + call + " and I called " + result + "!");
		if (call == RockPaperScissors.ROCK && result == RockPaperScissors.SCISSORS) {
			System.out.println("YOU WIN! \nYour ROCK blunts my SCISSORS");
		} else if (call == RockPaperScissors.ROCK && result == RockPaperScissors.ROCK) {
			System.out.println("DRAW! \nYour ROCK cancels out my ROCK!");
		} else if (call == RockPaperScissors.ROCK && result == RockPaperScissors.PAPER) {
			System.out.println("YOU LOSE! \nMy PAPER wraps your ROCK!");
		} else if (call == RockPaperScissors.PAPER && result == RockPaperScissors.ROCK) {
			System.out.println("YOU WIN! \nYour PAPER wraps my ROCK!");
		} else if (call == RockPaperScissors.PAPER && result == RockPaperScissors.PAPER) {
			System.out.println("DRAW! \nYour PAPER cancels out my PAPER!");
		} else if (call == RockPaperScissors.PAPER && result == RockPaperScissors.SCISSORS) {
			System.out.println("YOU LOSE! \nMy SCISSORS cut your PAPER!");
		} else if (call == RockPaperScissors.SCISSORS && result == RockPaperScissors.ROCK) {
			System.out.println("YOU LOSE! \nMy ROCK blunts your SCISSORS!");
		} else if (call == RockPaperScissors.SCISSORS && result == RockPaperScissors.SCISSORS) {
			System.out.println("DRAW! \nYours SCISSORS cancel out my SCISSORS!");
		} else if (call == RockPaperScissors.SCISSORS && result == RockPaperScissors.PAPER) {
			System.out.println("YOU WIN! \nYour SCISSORS cut my PAPER!");
		} else {
			System.out.println("Dude, what's up with your hand?");
		}

		return result;

	}

}
