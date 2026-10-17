package androidx.media3.ui;

import android.graphics.Color;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes15.dex */
abstract class HtmlUtils {
    public static String cssAllClassDescendantsSelector(String str) {
        return j6.a.s(".", str, ",.", str, " *");
    }

    public static String toCssRgba(int i) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }
}
