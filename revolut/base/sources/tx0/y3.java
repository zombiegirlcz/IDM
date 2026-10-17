package tx0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class y3 extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithToolbar f275279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f275280c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(ValueAnimator valueAnimator, NavBarWithToolbar navBarWithToolbar, float f, boolean z) {
        super(valueAnimator);
        this.f275279b = navBarWithToolbar;
        this.f275280c = f;
        this.d = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        float f = this.f275280c;
        NavBarWithToolbar navBarWithToolbar = this.f275279b;
        navBarWithToolbar.G = f;
        navBarWithToolbar.h0(this.d);
        navBarWithToolbar.g0();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        NavBarWithToolbar navBarWithToolbar = this.f275279b;
        navBarWithToolbar.getNavBarWithToolbar_toolbarTitle().setVisibility(0);
        navBarWithToolbar.getNavBarWithToolbar_toolbarTitleChained().setVisibility(0);
        navBarWithToolbar.getNavBarWithToolbar_toolbarSubtitleChained().setVisibility(0);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        NavBarWithToolbar navBarWithToolbar = this.f275279b;
        navBarWithToolbar.G = fFloatValue;
        navBarWithToolbar.g0();
    }
}
