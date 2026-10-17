package uz;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f284531b;

    public /* synthetic */ k(m mVar, int i) {
        this.f284530a = i;
        this.f284531b = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        switch (this.f284530a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                Object animatedValue = animator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                if (num != null) {
                    int iIntValue = num.intValue();
                    m mVar = this.f284531b;
                    mVar.D = iIntValue;
                    mVar.f284535w.invalidate();
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                Object animatedValue2 = animator.getAnimatedValue();
                Integer num2 = animatedValue2 instanceof Integer ? (Integer) animatedValue2 : null;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    m mVar2 = this.f284531b;
                    mVar2.E = iIntValue2;
                    mVar2.f284535w.invalidate();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.f284531b.F = animator.getAnimatedFraction();
                break;
        }
    }
}
