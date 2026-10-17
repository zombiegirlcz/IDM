package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.analyst_ratings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.BigRadialGaugeDelegate;
import com.revolut.core.ui_kit.delegates.FanChartDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.analyst_ratings.AnalystRatingsScreen;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.f;
import prk.g0;
import prk.x;
import rlh.c;
import rtk.b;
import rtk.d;
import rtk.e;
import rtk.g;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/analyst_ratings/AnalystRatingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lrtk/e;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalystRatingsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AnalystRatingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final d K;
    public final TextDelegate L;
    public final Lazy M;
    public final Object N;
    public final int O;
    public final h P;
    public final Lazy Q;
    public final j R;

    public AnalystRatingsScreen(d input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = new TextDelegate();
        final int i = 0;
        this.M = yhm.j.b(new Function0(this) { // from class: rtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalystRatingsScreen f257298b;

            {
                this.f257298b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AnalystRatingsScreen analystRatingsScreen = this.f257298b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AnalystRatingsScreen.S;
                        qji.b bVarU2 = analystRatingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.analyst_ratings.di.AnalystRatingsScreenComponent.Injector");
                        x xVar = (x) bVarU2;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        d dVar = analystRatingsScreen.K;
                        j jVar = analystRatingsScreen.R;
                        dVar.getClass();
                        jVar.getClass();
                        return new prk.f(g0Var, xVar2, dVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AnalystRatingsScreen.S;
                        return (g) ((prk.f) analystRatingsScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AnalystRatingsScreen.S;
                        AnalystRatingsScreen analystRatingsScreen2 = this.f257298b;
                        return dli.f.a(analystRatingsScreen2, (g) ((prk.f) analystRatingsScreen2.M.getValue()).f.get(), v.k(new BigRadialGaugeDelegate(), new FanChartDelegate(), new MultiTargetFanChartLoadingDelegate(), new HorizontalBarGroupDelegate(), analystRatingsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: rtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalystRatingsScreen f257298b;

            {
                this.f257298b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AnalystRatingsScreen analystRatingsScreen = this.f257298b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnalystRatingsScreen.S;
                        qji.b bVarU2 = analystRatingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.analyst_ratings.di.AnalystRatingsScreenComponent.Injector");
                        x xVar = (x) bVarU2;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        d dVar = analystRatingsScreen.K;
                        j jVar = analystRatingsScreen.R;
                        dVar.getClass();
                        jVar.getClass();
                        return new prk.f(g0Var, xVar2, dVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AnalystRatingsScreen.S;
                        return (g) ((prk.f) analystRatingsScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AnalystRatingsScreen.S;
                        AnalystRatingsScreen analystRatingsScreen2 = this.f257298b;
                        return dli.f.a(analystRatingsScreen2, (g) ((prk.f) analystRatingsScreen2.M.getValue()).f.get(), v.k(new BigRadialGaugeDelegate(), new FanChartDelegate(), new MultiTargetFanChartLoadingDelegate(), new HorizontalBarGroupDelegate(), analystRatingsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar;
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = yhm.j.b(new Function0(this) { // from class: rtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalystRatingsScreen f257298b;

            {
                this.f257298b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AnalystRatingsScreen analystRatingsScreen = this.f257298b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnalystRatingsScreen.S;
                        qji.b bVarU2 = analystRatingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.analyst_ratings.di.AnalystRatingsScreenComponent.Injector");
                        x xVar = (x) bVarU2;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        d dVar = analystRatingsScreen.K;
                        j jVar = analystRatingsScreen.R;
                        dVar.getClass();
                        jVar.getClass();
                        return new prk.f(g0Var, xVar2, dVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AnalystRatingsScreen.S;
                        return (g) ((prk.f) analystRatingsScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AnalystRatingsScreen.S;
                        AnalystRatingsScreen analystRatingsScreen2 = this.f257298b;
                        return dli.f.a(analystRatingsScreen2, (g) ((prk.f) analystRatingsScreen2.M.getValue()).f.get(), v.k(new BigRadialGaugeDelegate(), new FanChartDelegate(), new MultiTargetFanChartLoadingDelegate(), new HorizontalBarGroupDelegate(), analystRatingsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        this.R = new j(this, 25);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.instrument_analyst_forecasts_title, null, null, 14), null);
        d3().f174539b.setToolbarTitle(new TextLocalisedClause(R$string.instrument_analyst_forecasts_title, null, null, 14));
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 17), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.O;
    }

    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
