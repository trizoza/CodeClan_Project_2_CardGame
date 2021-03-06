package example.codeclan.com.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/01/2017.
 */
public class BlackJackGameTest {

    BlackJackGame game;

    @Before
    public void before() {
        game = new BlackJackGame();
    }

    @Test
    public void canSetUpGame() {
        assertEquals(2, game.numOfPlayers());
        assertEquals(2, game.getPlayers().get(0).bjCardCount());
        assertEquals(48, game.getDeck().cardCount());
    }

}