package zl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import ip0.z50;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class m extends b {
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f323151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yl.h f323152h;

    public m(uc.d dVar) {
        super(dVar);
        this.f323152h = new yl.h();
    }

    @Override // zl.b
    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final z50 d(boolean z) {
        int i;
        int i2;
        int i3;
        int i5;
        if (z) {
            int i6 = this.d;
            int i21 = this.f;
            i = i6 + i21;
            int i22 = this.e;
            i2 = i22 + i21;
            i3 = i6 - i21;
            i5 = i22 - i21;
        } else {
            int i32 = this.d;
            int i33 = this.f;
            i = i32 - i33;
            int i43 = this.e;
            i2 = i43 - i33;
            i3 = i32 + i33;
            i5 = i43 + i33;
        }
        return new z50(i, i2, i3, i5);
    }

    public final ValueAnimator e(int i, int i2, long j2, boolean z, yl.h hVar) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.addUpdateListener(new l(this, hVar, z));
        return valueAnimatorOfInt;
    }

    public m f(float f) {
        Animator animator = this.f323137c;
        if (animator != null) {
            long j2 = (long) (f * this.f323135a);
            Iterator<Animator> it8 = ((AnimatorSet) animator).getChildAnimations().iterator();
            while (it8.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it8.next();
                long duration = valueAnimator.getDuration();
                if (j2 <= duration) {
                    duration = j2;
                }
                valueAnimator.setCurrentPlayTime(duration);
                j2 -= duration;
            }
        }
        return this;
    }
}
