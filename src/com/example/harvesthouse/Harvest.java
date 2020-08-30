package com.example.harvesthouse;



import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Harvest extends Activity {
Animation topAnim,bottomAnim;
ImageView image;
TextView logo;
TextView slogan;
private static final long SPLASH = 4000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_harvest);
		image =(ImageView)findViewById(R.id.imageView1);
		logo =(TextView)findViewById(R.id.textView2);
		slogan =(TextView)findViewById(R.id.textView3);
		topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
	 bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
				//Set animation to elements 
	image.setAnimation(topAnim);
    logo.setAnimation(topAnim);
	slogan.setAnimation(bottomAnim);
	new Handler().postDelayed(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Intent launch=new Intent(Harvest.this,Page.class);
			startActivity(launch);
			
			finish();
			
		}
		
	}, SPLASH);	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_harvest, menu);
		return true;
	}

}
