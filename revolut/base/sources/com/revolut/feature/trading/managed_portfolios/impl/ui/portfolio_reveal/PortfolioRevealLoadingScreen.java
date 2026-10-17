package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal;

import android.animation.AnimatorSet;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b8f.f;
import b8f.g;
import b8f.i;
import b8f.j;
import b8f.n;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SummaryCardLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealLoadingScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealLoadingScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealLoadingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb8f/i;", "Ldli/a;", "Lb8f/j;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioRevealLoadingScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PortfolioRevealLoadingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PortfolioRevealLoadingScreenContract$InputData K;
    public final h L;
    public final FullScreenStateDelegate M;
    public AnimatorSet N;
    public boolean O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PortfolioRevealLoadingScreen(PortfolioRevealLoadingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, f.f);
        this.M = new FullScreenStateDelegate();
        this.P = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: b8f.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealLoadingScreen f13230b;

            {
                this.f13230b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PortfolioRevealLoadingScreen portfolioRevealLoadingScreen = this.f13230b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealLoadingScreen.T;
                        qji.b bVarU2 = portfolioRevealLoadingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.di.PortfolioRevealLoadingScreenInjector");
                        w5f.u uVar = (w5f.u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        w5f.u uVar2 = uVar.f295243c;
                        PortfolioRevealLoadingScreenContract$InputData portfolioRevealLoadingScreenContract$InputData = portfolioRevealLoadingScreen.K;
                        portfolioRevealLoadingScreenContract$InputData.getClass();
                        return new w5f.w(mVar, uVar2, portfolioRevealLoadingScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealLoadingScreen.T;
                        return (n) ((w5f.w) portfolioRevealLoadingScreen.Q.getValue()).f295247b.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealLoadingScreen.T;
                        PortfolioRevealLoadingScreen portfolioRevealLoadingScreen2 = this.f13230b;
                        return dli.f.a(portfolioRevealLoadingScreen2, (n) portfolioRevealLoadingScreen2.R.getValue(), zhm.v.k(portfolioRevealLoadingScreen2.M, new SummaryCardLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: b8f.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealLoadingScreen f13230b;

            {
                this.f13230b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PortfolioRevealLoadingScreen portfolioRevealLoadingScreen = this.f13230b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealLoadingScreen.T;
                        qji.b bVarU2 = portfolioRevealLoadingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.di.PortfolioRevealLoadingScreenInjector");
                        w5f.u uVar = (w5f.u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        w5f.u uVar2 = uVar.f295243c;
                        PortfolioRevealLoadingScreenContract$InputData portfolioRevealLoadingScreenContract$InputData = portfolioRevealLoadingScreen.K;
                        portfolioRevealLoadingScreenContract$InputData.getClass();
                        return new w5f.w(mVar, uVar2, portfolioRevealLoadingScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealLoadingScreen.T;
                        return (n) ((w5f.w) portfolioRevealLoadingScreen.Q.getValue()).f295247b.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealLoadingScreen.T;
                        PortfolioRevealLoadingScreen portfolioRevealLoadingScreen2 = this.f13230b;
                        return dli.f.a(portfolioRevealLoadingScreen2, (n) portfolioRevealLoadingScreen2.R.getValue(), zhm.v.k(portfolioRevealLoadingScreen2.M, new SummaryCardLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: b8f.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealLoadingScreen f13230b;

            {
                this.f13230b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PortfolioRevealLoadingScreen portfolioRevealLoadingScreen = this.f13230b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealLoadingScreen.T;
                        qji.b bVarU2 = portfolioRevealLoadingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.di.PortfolioRevealLoadingScreenInjector");
                        w5f.u uVar = (w5f.u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        w5f.u uVar2 = uVar.f295243c;
                        PortfolioRevealLoadingScreenContract$InputData portfolioRevealLoadingScreenContract$InputData = portfolioRevealLoadingScreen.K;
                        portfolioRevealLoadingScreenContract$InputData.getClass();
                        return new w5f.w(mVar, uVar2, portfolioRevealLoadingScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealLoadingScreen.T;
                        return (n) ((w5f.w) portfolioRevealLoadingScreen.Q.getValue()).f295247b.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealLoadingScreen.T;
                        PortfolioRevealLoadingScreen portfolioRevealLoadingScreen2 = this.f13230b;
                        return dli.f.a(portfolioRevealLoadingScreen2, (n) portfolioRevealLoadingScreen2.R.getValue(), zhm.v.k(portfolioRevealLoadingScreen2.M, new SummaryCardLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (this.O) {
            return;
        }
        this.O = true;
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        OneShotPreDrawListener.add(recyclerView, new ag.q(recyclerView, 3, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w5f.w) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonIcon(null);
        d3().f174540c.setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            this.N = null;
            animatorSet.cancel();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new g(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
