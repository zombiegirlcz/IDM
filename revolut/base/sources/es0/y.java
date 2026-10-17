package es0;

import android.animation.ValueAnimator;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes19.dex */
public final class y implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f128851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f128852c;

    public y(a0 a0Var, int i, int i2) {
        this.f128850a = i;
        this.f128851b = i2;
        this.f128852c = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a0 a0Var = this.f128852c;
        int iLerp = AnimationUtils.lerp(a0Var.f128785j, this.f128850a, animatedFraction);
        int iLerp2 = AnimationUtils.lerp(a0Var.k, this.f128851b, animatedFraction);
        if (iLerp == a0Var.f && iLerp2 == a0Var.f128783g) {
            return;
        }
        a0Var.f = iLerp;
        a0Var.f128783g = iLerp2;
        ViewCompat.postInvalidateOnAnimation(a0Var);
    }
}
