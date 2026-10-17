package oq0;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OvershootInterpolator f227697a = new OvershootInterpolator();

    private a() {
    }

    public static AnimationSet a() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(f227697a);
        animationSet.setDuration(200L);
        animationSet.addAnimation(new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f));
        animationSet.addAnimation(new ScaleAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1, 0.5f, 1, 0.5f));
        return animationSet;
    }

    public static AnimationSet b() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(f227697a);
        animationSet.setDuration(200L);
        animationSet.addAnimation(new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED));
        animationSet.addAnimation(new ScaleAnimation(1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1, 0.5f, 1, 0.5f));
        return animationSet;
    }
}
