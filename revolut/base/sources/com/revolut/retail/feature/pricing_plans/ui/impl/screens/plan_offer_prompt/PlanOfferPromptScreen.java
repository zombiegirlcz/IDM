package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreenContract$InputData;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.n2;
import qgk.o2;
import te0.w;
import uf0.d;
import umk.b;
import umk.c;
import umk.i;
import umk.j;
import umk.k;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_prompt/PlanOfferPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lumk/i;", "Ldli/a;", "Lumk/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanOfferPromptScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(PlanOfferPromptScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PlanOfferPromptScreenContract$InputData K;
    public final int L;
    public final int M;
    public final Boolean N;
    public final h O;
    public final FullScreenStateDelegate P;
    public final PromptMarketingContentDelegate Q;
    public final PromptMarketingContentLoadingDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public PlanOfferPromptScreen(PlanOfferPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = inputData.getF103596c() ? R$style.TransparentNavigationBarMarkerTheme : R$style.UiKitTheme_Mono;
        this.N = inputData.getF103596c() ? Boolean.FALSE : null;
        this.O = s.t(this, b.f);
        this.P = new FullScreenStateDelegate();
        this.Q = new PromptMarketingContentDelegate();
        this.R = new PromptMarketingContentLoadingDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: umk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferPromptScreen f281322b;

            {
                this.f281322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanOfferPromptScreen planOfferPromptScreen = this.f281322b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanOfferPromptScreen.V;
                        PlanOfferPromptScreen planOfferPromptScreen2 = this.f281322b;
                        return dli.f.a(planOfferPromptScreen2, planOfferPromptScreen2.R2(), v.k(planOfferPromptScreen2.P, planOfferPromptScreen2.Q, planOfferPromptScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanOfferPromptScreen.V;
                        qji.b bVarU2 = planOfferPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.di.PlanOfferPromptScreenInjector");
                        n2 n2Var = (n2) ((vmk.a) bVarU2).b().mo3808a(planOfferPromptScreen);
                        PlanOfferPromptScreenContract$InputData planOfferPromptScreenContract$InputData = planOfferPromptScreen.K;
                        switch (n2Var.f246164a) {
                            case 0:
                                planOfferPromptScreenContract$InputData.getClass();
                                n2Var.d = planOfferPromptScreenContract$InputData;
                                break;
                            default:
                                planOfferPromptScreenContract$InputData.getClass();
                                n2Var.d = planOfferPromptScreenContract$InputData;
                                break;
                        }
                        return (o2) n2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PlanOfferPromptScreen.V;
                        o2 o2Var = (o2) planOfferPromptScreen.T.getValue();
                        switch (o2Var.f246181a) {
                            case 0:
                                return (j) o2Var.d.get();
                            default:
                                return (j) o2Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: umk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferPromptScreen f281322b;

            {
                this.f281322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanOfferPromptScreen planOfferPromptScreen = this.f281322b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanOfferPromptScreen.V;
                        PlanOfferPromptScreen planOfferPromptScreen2 = this.f281322b;
                        return dli.f.a(planOfferPromptScreen2, planOfferPromptScreen2.R2(), v.k(planOfferPromptScreen2.P, planOfferPromptScreen2.Q, planOfferPromptScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanOfferPromptScreen.V;
                        qji.b bVarU2 = planOfferPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.di.PlanOfferPromptScreenInjector");
                        n2 n2Var = (n2) ((vmk.a) bVarU2).b().mo3808a(planOfferPromptScreen);
                        PlanOfferPromptScreenContract$InputData planOfferPromptScreenContract$InputData = planOfferPromptScreen.K;
                        switch (n2Var.f246164a) {
                            case 0:
                                planOfferPromptScreenContract$InputData.getClass();
                                n2Var.d = planOfferPromptScreenContract$InputData;
                                break;
                            default:
                                planOfferPromptScreenContract$InputData.getClass();
                                n2Var.d = planOfferPromptScreenContract$InputData;
                                break;
                        }
                        return (o2) n2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PlanOfferPromptScreen.V;
                        o2 o2Var = (o2) planOfferPromptScreen.T.getValue();
                        switch (o2Var.f246181a) {
                            case 0:
                                return (j) o2Var.d.get();
                            default:
                                return (j) o2Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: umk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferPromptScreen f281322b;

            {
                this.f281322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanOfferPromptScreen planOfferPromptScreen = this.f281322b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanOfferPromptScreen.V;
                        PlanOfferPromptScreen planOfferPromptScreen2 = this.f281322b;
                        return dli.f.a(planOfferPromptScreen2, planOfferPromptScreen2.R2(), v.k(planOfferPromptScreen2.P, planOfferPromptScreen2.Q, planOfferPromptScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanOfferPromptScreen.V;
                        qji.b bVarU2 = planOfferPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.di.PlanOfferPromptScreenInjector");
                        n2 n2Var = (n2) ((vmk.a) bVarU2).b().mo3808a(planOfferPromptScreen);
                        PlanOfferPromptScreenContract$InputData planOfferPromptScreenContract$InputData = planOfferPromptScreen.K;
                        switch (n2Var.f246164a) {
                            case 0:
                                planOfferPromptScreenContract$InputData.getClass();
                                n2Var.d = planOfferPromptScreenContract$InputData;
                                break;
                            default:
                                planOfferPromptScreenContract$InputData.getClass();
                                n2Var.d = planOfferPromptScreenContract$InputData;
                                break;
                        }
                        return (o2) n2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PlanOfferPromptScreen.V;
                        o2 o2Var = (o2) planOfferPromptScreen.T.getValue();
                        switch (o2Var.f246181a) {
                            case 0:
                                return (j) o2Var.d.get();
                            default:
                                return (j) o2Var.d.get();
                        }
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(uiState.f281326a ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o2) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.K.getF103596c()) {
            d3().f174540c.setModel(goi.i.a(d3().f174540c.getF98530h(), false, false, 1));
        }
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setVisibility(8);
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.Q;
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.J(rd0.e.b(promptMarketingContentDelegate.f53079c), rd0.e.b(this.R.p()), rd0.e.b(d3().f174539b.f59410q)), new uea.e(this, continuation, 13), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.d), new d(this, continuation, 18), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new umk.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new umk.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2, reason: from getter */
    public final Boolean getN() {
        return this.N;
    }
}
