package com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information;

import aii.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreenContract$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dmc.m;
import inc.b;
import inc.d;
import inc.g;
import inc.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import z0h.s1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/portfolio_strategy_information/PortfolioStrategyInformationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "Ltki/c;", "Linc/i;", "Lz0h/s1;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioStrategyInformationScreen extends ViewController<r> implements c, s1 {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PortfolioStrategyInformationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PortfolioStrategyInformationScreenContract$Input K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final PlainTextDelegate P;
    public final TrendViewDelegate Q;
    public final PlanTileDelegate R;
    public final PlanTileLoadingDelegate S;
    public final HeaderLoadingDelegate T;
    public final HeaderDelegate U;
    public final TextDelegate V;
    public final ListSubheaderDelegate W;
    public final RowLoadingDelegate X;
    public final HorizontalBarGroupDelegate Y;
    public final CellDetailsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsChevronDelegate f85167a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FixedTabsDelegate f85168b0;
    public final FullScreenStateDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f85169d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LargeActionButtonDelegate f85170e0;

    public PortfolioStrategyInformationScreen(PortfolioStrategyInformationScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: inc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioStrategyInformationScreen f162772b;

            {
                this.f162772b = this;
            }

            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioStrategyInformationScreen.f0;
                        PortfolioStrategyInformationScreen portfolioStrategyInformationScreen = this.f162772b;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioStrategyInformationScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioStrategyInformationScreenContract$Input portfolioStrategyInformationScreenContract$Input = portfolioStrategyInformationScreen.K;
                        doc.i iVar = new doc.i(pdh.c.FIVE_YEARS);
                        doc.g gVar = new doc.g(portfolioStrategyInformationScreen.Q, portfolioStrategyInformationScreen.T, portfolioStrategyInformationScreen.U, portfolioStrategyInformationScreen.V, null, portfolioStrategyInformationScreen.f85168b0, portfolioStrategyInformationScreen.c0, null);
                        noc.e eVar = new noc.e(portfolioStrategyInformationScreen.W, portfolioStrategyInformationScreen.f85170e0, portfolioStrategyInformationScreen.X, portfolioStrategyInformationScreen.Y);
                        v1h.a aVar3 = new v1h.a(portfolioStrategyInformationScreen.f85167a0);
                        portfolioStrategyInformationScreenContract$Input.getClass();
                        return new m(rVar, portfolioStrategyInformationScreen, portfolioStrategyInformationScreenContract$Input, iVar, gVar, eVar, portfolioStrategyInformationScreen, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioStrategyInformationScreen.f0;
                        return (g) ((m) this.f162772b.L.getValue()).f116014w.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioStrategyInformationScreen.f0;
                        PortfolioStrategyInformationScreen portfolioStrategyInformationScreen2 = this.f162772b;
                        return tki.g.a(portfolioStrategyInformationScreen2, portfolioStrategyInformationScreen2.d(), v.k(portfolioStrategyInformationScreen2.P, portfolioStrategyInformationScreen2.Q, portfolioStrategyInformationScreen2.S, portfolioStrategyInformationScreen2.R, portfolioStrategyInformationScreen2.T, portfolioStrategyInformationScreen2.V, portfolioStrategyInformationScreen2.U, portfolioStrategyInformationScreen2.W, portfolioStrategyInformationScreen2.X, portfolioStrategyInformationScreen2.Y, portfolioStrategyInformationScreen2.Z, portfolioStrategyInformationScreen2.f85167a0), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: inc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioStrategyInformationScreen f162772b;

            {
                this.f162772b = this;
            }

            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioStrategyInformationScreen.f0;
                        PortfolioStrategyInformationScreen portfolioStrategyInformationScreen = this.f162772b;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioStrategyInformationScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioStrategyInformationScreenContract$Input portfolioStrategyInformationScreenContract$Input = portfolioStrategyInformationScreen.K;
                        doc.i iVar = new doc.i(pdh.c.FIVE_YEARS);
                        doc.g gVar = new doc.g(portfolioStrategyInformationScreen.Q, portfolioStrategyInformationScreen.T, portfolioStrategyInformationScreen.U, portfolioStrategyInformationScreen.V, null, portfolioStrategyInformationScreen.f85168b0, portfolioStrategyInformationScreen.c0, null);
                        noc.e eVar = new noc.e(portfolioStrategyInformationScreen.W, portfolioStrategyInformationScreen.f85170e0, portfolioStrategyInformationScreen.X, portfolioStrategyInformationScreen.Y);
                        v1h.a aVar3 = new v1h.a(portfolioStrategyInformationScreen.f85167a0);
                        portfolioStrategyInformationScreenContract$Input.getClass();
                        return new m(rVar, portfolioStrategyInformationScreen, portfolioStrategyInformationScreenContract$Input, iVar, gVar, eVar, portfolioStrategyInformationScreen, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioStrategyInformationScreen.f0;
                        return (g) ((m) this.f162772b.L.getValue()).f116014w.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioStrategyInformationScreen.f0;
                        PortfolioStrategyInformationScreen portfolioStrategyInformationScreen2 = this.f162772b;
                        return tki.g.a(portfolioStrategyInformationScreen2, portfolioStrategyInformationScreen2.d(), v.k(portfolioStrategyInformationScreen2.P, portfolioStrategyInformationScreen2.Q, portfolioStrategyInformationScreen2.S, portfolioStrategyInformationScreen2.R, portfolioStrategyInformationScreen2.T, portfolioStrategyInformationScreen2.V, portfolioStrategyInformationScreen2.U, portfolioStrategyInformationScreen2.W, portfolioStrategyInformationScreen2.X, portfolioStrategyInformationScreen2.Y, portfolioStrategyInformationScreen2.Z, portfolioStrategyInformationScreen2.f85167a0), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, b.f);
        this.P = new PlainTextDelegate();
        this.Q = new TrendViewDelegate(1000L);
        this.R = new PlanTileDelegate(0);
        this.S = new PlanTileLoadingDelegate();
        this.T = new HeaderLoadingDelegate();
        this.U = new HeaderDelegate();
        this.V = new TextDelegate();
        this.W = new ListSubheaderDelegate();
        this.X = new RowLoadingDelegate();
        this.Y = new HorizontalBarGroupDelegate();
        this.Z = new CellDetailsDelegate();
        this.f85167a0 = new CellDetailsChevronDelegate();
        this.f85168b0 = new FixedTabsDelegate();
        this.c0 = new FullScreenStateDelegate();
        final int i3 = 2;
        this.f85169d0 = w.y0(new Function0(this) { // from class: inc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioStrategyInformationScreen f162772b;

            {
                this.f162772b = this;
            }

            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioStrategyInformationScreen.f0;
                        PortfolioStrategyInformationScreen portfolioStrategyInformationScreen = this.f162772b;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioStrategyInformationScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioStrategyInformationScreenContract$Input portfolioStrategyInformationScreenContract$Input = portfolioStrategyInformationScreen.K;
                        doc.i iVar = new doc.i(pdh.c.FIVE_YEARS);
                        doc.g gVar = new doc.g(portfolioStrategyInformationScreen.Q, portfolioStrategyInformationScreen.T, portfolioStrategyInformationScreen.U, portfolioStrategyInformationScreen.V, null, portfolioStrategyInformationScreen.f85168b0, portfolioStrategyInformationScreen.c0, null);
                        noc.e eVar = new noc.e(portfolioStrategyInformationScreen.W, portfolioStrategyInformationScreen.f85170e0, portfolioStrategyInformationScreen.X, portfolioStrategyInformationScreen.Y);
                        v1h.a aVar3 = new v1h.a(portfolioStrategyInformationScreen.f85167a0);
                        portfolioStrategyInformationScreenContract$Input.getClass();
                        return new m(rVar, portfolioStrategyInformationScreen, portfolioStrategyInformationScreenContract$Input, iVar, gVar, eVar, portfolioStrategyInformationScreen, aVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioStrategyInformationScreen.f0;
                        return (g) ((m) this.f162772b.L.getValue()).f116014w.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioStrategyInformationScreen.f0;
                        PortfolioStrategyInformationScreen portfolioStrategyInformationScreen2 = this.f162772b;
                        return tki.g.a(portfolioStrategyInformationScreen2, portfolioStrategyInformationScreen2.d(), v.k(portfolioStrategyInformationScreen2.P, portfolioStrategyInformationScreen2.Q, portfolioStrategyInformationScreen2.S, portfolioStrategyInformationScreen2.R, portfolioStrategyInformationScreen2.T, portfolioStrategyInformationScreen2.V, portfolioStrategyInformationScreen2.U, portfolioStrategyInformationScreen2.W, portfolioStrategyInformationScreen2.X, portfolioStrategyInformationScreen2.Y, portfolioStrategyInformationScreen2.Z, portfolioStrategyInformationScreen2.f85167a0), 0, null, null, null, 60);
                }
            }
        });
        this.f85170e0 = new LargeActionButtonDelegate();
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        inc.h hVar = uiState.f162780a;
        TextLocalisedClause textLocalisedClause = hVar.f162778a;
        CompositeClause compositeClause = hVar.f162779b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(compositeClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.l0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((m) this.L.getValue()).f116005j.get()).d(u.c(this.f85170e0));
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, null, 0), 3);
        efm.r rVarFilter = d3().f174539b.p0().filter(new ihd.c(16, new im3.e(12)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new d(this, null, 1), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.W;
        efm.r rVarMerge = efm.r.merge(listSubheaderDelegate.d, this.f85170e0.d.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(rVarMerge, new im3.e(13))), null, new inc.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(listSubheaderDelegate.f52707c, new im3.e(14))), null, new inc.c(this, null, 2), 3);
        efm.r map = this.P.f.f121375b.filter(new ihd.c(17, new im3.e(15))).map(new ihd.c(15, new im3.e(16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new inc.c(this, null, 0), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.f85169d0.getValue();
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.V.d);
    }
}
