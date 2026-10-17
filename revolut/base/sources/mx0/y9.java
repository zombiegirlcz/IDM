package mx0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.drawables.CrossfadeDrawable;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class y9 extends FrameLayout {

    @NotNull
    public static final x9 Companion = new x9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.o f210125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ht0.b0 f210126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kge.d f210127c;
    public final CrossfadeDrawable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.revolut.core.ui_kit.views.o hostView) {
        super(hostView.getContext());
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f210125a = hostView;
        ht0.b0 listener = new ht0.b0(0, this, y9.class, "onHostDismissed", "onHostDismissed()V", 0, 9);
        this.f210126b = listener;
        Intrinsics.checkNotNullParameter(listener, "listener");
        hostView.f59570h.add(listener);
        this.f210127c = new kge.d(hostView, this);
        this.d = new CrossfadeDrawable(0);
    }

    public final void a(View whereToResolve, boolean z) {
        com.revolut.core.ui_kit.views.o oVar = this.f210125a;
        UIKitFrameLayout whereToApply = oVar.getContentContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(whereToApply, "<get-contentContainer>(...)");
        Context context = oVar.getContentContainer$ui_kit_components_release().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_windowBackground, context);
        Intrinsics.checkNotNullParameter(whereToResolve, "whereToResolve");
        Intrinsics.checkNotNullParameter(whereToApply, "whereToApply");
        CrossfadeDrawable crossfadeDrawable = this.d;
        Intrinsics.checkNotNullParameter(crossfadeDrawable, "crossfadeDrawable");
        boolean z3 = false;
        boolean z4 = whereToApply.getBackground() == crossfadeDrawable;
        if (z && z4) {
            z3 = true;
        }
        Drawable drawableA = rr0.b.a(whereToResolve);
        if (drawableA == null) {
            drawableA = new ColorDrawable(iS);
        }
        if (!z4) {
            whereToApply.setBackground(crossfadeDrawable);
        }
        crossfadeDrawable.b(drawableA, z3);
    }

    public final void b(View embeddedView, boolean z, lki.s sVar) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        Intrinsics.checkNotNullParameter(embeddedView, "embeddedView");
        Function0 aVar = sVar;
        if (sVar == null) {
            aVar = new mw1.a(6);
        }
        js0.b bVar = new js0.b(aVar);
        c6d.b.A(embeddedView).f209886a = new nb(bVar);
        a(embeddedView, !z);
        kge.d dVar = this.f210127c;
        com.revolut.core.ui_kit.views.o oVar = (com.revolut.core.ui_kit.views.o) dVar.f183974b;
        y9 y9Var = (y9) dVar.f183975c;
        if (c6d.b.b(y9Var) == 1) {
            y9Var.setVisibility(0);
            y9Var.setAlpha(1.0f);
            ViewGroup contentWrapper$ui_kit_components_release = oVar.getContentWrapper$ui_kit_components_release();
            if (contentWrapper$ui_kit_components_release == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate4 = contentWrapper$ui_kit_components_release.animate();
            if (viewPropertyAnimatorAnimate4 != null) {
                viewPropertyAnimatorAnimate4.cancel();
            }
            if (z) {
                contentWrapper$ui_kit_components_release.setAlpha(BitmapDescriptorFactory.HUE_RED);
                contentWrapper$ui_kit_components_release.setVisibility(8);
                oVar.getEmbeddedContentActivator$ui_kit_components_release().d(dVar);
            } else {
                contentWrapper$ui_kit_components_release.animate().alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new k0.b(contentWrapper$ui_kit_components_release, dVar, 18)).start();
            }
        }
        int iIndexOfChild = indexOfChild(embeddedView);
        View view = null;
        if (iIndexOfChild > 0) {
            int i = iIndexOfChild - 1;
            while (true) {
                if (-1 >= i) {
                    break;
                }
                View childAt = getChildAt(i);
                Intrinsics.h(childAt);
                if (c6d.b.A(childAt).f209886a instanceof nb) {
                    view = childAt;
                    break;
                }
                i--;
            }
        }
        if (z) {
            if (view != null && (viewPropertyAnimatorAnimate3 = view.animate()) != null) {
                viewPropertyAnimatorAnimate3.cancel();
            }
            if (view != null) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            if (view != null) {
                view.setVisibility(8);
            }
            embeddedView.animate().cancel();
            embeddedView.setVisibility(0);
            embeddedView.setAlpha(1.0f);
            bVar.run();
            return;
        }
        if (view != null && (viewPropertyAnimatorAnimate2 = view.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(BitmapDescriptorFactory.HUE_RED)) != null && (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorAlpha.withEndAction(new bb6.b(view, 6))) != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
        embeddedView.animate().cancel();
        embeddedView.setVisibility(0);
        embeddedView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        embeddedView.animate().alpha(1.0f).withEndAction(bVar).start();
    }
}
