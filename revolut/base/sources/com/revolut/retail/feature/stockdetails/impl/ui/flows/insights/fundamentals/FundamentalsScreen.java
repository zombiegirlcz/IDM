package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.BigRadialGaugeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FanChartDelegate;
import com.revolut.core.ui_kit.delegates.GroupedBarLineChartDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalLegendDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedLinearGaugeDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.FundamentalsScreen;
import com.revolut.retail.wealth.resources.R$string;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.g0;
import prk.t;
import prk.x;
import te0.w;
import tki.c;
import vc.s;
import wa3.d;
import wtk.b;
import wtk.f;
import wtk.g;
import wtk.i;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lwtk/o;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FundamentalsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(FundamentalsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final i K;
    public final Lazy L;
    public final Object M;
    public final int N;
    public final h O;
    public final HeaderDelegate P;
    public final ListSubheaderDelegate Q;
    public final CellDetailsDelegate R;
    public final GroupedBarLineChartDelegate S;
    public final HorizontalLegendDelegate T;
    public final TextDelegate U;
    public final SmallActionButtonDelegate V;
    public final Lazy W;
    public final j X;

    public FundamentalsScreen(i input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = yhm.j.b(new Function0(this) { // from class: wtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundamentalsScreen f300008b;

            {
                this.f300008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FundamentalsScreen fundamentalsScreen = this.f300008b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FundamentalsScreen.Y;
                        qji.b bVarU2 = fundamentalsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.di.FundamentalsScreenComponent.Injector");
                        x xVar = (x) bVarU2;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        i iVar = fundamentalsScreen.K;
                        fuk.e eVar = new fuk.e(iVar.f300016a);
                        fuk.c cVar = new fuk.c(fundamentalsScreen.R, fundamentalsScreen.S, fundamentalsScreen.T);
                        avk.j jVar = fundamentalsScreen.X;
                        jVar.getClass();
                        return new prk.t(g0Var, xVar2, iVar, eVar, cVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = FundamentalsScreen.Y;
                        return (j) ((prk.t) fundamentalsScreen.L.getValue()).f239299l.get();
                    default:
                        KProperty[] kPropertyArr3 = FundamentalsScreen.Y;
                        FundamentalsScreen fundamentalsScreen2 = this.f300008b;
                        return tki.g.a(fundamentalsScreen2, (j) ((prk.t) fundamentalsScreen2.L.getValue()).f239299l.get(), zhm.v.k(new BigRadialGaugeDelegate(), new FanChartDelegate(), new MultiTargetFanChartLoadingDelegate(), fundamentalsScreen2.U, new HorizontalBarGroupDelegate(), fundamentalsScreen2.Q, fundamentalsScreen2.R, fundamentalsScreen2.P, new HeaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new SegmentedLinearGaugeDelegate(), fundamentalsScreen2.S, fundamentalsScreen2.T, fundamentalsScreen2.V), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundamentalsScreen f300008b;

            {
                this.f300008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FundamentalsScreen fundamentalsScreen = this.f300008b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FundamentalsScreen.Y;
                        qji.b bVarU2 = fundamentalsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.di.FundamentalsScreenComponent.Injector");
                        x xVar = (x) bVarU2;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        i iVar = fundamentalsScreen.K;
                        fuk.e eVar = new fuk.e(iVar.f300016a);
                        fuk.c cVar = new fuk.c(fundamentalsScreen.R, fundamentalsScreen.S, fundamentalsScreen.T);
                        avk.j jVar = fundamentalsScreen.X;
                        jVar.getClass();
                        return new prk.t(g0Var, xVar2, iVar, eVar, cVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = FundamentalsScreen.Y;
                        return (j) ((prk.t) fundamentalsScreen.L.getValue()).f239299l.get();
                    default:
                        KProperty[] kPropertyArr3 = FundamentalsScreen.Y;
                        FundamentalsScreen fundamentalsScreen2 = this.f300008b;
                        return tki.g.a(fundamentalsScreen2, (j) ((prk.t) fundamentalsScreen2.L.getValue()).f239299l.get(), zhm.v.k(new BigRadialGaugeDelegate(), new FanChartDelegate(), new MultiTargetFanChartLoadingDelegate(), fundamentalsScreen2.U, new HorizontalBarGroupDelegate(), fundamentalsScreen2.Q, fundamentalsScreen2.R, fundamentalsScreen2.P, new HeaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new SegmentedLinearGaugeDelegate(), fundamentalsScreen2.S, fundamentalsScreen2.T, fundamentalsScreen2.V), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, b.f);
        this.P = new HeaderDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new CellDetailsDelegate();
        this.S = new GroupedBarLineChartDelegate();
        this.T = new HorizontalLegendDelegate();
        this.U = new TextDelegate();
        this.V = new SmallActionButtonDelegate();
        final int i3 = 2;
        this.W = yhm.j.b(new Function0(this) { // from class: wtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundamentalsScreen f300008b;

            {
                this.f300008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FundamentalsScreen fundamentalsScreen = this.f300008b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FundamentalsScreen.Y;
                        qji.b bVarU2 = fundamentalsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.di.FundamentalsScreenComponent.Injector");
                        x xVar = (x) bVarU2;
                        g0 g0Var = xVar.f239310b;
                        x xVar2 = xVar.f239311c;
                        i iVar = fundamentalsScreen.K;
                        fuk.e eVar = new fuk.e(iVar.f300016a);
                        fuk.c cVar = new fuk.c(fundamentalsScreen.R, fundamentalsScreen.S, fundamentalsScreen.T);
                        avk.j jVar = fundamentalsScreen.X;
                        jVar.getClass();
                        return new prk.t(g0Var, xVar2, iVar, eVar, cVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = FundamentalsScreen.Y;
                        return (j) ((prk.t) fundamentalsScreen.L.getValue()).f239299l.get();
                    default:
                        KProperty[] kPropertyArr3 = FundamentalsScreen.Y;
                        FundamentalsScreen fundamentalsScreen2 = this.f300008b;
                        return tki.g.a(fundamentalsScreen2, (j) ((prk.t) fundamentalsScreen2.L.getValue()).f239299l.get(), zhm.v.k(new BigRadialGaugeDelegate(), new FanChartDelegate(), new MultiTargetFanChartLoadingDelegate(), fundamentalsScreen2.U, new HorizontalBarGroupDelegate(), fundamentalsScreen2.Q, fundamentalsScreen2.R, fundamentalsScreen2.P, new HeaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new SegmentedLinearGaugeDelegate(), fundamentalsScreen2.S, fundamentalsScreen2.T, fundamentalsScreen2.V), 0, null, null, null, 60);
                }
            }
        });
        this.X = new j(this, 29);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((wtk.o) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wtk.j) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.instrument_fundamentals_title, null, null, 14), null);
        d3().f174539b.setToolbarTitle(new TextLocalisedClause(R$string.instrument_fundamentals_title, null, null, 14));
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, new d(rd0.e.b(this.Q.d), 26), new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(this.P.e.f121375b), 27), null, new f(this, null, 1), 3);
        ViewController.P2(this, new d(rd0.e.b(this.V.f53336c.f121375b), 28), new g(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.W.getValue();
    }
}
