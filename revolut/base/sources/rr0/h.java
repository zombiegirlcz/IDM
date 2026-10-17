package rr0;

import android.graphics.Color;

/* JADX INFO: loaded from: classes19.dex */
public final class h {
    private h() {
    }

    public static double a(double d) {
        return Math.min(Math.max(d <= 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d), 0.0d), 1.0d);
    }

    public static double b(int i) {
        double dA = a(((double) Color.red(i)) / 255.0d);
        double dA2 = a(((double) Color.green(i)) / 255.0d) * 0.7152d;
        return (a(((double) Color.blue(i)) / 255.0d) * 0.0722d) + dA2 + (dA * 0.2126d);
    }
}
