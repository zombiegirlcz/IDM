package com.orhanobut.dialogplus;

import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
final class Utils {
    private Utils() {
    }

    public static void a(View view, int i, SimpleAnimationListener simpleAnimationListener) {
        HeightAnimation heightAnimation = new HeightAnimation(view, view.getHeight(), i);
        heightAnimation.setAnimationListener(simpleAnimationListener);
        heightAnimation.setDuration(200L);
        view.startAnimation(heightAnimation);
    }

    public static int b(int i, boolean z) {
        if (i == 17) {
            return z ? com.revolut.revolut.feature_fourthline_impl.R.anim.fade_in_center : com.revolut.revolut.feature_fourthline_impl.R.anim.fade_out_center;
        }
        if (i == 48) {
            return z ? com.revolut.revolut.feature_fourthline_impl.R.anim.slide_in_top : com.revolut.revolut.feature_fourthline_impl.R.anim.slide_out_top;
        }
        if (i != 80) {
            return -1;
        }
        return z ? com.revolut.revolut.feature_fourthline_impl.R.anim.slide_in_bottom : com.revolut.revolut.feature_fourthline_impl.R.anim.slide_out_bottom;
    }
}
