package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.PortfolioInsightsPerformanceController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.PortfolioInsightsPerformanceControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import dli.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w5f.d0;
import w5f.e0;
import xki.e;
import y7f.b;
import y7f.d;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/performance/PortfolioInsightsPerformanceController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ly7f/d;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioInsightsPerformanceController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PortfolioInsightsPerformanceController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PortfolioInsightsPerformanceControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public PortfolioInsightsPerformanceController(PortfolioInsightsPerformanceControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: y7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsPerformanceController f311506b;

            {
                this.f311506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PortfolioInsightsPerformanceController portfolioInsightsPerformanceController = this.f311506b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsPerformanceController.Q;
                        e0 e0Var = (e0) portfolioInsightsPerformanceController.O.getValue();
                        switch (e0Var.f295135a) {
                            case 0:
                                return (e) e0Var.d.get();
                            default:
                                return (e) e0Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsPerformanceController.Q;
                        qji.b bVarU2 = portfolioInsightsPerformanceController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.di.PortfolioInsightsPerformanceControllerInjector");
                        d0 d0Var = (d0) ((z7f.a) bVarU2).b().mo3808a(portfolioInsightsPerformanceController);
                        PortfolioInsightsPerformanceControllerContract$InputData portfolioInsightsPerformanceControllerContract$InputData = portfolioInsightsPerformanceController.K;
                        switch (d0Var.f295130a) {
                            case 0:
                                portfolioInsightsPerformanceControllerContract$InputData.getClass();
                                d0Var.d = portfolioInsightsPerformanceControllerContract$InputData;
                                break;
                            default:
                                portfolioInsightsPerformanceControllerContract$InputData.getClass();
                                d0Var.d = portfolioInsightsPerformanceControllerContract$InputData;
                                break;
                        }
                        return (e0) d0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsPerformanceController.Q;
                        PortfolioInsightsPerformanceController portfolioInsightsPerformanceController2 = this.f311506b;
                        return f.a(portfolioInsightsPerformanceController2, (e) portfolioInsightsPerformanceController2.M.getValue(), v.k(new PlainTextDelegate(), new VaultsProgressDelegate(), new HeaderDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: y7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsPerformanceController f311506b;

            {
                this.f311506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PortfolioInsightsPerformanceController portfolioInsightsPerformanceController = this.f311506b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsPerformanceController.Q;
                        e0 e0Var = (e0) portfolioInsightsPerformanceController.O.getValue();
                        switch (e0Var.f295135a) {
                            case 0:
                                return (e) e0Var.d.get();
                            default:
                                return (e) e0Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsPerformanceController.Q;
                        qji.b bVarU2 = portfolioInsightsPerformanceController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.di.PortfolioInsightsPerformanceControllerInjector");
                        d0 d0Var = (d0) ((z7f.a) bVarU2).b().mo3808a(portfolioInsightsPerformanceController);
                        PortfolioInsightsPerformanceControllerContract$InputData portfolioInsightsPerformanceControllerContract$InputData = portfolioInsightsPerformanceController.K;
                        switch (d0Var.f295130a) {
                            case 0:
                                portfolioInsightsPerformanceControllerContract$InputData.getClass();
                                d0Var.d = portfolioInsightsPerformanceControllerContract$InputData;
                                break;
                            default:
                                portfolioInsightsPerformanceControllerContract$InputData.getClass();
                                d0Var.d = portfolioInsightsPerformanceControllerContract$InputData;
                                break;
                        }
                        return (e0) d0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsPerformanceController.Q;
                        PortfolioInsightsPerformanceController portfolioInsightsPerformanceController2 = this.f311506b;
                        return f.a(portfolioInsightsPerformanceController2, (e) portfolioInsightsPerformanceController2.M.getValue(), v.k(new PlainTextDelegate(), new VaultsProgressDelegate(), new HeaderDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: y7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsPerformanceController f311506b;

            {
                this.f311506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PortfolioInsightsPerformanceController portfolioInsightsPerformanceController = this.f311506b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsPerformanceController.Q;
                        e0 e0Var = (e0) portfolioInsightsPerformanceController.O.getValue();
                        switch (e0Var.f295135a) {
                            case 0:
                                return (e) e0Var.d.get();
                            default:
                                return (e) e0Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsPerformanceController.Q;
                        qji.b bVarU2 = portfolioInsightsPerformanceController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.di.PortfolioInsightsPerformanceControllerInjector");
                        d0 d0Var = (d0) ((z7f.a) bVarU2).b().mo3808a(portfolioInsightsPerformanceController);
                        PortfolioInsightsPerformanceControllerContract$InputData portfolioInsightsPerformanceControllerContract$InputData = portfolioInsightsPerformanceController.K;
                        switch (d0Var.f295130a) {
                            case 0:
                                portfolioInsightsPerformanceControllerContract$InputData.getClass();
                                d0Var.d = portfolioInsightsPerformanceControllerContract$InputData;
                                break;
                            default:
                                portfolioInsightsPerformanceControllerContract$InputData.getClass();
                                d0Var.d = portfolioInsightsPerformanceControllerContract$InputData;
                                break;
                        }
                        return (e0) d0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsPerformanceController.Q;
                        PortfolioInsightsPerformanceController portfolioInsightsPerformanceController2 = this.f311506b;
                        return f.a(portfolioInsightsPerformanceController2, (e) portfolioInsightsPerformanceController2.M.getValue(), v.k(new PlainTextDelegate(), new VaultsProgressDelegate(), new HeaderDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f311508a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f311509b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (y7f.e) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new y5g.d(this, null, 5), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
