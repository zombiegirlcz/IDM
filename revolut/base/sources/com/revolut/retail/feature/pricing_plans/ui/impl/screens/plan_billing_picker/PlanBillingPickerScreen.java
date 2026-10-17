package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.BannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreen;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import qgk.k2;
import te0.w;
import vc.s;
import xki.e;
import z75.f;
import zhm.d0;
import zhm.v;
import zkk.c;
import zkk.g;
import zkk.l;
import zkk.m;
import zkk.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_billing_picker/PlanBillingPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzkk/l;", "Ldli/a;", "Lzkk/n;", "Lno/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanBillingPickerScreen extends ViewController<l> implements a, k {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PlanBillingPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final PlanBillingPickerScreenContract$InputData K;
    public final int L;
    public AnalyticsContext M;
    public final h N;
    public final RowDelegate O;
    public final LargeActionButtonDelegate P;
    public final TextDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public PlanBillingPickerScreen(PlanBillingPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.N = s.t(this, c.f);
        this.O = new RowDelegate(null, null, 7);
        this.P = new LargeActionButtonDelegate();
        this.Q = new TextDelegate();
        this.R = new FullScreenStateDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: zkk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBillingPickerScreen f323062b;

            {
                this.f323062b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanBillingPickerScreen planBillingPickerScreen = this.f323062b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBillingPickerScreen.W;
                        k2 k2Var = (k2) planBillingPickerScreen.U.getValue();
                        switch (k2Var.f246085a) {
                            case 0:
                                return (fd6.a) k2Var.e.get();
                            default:
                                return (fd6.a) k2Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBillingPickerScreen.W;
                        PlanBillingPickerScreen planBillingPickerScreen2 = this.f323062b;
                        return dli.f.a(planBillingPickerScreen2, planBillingPickerScreen2.R2(), d0.E0(((fd6.a) planBillingPickerScreen2.S.getValue()).e, v.k(new BannerLoadingDelegate(), new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new PlainTextLoadingDelegate(), planBillingPickerScreen2.R, planBillingPickerScreen2.O, planBillingPickerScreen2.P, planBillingPickerScreen2.Q)), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanBillingPickerScreen.W;
                        qji.b bVarR1 = planBillingPickerScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.di.PlanBillingPickerScreenInjector");
                        return (k2) ((alk.a) ((qhk.b) bVarR1).l().mo3808a(planBillingPickerScreen)).h(planBillingPickerScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr4 = PlanBillingPickerScreen.W;
                        k2 k2Var2 = (k2) planBillingPickerScreen.U.getValue();
                        switch (k2Var2.f246085a) {
                            case 0:
                                return (m) k2Var2.k.get();
                            default:
                                return (m) k2Var2.k.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: zkk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBillingPickerScreen f323062b;

            {
                this.f323062b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanBillingPickerScreen planBillingPickerScreen = this.f323062b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBillingPickerScreen.W;
                        k2 k2Var = (k2) planBillingPickerScreen.U.getValue();
                        switch (k2Var.f246085a) {
                            case 0:
                                return (fd6.a) k2Var.e.get();
                            default:
                                return (fd6.a) k2Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBillingPickerScreen.W;
                        PlanBillingPickerScreen planBillingPickerScreen2 = this.f323062b;
                        return dli.f.a(planBillingPickerScreen2, planBillingPickerScreen2.R2(), d0.E0(((fd6.a) planBillingPickerScreen2.S.getValue()).e, v.k(new BannerLoadingDelegate(), new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new PlainTextLoadingDelegate(), planBillingPickerScreen2.R, planBillingPickerScreen2.O, planBillingPickerScreen2.P, planBillingPickerScreen2.Q)), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanBillingPickerScreen.W;
                        qji.b bVarR1 = planBillingPickerScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.di.PlanBillingPickerScreenInjector");
                        return (k2) ((alk.a) ((qhk.b) bVarR1).l().mo3808a(planBillingPickerScreen)).h(planBillingPickerScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr4 = PlanBillingPickerScreen.W;
                        k2 k2Var2 = (k2) planBillingPickerScreen.U.getValue();
                        switch (k2Var2.f246085a) {
                            case 0:
                                return (m) k2Var2.k.get();
                            default:
                                return (m) k2Var2.k.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: zkk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBillingPickerScreen f323062b;

            {
                this.f323062b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanBillingPickerScreen planBillingPickerScreen = this.f323062b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBillingPickerScreen.W;
                        k2 k2Var = (k2) planBillingPickerScreen.U.getValue();
                        switch (k2Var.f246085a) {
                            case 0:
                                return (fd6.a) k2Var.e.get();
                            default:
                                return (fd6.a) k2Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBillingPickerScreen.W;
                        PlanBillingPickerScreen planBillingPickerScreen2 = this.f323062b;
                        return dli.f.a(planBillingPickerScreen2, planBillingPickerScreen2.R2(), d0.E0(((fd6.a) planBillingPickerScreen2.S.getValue()).e, v.k(new BannerLoadingDelegate(), new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new PlainTextLoadingDelegate(), planBillingPickerScreen2.R, planBillingPickerScreen2.O, planBillingPickerScreen2.P, planBillingPickerScreen2.Q)), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanBillingPickerScreen.W;
                        qji.b bVarR1 = planBillingPickerScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.di.PlanBillingPickerScreenInjector");
                        return (k2) ((alk.a) ((qhk.b) bVarR1).l().mo3808a(planBillingPickerScreen)).h(planBillingPickerScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr4 = PlanBillingPickerScreen.W;
                        k2 k2Var2 = (k2) planBillingPickerScreen.U.getValue();
                        switch (k2Var2.f246085a) {
                            case 0:
                                return (m) k2Var2.k.get();
                            default:
                                return (m) k2Var2.k.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: zkk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBillingPickerScreen f323062b;

            {
                this.f323062b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlanBillingPickerScreen planBillingPickerScreen = this.f323062b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBillingPickerScreen.W;
                        k2 k2Var = (k2) planBillingPickerScreen.U.getValue();
                        switch (k2Var.f246085a) {
                            case 0:
                                return (fd6.a) k2Var.e.get();
                            default:
                                return (fd6.a) k2Var.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBillingPickerScreen.W;
                        PlanBillingPickerScreen planBillingPickerScreen2 = this.f323062b;
                        return dli.f.a(planBillingPickerScreen2, planBillingPickerScreen2.R2(), d0.E0(((fd6.a) planBillingPickerScreen2.S.getValue()).e, v.k(new BannerLoadingDelegate(), new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new PlainTextLoadingDelegate(), planBillingPickerScreen2.R, planBillingPickerScreen2.O, planBillingPickerScreen2.P, planBillingPickerScreen2.Q)), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanBillingPickerScreen.W;
                        qji.b bVarR1 = planBillingPickerScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.di.PlanBillingPickerScreenInjector");
                        return (k2) ((alk.a) ((qhk.b) bVarR1).l().mo3808a(planBillingPickerScreen)).h(planBillingPickerScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr4 = PlanBillingPickerScreen.W;
                        k2 k2Var2 = (k2) planBillingPickerScreen.U.getValue();
                        switch (k2Var2.f246085a) {
                            case 0:
                                return (m) k2Var2.k.get();
                            default:
                                return (m) k2Var2.k.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        this.M = new AnalyticsContext(uiState.f323076c);
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((jii.n) value).f174542b;
        Clause clause = uiState.f323074a;
        navBarBottomSheet.setHeaderModel(clause == null ? null : new lw0.a(clause, uiState.f323075b, null, null, false, 28));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k2) this.U.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.n) value).f174542b.setHeaderModel(null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.O;
        Continuation continuation = null;
        ViewController.P2(this, new f(rd0.e.b(rowDelegate.f53218h), 9), new zkk.f(this, continuation, 0), 3);
        ViewController.P2(this, new f(rd0.e.b(rowDelegate.o.f121375b), 10), new zkk.f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new zkk.f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new zkk.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
