package ix0;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {
    public static void a(CharSequence charSequence, int i, int i2, ArrayList outList) {
        ForegroundColorSpan[] foregroundColorSpanArr;
        Intrinsics.checkNotNullParameter(outList, "outList");
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        ForegroundColorSpan[] foregroundColorSpanArr2 = null;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : null;
        int i3 = 0;
        if (spannableStringBuilder != null && (foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ForegroundColorSpan.class)) != null && foregroundColorSpanArr.length != 0) {
            foregroundColorSpanArr2 = foregroundColorSpanArr;
        }
        if (foregroundColorSpanArr2 == null) {
            outList.add(new mx0.t0(charSequence.toString(), i, i2));
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequence;
        int length = spannableStringBuilder2.length();
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = i;
        }
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr2) {
            int spanEnd = spannableStringBuilder2.getSpanEnd(foregroundColorSpan);
            for (int spanStart = spannableStringBuilder2.getSpanStart(foregroundColorSpan); spanStart < spanEnd; spanStart++) {
                iArr[spanStart] = foregroundColorSpan.getForegroundColor();
            }
        }
        StringBuilder sb6 = new StringBuilder();
        int i6 = 0;
        int i21 = 0;
        while (i3 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i3);
            int i22 = i21 + 1;
            int i32 = iArr[i21];
            if (i21 == 0) {
                i6 = i32;
            } else if (i32 != i6) {
                String string = sb6.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                outList.add(new mx0.t0(string, i6, i2));
                kotlin.text.w.g(sb6);
                i6 = i32;
            }
            sb6.append(cCharAt);
            i3++;
            i21 = i22;
        }
        String string2 = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        outList.add(new mx0.t0(string2, i6, i2));
    }
}
