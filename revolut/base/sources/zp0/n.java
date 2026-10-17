package zp0;

import android.text.format.DateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class n {
    private n() {
    }

    public static String a(String skeleton, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, skeleton);
        Intrinsics.checkNotNullExpressionValue(bestDateTimePattern, "getBestDateTimePattern(...)");
        StringBuilder sb6 = new StringBuilder();
        int length = bestDateTimePattern.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = bestDateTimePattern.charAt(i);
            if (d0.K("dMy" + kotlin.collections.d.b0(p.f324131q, null, 62), cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        return sb6.toString();
    }
}
