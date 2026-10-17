package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return_chart_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import buk.c;
import buk.e;
import buk.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return_chart_info.ExpectedAnnualReturnChartInfoScreen;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import prk.g0;
import prk.r;
import prk.x;
import vc.s;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/modal_screens/expected_annual_return_chart_info/ExpectedAnnualReturnChartInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbuk/f;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpectedAnnualReturnChartInfoScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ExpectedAnnualReturnChartInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final e K;
    public final h L;
    public final Lazy M;
    public final Lazy N;
    public final int O;
    public final Lazy P;

    public ExpectedAnnualReturnChartInfoScreen(e input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = s.t(this, c.f);
        final int i = 0;
        this.M = j.b(new Function0(this) { // from class: buk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAnnualReturnChartInfoScreen f18896b;

            {
                this.f18896b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExpectedAnnualReturnChartInfoScreen expectedAnnualReturnChartInfoScreen = this.f18896b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ExpectedAnnualReturnChartInfoScreen.Q;
                        qji.b bVarR1 = expectedAnnualReturnChartInfoScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return_chart_info.di.ExpectedAnnualReturnChartInfoScreenComponent.Injector");
                        x xVar = (x) bVarR1;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        e eVar = expectedAnnualReturnChartInfoScreen.K;
                        eVar.getClass();
                        return new r(g0Var, xVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpectedAnnualReturnChartInfoScreen.Q;
                        return (a) ((r) expectedAnnualReturnChartInfoScreen.M.getValue()).f239290b.get();
                    default:
                        KProperty[] kPropertyArr3 = ExpectedAnnualReturnChartInfoScreen.Q;
                        ExpectedAnnualReturnChartInfoScreen expectedAnnualReturnChartInfoScreen2 = this.f18896b;
                        return dli.f.a(expectedAnnualReturnChartInfoScreen2, (a) expectedAnnualReturnChartInfoScreen2.N.getValue(), u.c(new CellDetailsStandaloneNoteDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = j.b(new Function0(this) { // from class: buk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAnnualReturnChartInfoScreen f18896b;

            {
                this.f18896b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExpectedAnnualReturnChartInfoScreen expectedAnnualReturnChartInfoScreen = this.f18896b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpectedAnnualReturnChartInfoScreen.Q;
                        qji.b bVarR1 = expectedAnnualReturnChartInfoScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return_chart_info.di.ExpectedAnnualReturnChartInfoScreenComponent.Injector");
                        x xVar = (x) bVarR1;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        e eVar = expectedAnnualReturnChartInfoScreen.K;
                        eVar.getClass();
                        return new r(g0Var, xVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpectedAnnualReturnChartInfoScreen.Q;
                        return (a) ((r) expectedAnnualReturnChartInfoScreen.M.getValue()).f239290b.get();
                    default:
                        KProperty[] kPropertyArr3 = ExpectedAnnualReturnChartInfoScreen.Q;
                        ExpectedAnnualReturnChartInfoScreen expectedAnnualReturnChartInfoScreen2 = this.f18896b;
                        return dli.f.a(expectedAnnualReturnChartInfoScreen2, (a) expectedAnnualReturnChartInfoScreen2.N.getValue(), u.c(new CellDetailsStandaloneNoteDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        final int i3 = 2;
        this.P = j.b(new Function0(this) { // from class: buk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAnnualReturnChartInfoScreen f18896b;

            {
                this.f18896b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ExpectedAnnualReturnChartInfoScreen expectedAnnualReturnChartInfoScreen = this.f18896b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpectedAnnualReturnChartInfoScreen.Q;
                        qji.b bVarR1 = expectedAnnualReturnChartInfoScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return_chart_info.di.ExpectedAnnualReturnChartInfoScreenComponent.Injector");
                        x xVar = (x) bVarR1;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        e eVar = expectedAnnualReturnChartInfoScreen.K;
                        eVar.getClass();
                        return new r(g0Var, xVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpectedAnnualReturnChartInfoScreen.Q;
                        return (a) ((r) expectedAnnualReturnChartInfoScreen.M.getValue()).f239290b.get();
                    default:
                        KProperty[] kPropertyArr3 = ExpectedAnnualReturnChartInfoScreen.Q;
                        ExpectedAnnualReturnChartInfoScreen expectedAnnualReturnChartInfoScreen2 = this.f18896b;
                        return dli.f.a(expectedAnnualReturnChartInfoScreen2, (a) expectedAnnualReturnChartInfoScreen2.N.getValue(), u.c(new CellDetailsStandaloneNoteDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f18899a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f18900b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (buk.a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_got_it, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new brc.h(this, null, 9), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
