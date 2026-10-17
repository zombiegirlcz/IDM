package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager;

import ali.g;
import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.core.ui.activity.CustomTheme;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.b;
import efm.r;
import ghk.i;
import java.util.List;
import kji.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import qgk.i0;
import qgk.v0;
import te0.w;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/c;", "Lali/g;", "Lghk/o;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem;", "Lno/k;", "Lkji/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanPagerFlow extends ViewController<c> implements g, k, f {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PlanPagerFlow.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/FlowPlanPagerBinding;", 0))};
    public final PlanPagerFlowContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public AnalyticsContext O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Lazy T;

    public PlanPagerFlow(PlanPagerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_plan_pager;
        this.M = z92.f.m(inputData.f103048g);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ghk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPagerFlow f143945b;

            {
                this.f143945b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanPagerFlow planPagerFlow = this.f143945b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPagerFlow.U;
                        return mif.a.a(planPagerFlow, 0, R$id.planPagerFlow_pager, planPagerFlow.R2(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPagerFlow.U;
                        phm.a aVar = (phm.a) ue0.e.j(planPagerFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = planPagerFlow.K;
                        planPagerFlowContract$InputData.getClass();
                        return new v0(i0Var, planPagerFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPagerFlow.U;
                        return (i) ((v0) planPagerFlow.Q.getValue()).f246288g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PlanPagerFlow.U;
                        fk3.b bVarB = ((v0) planPagerFlow.Q.getValue()).f246286b.f246022t.b();
                        vc.s.j(bVarB);
                        return Boolean.valueOf(((ik3.g) bVarB).f161888g.b().H1);
                    default:
                        KProperty[] kPropertyArr5 = PlanPagerFlow.U;
                        return new c(planPagerFlow);
                }
            }
        });
        this.O = inputData.f;
        this.P = s.t(this, ghk.b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ghk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPagerFlow f143945b;

            {
                this.f143945b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanPagerFlow planPagerFlow = this.f143945b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPagerFlow.U;
                        return mif.a.a(planPagerFlow, 0, R$id.planPagerFlow_pager, planPagerFlow.R2(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPagerFlow.U;
                        phm.a aVar = (phm.a) ue0.e.j(planPagerFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = planPagerFlow.K;
                        planPagerFlowContract$InputData.getClass();
                        return new v0(i0Var, planPagerFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPagerFlow.U;
                        return (i) ((v0) planPagerFlow.Q.getValue()).f246288g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PlanPagerFlow.U;
                        fk3.b bVarB = ((v0) planPagerFlow.Q.getValue()).f246286b.f246022t.b();
                        vc.s.j(bVarB);
                        return Boolean.valueOf(((ik3.g) bVarB).f161888g.b().H1);
                    default:
                        KProperty[] kPropertyArr5 = PlanPagerFlow.U;
                        return new c(planPagerFlow);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ghk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPagerFlow f143945b;

            {
                this.f143945b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanPagerFlow planPagerFlow = this.f143945b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPagerFlow.U;
                        return mif.a.a(planPagerFlow, 0, R$id.planPagerFlow_pager, planPagerFlow.R2(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPagerFlow.U;
                        phm.a aVar = (phm.a) ue0.e.j(planPagerFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = planPagerFlow.K;
                        planPagerFlowContract$InputData.getClass();
                        return new v0(i0Var, planPagerFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPagerFlow.U;
                        return (i) ((v0) planPagerFlow.Q.getValue()).f246288g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PlanPagerFlow.U;
                        fk3.b bVarB = ((v0) planPagerFlow.Q.getValue()).f246286b.f246022t.b();
                        vc.s.j(bVarB);
                        return Boolean.valueOf(((ik3.g) bVarB).f161888g.b().H1);
                    default:
                        KProperty[] kPropertyArr5 = PlanPagerFlow.U;
                        return new c(planPagerFlow);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: ghk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPagerFlow f143945b;

            {
                this.f143945b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlanPagerFlow planPagerFlow = this.f143945b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPagerFlow.U;
                        return mif.a.a(planPagerFlow, 0, R$id.planPagerFlow_pager, planPagerFlow.R2(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPagerFlow.U;
                        phm.a aVar = (phm.a) ue0.e.j(planPagerFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = planPagerFlow.K;
                        planPagerFlowContract$InputData.getClass();
                        return new v0(i0Var, planPagerFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPagerFlow.U;
                        return (i) ((v0) planPagerFlow.Q.getValue()).f246288g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PlanPagerFlow.U;
                        fk3.b bVarB = ((v0) planPagerFlow.Q.getValue()).f246286b.f246022t.b();
                        vc.s.j(bVarB);
                        return Boolean.valueOf(((ik3.g) bVarB).f161888g.b().H1);
                    default:
                        KProperty[] kPropertyArr5 = PlanPagerFlow.U;
                        return new c(planPagerFlow);
                }
            }
        });
        final int i6 = 4;
        this.T = j.b(new Function0(this) { // from class: ghk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPagerFlow f143945b;

            {
                this.f143945b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                PlanPagerFlow planPagerFlow = this.f143945b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPagerFlow.U;
                        return mif.a.a(planPagerFlow, 0, R$id.planPagerFlow_pager, planPagerFlow.R2(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPagerFlow.U;
                        phm.a aVar = (phm.a) ue0.e.j(planPagerFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = planPagerFlow.K;
                        planPagerFlowContract$InputData.getClass();
                        return new v0(i0Var, planPagerFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPagerFlow.U;
                        return (i) ((v0) planPagerFlow.Q.getValue()).f246288g.get();
                    case 3:
                        KProperty[] kPropertyArr4 = PlanPagerFlow.U;
                        fk3.b bVarB = ((v0) planPagerFlow.Q.getValue()).f246286b.f246022t.b();
                        vc.s.j(bVarB);
                        return Boolean.valueOf(((ik3.g) bVarB).f161888g.b().H1);
                    default:
                        KProperty[] kPropertyArr5 = PlanPagerFlow.U;
                        return new c(planPagerFlow);
                }
            }
        });
    }

    public static void d3(LargeActionButton largeActionButton, a aVar) {
        if (aVar instanceof a.C0633a) {
            w01.k.b(largeActionButton);
            largeActionButton.setCustomE2ETestId(null);
        } else {
            if (!(aVar instanceof ghk.g)) {
                throw new NoWhenBranchMatchedException();
            }
            w01.k.f(largeActionButton);
            ghk.g gVar = (ghk.g) aVar;
            largeActionButton.setText(gVar.f143954a);
            largeActionButton.o(gVar.f143955b);
            largeActionButton.setCustomE2ETestId(gVar.f143956c);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ghk.o uiState = (ghk.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = e3().f215179g;
        Clause clause = uiState.f143974b;
        AnimatedBackgroundType animatedBackgroundType = uiState.f143977h;
        b bVar = uiState.f143976g;
        ghk.h hVar = uiState.f;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(uiState.f143974b);
        navBarWithToolbar.setMenuItems(v.l(uiState.f143975c));
        navBarWithToolbar.setNavigationButtonIcon(uiState.d);
        Tabs tabs = e3().i;
        List<com.revolut.core.ui_kit.views.q> list = uiState.e;
        tabs.setVisibility(list.size() > 1 ? 0 : 8);
        tabs.setItems(list, uiState.f143973a);
        boolean z = bVar instanceof b.a;
        if ((e3().f.getVisibility() == 0) != (!z)) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            if (!(hVar.f143957a instanceof ghk.g)) {
                boolean z3 = hVar.f143958b instanceof ghk.g;
            }
        }
        LargeActionButton planPagerFlowTopButton = e3().f215181j;
        Intrinsics.checkNotNullExpressionValue(planPagerFlowTopButton, "planPagerFlowTopButton");
        d3(planPagerFlowTopButton, hVar.f143957a);
        LargeActionButton planPagerFlowBottomButton = e3().f215178c;
        Intrinsics.checkNotNullExpressionValue(planPagerFlowBottomButton, "planPagerFlowBottomButton");
        d3(planPagerFlowBottomButton, hVar.f143958b);
        FooterTextView footerTextView = e3().d;
        if (z) {
            footerTextView.setVisibility(8);
        } else {
            if (!(bVar instanceof ghk.k)) {
                throw new NoWhenBranchMatchedException();
            }
            footerTextView.setVisibility(0);
            footerTextView.setTextClause(((ghk.k) bVar).f143964a);
        }
        e3().f215177b.setBackgroundType(animatedBackgroundType);
        if (((Boolean) this.S.getValue()).booleanValue() && this.K.f103049h) {
            Activity activityM2 = m2();
            BaseDelegatesActivity baseDelegatesActivity = activityM2 instanceof BaseDelegatesActivity ? (BaseDelegatesActivity) activityM2 : null;
            if (baseDelegatesActivity != null) {
                CustomTheme.INSTANCE.getClass();
                baseDelegatesActivity.T0(CustomTheme.Companion.a(animatedBackgroundType), false);
            }
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.O = analyticsContext;
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        PlanPagerFlowContract$PlanPagerItem pagerItem2 = (PlanPagerFlowContract$PlanPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v0) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getQ() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (v0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = e3().f215179g;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        e3().f215178c.setVisibility(8);
        e3().f215177b.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
        e3().f215180h.registerOnPageChangeCallback((ghk.c) this.T.getValue());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        e3().f215180h.unregisterOnPageChangeCallback((ghk.c) this.T.getValue());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(e3().f215179g.f59410q), new ghk.d(this, null, 0), 3);
        r rVarFilter = e3().f215179g.o.f57403b.filter(new ge6.j(12, new gd8.j(29)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new ghk.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().i.f58882b), new ghk.f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(e3().d.f58608l), new ghk.f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(e3().f215178c.o), new ghk.d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(e3().f215181j.o), new ghk.d(this, null, 2), 3);
    }

    public final ngk.a e3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.N.getValue();
    }
}
