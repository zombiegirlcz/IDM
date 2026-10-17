package rr0;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private i() {
    }

    public static void a(View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    public static void b(View view, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.measure(ViewGroup.getChildMeasureSpec(i, i3, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, i5, view.getLayoutParams().height));
    }

    public static int c(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                return View.MeasureSpec.getSize(i);
            }
            if (i2 != -2) {
                if (i2 != -1) {
                    return Math.min(i3, i2);
                }
                Integer numValueOf = Integer.valueOf(i3);
                if (i3 == Integer.MAX_VALUE) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
            }
        } else if (i2 != -2) {
            return i2 != -1 ? Math.min(View.MeasureSpec.getSize(i), i2) : Math.min(View.MeasureSpec.getSize(i), i3);
        }
        return -1;
    }

    public static int d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.getSize(i);
        }
        return Integer.MAX_VALUE;
    }
}
