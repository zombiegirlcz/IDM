package c90;

import android.content.Context;
import android.graphics.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Integer a(String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        if (color.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(color));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
