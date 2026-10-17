package mt0;

import android.animation.Animator;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f f208691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f208692c;

    public /* synthetic */ f(f1.f fVar, g gVar, int i) {
        this.f208690a = i;
        this.f208691b = fVar;
        this.f208692c = gVar;
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
        int i = this.f208690a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f208690a) {
            case 0:
                this.f208691b.invoke();
                this.f208692c.d();
                break;
            default:
                this.f208691b.invoke();
                this.f208692c.c();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f208690a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f208690a;
    }
}
