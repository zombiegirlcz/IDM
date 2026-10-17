package nq0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewOverlay;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import cs0.a;
import fu0.i;
import ix0.i2;
import ix0.j2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements rr0.d, ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f218348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cs0.b f218349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RevolutShimmerDrawable f218350c;
    public ValueAnimator d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j2 f218351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f218352h;

    public e(View view, cs0.b blendMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(blendMode, "blendMode");
        this.f218348a = view;
        this.f218349b = blendMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rr0.d
    public final void L(boolean z) {
        int iS;
        RevolutShimmerDrawable revolutShimmerDrawable = this.f218350c;
        View view = this.f218348a;
        if (revolutShimmerDrawable == null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (kli.a.q(context)) {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorWhite_10, context2);
            } else {
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorGrey50_10, context3);
            }
            a.c cVar = new a.c();
            cs0.a aVar = cVar.f108423a;
            aVar.e = 0;
            aVar.d = iS;
            cVar.k(this.f218349b);
            a.c cVar2 = (a.c) ((a.c) ((a.c) cVar.d(cs0.d.LEFT_TO_RIGHT)).i(BitmapDescriptorFactory.HUE_RED)).f(1000L);
            cs0.a aVar2 = cVar2.f108423a;
            aVar2.o = 2;
            aVar2.f108416m = true;
            cs0.a aVarA = cVar2.a();
            RevolutShimmerDrawable revolutShimmerDrawable2 = new RevolutShimmerDrawable();
            revolutShimmerDrawable2.a(aVarA);
            this.f218350c = revolutShimmerDrawable2;
            revolutShimmerDrawable = revolutShimmerDrawable2;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
            valueAnimator.addUpdateListener(this);
            valueAnimator.addListener(this);
            this.d = valueAnimator;
        } else {
            valueAnimator.cancel();
        }
        if (!z) {
            valueAnimator.setIntValues(revolutShimmerDrawable.f56062b.getAlpha(), 0);
            valueAnimator.setDuration(200L);
            valueAnimator.start();
            return;
        }
        revolutShimmerDrawable.c();
        revolutShimmerDrawable.b();
        revolutShimmerDrawable.setAlpha(255);
        boolean z3 = view.getLayerType() == 2;
        this.f = z3;
        if (this.e) {
            return;
        }
        this.e = true;
        if (!z3) {
            view.setForeground(revolutShimmerDrawable);
            return;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            i iVar = view instanceof i ? (i) view : null;
            c cVar3 = new c(revolutShimmerDrawable, view, iVar != null ? iVar.getHighlightTarget() : null);
            this.f218352h = cVar3;
            j2.Companion.getClass();
            this.f218351g = i2.a(view, cVar3);
            cVar3.run();
            ViewOverlay overlay = view2.getOverlay();
            if (overlay != null) {
                overlay.add(cVar3);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.e && this.f) {
            c cVar = this.f218352h;
            Object parent = this.f218348a.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (cVar != null && view != null) {
                view.getOverlay().remove(cVar);
            }
            this.f218352h = null;
            this.e = false;
            j2 j2Var = this.f218351g;
            if (j2Var != null) {
                j2Var.cancel();
            }
            this.f218351g = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        RevolutShimmerDrawable revolutShimmerDrawable = this.f218350c;
        if (revolutShimmerDrawable != null) {
            Object animatedValue = animation.getAnimatedValue();
            Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            revolutShimmerDrawable.setAlpha(((Integer) animatedValue).intValue());
        }
    }

    public /* synthetic */ e(View view) {
        this(view, cs0.b.MASKED);
    }
}
