package et0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f129016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f129017c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f129018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ValueAnimator valueAnimator, float f, e eVar, float f4, float f5, float f6, float f32) {
        super(valueAnimator);
        this.f129016b = f;
        this.f129017c = eVar;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.f129018g = f32;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
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
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        float f = this.f129016b;
        float fA = j6.a.a(1.0f, fFloatValue, 0.65f - f, f);
        e eVar = this.f129017c;
        eVar.f129019a.setScaleX(fA);
        eVar.f129019a.setScaleY(fA);
        float f4 = this.d;
        float fA2 = j6.a.a(this.e, f4, fFloatValue, f4);
        float f5 = this.f;
        float fA3 = j6.a.a(this.f129018g, f5, fFloatValue, f5);
        eVar.f129019a.setTranslationX(fA2 - ((eVar.f129019a.getWidth() / 2.0f) + r3.getLeft()));
        eVar.f129019a.setTranslationY(fA3 - ((eVar.f129019a.getHeight() / 2.0f) + r0.getTop()));
        eVar.f129019a.setRotation(fFloatValue * 90.0f);
    }
}
