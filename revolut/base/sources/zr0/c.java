package zr0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;
import lq0.p;
import z9h.n;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f324522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f324523c;
    public final /* synthetic */ ValueAnimator d;
    public final /* synthetic */ p e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ValueAnimator valueAnimator, e eVar, p pVar, ValueAnimator valueAnimator2, p pVar2) {
        super(valueAnimator);
        this.f324522b = eVar;
        this.f324523c = pVar;
        this.d = valueAnimator2;
        this.e = pVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f324522b.d = null;
        this.f324523c.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f324522b.d = this.d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.e.b(((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }
}
