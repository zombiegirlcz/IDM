package mt0;

import android.animation.Animator;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f208683b;

    public /* synthetic */ c(g gVar, int i) {
        this.f208682a = i;
        this.f208683b = gVar;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f208682a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f208682a) {
            case 3:
                this.f208683b.f208695c.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f208682a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f208682a) {
            case 0:
                g gVar = this.f208683b;
                gVar.f208693a.setPivotX(r0.getWidth() / 2);
                gVar.f208693a.setPivotY(r0.getHeight());
                gVar.f208694b.setScaleX(1.0f);
                gVar.f208694b.setScaleY(1.0f);
                break;
            case 1:
                g gVar2 = this.f208683b;
                ks0.l lVar = gVar2.f;
                Object obj2 = gVar2.e;
                Float fValueOf = Float.valueOf(0.96f);
                ks0.l.d(lVar, obj2, null, fValueOf, fValueOf, 6);
                break;
            case 2:
                g gVar3 = this.f208683b;
                ShadowLayout shadowLayout = gVar3.f208693a;
                shadowLayout.setPivotX(shadowLayout.getWidth() / 2);
                shadowLayout.setPivotY(shadowLayout.getHeight() / 2);
                ks0.l lVar2 = gVar3.f;
                Object obj3 = gVar3.e;
                Float fValueOf2 = Float.valueOf(1.0f);
                ks0.l.d(lVar2, obj3, null, fValueOf2, fValueOf2, 6);
                break;
            case 3:
                break;
            default:
                g gVar4 = this.f208683b;
                gVar4.f208693a.setPivotX(r0.getWidth() / 2);
                gVar4.f208693a.setPivotY(r9.getHeight());
                break;
        }
    }
}
