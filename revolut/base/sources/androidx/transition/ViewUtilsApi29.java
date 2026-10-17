package androidx.transition;

import a41.g;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
class ViewUtilsApi29 extends ViewUtilsApi23 {
    @Override // androidx.transition.ViewUtilsApi19
    public float getTransitionAlpha(View view) {
        return g.a(view);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void setAnimationMatrix(View view, Matrix matrix) {
        g.v(view, matrix);
    }

    @Override // androidx.transition.ViewUtilsApi22, androidx.transition.ViewUtilsApi19
    public void setLeftTopRightBottom(View view, int i, int i2, int i3, int i5) {
        g.k(view, i, i2, i3, i5);
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setTransitionAlpha(View view, float f) {
        g.j(view, f);
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsApi19
    public void setTransitionVisibility(View view, int i) {
        g.h(i, view);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void transformMatrixToGlobal(View view, Matrix matrix) {
        g.l(view, matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void transformMatrixToLocal(View view, Matrix matrix) {
        g.A(view, matrix);
    }
}
