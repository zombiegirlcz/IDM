package kji;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import au0.r5;
import aw0.w9;
import aw0.y9;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$style;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherFragment;
import h30.q;
import ix0.d1;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    public static final class a implements xji.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f184414a = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f184415b = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ValueAnimator f184416c;
        public com.revolut.kompot.navigable.a d;
        public com.revolut.kompot.navigable.a e;

        @Override // xji.a
        public final void U0(com.revolut.kompot.navigable.a controller, boolean z) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            if (!nji.a.b(controller) || controller.q2().d()) {
                return;
            }
            ValueAnimator valueAnimator = this.f184416c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f184416c = null;
            this.d = null;
            if (z) {
                a(controller);
            } else {
                b(controller);
            }
        }

        public final void a(com.revolut.kompot.navigable.a controller) {
            dx0.c cVar;
            q qVar;
            Window window;
            View decorView;
            q qVar2;
            Window window2;
            View decorView2;
            Intrinsics.checkNotNullParameter(controller, "controller");
            if (controller.q2().c()) {
                String str = controller.u2().f98378a;
                LinkedHashMap linkedHashMap = this.f184414a;
                d1 n1Var = (d1) linkedHashMap.get(str);
                if (n1Var == null) {
                    Context context = controller.D2().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    int i = R$id.internal_status_bar_controller_tag;
                    y9 y9Var = y9.THEME;
                    a5.a styleApplicator = new a5.a(19);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
                    Activity activityI = z92.f.i(context);
                    View viewFindViewById = (activityI == null || (window2 = activityI.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) ? null : decorView2.findViewById(R.id.content);
                    if (activityI == null || viewFindViewById == null) {
                        qVar2 = null;
                    } else {
                        Object tag2 = viewFindViewById.getTag(i);
                        r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
                        if (r1Var == null) {
                            r1Var = new r1();
                            viewFindViewById.setTag(i, r1Var);
                        }
                        qVar2 = new q(y9Var, styleApplicator, r1Var, context);
                    }
                    o1 priority = o1.NORMAL;
                    Intrinsics.checkNotNullParameter(priority, "priority");
                    n1Var = new n1(qVar2, qVar2 != null ? Long.valueOf(qVar2.K0(priority)) : null);
                }
                w9 w9Var = y9.Companion;
                Integer w3 = controller.getW();
                w9Var.getClass();
                ((n1) n1Var).a((w3 != null && w3.intValue() == R$style.ShowcaseSystemBarsMarkerTheme) ? y9.LIGHT : y9.THEME);
                linkedHashMap.put(controller.u2().f98378a, n1Var);
            }
            String str2 = controller.u2().f98378a;
            LinkedHashMap linkedHashMap2 = this.f184415b;
            d1 n1Var2 = (d1) linkedHashMap2.get(str2);
            if (n1Var2 == null) {
                Context context2 = controller.D2().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                int i2 = R$id.internal_navigation_bar_controller_tag;
                dx0.c cVar2 = dx0.c.DEFAULT;
                h35.c styleApplicator2 = new h35.c(25);
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(styleApplicator2, "styleApplicator");
                Activity activityI2 = z92.f.i(context2);
                View viewFindViewById2 = (activityI2 == null || (window = activityI2.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
                if (activityI2 == null || viewFindViewById2 == null) {
                    qVar = null;
                } else {
                    Object tag3 = viewFindViewById2.getTag(i2);
                    r1 r1Var2 = tag3 instanceof r1 ? (r1) tag3 : null;
                    if (r1Var2 == null) {
                        r1Var2 = new r1();
                        viewFindViewById2.setTag(i2, r1Var2);
                    }
                    qVar = new q(cVar2, styleApplicator2, r1Var2, context2);
                }
                o1 priority2 = o1.NORMAL;
                Intrinsics.checkNotNullParameter(priority2, "priority");
                n1Var2 = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority2)) : null);
            }
            dx0.a aVar = dx0.c.Companion;
            Integer w5 = controller.getW();
            aVar.getClass();
            int i3 = R$style.TransparentNavigationBarMarkerTheme;
            if (w5 != null && w5.intValue() == i3) {
                cVar = dx0.c.TRANSPARENT;
            } else {
                cVar = (w5 != null && w5.intValue() == R$style.ShowcaseSystemBarsMarkerTheme) ? dx0.c.SHOWCASE : dx0.c.DEFAULT;
            }
            ((n1) n1Var2).a(cVar);
            linkedHashMap2.put(controller.u2().f98378a, n1Var2);
        }

        public final void b(com.revolut.kompot.navigable.a aVar) {
            String str = aVar.u2().f98378a;
            LinkedHashMap linkedHashMap = this.f184414a;
            d1 d1Var = (d1) linkedHashMap.get(str);
            if (d1Var != null) {
                ((n1) d1Var).b();
            }
            String str2 = aVar.u2().f98378a;
            LinkedHashMap linkedHashMap2 = this.f184415b;
            d1 d1Var2 = (d1) linkedHashMap2.get(str2);
            if (d1Var2 != null) {
                ((n1) d1Var2).b();
            }
            linkedHashMap.remove(aVar.u2().f98378a);
            linkedHashMap2.remove(aVar.u2().f98378a);
        }

        @Override // xji.a
        public final void m0(com.revolut.kompot.navigable.a controller, boolean z) {
            dx0.c cVar;
            Window window;
            Intrinsics.checkNotNullParameter(controller, "controller");
            if (!nji.a.b(controller) || controller.q2().d()) {
                return;
            }
            if (!z) {
                this.d = controller;
                return;
            }
            if (this.d != null) {
                Context context = controller.D2().getContext();
                Activity context2 = controller.m2();
                Intrinsics.checkNotNullParameter(context2, "context");
                Activity activityM = kli.a.m(context2);
                Integer numValueOf = (activityM == null || (window = activityM.getWindow()) == null) ? null : Integer.valueOf(window.getNavigationBarColor());
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    dx0.a aVar = dx0.c.Companion;
                    Integer w3 = controller.getW();
                    aVar.getClass();
                    int i = R$style.TransparentNavigationBarMarkerTheme;
                    if (w3 != null && w3.intValue() == i) {
                        cVar = dx0.c.TRANSPARENT;
                    } else {
                        cVar = (w3 != null && w3.intValue() == R$style.ShowcaseSystemBarsMarkerTheme) ? dx0.c.SHOWCASE : dx0.c.DEFAULT;
                    }
                    int iC = io0.a.c(controller.m2(), cVar.b());
                    if (iIntValue == iC || Intrinsics.f(controller.D2().getRootView().getTag(com.revolut.kompot.common.R$id.internal_navigationBarAnimationControlAcquired), Boolean.TRUE)) {
                        return;
                    }
                    Window window2 = controller.m2().getWindow();
                    Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                    Intrinsics.h(context);
                    Color color = dx0.c.TRANSPARENT.d();
                    Intrinsics.checkNotNullParameter(window2, "window");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(color, "color");
                    window2.setNavigationBarDividerColor(io0.a.c(context, color));
                    if (Build.VERSION.SDK_INT <= 28) {
                        ViewCompat.requestApplyInsets(window2.getDecorView());
                    }
                    ValueAnimator valueAnimator = this.f184416c;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluatorCompat(), numValueOf, Integer.valueOf(iC));
                    valueAnimatorOfObject.setDuration(300L);
                    valueAnimatorOfObject.addUpdateListener(new r5(iC, iIntValue, controller));
                    valueAnimatorOfObject.start();
                    this.f184416c = valueAnimatorOfObject;
                }
            }
        }

        @Override // xji.a
        public final void q(com.revolut.kompot.navigable.a controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            if (nji.a.b(controller)) {
                if (controller.q2().d()) {
                    b(controller);
                }
                if (controller.equals(this.d)) {
                    this.d = null;
                }
            }
        }

        @Override // xji.a
        public final void w1(com.revolut.kompot.navigable.a controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            if (nji.a.b(controller)) {
                b(controller);
                if (controller.equals(this.e)) {
                    this.e = null;
                }
            }
        }

        @Override // xji.a
        public final void z2(com.revolut.kompot.navigable.a controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            if (nji.a.b(controller)) {
                if (controller.q2().d() || this.f184415b.isEmpty()) {
                    a(controller);
                }
                this.e = controller;
            }
        }
    }

    private l() {
    }

    public static void a(KompotLauncherFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment.getLifecycle().getState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            fragment.getLifecycle().addObserver(new m(new a()));
        }
    }
}
