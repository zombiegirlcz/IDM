package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot;

import android.view.View;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.PlanSwitchToAnnualScreen;
import dli.a;
import dli.c;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx4.f0;
import le8.d;
import llb.e;
import llh.g;
import lnk.f;
import lnk.h;
import lnk.j;
import lw0.i;
import pki.b;
import qgk.i0;
import qgk.k1;
import qgk.l1;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_switch/kompot/PlanSwitchToAnnualScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llnk/h;", "Ldli/a;", "Llnk/j;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanSwitchToAnnualScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PlanSwitchToAnnualScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final f K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final ao.h P;

    public PlanSwitchToAnnualScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_base;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lnk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSwitchToAnnualScreen f197289b;

            {
                this.f197289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanSwitchToAnnualScreen planSwitchToAnnualScreen = this.f197289b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanSwitchToAnnualScreen.Q;
                        PlanSwitchToAnnualScreen planSwitchToAnnualScreen2 = this.f197289b;
                        return dli.f.a(planSwitchToAnnualScreen2, (i) planSwitchToAnnualScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanSwitchToAnnualScreen.Q;
                        qji.b bVarU2 = planSwitchToAnnualScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.di.PlanSwitchToAnnualScreenInjector");
                        k1 k1Var = (k1) bVarU2;
                        i0 i0Var = k1Var.f246081c;
                        k1 k1Var2 = k1Var.d;
                        f fVar = planSwitchToAnnualScreen.K;
                        fVar.getClass();
                        return new l1(i0Var, k1Var2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = PlanSwitchToAnnualScreen.Q;
                        return (i) ((l1) planSwitchToAnnualScreen.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lnk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSwitchToAnnualScreen f197289b;

            {
                this.f197289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanSwitchToAnnualScreen planSwitchToAnnualScreen = this.f197289b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanSwitchToAnnualScreen.Q;
                        PlanSwitchToAnnualScreen planSwitchToAnnualScreen2 = this.f197289b;
                        return dli.f.a(planSwitchToAnnualScreen2, (i) planSwitchToAnnualScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanSwitchToAnnualScreen.Q;
                        qji.b bVarU2 = planSwitchToAnnualScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.di.PlanSwitchToAnnualScreenInjector");
                        k1 k1Var = (k1) bVarU2;
                        i0 i0Var = k1Var.f246081c;
                        k1 k1Var2 = k1Var.d;
                        f fVar = planSwitchToAnnualScreen.K;
                        fVar.getClass();
                        return new l1(i0Var, k1Var2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = PlanSwitchToAnnualScreen.Q;
                        return (i) ((l1) planSwitchToAnnualScreen.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lnk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanSwitchToAnnualScreen f197289b;

            {
                this.f197289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanSwitchToAnnualScreen planSwitchToAnnualScreen = this.f197289b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanSwitchToAnnualScreen.Q;
                        PlanSwitchToAnnualScreen planSwitchToAnnualScreen2 = this.f197289b;
                        return dli.f.a(planSwitchToAnnualScreen2, (i) planSwitchToAnnualScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanSwitchToAnnualScreen.Q;
                        qji.b bVarU2 = planSwitchToAnnualScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.di.PlanSwitchToAnnualScreenInjector");
                        k1 k1Var = (k1) bVarU2;
                        i0 i0Var = k1Var.f246081c;
                        k1 k1Var2 = k1Var.d;
                        f fVar = planSwitchToAnnualScreen.K;
                        fVar.getClass();
                        return new l1(i0Var, k1Var2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = PlanSwitchToAnnualScreen.Q;
                        return (i) ((l1) planSwitchToAnnualScreen.N.getValue()).d.get();
                }
            }
        });
        this.P = s.t(this, new e(24));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarBottomSheet navBarBottomSheet = d3().f174514c;
        Clause clause = uiState.f197298b;
        navBarBottomSheet.setHeaderModel(clause != null ? new lw0.a(new TextLocalisedClause(R$string.switch_to_annual_prompt_switch_button, null, null, 14), clause, null, null, false, 28) : new lw0.h(i.TITLE_SUBTITLE));
        ActionFooterView actionFooterView = d3().f174513b;
        Clause clause2 = uiState.f197299c;
        if (clause2 == null) {
            actionFooterView.setVisibility(8);
        } else {
            actionFooterView.setModel(new aw0.e(false, uiState.d, null, new n6(clause2, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53));
            actionFooterView.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (lnk.i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new f0(rd0.e.b(d3().f174513b.e), 27), new d(this, (Continuation) null, 25), 3);
        r map = d3().f174513b.f.map(new g(22, new e(23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new la8.h(this, null, 27), 3);
    }

    public final jii.e d3() {
        return (jii.e) this.P.getValue(this, Q[0]);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
