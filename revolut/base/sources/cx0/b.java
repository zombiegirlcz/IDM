package cx0;

import android.animation.Animator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f109878b;

    public /* synthetic */ b(View view, int i) {
        this.f109877a = i;
        this.f109878b = view;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void D(Animator animator) {
    }

    private final void E(Animator animator) {
    }

    private final void F(Animator animator) {
    }

    private final void G(Animator animator) {
    }

    private final void H(Animator animator) {
    }

    private final void I(Animator animator) {
    }

    private final void J(Animator animator) {
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

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f109877a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f109877a) {
            case 0:
                this.f109878b.setTag(R$id.internal_jump_animation_tag, null);
                break;
            case 1:
            case 2:
                break;
            case 3:
                this.f109878b.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                break;
            case 4:
                this.f109878b.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                break;
            case 5:
                this.f109878b.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                break;
            case 6:
                View view = this.f109878b;
                view.setScaleY(1.0f);
                view.setScaleX(1.0f);
                break;
            case 7:
                this.f109878b.setAlpha(1.0f);
                break;
            case 8:
                this.f109878b.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                break;
            case 9:
                this.f109878b.setVisibility(4);
                break;
            case 10:
                break;
            default:
                this.f109878b.setVisibility(4);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f109877a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f109877a) {
            case 1:
                this.f109878b.setVisibility(4);
                break;
            case 2:
                this.f109878b.setVisibility(4);
                break;
            case 10:
                this.f109878b.setVisibility(0);
                break;
        }
    }
}
