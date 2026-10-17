package ux0;

import android.animation.Animator;

/* JADX INFO: loaded from: classes20.dex */
public final class n0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f283783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f283784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f283785c;

    public n0(boolean z, s0 s0Var, k0 k0Var) {
        this.f283783a = z;
        this.f283784b = s0Var;
        this.f283785c = k0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        s0 s0Var = this.f283784b;
        boolean z = this.f283783a;
        if (!z) {
            s0Var.f();
        }
        if (!this.f283785c.f283779n || z) {
            return;
        }
        s0Var.f283810q.b(s0Var.getProductIntroContentView());
    }
}
