package iuh;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static boolean a(Integer num, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String string = d0.F0(text).toString();
        if (string.length() > 0) {
            return string.length() <= (num != null ? num.intValue() : Integer.MAX_VALUE);
        }
        return false;
    }
}
