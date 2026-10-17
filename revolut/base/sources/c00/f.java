package c00;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f {
    public static h a(int i, int i2, int i3, int i5, int i6) {
        int i21 = (i6 / 90) % 4;
        boolean z = i21 == 1;
        boolean z3 = i21 == 3;
        int i22 = (z3 || z) ? i5 : i3;
        if (!z3 && !z) {
            i3 = i5;
        }
        int i32 = i3 > i22 ? i2 : (int) (i / ((i22 * 1.0f) / i3));
        if (i3 > i22) {
            i = (int) (i2 / ((i3 * 1.0f) / i22));
        }
        return new h(i32, i);
    }

    public static Rect b(Rect rect, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new Rect(i == i3 ? rect.left : ((i3 - i) / 2) + rect.left, i2 == i5 ? rect.top : ((i5 - i2) / 2) + rect.top, i == i3 ? rect.right : rect.right + ((i3 - i) / 2), i2 == i5 ? rect.bottom : rect.bottom + ((i5 - i2) / 2));
    }
}
