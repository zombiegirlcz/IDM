package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import b8f.p;
import b8f.u;
import b8f.v;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.SummaryCardDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d1h.j;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import w5f.x;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb8f/u;", "Ltki/c;", "Lb8f/w;", "Ld1h/j;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioRevealScreen extends ViewController<u> implements c, j {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PortfolioRevealScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final PortfolioRevealScreenContract$InputData K;
    public final h L;
    public final SummaryCardDelegate M;
    public final int N;
    public final FooterTextDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PortfolioRevealScreen(PortfolioRevealScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, p.f);
        this.M = new SummaryCardDelegate();
        this.N = R$layout.screen_recycler_navbar_action_footer;
        this.O = new FooterTextDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: b8f.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealScreen f13248b;

            {
                this.f13248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PortfolioRevealScreen portfolioRevealScreen = this.f13248b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealScreen.T;
                        qji.b bVarU2 = portfolioRevealScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.di.PortfolioRevealScreenInjector");
                        w5f.u uVar = (w5f.u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        w5f.u uVar2 = uVar.f295243c;
                        PortfolioRevealScreenContract$InputData portfolioRevealScreenContract$InputData = portfolioRevealScreen.K;
                        portfolioRevealScreenContract$InputData.getClass();
                        return new w5f.x(mVar, uVar2, portfolioRevealScreenContract$InputData, portfolioRevealScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealScreen.T;
                        return (v) ((w5f.x) portfolioRevealScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealScreen.T;
                        PortfolioRevealScreen portfolioRevealScreen2 = this.f13248b;
                        return tki.g.a(portfolioRevealScreen2, portfolioRevealScreen2.d(), zhm.v.k(portfolioRevealScreen2.P, portfolioRevealScreen2.O, new FooterTextLoadingDelegate(), portfolioRevealScreen2.M, new ListCellDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: b8f.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealScreen f13248b;

            {
                this.f13248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PortfolioRevealScreen portfolioRevealScreen = this.f13248b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealScreen.T;
                        qji.b bVarU2 = portfolioRevealScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.di.PortfolioRevealScreenInjector");
                        w5f.u uVar = (w5f.u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        w5f.u uVar2 = uVar.f295243c;
                        PortfolioRevealScreenContract$InputData portfolioRevealScreenContract$InputData = portfolioRevealScreen.K;
                        portfolioRevealScreenContract$InputData.getClass();
                        return new w5f.x(mVar, uVar2, portfolioRevealScreenContract$InputData, portfolioRevealScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealScreen.T;
                        return (v) ((w5f.x) portfolioRevealScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealScreen.T;
                        PortfolioRevealScreen portfolioRevealScreen2 = this.f13248b;
                        return tki.g.a(portfolioRevealScreen2, portfolioRevealScreen2.d(), zhm.v.k(portfolioRevealScreen2.P, portfolioRevealScreen2.O, new FooterTextLoadingDelegate(), portfolioRevealScreen2.M, new ListCellDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: b8f.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealScreen f13248b;

            {
                this.f13248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PortfolioRevealScreen portfolioRevealScreen = this.f13248b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealScreen.T;
                        qji.b bVarU2 = portfolioRevealScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.di.PortfolioRevealScreenInjector");
                        w5f.u uVar = (w5f.u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        w5f.u uVar2 = uVar.f295243c;
                        PortfolioRevealScreenContract$InputData portfolioRevealScreenContract$InputData = portfolioRevealScreen.K;
                        portfolioRevealScreenContract$InputData.getClass();
                        return new w5f.x(mVar, uVar2, portfolioRevealScreenContract$InputData, portfolioRevealScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealScreen.T;
                        return (v) ((w5f.x) portfolioRevealScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealScreen.T;
                        PortfolioRevealScreen portfolioRevealScreen2 = this.f13248b;
                        return tki.g.a(portfolioRevealScreen2, portfolioRevealScreen2.d(), zhm.v.k(portfolioRevealScreen2.P, portfolioRevealScreen2.O, new FooterTextLoadingDelegate(), portfolioRevealScreen2.M, new ListCellDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b8f.w uiState = (b8f.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView actionFooterView = d3().f174533b;
        i iVar = uiState.f13253b;
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getO() {
        return this.O;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new b8f.q(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new b8f.q(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53497c), new b8f.s(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v d() {
        return (v) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
