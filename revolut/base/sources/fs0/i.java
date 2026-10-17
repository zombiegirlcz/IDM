package fs0;

import android.text.Spannable;
import ix0.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private i() {
    }

    public static void a(Spannable spannable) {
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        b0[] b0VarArr = (b0[]) spannable.getSpans(0, spannable.length(), b0.class);
        Intrinsics.h(b0VarArr);
        for (b0 b0Var : b0VarArr) {
            if (b0Var.i != 1.0f) {
                b0Var.b(3, null, spannable, true);
            }
        }
    }

    public static int b(Spannable spannable, int i) {
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        for (uy0.a aVar : (uy0.a[]) spannable.getSpans(i, Math.min(i + 1, spannable.length()), uy0.a.class)) {
            int spanStart = spannable.getSpanStart(aVar);
            int spanEnd = spannable.getSpanEnd(aVar);
            if (i >= spanStart && i < spanEnd) {
                return spanEnd;
            }
        }
        return i;
    }

    public static void c(Spannable spannable, int i, int i2, int[] out) {
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        Intrinsics.checkNotNullParameter(out, "out");
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        uy0.a[] aVarArr = (uy0.a[]) spannable.getSpans(iMin, iMax, uy0.a.class);
        int length = aVarArr.length;
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (i3 >= length) {
                break;
            }
            uy0.a aVar = aVarArr[i3];
            int spanStart = spannable.getSpanStart(aVar);
            int spanEnd = spannable.getSpanEnd(aVar);
            if (iMin > spanStart && iMax <= spanEnd) {
                iMax = Math.min(spanEnd + 1, spannable.length());
                z = true;
                iMin = spanEnd;
                break;
            }
            if (iMin > spanStart && iMin <= spanEnd) {
                z = true;
                iMin = spanStart;
            }
            if (iMax >= spanStart && iMax < spanEnd) {
                z = true;
                iMax = spanEnd;
            }
            i3++;
        }
        if (z) {
            out[0] = Math.max(0, iMin);
            out[1] = Math.min(spannable.length(), iMax);
        } else {
            out[0] = Math.min(i, i2);
            out[1] = Math.max(i, i2);
        }
    }
}
