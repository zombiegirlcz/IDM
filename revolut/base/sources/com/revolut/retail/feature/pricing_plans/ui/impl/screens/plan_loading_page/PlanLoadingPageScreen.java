package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_loading_page;

import aii.q;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_loading_page.PlanLoadingPageScreen;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mmk.c;
import mmk.d;
import pki.b;
import prk.u;
import qgk.o0;
import te0.w;
import xki.e;
import z92.f;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_loading_page/PlanLoadingPageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmmk/c;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanLoadingPageScreen extends ViewController<q> implements a {
    public final PlanLoadingPageScreenContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PlanLoadingPageScreen(PlanLoadingPageScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_plan_loading_page;
        this.M = f.m(inputData.f103578a);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanLoadingPageScreen f207241b;

            {
                this.f207241b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanLoadingPageScreen planLoadingPageScreen = this.f207241b;
                switch (i2) {
                    case 0:
                        PlanLoadingPageScreen planLoadingPageScreen2 = this.f207241b;
                        return dli.f.a(planLoadingPageScreen2, (d) planLoadingPageScreen2.P.getValue(), v.k(new TabsLoadingDelegate(), new RowLoadingDelegate(), new ListingTileLoadingDelegate(), new ListSubheaderLoadingDelegate()), R$id.planLoadingPageScreen_recyclerView, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = planLoadingPageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_loading_page.di.PlanLoadingPageScreenInjector");
                        planLoadingPageScreen.K.getClass();
                        o0 o0Var = new o0();
                        o0Var.f246172a = e4m.b.b(new u(o0Var, 1, 13));
                        o0Var.f246173b = e4m.b.b(new u(o0Var, 0, 13));
                        return o0Var;
                    default:
                        return (d) ((o0) planLoadingPageScreen.O.getValue()).f246173b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanLoadingPageScreen f207241b;

            {
                this.f207241b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanLoadingPageScreen planLoadingPageScreen = this.f207241b;
                switch (i22) {
                    case 0:
                        PlanLoadingPageScreen planLoadingPageScreen2 = this.f207241b;
                        return dli.f.a(planLoadingPageScreen2, (d) planLoadingPageScreen2.P.getValue(), v.k(new TabsLoadingDelegate(), new RowLoadingDelegate(), new ListingTileLoadingDelegate(), new ListSubheaderLoadingDelegate()), R$id.planLoadingPageScreen_recyclerView, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = planLoadingPageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_loading_page.di.PlanLoadingPageScreenInjector");
                        planLoadingPageScreen.K.getClass();
                        o0 o0Var = new o0();
                        o0Var.f246172a = e4m.b.b(new u(o0Var, 1, 13));
                        o0Var.f246173b = e4m.b.b(new u(o0Var, 0, 13));
                        return o0Var;
                    default:
                        return (d) ((o0) planLoadingPageScreen.O.getValue()).f246173b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanLoadingPageScreen f207241b;

            {
                this.f207241b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanLoadingPageScreen planLoadingPageScreen = this.f207241b;
                switch (i22) {
                    case 0:
                        PlanLoadingPageScreen planLoadingPageScreen2 = this.f207241b;
                        return dli.f.a(planLoadingPageScreen2, (d) planLoadingPageScreen2.P.getValue(), v.k(new TabsLoadingDelegate(), new RowLoadingDelegate(), new ListingTileLoadingDelegate(), new ListSubheaderLoadingDelegate()), R$id.planLoadingPageScreen_recyclerView, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = planLoadingPageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_loading_page.di.PlanLoadingPageScreenInjector");
                        planLoadingPageScreen.K.getClass();
                        o0 o0Var = new o0();
                        o0Var.f246172a = e4m.b.b(new u(o0Var, 1, 13));
                        o0Var.f246173b = e4m.b.b(new u(o0Var, 0, 13));
                        return o0Var;
                    default:
                        return (d) ((o0) planLoadingPageScreen.O.getValue()).f246173b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
