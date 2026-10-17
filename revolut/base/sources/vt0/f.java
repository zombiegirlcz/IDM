package vt0;

import android.animation.Animator;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.multibar.MultiBarView;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import ms0.p;
import yt0.b0;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f291872b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f291871a = i;
        this.f291872b = obj2;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f291871a) {
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) throws IOException {
        ViewParent parent;
        switch (this.f291871a) {
            case 0:
                ((d) this.f291872b).setState(b.LIST_SCREEN);
                break;
            case 1:
                ((ConstraintLayout) this.f291872b).setVisibility(4);
                break;
            case 2:
                ((SmallActionButton) this.f291872b).setVisibility(4);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                w01.k.a((LottieAnimationView) this.f291872b);
                break;
            case 4:
                wp0.e eVar = (wp0.e) this.f291872b;
                eVar.f298999g.b();
                p pVar = eVar.f;
                if (pVar != null && (parent = pVar.getParent()) != null) {
                    if (!(parent instanceof ViewGroup)) {
                        parent = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup != null) {
                        viewGroup.removeView(eVar.f);
                    }
                }
                p pVar2 = eVar.f;
                if (pVar2 != null) {
                    pVar2.f208357a.recycle();
                    pVar2.f208358b.recycle();
                }
                break;
            case 5:
                ((qg7.k) this.f291872b).invoke();
                break;
            case 6:
                yt0.j jVar = (yt0.j) this.f291872b;
                if (jVar.f316571h == animation) {
                    jVar.f316571h = null;
                }
                break;
            case 7:
                b0 b0Var = (b0) this.f291872b;
                b0Var.i = null;
                b0Var.b();
                break;
            default:
                ((MultiBarView) this.f291872b).setGraphScale(1.0f);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f291871a) {
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f291871a) {
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                w01.k.d((LottieAnimationView) this.f291872b);
                break;
        }
    }
}
