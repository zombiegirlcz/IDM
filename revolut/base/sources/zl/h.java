package zl;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import dki.w;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yl.c f323144h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f323145j;

    @Override // zl.c, zl.b
    /* JADX INFO: renamed from: d */
    public final ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new w(this, 3));
        return valueAnimator;
    }

    public final PropertyValuesHolder g(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.i;
            i = i2 / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i = this.i;
            i2 = i / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    public final PropertyValuesHolder h(boolean z) {
        int i;
        String str;
        int i2 = 0;
        if (z) {
            str = "ANIMATION_STROKE_REVERSE";
            i2 = this.i;
            i = 0;
        } else {
            i = this.i;
            str = "ANIMATION_STROKE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }
}
