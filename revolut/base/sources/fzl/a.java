package fzl;

import android.graphics.Color;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static final boolean a(int i) {
        return Math.sqrt((((double) (Color.blue(i) * Color.blue(i))) * 0.068d) + ((((double) (Color.green(i) * Color.green(i))) * 0.691d) + (((double) (Color.red(i) * Color.red(i))) * 0.241d))) > 130.0d;
    }
}
