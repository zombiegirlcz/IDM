package dr0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarSelectorDrawable;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingBottomBarSelectorDrawable f117058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f117059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ValueAnimator valueAnimator, FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable, int i) {
        super(valueAnimator);
        this.f117058b = floatingBottomBarSelectorDrawable;
        this.f117059c = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f117058b.v = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = this.f117058b;
        if (floatingBottomBarSelectorDrawable.v) {
            return;
        }
        floatingBottomBarSelectorDrawable.e.set(floatingBottomBarSelectorDrawable.f55978g);
        floatingBottomBarSelectorDrawable.f55988t = this.f117059c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        float interpolation = jq0.r.f177393b.getInterpolation(animatedFraction);
        FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = this.f117058b;
        RectF rectF = floatingBottomBarSelectorDrawable.f55979h;
        RectF rectF2 = floatingBottomBarSelectorDrawable.f;
        float f = rectF2.left;
        RectF rectF3 = floatingBottomBarSelectorDrawable.f55978g;
        rectF.set(i1.b(f, rectF3.left, interpolation), i1.b(rectF2.top, rectF3.top, interpolation), i1.b(rectF2.right, rectF3.right, interpolation), i1.b(rectF2.bottom, rectF3.bottom, interpolation));
        float fA = FloatingBottomBarSelectorDrawable.a(floatingBottomBarSelectorDrawable, animatedFraction, floatingBottomBarSelectorDrawable.f55985q);
        rectF.inset(((1.0f - fA) * rectF.width()) / 2.0f, ((1.0f - FloatingBottomBarSelectorDrawable.a(floatingBottomBarSelectorDrawable, animatedFraction, floatingBottomBarSelectorDrawable.f55986r)) * rectF.height()) / 2.0f);
        floatingBottomBarSelectorDrawable.invalidateSelf();
    }
}
