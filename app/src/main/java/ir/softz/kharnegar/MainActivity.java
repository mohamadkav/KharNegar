package ir.softz.kharnegar;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GifMovieView gif1 = (GifMovieView) findViewById(R.id.gif1);
        gif1.setMovieResource(R.drawable.gif_heart);
//        float scale = 0.5f;
//        gif1.setPivotX(50);
//        gif1.setPivotY(50);
//        gif1.setScaleX(gif1.getScaleX() + scale);
//        gif1.setScaleY(gif1.getScaleY() + scale);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

//    public void onGifClick(View v) {
//        GifMovieView gif = (GifMovieView) v;
//        gif.setPaused(!gif.isPaused());
//    }

}
