package ox0;

import android.animation.Animator;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f230501b;

    public /* synthetic */ s(t tVar, int i) {
        this.f230500a = i;
        this.f230501b = tVar;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f230500a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f230500a) {
            case 0:
                this.f230501b.f230509m = null;
                break;
            default:
                this.f230501b.d.setBackgroundDrawableLockedBoundsEnabled$ui_kit_components_release(false);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f230500a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f230500a;
    }
}
