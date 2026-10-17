package b01;

import a0.d;
import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.TextDrawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z3 = Intrinsics.k(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        int iT = d0.T(string, " ", 0, false, 6);
        if (iT <= 1) {
            return c(string);
        }
        String strC = c(string);
        String strSubstring = string.substring(iT + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return d.r(strC, c(strSubstring));
    }

    public static TextDrawable b(Context context, String text, int i, int i2, int i3, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "initials");
        TextDrawable.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        TextDrawable textDrawable = new TextDrawable(context, text, i, BitmapDescriptorFactory.HUE_RED, f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f), 0);
        if (true != textDrawable.e) {
            textDrawable.e = true;
            textDrawable.f = true;
            textDrawable.invalidateSelf();
        }
        textDrawable.f55790g = -1;
        textDrawable.f55791h = i3;
        textDrawable.invalidateSelf();
        TextDrawable.c(textDrawable, i2);
        return textDrawable;
    }

    public static String c(String str) {
        if (str.length() <= 0) {
            return "";
        }
        if (str.length() > 1 && Character.isHighSurrogate(str.charAt(0)) && Character.isLowSurrogate(str.charAt(1))) {
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }
}
