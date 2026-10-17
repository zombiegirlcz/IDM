package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RatingBarDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedLinearGaugeDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.PortfolioInsightsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import d1h.j;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import rd0.e;
import t7f.f;
import te0.w;
import v7f.c;
import vc.s;
import vkm.d;
import w5f.t;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/main/PortfolioInsightsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lv7f/c;", "Ld1h/j;", "Ldli/a;", "Lt7f/f;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioInsightsScreen extends ViewController<Object> implements c, j, dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PortfolioInsightsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object Q;
    public final Object S;
    public final Object T;
    public final int K = R$layout.screen_recycler_navbar;
    public final FixedTabsDelegate L = new FixedTabsDelegate();
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final TagDelegate N = new TagDelegate();
    public final ListSubheaderDelegate O = new ListSubheaderDelegate();
    public final FooterTextDelegate P = new FooterTextDelegate();
    public final h R = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public PortfolioInsightsScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: t7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsScreen f268656b;

            {
                this.f268656b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PortfolioInsightsScreen portfolioInsightsScreen = this.f268656b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsScreen.U;
                        PortfolioInsightsScreen portfolioInsightsScreen2 = this.f268656b;
                        return dli.f.a(portfolioInsightsScreen2, (e) portfolioInsightsScreen2.T.getValue(), v.k(new HeaderDelegate(), portfolioInsightsScreen2.O, new CellDetailsLoadingDelegate(), new HeaderLoadingDelegate(), new SegmentedLinearGaugeDelegate(), new RatingBarDelegate(), portfolioInsightsScreen2.P, portfolioInsightsScreen2.L, portfolioInsightsScreen2.M, portfolioInsightsScreen2.N, new FooterTextLoadingDelegate(), new TrendViewDelegate(200L)), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsScreen.U;
                        qji.b bVarU2 = portfolioInsightsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.di.PortfolioInsightsScreenInjector");
                        w5f.s sVar = (w5f.s) bVarU2;
                        return new t(sVar.f295234b, sVar.f295235c, portfolioInsightsScreen);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsScreen.U;
                        return (e) ((t) portfolioInsightsScreen.S.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: t7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsScreen f268656b;

            {
                this.f268656b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PortfolioInsightsScreen portfolioInsightsScreen = this.f268656b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsScreen.U;
                        PortfolioInsightsScreen portfolioInsightsScreen2 = this.f268656b;
                        return dli.f.a(portfolioInsightsScreen2, (e) portfolioInsightsScreen2.T.getValue(), v.k(new HeaderDelegate(), portfolioInsightsScreen2.O, new CellDetailsLoadingDelegate(), new HeaderLoadingDelegate(), new SegmentedLinearGaugeDelegate(), new RatingBarDelegate(), portfolioInsightsScreen2.P, portfolioInsightsScreen2.L, portfolioInsightsScreen2.M, portfolioInsightsScreen2.N, new FooterTextLoadingDelegate(), new TrendViewDelegate(200L)), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsScreen.U;
                        qji.b bVarU2 = portfolioInsightsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.di.PortfolioInsightsScreenInjector");
                        w5f.s sVar = (w5f.s) bVarU2;
                        return new t(sVar.f295234b, sVar.f295235c, portfolioInsightsScreen);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsScreen.U;
                        return (e) ((t) portfolioInsightsScreen.S.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: t7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsScreen f268656b;

            {
                this.f268656b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PortfolioInsightsScreen portfolioInsightsScreen = this.f268656b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsScreen.U;
                        PortfolioInsightsScreen portfolioInsightsScreen2 = this.f268656b;
                        return dli.f.a(portfolioInsightsScreen2, (e) portfolioInsightsScreen2.T.getValue(), v.k(new HeaderDelegate(), portfolioInsightsScreen2.O, new CellDetailsLoadingDelegate(), new HeaderLoadingDelegate(), new SegmentedLinearGaugeDelegate(), new RatingBarDelegate(), portfolioInsightsScreen2.P, portfolioInsightsScreen2.L, portfolioInsightsScreen2.M, portfolioInsightsScreen2.N, new FooterTextLoadingDelegate(), new TrendViewDelegate(200L)), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsScreen.U;
                        qji.b bVarU2 = portfolioInsightsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.di.PortfolioInsightsScreenInjector");
                        w5f.s sVar = (w5f.s) bVarU2;
                        return new t(sVar.f295234b, sVar.f295235c, portfolioInsightsScreen);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsScreen.U;
                        return (e) ((t) portfolioInsightsScreen.S.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getP() {
        return this.P;
    }

    @Override // i6f.w0
    public final d L0() {
        return e.b(this.M.f52371h.f121375b);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (t7f.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_robo_insights_performance_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_robo_insights_performance_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.wealth_robo_insights_performance_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, e.b(((m) value).f174539b.f59410q), new t05.m(this, continuation, 10), 3);
        ViewController.P2(this, e.b(this.M.f52371h.f121375b), new t7f.c(this, null), 3);
        ViewController.P2(this, new t05.c(e.b(this.O.d), 28), new sy6.j(this, continuation, 24), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
