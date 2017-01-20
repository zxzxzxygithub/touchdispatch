package instantrun.test.com.touchdispatchtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.lang.ref.SoftReference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLinearLayout myLinearLayout = (MyLinearLayout) findViewById(R.id.activity_main);
        myLinearLayout.requestDisallowInterceptTouchEvent(true);
        SoftReference<MainActivity> softReference = new SoftReference<MainActivity>(this);
        MainActivity mainActivity = softReference.get();
        if (mainActivity == null) {
            Toast.makeText(mainActivity, "activity is null", Toast.LENGTH_SHORT).show();
        }
    }

    public void hehe(View view) {
        Toast.makeText(this, "click button", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(this, "activity handlel ontouchevent", Toast.LENGTH_SHORT).show();
        return super.onTouchEvent(event);
    }
}
