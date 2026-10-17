package zl;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import dki.w;

/* JADX INFO: loaded from: classes17.dex */
public class c extends b {
    public final /* synthetic */ int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xl.a f323138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(uc.d dVar, int i) {
        super(dVar);
        this.d = i;
    }

    @Override // zl.b
    public Animator a() {
        switch (this.d) {
            case 0:
                return a();
            case 1:
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimator.addUpdateListener(new w(this, 5));
                return valueAnimator;
            default:
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setDuration(350L);
                valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimator2.addUpdateListener(new w(this, 6));
                return valueAnimator2;
        }
    }

    /* JADX INFO: renamed from: d */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new w(this, 2));
        return valueAnimator;
    }

    public PropertyValuesHolder e(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = this.f;
            i2 = this.e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.e;
            i2 = this.f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new ArgbEvaluator());
        return propertyValuesHolderOfInt;
    }

    public b f(float f) {
        Animator animator = this.f323137c;
        if (animator != null) {
            long j2 = (long) (f * this.f323135a);
            if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) this.f323137c).getValues().length > 0) {
                ((ValueAnimator) this.f323137c).setCurrentPlayTime(j2);
            }
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uc.d dVar) {
        super(dVar);
        this.d = 0;
        this.f323138g = new yl.a();
    }
}
