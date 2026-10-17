package zl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes17.dex */
public final class k extends m {
    public yl.g i;

    @Override // zl.m
    public final /* bridge */ /* synthetic */ m f(float f) {
        g(f);
        return this;
    }

    public final void g(float f) {
        Animator animator = this.f323137c;
        if (animator != null) {
            long j2 = (long) (f * this.f323135a);
            int size = ((AnimatorSet) animator).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.f323137c).getChildAnimations().get(i);
                long startDelay = j2 - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
    }
}
