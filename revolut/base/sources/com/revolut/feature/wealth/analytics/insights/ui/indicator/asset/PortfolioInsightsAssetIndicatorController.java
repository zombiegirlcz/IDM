package com.revolut.feature.wealth.analytics.insights.ui.indicator.asset;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bxg.b;
import bxg.d;
import bxg.f;
import bxg.l;
import bxg.m;
import bxg.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorController;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/insights/ui/indicator/asset/PortfolioInsightsAssetIndicatorController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lbxg/o;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioInsightsAssetIndicatorController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PortfolioInsightsAssetIndicatorController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PortfolioInsightsAssetIndicatorControllerContract$InputData K;
    public final RowDelegate L;
    public final ListSubheaderDelegate M;
    public final FullScreenStateDelegate N;
    public final h O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PortfolioInsightsAssetIndicatorController(PortfolioInsightsAssetIndicatorControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = new ListSubheaderDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = s.t(this, b.f);
        this.P = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bxg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsAssetIndicatorController f19684b;

            {
                this.f19684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PortfolioInsightsAssetIndicatorController portfolioInsightsAssetIndicatorController = this.f19684b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsAssetIndicatorController.T;
                        PortfolioInsightsAssetIndicatorController portfolioInsightsAssetIndicatorController2 = this.f19684b;
                        return tki.g.a(portfolioInsightsAssetIndicatorController2, portfolioInsightsAssetIndicatorController2.R2(), zhm.v.k(portfolioInsightsAssetIndicatorController2.M, portfolioInsightsAssetIndicatorController2.L, new RowLoadingDelegate(), portfolioInsightsAssetIndicatorController2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsAssetIndicatorController.T;
                        qji.b bVarU2 = portfolioInsightsAssetIndicatorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.di.PortfolioInsightsAssetIndicatorControllerComponent.Injector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        PortfolioInsightsAssetIndicatorControllerContract$InputData portfolioInsightsAssetIndicatorControllerContract$InputData = portfolioInsightsAssetIndicatorController.K;
                        portfolioInsightsAssetIndicatorControllerContract$InputData.getClass();
                        return new ewg.e(hVar, kVar2, portfolioInsightsAssetIndicatorControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsAssetIndicatorController.T;
                        return (f) ((ewg.e) portfolioInsightsAssetIndicatorController.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bxg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsAssetIndicatorController f19684b;

            {
                this.f19684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PortfolioInsightsAssetIndicatorController portfolioInsightsAssetIndicatorController = this.f19684b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsAssetIndicatorController.T;
                        PortfolioInsightsAssetIndicatorController portfolioInsightsAssetIndicatorController2 = this.f19684b;
                        return tki.g.a(portfolioInsightsAssetIndicatorController2, portfolioInsightsAssetIndicatorController2.R2(), zhm.v.k(portfolioInsightsAssetIndicatorController2.M, portfolioInsightsAssetIndicatorController2.L, new RowLoadingDelegate(), portfolioInsightsAssetIndicatorController2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsAssetIndicatorController.T;
                        qji.b bVarU2 = portfolioInsightsAssetIndicatorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.di.PortfolioInsightsAssetIndicatorControllerComponent.Injector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        PortfolioInsightsAssetIndicatorControllerContract$InputData portfolioInsightsAssetIndicatorControllerContract$InputData = portfolioInsightsAssetIndicatorController.K;
                        portfolioInsightsAssetIndicatorControllerContract$InputData.getClass();
                        return new ewg.e(hVar, kVar2, portfolioInsightsAssetIndicatorControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsAssetIndicatorController.T;
                        return (f) ((ewg.e) portfolioInsightsAssetIndicatorController.R.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: bxg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsAssetIndicatorController f19684b;

            {
                this.f19684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PortfolioInsightsAssetIndicatorController portfolioInsightsAssetIndicatorController = this.f19684b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsAssetIndicatorController.T;
                        PortfolioInsightsAssetIndicatorController portfolioInsightsAssetIndicatorController2 = this.f19684b;
                        return tki.g.a(portfolioInsightsAssetIndicatorController2, portfolioInsightsAssetIndicatorController2.R2(), zhm.v.k(portfolioInsightsAssetIndicatorController2.M, portfolioInsightsAssetIndicatorController2.L, new RowLoadingDelegate(), portfolioInsightsAssetIndicatorController2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsAssetIndicatorController.T;
                        qji.b bVarU2 = portfolioInsightsAssetIndicatorController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.di.PortfolioInsightsAssetIndicatorControllerComponent.Injector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        PortfolioInsightsAssetIndicatorControllerContract$InputData portfolioInsightsAssetIndicatorControllerContract$InputData = portfolioInsightsAssetIndicatorController.K;
                        portfolioInsightsAssetIndicatorControllerContract$InputData.getClass();
                        return new ewg.e(hVar, kVar2, portfolioInsightsAssetIndicatorControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsAssetIndicatorController.T;
                        return (f) ((ewg.e) portfolioInsightsAssetIndicatorController.R.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        bxg.o uiState = (bxg.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        n nVar = uiState.f19696a;
        if (nVar instanceof l) {
            navBarWithToolbar.l0();
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
            l lVar = (l) nVar;
            TextClause textClause = lVar.f19692a;
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setSecondDescriptionText(lVar.f19693b);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setMenuItems(lVar.f19694c);
        } else if (Intrinsics.f(nVar, m.f19695a)) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else if (nVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ewg.e) this.R.getValue();
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
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new btd.e(this, continuation, 17), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new brc.h(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52707c), new bxg.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new bxg.e(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
