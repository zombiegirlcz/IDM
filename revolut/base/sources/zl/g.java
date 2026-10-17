package zl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends b {
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f323142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f323143h;
    public yl.b i;

    @Override // zl.b
    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final ValueAnimator d(int i, int i2, long j2, f fVar) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.addUpdateListener(new d(this, fVar));
        return valueAnimatorOfInt;
    }
}
