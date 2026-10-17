package dy0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import au0.b2;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import ip0.cc0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tfm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121025c;

    public /* synthetic */ t(Object obj2, Object obj3, int i) {
        this.f121023a = i;
        this.f121024b = obj2;
        this.f121025c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        int i = this.f121023a;
        Object obj2 = this.f121024b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                SliderLayout.a aVar = SliderLayout.Companion;
                ((SliderLayout) obj2).L();
                break;
            case 1:
            case 2:
            default:
                super.onAnimationCancel(animation);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((cc0) obj2).f163718h.setVisibility(8);
                z0 z0Var = (z0) this.f121025c;
                if (!z0Var.isDisposed()) {
                    try {
                        z0Var.c(Unit.f186387a);
                        z0Var.a();
                    } catch (Exception e) {
                        z0Var.b(e);
                        return;
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i = this.f121023a;
        Object obj2 = this.f121025c;
        Object obj3 = this.f121024b;
        Intrinsics.checkNotNullParameter(animation, "animation");
        switch (i) {
            case 0:
                SliderLayout sliderLayout = (SliderLayout) obj3;
                SliderLayout.a aVar = SliderLayout.Companion;
                sliderLayout.E((r) obj2, false);
                sliderLayout.L();
                break;
            case 1:
                ((LottieAnimationView) obj2).setVisibility(8);
                ((h60.f) obj3).T();
                break;
            case 2:
                joi.u handle = (joi.u) obj3;
                handle.a(false, true, false);
                hoi.p pVar = (hoi.p) obj2;
                joi.t tVar = pVar.f154340g;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(handle, "handle");
                tVar.f177130a.remove(handle);
                pVar.i();
                break;
            default:
                ((cc0) obj3).f163718h.setVisibility(8);
                z0 z0Var = (z0) obj2;
                if (!z0Var.isDisposed()) {
                    try {
                        z0Var.c(Unit.f186387a);
                        z0Var.a();
                    } catch (Exception e) {
                        z0Var.b(e);
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f121023a) {
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f121025c;
                Intrinsics.checkNotNullParameter(animation, "animation");
                h60.f fVar = (h60.f) this.f121024b;
                h60.b bVar = fVar.e;
                if (bVar != null && bVar.b()) {
                    lottieAnimationView.setOnClickListener(new b2(fVar, 28));
                } else {
                    lottieAnimationView.setOnClickListener(null);
                    lottieAnimationView.setClickable(false);
                }
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
