package mx0;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n5 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned spanned, int i3, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb6 = new StringBuilder();
        while (i < i2) {
            char cCharAt = source.charAt(i);
            byte type = (byte) Character.getType(cCharAt);
            if (type != 19 && type != 28 && type != 6) {
                sb6.append(cCharAt);
            }
            i++;
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.contentEquals(source)) {
            return null;
        }
        return string;
    }
}
