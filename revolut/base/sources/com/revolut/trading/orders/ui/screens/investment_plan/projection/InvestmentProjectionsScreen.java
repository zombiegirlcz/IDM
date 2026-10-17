package com.revolut.trading.orders.ui.screens.investment_plan.projection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.q;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.ForecastLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import java.util.List;
import jsl.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import vkm.q0;
import xki.e;
import xsl.j;
import z0h.s1;
import zr4.b;
import zul.c;
import zul.f;
import zul.g;
import zul.i;
import zul.o;
import zul.u;
import zul.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/screens/investment_plan/projection/InvestmentProjectionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzul/o;", "", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestmentProjectionsScreen extends ViewController<o> implements dli.a, s1 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f107027e0 = {o0.f186429a.j(new h0(InvestmentProjectionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final FixedTabsDelegate T;
    public final RowDelegate U;
    public final PlainTextDelegate V;
    public final ListSubheaderDelegate W;
    public final TrendViewDelegate X;
    public final CandleStickGraphDelegate Y;
    public final usc.a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final d f107028a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final zul.d f107029b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f107030d0;

    public InvestmentProjectionsScreen(InvestmentProjectionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, c.f);
        this.M = w.y0(new zk7.a(this, inputData, 19));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: zul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentProjectionsScreen f325521b;

            {
                this.f325521b = this;
            }

            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestmentProjectionsScreen investmentProjectionsScreen = this.f325521b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestmentProjectionsScreen.f107027e0;
                        return (q) ((xsl.j) investmentProjectionsScreen.M.getValue()).u.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InvestmentProjectionsScreen.f107027e0;
                        return zhm.v.k((ForecastDelegate) investmentProjectionsScreen.O.getValue(), new ForecastLoadingDelegate(), (InputSliderDelegate) investmentProjectionsScreen.Q.getValue(), new InputSliderLoadingDelegate(), (TextDelegate) investmentProjectionsScreen.R.getValue(), (FullScreenStateDelegate) investmentProjectionsScreen.S.getValue(), investmentProjectionsScreen.T, new FixedTabsLoadingDelegate(), investmentProjectionsScreen.U, investmentProjectionsScreen.V, investmentProjectionsScreen.W, (HeaderDelegate) investmentProjectionsScreen.P.getValue(), new HeaderLoadingDelegate(), investmentProjectionsScreen.X, investmentProjectionsScreen.Y);
                    default:
                        KProperty[] kPropertyArr3 = InvestmentProjectionsScreen.f107027e0;
                        InvestmentProjectionsScreen investmentProjectionsScreen2 = this.f325521b;
                        q qVarR2 = investmentProjectionsScreen2.R2();
                        List list = (List) investmentProjectionsScreen2.c0.getValue();
                        ScreenContentRecyclerView recyclerView = investmentProjectionsScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(investmentProjectionsScreen2, qVarR2, list, recyclerView.getId(), null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.O = w.y0(new b(22));
        this.P = w.y0(new b(23));
        this.Q = w.y0(new b(24));
        this.R = w.y0(new b(25));
        this.S = w.y0(new b(26));
        this.T = new FixedTabsDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new PlainTextDelegate();
        this.W = new ListSubheaderDelegate();
        this.X = new TrendViewDelegate(1000L);
        this.Y = new CandleStickGraphDelegate(yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        this.Z = new usc.a(this);
        this.f107028a0 = new d(this);
        this.f107029b0 = new zul.d(this);
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: zul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentProjectionsScreen f325521b;

            {
                this.f325521b = this;
            }

            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestmentProjectionsScreen investmentProjectionsScreen = this.f325521b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestmentProjectionsScreen.f107027e0;
                        return (q) ((xsl.j) investmentProjectionsScreen.M.getValue()).u.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InvestmentProjectionsScreen.f107027e0;
                        return zhm.v.k((ForecastDelegate) investmentProjectionsScreen.O.getValue(), new ForecastLoadingDelegate(), (InputSliderDelegate) investmentProjectionsScreen.Q.getValue(), new InputSliderLoadingDelegate(), (TextDelegate) investmentProjectionsScreen.R.getValue(), (FullScreenStateDelegate) investmentProjectionsScreen.S.getValue(), investmentProjectionsScreen.T, new FixedTabsLoadingDelegate(), investmentProjectionsScreen.U, investmentProjectionsScreen.V, investmentProjectionsScreen.W, (HeaderDelegate) investmentProjectionsScreen.P.getValue(), new HeaderLoadingDelegate(), investmentProjectionsScreen.X, investmentProjectionsScreen.Y);
                    default:
                        KProperty[] kPropertyArr3 = InvestmentProjectionsScreen.f107027e0;
                        InvestmentProjectionsScreen investmentProjectionsScreen2 = this.f325521b;
                        q qVarR2 = investmentProjectionsScreen2.R2();
                        List list = (List) investmentProjectionsScreen2.c0.getValue();
                        ScreenContentRecyclerView recyclerView = investmentProjectionsScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(investmentProjectionsScreen2, qVarR2, list, recyclerView.getId(), null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i3 = 2;
        this.f107030d0 = w.y0(new Function0(this) { // from class: zul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentProjectionsScreen f325521b;

            {
                this.f325521b = this;
            }

            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestmentProjectionsScreen investmentProjectionsScreen = this.f325521b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestmentProjectionsScreen.f107027e0;
                        return (q) ((xsl.j) investmentProjectionsScreen.M.getValue()).u.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InvestmentProjectionsScreen.f107027e0;
                        return zhm.v.k((ForecastDelegate) investmentProjectionsScreen.O.getValue(), new ForecastLoadingDelegate(), (InputSliderDelegate) investmentProjectionsScreen.Q.getValue(), new InputSliderLoadingDelegate(), (TextDelegate) investmentProjectionsScreen.R.getValue(), (FullScreenStateDelegate) investmentProjectionsScreen.S.getValue(), investmentProjectionsScreen.T, new FixedTabsLoadingDelegate(), investmentProjectionsScreen.U, investmentProjectionsScreen.V, investmentProjectionsScreen.W, (HeaderDelegate) investmentProjectionsScreen.P.getValue(), new HeaderLoadingDelegate(), investmentProjectionsScreen.X, investmentProjectionsScreen.Y);
                    default:
                        KProperty[] kPropertyArr3 = InvestmentProjectionsScreen.f107027e0;
                        InvestmentProjectionsScreen investmentProjectionsScreen2 = this.f325521b;
                        q qVarR2 = investmentProjectionsScreen2.R2();
                        List list = (List) investmentProjectionsScreen2.c0.getValue();
                        ScreenContentRecyclerView recyclerView = investmentProjectionsScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(investmentProjectionsScreen2, qVarR2, list, recyclerView.getId(), null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        zul.w uiState = (zul.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        v vVar = uiState.f325558a;
        u uVar = uiState.f325559b;
        navBarWithToolbar.setTitle(vVar.f325556b, null);
        navBarWithToolbar.setToolbarTitle(vVar.f325556b);
        navBarWithToolbar.setEndIconImage(vVar.f325555a);
        navBarWithToolbar.setDescriptionText(vVar.f325557c);
        Clause clause = vVar.d;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        if (vVar.e) {
            navBarWithToolbar.I0(t3.PROFILE, false);
        } else {
            navBarWithToolbar.l0();
        }
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setEnabled(uVar.f325554b);
        goToButton.setText(uVar.f325553a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new f(this, continuation, 0), 3);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        ViewController.P2(this, rd0.e.b(goToButton.o), new f(this, continuation, 1), 3);
        InputSliderDelegate inputSliderDelegate = (InputSliderDelegate) this.Q.getValue();
        ViewController.P2(this, new z75.f(rd0.e.b(inputSliderDelegate.f52559c), 24), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputSliderDelegate.e), new zul.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(((TextDelegate) this.R.getValue()).d), new i(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new q0(new z75.f(rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), 23), new zul.j(2, 4, zul.q.class, R2(), "onErrorRetryButtonClick", "onErrorRetryButtonClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 1), null, null, 7);
        ViewController.P2(this, rd0.e.b(this.T.f52339c.f121375b), new i(this, continuation, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, f107027e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final zul.q d() {
        return (zul.q) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f107030d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(((TextDelegate) this.R.getValue()).d);
    }
}
