package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return.ExpectedAnnualReturnInfoScreen;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.g0;
import prk.s;
import prk.x;
import te0.w;
import yhm.j;
import zhm.v;
import ztk.b;
import ztk.d;
import ztk.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/modal_screens/expected_annual_return/ExpectedAnnualReturnInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lztk/e;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpectedAnnualReturnInfoScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ExpectedAnnualReturnInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final d K;
    public final Lazy L;
    public final Object M;
    public final int N;
    public final h O;
    public final Lazy P;

    public ExpectedAnnualReturnInfoScreen(d input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: ztk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAnnualReturnInfoScreen f325174b;

            {
                this.f325174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExpectedAnnualReturnInfoScreen expectedAnnualReturnInfoScreen = this.f325174b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ExpectedAnnualReturnInfoScreen.Q;
                        qji.b bVarR1 = expectedAnnualReturnInfoScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return.di.ExpectedAnnualReturnInfoScreenComponent.Injector");
                        x xVar = (x) bVarR1;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        d dVar = expectedAnnualReturnInfoScreen.K;
                        dVar.getClass();
                        return new s(g0Var, xVar2, dVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpectedAnnualReturnInfoScreen.Q;
                        return (h) ((s) expectedAnnualReturnInfoScreen.L.getValue()).f239292b.get();
                    default:
                        KProperty[] kPropertyArr3 = ExpectedAnnualReturnInfoScreen.Q;
                        ExpectedAnnualReturnInfoScreen expectedAnnualReturnInfoScreen2 = this.f325174b;
                        return dli.f.a(expectedAnnualReturnInfoScreen2, (h) ((s) expectedAnnualReturnInfoScreen2.L.getValue()).f239292b.get(), v.k(new PlainTextDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new PlainTextLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ztk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAnnualReturnInfoScreen f325174b;

            {
                this.f325174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExpectedAnnualReturnInfoScreen expectedAnnualReturnInfoScreen = this.f325174b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpectedAnnualReturnInfoScreen.Q;
                        qji.b bVarR1 = expectedAnnualReturnInfoScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return.di.ExpectedAnnualReturnInfoScreenComponent.Injector");
                        x xVar = (x) bVarR1;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        d dVar = expectedAnnualReturnInfoScreen.K;
                        dVar.getClass();
                        return new s(g0Var, xVar2, dVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpectedAnnualReturnInfoScreen.Q;
                        return (h) ((s) expectedAnnualReturnInfoScreen.L.getValue()).f239292b.get();
                    default:
                        KProperty[] kPropertyArr3 = ExpectedAnnualReturnInfoScreen.Q;
                        ExpectedAnnualReturnInfoScreen expectedAnnualReturnInfoScreen2 = this.f325174b;
                        return dli.f.a(expectedAnnualReturnInfoScreen2, (h) ((s) expectedAnnualReturnInfoScreen2.L.getValue()).f239292b.get(), v.k(new PlainTextDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new PlainTextLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = vc.s.t(this, b.f);
        final int i3 = 2;
        this.P = j.b(new Function0(this) { // from class: ztk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAnnualReturnInfoScreen f325174b;

            {
                this.f325174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ExpectedAnnualReturnInfoScreen expectedAnnualReturnInfoScreen = this.f325174b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpectedAnnualReturnInfoScreen.Q;
                        qji.b bVarR1 = expectedAnnualReturnInfoScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return.di.ExpectedAnnualReturnInfoScreenComponent.Injector");
                        x xVar = (x) bVarR1;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        d dVar = expectedAnnualReturnInfoScreen.K;
                        dVar.getClass();
                        return new s(g0Var, xVar2, dVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpectedAnnualReturnInfoScreen.Q;
                        return (h) ((s) expectedAnnualReturnInfoScreen.L.getValue()).f239292b.get();
                    default:
                        KProperty[] kPropertyArr3 = ExpectedAnnualReturnInfoScreen.Q;
                        ExpectedAnnualReturnInfoScreen expectedAnnualReturnInfoScreen2 = this.f325174b;
                        return dli.f.a(expectedAnnualReturnInfoScreen2, (h) ((s) expectedAnnualReturnInfoScreen2.L.getValue()).f239292b.get(), v.k(new PlainTextDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new PlainTextLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ztk.h) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.instrument_insights_expected_annual_return_screen_title, null, null, 14), null);
        d3().f174539b.setSecondDescriptionVisible(true);
        d3().f174539b.setSecondDescriptionText(new TextLocalisedClause(R$string.instrument_insights_expected_annual_return_screen_description, null, null, 14));
        d3().f174539b.setToolbarTitle(new TextLocalisedClause(R$string.instrument_insights_expected_annual_return_screen_title, null, null, 14));
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new z3f.b(this, null, 29), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.N;
    }

    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
