import java.util.ArrayList;

/**
 * Representation of a location on the playing table.
 */
public interface Location
{
    void place(Card c);
    void remove();
    boolean isEmpty();
    Card peek();
    ArrayList<Card> getStackToMove(Card currCard);
}
