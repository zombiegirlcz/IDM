package ox0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f230471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FormsActionButton f230472c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ View e;
    public final /* synthetic */ boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FormsActionButton f230473g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ValueAnimator valueAnimator, d dVar, View view, FormsActionButton formsActionButton, boolean z, View view2, boolean z3, FormsActionButton formsActionButton2) {
        super(valueAnimator);
        this.f230471b = view;
        this.f230472c = formsActionButton;
        this.d = z;
        this.e = view2;
        this.f = z3;
        this.f230473g = formsActionButton2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        d.a(this.f230471b, this.f230472c, this.d);
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
        boolean z = this.f;
        this.e.setAlpha(z ? 1 - fFloatValue : fFloatValue);
        if (!z) {
            fFloatValue = 1 - fFloatValue;
        }
        this.f230473g.setAlpha(fFloatValue);
    }
}
