package aam;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ WindowInsetsAnimation.Bounds h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation i(int i, Interpolator interpolator, long j2) {
        return new WindowInsetsAnimation(i, interpolator, j2);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation j(Object obj2) {
        return (WindowInsetsAnimation) obj2;
    }

    public static /* synthetic */ void m() {
    }
}
