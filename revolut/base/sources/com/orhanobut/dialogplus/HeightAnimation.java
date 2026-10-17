package com.orhanobut.dialogplus;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes17.dex */
class HeightAnimation extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f50246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50247c;

    public HeightAnimation(View view, int i, int i2) {
        this.f50246b = view;
        this.f50245a = i;
        this.f50247c = i2 - i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        View view = this.f50246b;
        view.getLayoutParams().height = (int) ((this.f50247c * f) + this.f50245a);
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
