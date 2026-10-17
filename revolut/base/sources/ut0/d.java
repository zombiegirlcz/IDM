package ut0;

import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rr0.i;

/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ViewGroup view, int i, int i2, float f, a strategy, int i3, int i5) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        int i6 = c.f283013a[strategy.ordinal()];
        if (i6 == 1) {
            int iC = i.c(i2, view.getLayoutParams().height, i5);
            if (iC == -1) {
                ((b) view).j(i, i2);
                iC = view.getMeasuredHeight();
            }
            if (iC <= i5) {
                i5 = iC;
            }
            int iC2 = rim.d.c(i5 * f);
            if (iC2 <= i3) {
                i3 = iC2;
            }
            if (i3 > i.d(i)) {
                ((b) view).j(i, i2);
                return;
            }
            ((b) view).j(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            return;
        }
        if (i6 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int iC3 = i.c(i, view.getLayoutParams().width, i3);
        if (iC3 == -1) {
            ((b) view).j(i, i2);
            iC3 = view.getMeasuredWidth();
        }
        if (iC3 <= i3) {
            i3 = iC3;
        }
        int iC4 = rim.d.c(i3 / f);
        if (iC4 <= i5) {
            i5 = iC4;
        }
        if (i5 > i.d(i2)) {
            ((b) view).j(i, i2);
        } else {
            ((b) view).j(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        }
    }
}
