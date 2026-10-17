package dy0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.i1;
import ix0.l1;
import kotlin.jvm.internal.Intrinsics;
import mx0.hd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class q0 implements m0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f121012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f121014c;
    public final DecelerateInterpolator d;
    public View e;
    public hd f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jy0.m f121015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f121016h;
    public r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f121017j;
    public final AccelerateInterpolator k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f121018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f121019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f121020n;

    public q0(p0 p0Var, boolean z, boolean z3) {
        this.f121012a = p0Var;
        this.f121013b = z3;
        o0 o0Var = Companion;
        hd.a aVar = hd.Companion;
        HomeOverlayConfig homeOverlayConfig = p0Var != null ? p0Var.f121008c : null;
        aVar.getClass();
        long j2 = hd.a.a(homeOverlayConfig) ? 350L : 450L;
        o0Var.getClass();
        h0 customSettling = new h0(j2, new LinearInterpolator(), 10);
        Intrinsics.checkNotNullParameter(customSettling, "customSettling");
        i0 i0Var = new i0(new j0(300.0f), customSettling, true, true);
        this.f121014c = i0Var;
        this.d = new DecelerateInterpolator();
        this.f121016h = -1.0f;
        this.i = r.SHOWN;
        this.f121017j = z ? new e(i0Var, c.KEEP_HIDDEN_IF_OVERLAY_BLUR_PRESENT, 2) : null;
        this.k = new AccelerateInterpolator();
        this.f121018l = new w(i0Var);
    }

    @Override // dy0.m0
    public final void a(View view, SliderLayout parent, r state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        hd hdVar = this.f;
        ViewParent parent2 = hdVar != null ? hdVar.getParent() : null;
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f);
        }
        jy0.m mVar = this.f121015g;
        if (mVar != null) {
            mVar.e();
        }
        View view2 = this.e;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        view.setAlpha(1.0f);
        this.e = null;
        this.f = null;
        this.f121015g = null;
        e eVar = this.f121017j;
        if (eVar != null) {
            eVar.a(view, parent, state);
        }
        this.f121018l.a(view, parent, state);
        this.f121020n = false;
        this.f121019m = false;
    }

    @Override // dy0.m0
    public final void b(View view, SliderLayout parent, float f) throws Throwable {
        SlidingDimmerView slidingDimmerView;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f121020n = true;
        h(parent, view);
        r rVar = this.i;
        r rVar2 = r.HIDDEN;
        float dimmingAlpha$ui_kit_components_release = BitmapDescriptorFactory.HUE_RED;
        e eVar = this.f121017j;
        if (rVar == rVar2) {
            f(view, f, true);
            if (eVar != null) {
                eVar.e(view, parent, BitmapDescriptorFactory.HUE_RED);
            }
        } else {
            f(view, f, false);
            if (this.f121016h == -1.0f) {
                if (eVar != null && (slidingDimmerView = eVar.e) != null) {
                    dimmingAlpha$ui_kit_components_release = slidingDimmerView.getDimmingAlpha$ui_kit_components_release();
                }
                this.f121016h = dimmingAlpha$ui_kit_components_release;
            }
            float fB = i1.b(this.f121016h, 1.0f, f);
            if (eVar != null) {
                eVar.e(view, parent, fB);
            }
        }
        if (this.f121019m) {
            return;
        }
        this.f121018l.e(view, parent, f);
    }

    @Override // dy0.m0
    public final void c(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        lji.c cVarL = ksj.b.l(view);
        if (cVarL != null) {
            cVarL.c(f);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // dy0.m0
    public final void d(View view, SliderLayout parent, r targetState) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        this.i = targetState;
        if (this.f121013b && view.getBackground() == null) {
            Context context = view.getContext();
            if (!((Boolean) jo0.g.e.getValue()).booleanValue()) {
                Intrinsics.h(context);
                context = l1.a(context, context, R$style.UiKitThemeOverlay_LegacyMonoBackground_DayNight);
            }
            Intrinsics.h(context);
            view.setBackground(new ColorDrawable(kli.a.s(R$attr.uikit_windowBackground, context)));
        }
        h(parent, view);
        e eVar = this.f121017j;
        if (eVar != null) {
            eVar.d(view, parent, targetState);
        }
        this.f121018l.d(view, parent, targetState);
        if (targetState == r.SHOWN) {
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // dy0.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r22, com.revolut.core.ui_kit.views.slider_layout.SliderLayout r23, float r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dy0.q0.e(android.view.View, com.revolut.core.ui_kit.views.slider_layout.SliderLayout, float):void");
    }

    public final void f(View view, float f, boolean z) {
        g(view, z);
        jy0.m mVar = this.f121015g;
        if ((mVar == null || !mVar.A) && mVar != null) {
            mVar.k();
        }
        if (this.f121015g != null) {
            if (z) {
                f = 1 - f;
            }
            hd.a aVar = hd.Companion;
            p0 p0Var = this.f121012a;
            HomeOverlayConfig homeOverlayConfig = p0Var != null ? p0Var.f121008c : null;
            aVar.getClass();
            if (hd.a.a(homeOverlayConfig)) {
                jy0.m mVar2 = this.f121015g;
                if (mVar2 != null) {
                    Interpolator easing = jq0.r.f177395g;
                    Intrinsics.checkNotNullParameter(easing, "easing");
                    mVar2.c(f, easing, (jy0.d) mVar2.D.getValue());
                    return;
                }
                return;
            }
            jy0.m mVar3 = this.f121015g;
            if (mVar3 != null) {
                float interpolation = this.d.getInterpolation(f);
                Interpolator easing2 = jq0.r.f177392a;
                Intrinsics.checkNotNullParameter(easing2, "easing");
                mVar3.c(interpolation, easing2, (jy0.b) mVar3.C.getValue());
            }
        }
    }

    public final void g(View expandedView, boolean z) {
        hd hdVar = this.f;
        View view = this.e;
        if (this.f121015g != null || hdVar == null) {
            return;
        }
        p0 p0Var = this.f121012a;
        if (p0Var == null || view != null) {
            HomeOverlayConfig homeOverlayConfig = p0Var != null ? p0Var.f121008c : null;
            Intrinsics.checkNotNullParameter(expandedView, "expandedView");
            this.f121015g = new jy0.m(view, hdVar, expandedView, hdVar.e, hdVar.f209743h, z, homeOverlayConfig);
        }
    }

    @Override // dy0.m0
    public final i0 getConfig() {
        return this.f121014c;
    }

    public final void h(SliderLayout parent, View view) throws Throwable {
        jy0.m mVar;
        String str;
        p0 p0Var = this.f121012a;
        if (p0Var != null) {
            ParcelableViewTarget parcelableViewTarget = p0Var.f121006a;
            if (this.e == null) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                View viewA = js0.d.a(parcelableViewTarget, parent);
                this.e = viewA;
                if (viewA == null && (mVar = this.f121015g) != null && mVar.A) {
                    String strJ = parcelableViewTarget.j();
                    boolean z = p0Var.f121007b;
                    HomeOverlayConfig homeOverlayConfig = p0Var.f121008c;
                    if (homeOverlayConfig != null) {
                        str = "HomeOverlayConfig(startOffsetEnabled=" + homeOverlayConfig.f59655a + ")";
                    } else {
                        str = null;
                    }
                    StringBuilder sb6 = new StringBuilder("FinderTarget(target=");
                    sb6.append(strJ);
                    sb6.append(", backlightEnabled=");
                    sb6.append(z);
                    sb6.append(", homeOverlayConfig=");
                    hx7.e.n(new IllegalStateException(j6.a.q("Couldn't find highlighted element to start swipe to zoom transition ", v0.a.i(sb6, str, ")"))));
                }
            }
        }
        if (this.f != null || view.isInLayout()) {
            return;
        }
        ViewParent parent2 = view.getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup == null) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hd hdVar = new hd(context, null, 6, 0);
        this.f = hdVar;
        viewGroup.addView(hdVar, viewGroup.indexOfChild(view), new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(ParcelableViewTarget target, boolean z, HomeOverlayConfig homeOverlayConfig) {
        this(new p0(target, z, homeOverlayConfig), true, true);
        Intrinsics.checkNotNullParameter(target, "target");
    }
}
