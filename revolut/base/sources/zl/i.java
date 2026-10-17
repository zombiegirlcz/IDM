package zl;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import dki.w;

/* JADX INFO: loaded from: classes17.dex */
public class i extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f323146h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yl.d f323147j;

    public i(uc.d dVar) {
        super(dVar);
        this.f323147j = new yl.d();
    }

    @Override // zl.c, zl.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new w(this, 4));
        return valueAnimator;
    }

    public PropertyValuesHolder g(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.f323146h;
            i = (int) (i2 * this.i);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.f323146h;
            i2 = (int) (i * this.i);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    public final void h(float f, int i, int i2, int i3) {
        if (this.f323137c != null) {
            if (this.e == i && this.f == i2 && this.f323146h == i3 && this.i == f) {
                return;
            }
            this.e = i;
            this.f = i2;
            this.f323146h = i3;
            this.i = f;
            ((ValueAnimator) this.f323137c).setValues(e(false), e(true), g(false), g(true));
        }
    }
}
