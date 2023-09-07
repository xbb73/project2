

import java.awt.Color;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class BlackPlagueCritterRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(15,15));
		world.add(new Location(0,0), new BlackPlagueCritter());world.add(new Location(1,1), new BlackPlagueCritter());
		world.add(new Location(3,1), new Rock(Color.WHITE));
		Actor red = new Actor();
		red.setColor(Color.RED);
		world.add(new Location(0,9), new Actor());
		world.add(new Location(2,7), red);
		world.add(new Location(2,10), new Flower(Color.RED));
		world.add(new Location(3,4), new Rock(Color.BLACK));
        world.add(new Location(12,0), new Rock(Color.PINK));
		world.add(new Location(6,5), new Bug(Color.YELLOW));
		
		world.show(); 
	}
}