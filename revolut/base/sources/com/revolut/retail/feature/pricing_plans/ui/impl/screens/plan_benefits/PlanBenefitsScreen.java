package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import qgk.i0;
import qgk.t;
import te0.w;
import vc.s;
import wkk.b;
import wkk.c;
import wkk.d;
import wkk.g;
import xki.e;
import z92.f;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwkk/g;", "Lno/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanBenefitsScreen extends ViewController<q> implements dli.a, k {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PlanBenefitsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanBenefitsBinding;", 0))};
    public final PlanBenefitsScreenContract$InputData K;
    public final int L;
    public final int M;
    public AnalyticsContext N;
    public final h O;
    public final FullScreenStateDelegate P;
    public final SplitColumnCellDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public PlanBenefitsScreen(PlanBenefitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_plan_benefits;
        this.M = f.m(inputData.f103459c);
        this.O = s.t(this, b.f);
        this.P = new FullScreenStateDelegate();
        this.Q = new SplitColumnCellDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: wkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBenefitsScreen f298291b;

            {
                this.f298291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanBenefitsScreen planBenefitsScreen = this.f298291b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBenefitsScreen.U;
                        PlanBenefitsScreen planBenefitsScreen2 = this.f298291b;
                        return dli.f.a(planBenefitsScreen2, (f) planBenefitsScreen2.T.getValue(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planBenefitsScreen2.Q, new SplitColumnCellLoadingDelegate(), planBenefitsScreen2.P), R$id.planBenefitsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBenefitsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(planBenefitsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanBenefitsScreenContract$InputData planBenefitsScreenContract$InputData = planBenefitsScreen.K;
                        planBenefitsScreenContract$InputData.getClass();
                        return new t(i0Var, planBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanBenefitsScreen.U;
                        return (f) ((t) planBenefitsScreen.S.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: wkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBenefitsScreen f298291b;

            {
                this.f298291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanBenefitsScreen planBenefitsScreen = this.f298291b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBenefitsScreen.U;
                        PlanBenefitsScreen planBenefitsScreen2 = this.f298291b;
                        return dli.f.a(planBenefitsScreen2, (f) planBenefitsScreen2.T.getValue(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planBenefitsScreen2.Q, new SplitColumnCellLoadingDelegate(), planBenefitsScreen2.P), R$id.planBenefitsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBenefitsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(planBenefitsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanBenefitsScreenContract$InputData planBenefitsScreenContract$InputData = planBenefitsScreen.K;
                        planBenefitsScreenContract$InputData.getClass();
                        return new t(i0Var, planBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanBenefitsScreen.U;
                        return (f) ((t) planBenefitsScreen.S.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: wkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBenefitsScreen f298291b;

            {
                this.f298291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanBenefitsScreen planBenefitsScreen = this.f298291b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBenefitsScreen.U;
                        PlanBenefitsScreen planBenefitsScreen2 = this.f298291b;
                        return dli.f.a(planBenefitsScreen2, (f) planBenefitsScreen2.T.getValue(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planBenefitsScreen2.Q, new SplitColumnCellLoadingDelegate(), planBenefitsScreen2.P), R$id.planBenefitsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBenefitsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(planBenefitsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanBenefitsScreenContract$InputData planBenefitsScreenContract$InputData = planBenefitsScreen.K;
                        planBenefitsScreenContract$InputData.getClass();
                        return new t(i0Var, planBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanBenefitsScreen.U;
                        return (f) ((t) planBenefitsScreen.S.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        this.N = uiState.d;
        NavBarWithToolbar planBenefitsScreenNavBarWithToolbar = d3().f215190c;
        Intrinsics.checkNotNullExpressionValue(planBenefitsScreenNavBarWithToolbar, "planBenefitsScreenNavBarWithToolbar");
        Clause clause = uiState.f298294a;
        planBenefitsScreenNavBarWithToolbar.setTitle(clause, null);
        d3().f215190c.setToolbarTitle(clause);
        d3().f215189b.setBackgroundType(uiState.f298295b);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.S.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getP() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wkk.f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar planBenefitsScreenNavBarWithToolbar = d3().f215190c;
        Intrinsics.checkNotNullExpressionValue(planBenefitsScreenNavBarWithToolbar, "planBenefitsScreenNavBarWithToolbar");
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        planBenefitsScreenNavBarWithToolbar.j0(false);
        d3().f215190c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f215190c.f59410q), null, new wkg.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new d(this, null), 3);
    }

    public final ngk.d d3() {
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
