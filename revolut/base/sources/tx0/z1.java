package tx0;

import android.animation.Animator;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;

/* JADX INFO: loaded from: classes20.dex */
public final class z1 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarLargeCentred f275290b;

    public /* synthetic */ z1(NavBarLargeCentred navBarLargeCentred, int i) {
        this.f275289a = i;
        this.f275290b = navBarLargeCentred;
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
        int i = this.f275289a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f275289a) {
            case 0:
                NavBarLargeCentred navBarLargeCentred = this.f275290b;
                navBarLargeCentred.setClipChildren(true);
                navBarLargeCentred.setClipToPadding(true);
                navBarLargeCentred.g0 = false;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f275289a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f275289a) {
            case 0:
                break;
            default:
                NavBarLargeCentred navBarLargeCentred = this.f275290b;
                navBarLargeCentred.setClipChildren(false);
                navBarLargeCentred.setClipToPadding(false);
                navBarLargeCentred.g0 = true;
                break;
        }
    }
}
