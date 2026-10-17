package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreenContract$InputData;
import dli.a;
import dli.c;
import glk.d;
import glk.f;
import glk.j;
import glk.k;
import glk.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import qgk.r2;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/downgrade_block/PlanDowngradeBlockScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lglk/j;", "Ldli/a;", "Lglk/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanDowngradeBlockScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PlanDowngradeBlockScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PlanDowngradeBlockScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;

    public PlanDowngradeBlockScreen(PlanDowngradeBlockScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, d.f);
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: glk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeBlockScreen f144717b;

            {
                this.f144717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanDowngradeBlockScreen planDowngradeBlockScreen = this.f144717b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeBlockScreen.R;
                        qji.b bVarU2 = planDowngradeBlockScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.di.PlanDowngradeBlockScreenInjector");
                        r2 r2Var = (r2) ((hlk.b) bVarU2).b().mo3808a(planDowngradeBlockScreen);
                        PlanDowngradeBlockScreenContract$InputData planDowngradeBlockScreenContract$InputData = planDowngradeBlockScreen.K;
                        switch (r2Var.f246217a) {
                            case 0:
                                planDowngradeBlockScreenContract$InputData.getClass();
                                r2Var.d = planDowngradeBlockScreenContract$InputData;
                                break;
                            default:
                                planDowngradeBlockScreenContract$InputData.getClass();
                                r2Var.d = planDowngradeBlockScreenContract$InputData;
                                break;
                        }
                        return (hlk.a) r2Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeBlockScreen.R;
                        return ((hlk.a) planDowngradeBlockScreen.N.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeBlockScreen.R;
                        PlanDowngradeBlockScreen planDowngradeBlockScreen2 = this.f144717b;
                        return dli.f.a(planDowngradeBlockScreen2, (l) planDowngradeBlockScreen2.O.getValue(), u.c(planDowngradeBlockScreen2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: glk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeBlockScreen f144717b;

            {
                this.f144717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanDowngradeBlockScreen planDowngradeBlockScreen = this.f144717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeBlockScreen.R;
                        qji.b bVarU2 = planDowngradeBlockScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.di.PlanDowngradeBlockScreenInjector");
                        r2 r2Var = (r2) ((hlk.b) bVarU2).b().mo3808a(planDowngradeBlockScreen);
                        PlanDowngradeBlockScreenContract$InputData planDowngradeBlockScreenContract$InputData = planDowngradeBlockScreen.K;
                        switch (r2Var.f246217a) {
                            case 0:
                                planDowngradeBlockScreenContract$InputData.getClass();
                                r2Var.d = planDowngradeBlockScreenContract$InputData;
                                break;
                            default:
                                planDowngradeBlockScreenContract$InputData.getClass();
                                r2Var.d = planDowngradeBlockScreenContract$InputData;
                                break;
                        }
                        return (hlk.a) r2Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeBlockScreen.R;
                        return ((hlk.a) planDowngradeBlockScreen.N.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeBlockScreen.R;
                        PlanDowngradeBlockScreen planDowngradeBlockScreen2 = this.f144717b;
                        return dli.f.a(planDowngradeBlockScreen2, (l) planDowngradeBlockScreen2.O.getValue(), u.c(planDowngradeBlockScreen2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: glk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeBlockScreen f144717b;

            {
                this.f144717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanDowngradeBlockScreen planDowngradeBlockScreen = this.f144717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeBlockScreen.R;
                        qji.b bVarU2 = planDowngradeBlockScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.di.PlanDowngradeBlockScreenInjector");
                        r2 r2Var = (r2) ((hlk.b) bVarU2).b().mo3808a(planDowngradeBlockScreen);
                        PlanDowngradeBlockScreenContract$InputData planDowngradeBlockScreenContract$InputData = planDowngradeBlockScreen.K;
                        switch (r2Var.f246217a) {
                            case 0:
                                planDowngradeBlockScreenContract$InputData.getClass();
                                r2Var.d = planDowngradeBlockScreenContract$InputData;
                                break;
                            default:
                                planDowngradeBlockScreenContract$InputData.getClass();
                                r2Var.d = planDowngradeBlockScreenContract$InputData;
                                break;
                        }
                        return (hlk.a) r2Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeBlockScreen.R;
                        return ((hlk.a) planDowngradeBlockScreen.N.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeBlockScreen.R;
                        PlanDowngradeBlockScreen planDowngradeBlockScreen2 = this.f144717b;
                        return dli.f.a(planDowngradeBlockScreen2, (l) planDowngradeBlockScreen2.O.getValue(), u.c(planDowngradeBlockScreen2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setText(uiState.f144723b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hlk.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (l) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.plan_downgrade_ineligibility_reasons_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.plan_downgrade_ineligibility_reasons_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new glk.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new glk.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new f(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
