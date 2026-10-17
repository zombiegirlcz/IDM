package com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview;

import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.ForecastLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.trading.managed_portfolios.impl.R$id;
import com.revolut.feature.trading.managed_portfolios.impl.R$layout;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.fees.ManagedPortfolioDetailsFeesExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import d1h.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import n8f.b;
import n8f.c;
import n8f.d;
import n8f.f;
import n8f.g;
import n8f.i;
import n8f.k;
import n8f.l;
import n8f.m;
import n8f.n;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.q1;
import tx0.u1;
import vc.s;
import w5f.z;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/strategy_overview/StrategyOverviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ln8f/i;", "Ldli/a;", "Ln8f/o;", "Ld1h/j;", "Companion", "a", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StrategyOverviewScreen extends ViewController<i> implements dli.a, j {
    public final StrategyOverviewScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final RowLoadingDelegate N;
    public final ListSubheaderDelegate O;
    public final CellDetailsDelegate P;
    public final CellDetailsLoadingDelegate Q;
    public final CellDetailsChevronDelegate R;
    public final PlainTextDelegate S;
    public final PlainTextLoadingDelegate T;
    public final SmallActionButtonDelegate U;
    public final ToDoItemDelegate V;
    public final FixedTabsDelegate W;
    public final TextDelegate X;
    public final InputSliderDelegate Y;
    public final ForecastDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ForecastLoadingDelegate f91484a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TrendViewDelegate f91485b0;
    public final FooterTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final FullScreenStateDelegate f91486d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f91487e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f91488h0;
    public final g i0;
    public final b j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final d f91489k0;
    public static final /* synthetic */ KProperty[] l0 = {o0.f186429a.j(new h0(StrategyOverviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/trading/managed_portfolios/impl/databinding/ScreenStrategyOverviewBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public StrategyOverviewScreen(StrategyOverviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new RowLoadingDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = new CellDetailsDelegate();
        this.Q = new CellDetailsLoadingDelegate();
        this.R = new CellDetailsChevronDelegate();
        this.S = new PlainTextDelegate();
        this.T = new PlainTextLoadingDelegate();
        this.U = new SmallActionButtonDelegate();
        this.V = new ToDoItemDelegate();
        this.W = new FixedTabsDelegate();
        this.X = new TextDelegate();
        this.Y = new InputSliderDelegate();
        this.Z = new ForecastDelegate();
        this.f91484a0 = new ForecastLoadingDelegate();
        this.f91485b0 = new TrendViewDelegate(1000L);
        this.c0 = new FooterTextDelegate();
        this.f91486d0 = new FullScreenStateDelegate();
        this.f91487e0 = R$layout.screen_strategy_overview;
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: n8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyOverviewScreen f213361b;

            {
                this.f213361b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = StrategyOverviewScreen.l0;
                        StrategyOverviewScreen strategyOverviewScreen = this.f213361b;
                        Activity activityM2 = strategyOverviewScreen.m2();
                        StrategyOverviewScreenContract$InputData strategyOverviewScreenContract$InputData = strategyOverviewScreen.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        strategyOverviewScreenContract$InputData.getClass();
                        String str = strategyOverviewScreenContract$InputData.f91490a;
                        jlc.e eVar = new jlc.e(strategyOverviewScreen.Z, strategyOverviewScreen.f91484a0, strategyOverviewScreen.f91485b0, strategyOverviewScreen.X, strategyOverviewScreen.Y, null, null, null);
                        ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData = new ManagedPortfolioPerformanceExtensionContract$InputData(str);
                        g gVar = strategyOverviewScreen.i0;
                        gVar.getClass();
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(str, a6f.a.FORCE_TEMPLATE, true);
                        b bVar = strategyOverviewScreen.j0;
                        bVar.getClass();
                        ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData = new ManagedPortfolioDetailsFeesExtensionContract$InputData(str);
                        d dVar = strategyOverviewScreen.f91489k0;
                        dVar.getClass();
                        return new z(mVar, strategyOverviewScreen, strategyOverviewScreenContract$InputData, eVar, managedPortfolioPerformanceExtensionContract$InputData, gVar, managedPortfolioDetailsAllocationContract$InputData, bVar, managedPortfolioDetailsFeesExtensionContract$InputData, dVar, strategyOverviewScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = StrategyOverviewScreen.l0;
                        return (j) ((z) this.f213361b.f0.getValue()).D.get();
                    default:
                        KProperty[] kPropertyArr3 = StrategyOverviewScreen.l0;
                        StrategyOverviewScreen strategyOverviewScreen2 = this.f213361b;
                        return dli.f.a(strategyOverviewScreen2, (j) strategyOverviewScreen2.g0.getValue(), v.k(strategyOverviewScreen2.f91486d0, new HeaderDelegate(), strategyOverviewScreen2.M, strategyOverviewScreen2.N, strategyOverviewScreen2.O, strategyOverviewScreen2.P, strategyOverviewScreen2.Q, strategyOverviewScreen2.R, strategyOverviewScreen2.S, strategyOverviewScreen2.T, strategyOverviewScreen2.U, strategyOverviewScreen2.V, strategyOverviewScreen2.W, strategyOverviewScreen2.X, strategyOverviewScreen2.Y, strategyOverviewScreen2.Z, strategyOverviewScreen2.f91484a0, strategyOverviewScreen2.f91485b0, strategyOverviewScreen2.c0, new FooterTextLoadingDelegate()), R$id.strategyOverviewScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.g0 = w.y0(new Function0(this) { // from class: n8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyOverviewScreen f213361b;

            {
                this.f213361b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StrategyOverviewScreen.l0;
                        StrategyOverviewScreen strategyOverviewScreen = this.f213361b;
                        Activity activityM2 = strategyOverviewScreen.m2();
                        StrategyOverviewScreenContract$InputData strategyOverviewScreenContract$InputData = strategyOverviewScreen.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        strategyOverviewScreenContract$InputData.getClass();
                        String str = strategyOverviewScreenContract$InputData.f91490a;
                        jlc.e eVar = new jlc.e(strategyOverviewScreen.Z, strategyOverviewScreen.f91484a0, strategyOverviewScreen.f91485b0, strategyOverviewScreen.X, strategyOverviewScreen.Y, null, null, null);
                        ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData = new ManagedPortfolioPerformanceExtensionContract$InputData(str);
                        g gVar = strategyOverviewScreen.i0;
                        gVar.getClass();
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(str, a6f.a.FORCE_TEMPLATE, true);
                        b bVar = strategyOverviewScreen.j0;
                        bVar.getClass();
                        ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData = new ManagedPortfolioDetailsFeesExtensionContract$InputData(str);
                        d dVar = strategyOverviewScreen.f91489k0;
                        dVar.getClass();
                        return new z(mVar, strategyOverviewScreen, strategyOverviewScreenContract$InputData, eVar, managedPortfolioPerformanceExtensionContract$InputData, gVar, managedPortfolioDetailsAllocationContract$InputData, bVar, managedPortfolioDetailsFeesExtensionContract$InputData, dVar, strategyOverviewScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = StrategyOverviewScreen.l0;
                        return (j) ((z) this.f213361b.f0.getValue()).D.get();
                    default:
                        KProperty[] kPropertyArr3 = StrategyOverviewScreen.l0;
                        StrategyOverviewScreen strategyOverviewScreen2 = this.f213361b;
                        return dli.f.a(strategyOverviewScreen2, (j) strategyOverviewScreen2.g0.getValue(), v.k(strategyOverviewScreen2.f91486d0, new HeaderDelegate(), strategyOverviewScreen2.M, strategyOverviewScreen2.N, strategyOverviewScreen2.O, strategyOverviewScreen2.P, strategyOverviewScreen2.Q, strategyOverviewScreen2.R, strategyOverviewScreen2.S, strategyOverviewScreen2.T, strategyOverviewScreen2.U, strategyOverviewScreen2.V, strategyOverviewScreen2.W, strategyOverviewScreen2.X, strategyOverviewScreen2.Y, strategyOverviewScreen2.Z, strategyOverviewScreen2.f91484a0, strategyOverviewScreen2.f91485b0, strategyOverviewScreen2.c0, new FooterTextLoadingDelegate()), R$id.strategyOverviewScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i3 = 2;
        this.f91488h0 = w.y0(new Function0(this) { // from class: n8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyOverviewScreen f213361b;

            {
                this.f213361b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = StrategyOverviewScreen.l0;
                        StrategyOverviewScreen strategyOverviewScreen = this.f213361b;
                        Activity activityM2 = strategyOverviewScreen.m2();
                        StrategyOverviewScreenContract$InputData strategyOverviewScreenContract$InputData = strategyOverviewScreen.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        strategyOverviewScreenContract$InputData.getClass();
                        String str = strategyOverviewScreenContract$InputData.f91490a;
                        jlc.e eVar = new jlc.e(strategyOverviewScreen.Z, strategyOverviewScreen.f91484a0, strategyOverviewScreen.f91485b0, strategyOverviewScreen.X, strategyOverviewScreen.Y, null, null, null);
                        ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData = new ManagedPortfolioPerformanceExtensionContract$InputData(str);
                        g gVar = strategyOverviewScreen.i0;
                        gVar.getClass();
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(str, a6f.a.FORCE_TEMPLATE, true);
                        b bVar = strategyOverviewScreen.j0;
                        bVar.getClass();
                        ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData = new ManagedPortfolioDetailsFeesExtensionContract$InputData(str);
                        d dVar = strategyOverviewScreen.f91489k0;
                        dVar.getClass();
                        return new z(mVar, strategyOverviewScreen, strategyOverviewScreenContract$InputData, eVar, managedPortfolioPerformanceExtensionContract$InputData, gVar, managedPortfolioDetailsAllocationContract$InputData, bVar, managedPortfolioDetailsFeesExtensionContract$InputData, dVar, strategyOverviewScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = StrategyOverviewScreen.l0;
                        return (j) ((z) this.f213361b.f0.getValue()).D.get();
                    default:
                        KProperty[] kPropertyArr3 = StrategyOverviewScreen.l0;
                        StrategyOverviewScreen strategyOverviewScreen2 = this.f213361b;
                        return dli.f.a(strategyOverviewScreen2, (j) strategyOverviewScreen2.g0.getValue(), v.k(strategyOverviewScreen2.f91486d0, new HeaderDelegate(), strategyOverviewScreen2.M, strategyOverviewScreen2.N, strategyOverviewScreen2.O, strategyOverviewScreen2.P, strategyOverviewScreen2.Q, strategyOverviewScreen2.R, strategyOverviewScreen2.S, strategyOverviewScreen2.T, strategyOverviewScreen2.U, strategyOverviewScreen2.V, strategyOverviewScreen2.W, strategyOverviewScreen2.X, strategyOverviewScreen2.Y, strategyOverviewScreen2.Z, strategyOverviewScreen2.f91484a0, strategyOverviewScreen2.f91485b0, strategyOverviewScreen2.c0, new FooterTextLoadingDelegate()), R$id.strategyOverviewScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.i0 = new g(this);
        this.j0 = new b(this);
        this.f91489k0 = new d(this);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n8f.o uiState = (n8f.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        n nVar = uiState.f213379a;
        aw0.i iVar = uiState.f213381c;
        NavBarLargeCentred navBarLargeCentred = d3().f286214c;
        if (nVar instanceof k) {
            navBarLargeCentred.B();
            k kVar = (k) nVar;
            e3(navBarLargeCentred, kVar.f213375a);
            NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, kVar.f213376b, (q1) null, 2, (Object) null);
        } else if (nVar.equals(l.f213377a)) {
            navBarLargeCentred.B();
            e3(navBarLargeCentred, new NavBarLargeCentred.Model(null, null, null, null, null, null, null, null, 1023));
            NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, (Image) null, (q1) null, 2, (Object) null);
        } else {
            if (!nVar.equals(m.f213378a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarLargeCentred.H(u1.TITLE_AND_SUBTITLE);
            e3(navBarLargeCentred, new NavBarLargeCentred.Model(null, null, null, null, null, null, null, null, 1023));
            NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, (Image) null, (q1) null, 2, (Object) null);
        }
        ActionFooterView actionFooterView = d3().f286213b;
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getC0() {
        return this.c0;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getF91486d0() {
        return this.f91486d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n8f.j) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f286214c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f286214c.f59292m), new n8f.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.f91486d0.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f286213b.f), new n8f.e(this, null, 1), 3);
    }

    public final v5f.c d3() {
        ViewBinding value = this.L.getValue(this, l0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v5f.c) value;
    }

    public final void e3(NavBarLargeCentred navBarLargeCentred, NavBarLargeCentred.Model model) {
        navBarLargeCentred.setModel(NavBarLargeCentred.Model.a(model, null, null, null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 991));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.f91487e0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f91488h0.getValue();
    }

    @Override // d1h.j
    public final Flow y() {
        return rd0.e.b(this.X.d);
    }
}
