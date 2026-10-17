package androidx.media3.common.text;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SpanUtil {
    public static void addInheritedRelativeSizeSpan(Spannable spannable, float f, int i, int i2, int i3) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i2, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i2) {
                f = relativeSizeSpan.getSizeChange() * f;
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, i, i2, i3);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i, i2, i3);
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj2, int i, int i2, int i3) {
        for (Object obj3 : spannable.getSpans(i, i2, obj2.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj3, i, i2, i3);
        }
        spannable.setSpan(obj2, i, i2, i3);
    }

    private static void removeIfStartEndAndFlagsMatch(Spannable spannable, Object obj2, int i, int i2, int i3) {
        if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
            spannable.removeSpan(obj2);
        }
    }
}
