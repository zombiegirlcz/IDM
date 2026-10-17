package fu0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f138051a;

    public c(e eVar) {
        this.f138051a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = e.f138054m;
        e view = this.f138051a;
        if (!view.i) {
            view.i = true;
            b bVar = view.f138060j;
            if (bVar != null) {
                rr0.g gVar = (rr0.g) bVar;
                Intrinsics.checkNotNullParameter(view, "view");
                if (gVar.d == null) {
                    rr0.g.h(gVar, false, false, 2);
                }
            }
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        e view = this.f138051a;
        if (animatedFraction == 1.0f) {
            view.invalidate();
        }
        boolean z = view.i;
        if (z || animatedFraction < 0.1f || z) {
            return;
        }
        view.i = true;
        b bVar = view.f138060j;
        if (bVar != null) {
            rr0.g gVar = (rr0.g) bVar;
            Intrinsics.checkNotNullParameter(view, "view");
            if (gVar.d == null) {
                rr0.g.h(gVar, false, false, 2);
            }
        }
    }
}
