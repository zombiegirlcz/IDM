package androidx.transition;

import a41.g;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
abstract class ViewUtilsApi22 extends ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    public static class Api29Impl {
        public static void setLeftTopRightBottom(View view, int i, int i2, int i3, int i5) {
            g.k(view, i, i2, i3, i5);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setLeftTopRightBottom(View view, int i, int i2, int i3, int i5) {
        if (sTryHiddenSetLeftTopRightBottom) {
            try {
                Api29Impl.setLeftTopRightBottom(view, i, i2, i3, i5);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetLeftTopRightBottom = false;
            }
        }
    }
}
