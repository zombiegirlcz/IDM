package rp0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f256096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f256097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f256098c;
    public final ihm.f d;
    public final no.f2 e;
    public FrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ms0.g0 f256099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ifm.b f256100h;

    public j(Activity context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        View decorView = context.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup parentView = (ViewGroup) decorView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.f256096a = context;
        this.f256097b = parentView;
        this.f256098c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = new no.f2(this, 11);
        this.f256100h = new ifm.b();
    }

    public final void a() {
        this.f256100h.dispose();
        this.f256100h = new ifm.b();
        no.f2 f2Var = this.e;
        ViewGroup viewGroup = this.f256097b;
        or0.u.q(viewGroup, f2Var);
        viewGroup.removeView(this.f);
        this.f = null;
    }

    public final void b(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        if (!z) {
            a();
            return;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null && (viewPropertyAnimatorAnimate2 = frameLayout.animate()) != null) {
            viewPropertyAnimatorAnimate2.alpha(BitmapDescriptorFactory.HUE_RED);
            viewPropertyAnimatorAnimate2.withEndAction(new androidx.view.d(this, 22));
            viewPropertyAnimatorAnimate2.setDuration(300L);
        }
        ms0.g0 g0Var = this.f256099g;
        if (g0Var == null || (viewPropertyAnimatorAnimate = g0Var.animate()) == null) {
            return;
        }
        viewPropertyAnimatorAnimate.translationY(-kli.a.w(R$attr.uikit_dp24, this.f256096a));
        viewPropertyAnimatorAnimate.setDuration(300L);
    }

    public final void c(i configuration, boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        a();
        Activity activity = this.f256096a;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ms0.g0 g0Var = new ms0.g0(activity, null, 6, 0);
        g0Var.setTitle(configuration.d());
        g0Var.setSubtitle(configuration.c());
        g0Var.setIcon(configuration.a());
        te0.w.j0(this.f256100h, g0Var.f0().subscribe(new rof.e(4, new g(this, configuration, 0))));
        te0.w.j0(this.f256100h, g0Var.g0().subscribe(new rof.e(5, new g(this, configuration, 1))));
        g0Var.setTranslationY(-kli.a.w(R$attr.uikit_dp24, activity));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        Context context = g0Var.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.topMargin = kli.a.w(R$attr.uikit_dp24, context);
        Context context2 = g0Var.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams.leftMargin = kli.a.w(R$attr.uikit_dp16, context2);
        Context context3 = g0Var.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams.rightMargin = kli.a.w(R$attr.uikit_dp16, context3);
        Context context4 = g0Var.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        layoutParams.bottomMargin = kli.a.w(R$attr.uikit_dp24, context4);
        layoutParams.gravity = 48;
        g0Var.setLayoutParams(layoutParams);
        this.f256099g = g0Var;
        frameLayout.addView(g0Var);
        this.f = frameLayout;
        no.f2 f2Var = this.e;
        ViewGroup viewGroup = this.f256097b;
        or0.u.b(viewGroup, true, f2Var);
        viewGroup.addView(this.f);
        if (!z) {
            FrameLayout frameLayout2 = this.f;
            if (frameLayout2 != null) {
                frameLayout2.setAlpha(1.0f);
            }
            ms0.g0 g0Var2 = this.f256099g;
            if (g0Var2 != null) {
                g0Var2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            return;
        }
        FrameLayout frameLayout3 = this.f;
        if (frameLayout3 != null && (viewPropertyAnimatorAnimate2 = frameLayout3.animate()) != null) {
            viewPropertyAnimatorAnimate2.alpha(1.0f);
            viewPropertyAnimatorAnimate2.setDuration(300L);
        }
        ms0.g0 g0Var3 = this.f256099g;
        if (g0Var3 == null || (viewPropertyAnimatorAnimate = g0Var3.animate()) == null) {
            return;
        }
        viewPropertyAnimatorAnimate.translationY(BitmapDescriptorFactory.HUE_RED);
        viewPropertyAnimatorAnimate.setDuration(300L);
    }
}
