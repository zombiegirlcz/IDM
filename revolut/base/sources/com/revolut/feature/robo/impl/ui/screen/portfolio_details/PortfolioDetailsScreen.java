package com.revolut.feature.robo.impl.ui.screen.portfolio_details;

import aii.q;
import amc.c;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.ForecastLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.impl.R$id;
import com.revolut.feature.robo.impl.R$layout;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import doc.g;
import fnc.b;
import fnc.f;
import fnc.i;
import fnc.k;
import fnc.l;
import fnc.p;
import fnc.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/portfolio_details/PortfolioDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfnc/r;", "Companion", "a", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioDetailsScreen extends ViewController<q> implements a {
    public final PortfolioDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final boolean O;
    public final Object P;
    public final PlainTextDelegate Q;
    public final CellDetailsChevronDelegate R;
    public final RowDelegate S;
    public final FullScreenStateDelegate T;
    public final FixedTabsDelegate U;
    public final LargeActionButtonDelegate V;
    public final SmallActionButtonDelegate W;
    public final ListSubheaderDelegate X;
    public final TrendViewDelegate Y;
    public final ForecastLoadingDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TextDelegate f85157a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final HeaderLoadingDelegate f85158b0;
    public final HeaderDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RowLoadingDelegate f85159d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final TagDelegate f85160e0;
    public final InputSliderDelegate f0;
    public final ForecastDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final HorizontalBarGroupDelegate f85161h0;
    public final ActionWidgetDelegate i0;
    public final ScrollerDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f85162k0;
    public final RowDelegate l0;
    public final SelectableDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final k f85163n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final g f85164o0;
    public final avk.h p0;
    public final j q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final l f85165r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f85156s0 = {o0.f186429a.j(new h0(PortfolioDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/robo/impl/databinding/ScreenPortfolioDetailsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PortfolioDetailsScreen(PortfolioDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_portfolio_details;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioDetailsScreen f136620b;

            {
                this.f136620b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PortfolioDetailsScreen.Companion companion = PortfolioDetailsScreen.INSTANCE;
                        PortfolioDetailsScreen portfolioDetailsScreen = this.f136620b;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioDetailsScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioDetailsScreenContract$InputData portfolioDetailsScreenContract$InputData = portfolioDetailsScreen.K;
                        avk.h hVar = portfolioDetailsScreen.p0;
                        avk.j jVar = portfolioDetailsScreen.q0;
                        k kVar = portfolioDetailsScreen.f85163n0;
                        doc.g gVar = portfolioDetailsScreen.f85164o0;
                        doc.i iVar = new doc.i(pdh.c.ONE_WEEK);
                        noc.e eVar = new noc.e(portfolioDetailsScreen.X, portfolioDetailsScreen.V, portfolioDetailsScreen.f85159d0, portfolioDetailsScreen.f85161h0);
                        jlc.e eVar2 = new jlc.e(portfolioDetailsScreen.g0, portfolioDetailsScreen.Z, portfolioDetailsScreen.Y, portfolioDetailsScreen.f85157a0, portfolioDetailsScreen.f0, portfolioDetailsScreen.V, portfolioDetailsScreen.W, portfolioDetailsScreen.i0);
                        jlc.y yVar = new jlc.y(portfolioDetailsScreen.S);
                        v1h.a aVar3 = new v1h.a(portfolioDetailsScreen.R);
                        l lVar = portfolioDetailsScreen.f85165r0;
                        portfolioDetailsScreenContract$InputData.getClass();
                        hVar.getClass();
                        jVar.getClass();
                        kVar.getClass();
                        gVar.getClass();
                        lVar.getClass();
                        return new dmc.k(rVar, portfolioDetailsScreen, portfolioDetailsScreenContract$InputData, hVar, jVar, kVar, gVar, iVar, eVar, eVar2, yVar, aVar3, lVar);
                    case 1:
                        PortfolioDetailsScreen.Companion companion2 = PortfolioDetailsScreen.INSTANCE;
                        return (o) ((dmc.k) this.f136620b.N.getValue()).i0.get();
                    default:
                        PortfolioDetailsScreen.Companion companion3 = PortfolioDetailsScreen.INSTANCE;
                        PortfolioDetailsScreen portfolioDetailsScreen2 = this.f136620b;
                        return dli.f.a(portfolioDetailsScreen2, portfolioDetailsScreen2.d(), zhm.v.k(portfolioDetailsScreen2.X, portfolioDetailsScreen2.Q, portfolioDetailsScreen2.R, portfolioDetailsScreen2.f85159d0, portfolioDetailsScreen2.f85157a0, portfolioDetailsScreen2.S, portfolioDetailsScreen2.T, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), portfolioDetailsScreen2.U, new FixedTabsLoadingDelegate(), portfolioDetailsScreen2.c0, portfolioDetailsScreen2.f85158b0, portfolioDetailsScreen2.f85161h0, portfolioDetailsScreen2.Y, portfolioDetailsScreen2.f85160e0, portfolioDetailsScreen2.f0, portfolioDetailsScreen2.g0, portfolioDetailsScreen2.Z, portfolioDetailsScreen2.W, portfolioDetailsScreen2.i0, portfolioDetailsScreen2.j0), R$id.portfolioDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = true;
        this.P = w.y0(new Function0(this) { // from class: fnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioDetailsScreen f136620b;

            {
                this.f136620b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PortfolioDetailsScreen.Companion companion = PortfolioDetailsScreen.INSTANCE;
                        PortfolioDetailsScreen portfolioDetailsScreen = this.f136620b;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioDetailsScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioDetailsScreenContract$InputData portfolioDetailsScreenContract$InputData = portfolioDetailsScreen.K;
                        avk.h hVar = portfolioDetailsScreen.p0;
                        avk.j jVar = portfolioDetailsScreen.q0;
                        k kVar = portfolioDetailsScreen.f85163n0;
                        doc.g gVar = portfolioDetailsScreen.f85164o0;
                        doc.i iVar = new doc.i(pdh.c.ONE_WEEK);
                        noc.e eVar = new noc.e(portfolioDetailsScreen.X, portfolioDetailsScreen.V, portfolioDetailsScreen.f85159d0, portfolioDetailsScreen.f85161h0);
                        jlc.e eVar2 = new jlc.e(portfolioDetailsScreen.g0, portfolioDetailsScreen.Z, portfolioDetailsScreen.Y, portfolioDetailsScreen.f85157a0, portfolioDetailsScreen.f0, portfolioDetailsScreen.V, portfolioDetailsScreen.W, portfolioDetailsScreen.i0);
                        jlc.y yVar = new jlc.y(portfolioDetailsScreen.S);
                        v1h.a aVar3 = new v1h.a(portfolioDetailsScreen.R);
                        l lVar = portfolioDetailsScreen.f85165r0;
                        portfolioDetailsScreenContract$InputData.getClass();
                        hVar.getClass();
                        jVar.getClass();
                        kVar.getClass();
                        gVar.getClass();
                        lVar.getClass();
                        return new dmc.k(rVar, portfolioDetailsScreen, portfolioDetailsScreenContract$InputData, hVar, jVar, kVar, gVar, iVar, eVar, eVar2, yVar, aVar3, lVar);
                    case 1:
                        PortfolioDetailsScreen.Companion companion2 = PortfolioDetailsScreen.INSTANCE;
                        return (o) ((dmc.k) this.f136620b.N.getValue()).i0.get();
                    default:
                        PortfolioDetailsScreen.Companion companion3 = PortfolioDetailsScreen.INSTANCE;
                        PortfolioDetailsScreen portfolioDetailsScreen2 = this.f136620b;
                        return dli.f.a(portfolioDetailsScreen2, portfolioDetailsScreen2.d(), zhm.v.k(portfolioDetailsScreen2.X, portfolioDetailsScreen2.Q, portfolioDetailsScreen2.R, portfolioDetailsScreen2.f85159d0, portfolioDetailsScreen2.f85157a0, portfolioDetailsScreen2.S, portfolioDetailsScreen2.T, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), portfolioDetailsScreen2.U, new FixedTabsLoadingDelegate(), portfolioDetailsScreen2.c0, portfolioDetailsScreen2.f85158b0, portfolioDetailsScreen2.f85161h0, portfolioDetailsScreen2.Y, portfolioDetailsScreen2.f85160e0, portfolioDetailsScreen2.f0, portfolioDetailsScreen2.g0, portfolioDetailsScreen2.Z, portfolioDetailsScreen2.W, portfolioDetailsScreen2.i0, portfolioDetailsScreen2.j0), R$id.portfolioDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new PlainTextDelegate();
        this.R = new CellDetailsChevronDelegate();
        this.S = new RowDelegate(null, null, 7);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.T = fullScreenStateDelegate;
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.U = fixedTabsDelegate;
        this.V = new LargeActionButtonDelegate();
        this.W = new SmallActionButtonDelegate();
        this.X = new ListSubheaderDelegate();
        TrendViewDelegate trendViewDelegate = new TrendViewDelegate(1000L);
        this.Y = trendViewDelegate;
        this.Z = new ForecastLoadingDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.f85157a0 = textDelegate;
        HeaderLoadingDelegate headerLoadingDelegate = new HeaderLoadingDelegate();
        this.f85158b0 = headerLoadingDelegate;
        HeaderDelegate headerDelegate = new HeaderDelegate();
        this.c0 = headerDelegate;
        this.f85159d0 = new RowLoadingDelegate();
        TagDelegate tagDelegate = new TagDelegate();
        this.f85160e0 = tagDelegate;
        this.f0 = new InputSliderDelegate();
        this.g0 = new ForecastDelegate();
        this.f85161h0 = new HorizontalBarGroupDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.i0 = actionWidgetDelegate;
        final int i3 = 2;
        this.j0 = new ScrollerDelegate(v.k(new HeroBannerDelegate(0), new ActionWidgetLoadingDelegate(), actionWidgetDelegate), false);
        this.f85162k0 = w.y0(new Function0(this) { // from class: fnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioDetailsScreen f136620b;

            {
                this.f136620b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PortfolioDetailsScreen.Companion companion = PortfolioDetailsScreen.INSTANCE;
                        PortfolioDetailsScreen portfolioDetailsScreen = this.f136620b;
                        phm.a aVar = (phm.a) ue0.e.j(portfolioDetailsScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        PortfolioDetailsScreenContract$InputData portfolioDetailsScreenContract$InputData = portfolioDetailsScreen.K;
                        avk.h hVar = portfolioDetailsScreen.p0;
                        avk.j jVar = portfolioDetailsScreen.q0;
                        k kVar = portfolioDetailsScreen.f85163n0;
                        doc.g gVar = portfolioDetailsScreen.f85164o0;
                        doc.i iVar = new doc.i(pdh.c.ONE_WEEK);
                        noc.e eVar = new noc.e(portfolioDetailsScreen.X, portfolioDetailsScreen.V, portfolioDetailsScreen.f85159d0, portfolioDetailsScreen.f85161h0);
                        jlc.e eVar2 = new jlc.e(portfolioDetailsScreen.g0, portfolioDetailsScreen.Z, portfolioDetailsScreen.Y, portfolioDetailsScreen.f85157a0, portfolioDetailsScreen.f0, portfolioDetailsScreen.V, portfolioDetailsScreen.W, portfolioDetailsScreen.i0);
                        jlc.y yVar = new jlc.y(portfolioDetailsScreen.S);
                        v1h.a aVar3 = new v1h.a(portfolioDetailsScreen.R);
                        l lVar = portfolioDetailsScreen.f85165r0;
                        portfolioDetailsScreenContract$InputData.getClass();
                        hVar.getClass();
                        jVar.getClass();
                        kVar.getClass();
                        gVar.getClass();
                        lVar.getClass();
                        return new dmc.k(rVar, portfolioDetailsScreen, portfolioDetailsScreenContract$InputData, hVar, jVar, kVar, gVar, iVar, eVar, eVar2, yVar, aVar3, lVar);
                    case 1:
                        PortfolioDetailsScreen.Companion companion2 = PortfolioDetailsScreen.INSTANCE;
                        return (o) ((dmc.k) this.f136620b.N.getValue()).i0.get();
                    default:
                        PortfolioDetailsScreen.Companion companion3 = PortfolioDetailsScreen.INSTANCE;
                        PortfolioDetailsScreen portfolioDetailsScreen2 = this.f136620b;
                        return dli.f.a(portfolioDetailsScreen2, portfolioDetailsScreen2.d(), zhm.v.k(portfolioDetailsScreen2.X, portfolioDetailsScreen2.Q, portfolioDetailsScreen2.R, portfolioDetailsScreen2.f85159d0, portfolioDetailsScreen2.f85157a0, portfolioDetailsScreen2.S, portfolioDetailsScreen2.T, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), portfolioDetailsScreen2.U, new FixedTabsLoadingDelegate(), portfolioDetailsScreen2.c0, portfolioDetailsScreen2.f85158b0, portfolioDetailsScreen2.f85161h0, portfolioDetailsScreen2.Y, portfolioDetailsScreen2.f85160e0, portfolioDetailsScreen2.f0, portfolioDetailsScreen2.g0, portfolioDetailsScreen2.Z, portfolioDetailsScreen2.W, portfolioDetailsScreen2.i0, portfolioDetailsScreen2.j0), R$id.portfolioDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.l0 = rowDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.m0 = selectableDelegate;
        this.f85163n0 = new k(this);
        this.f85164o0 = new g(trendViewDelegate, headerLoadingDelegate, headerDelegate, textDelegate, tagDelegate, fixedTabsDelegate, fullScreenStateDelegate, selectableDelegate);
        this.p0 = new avk.h(this);
        this.q0 = new j(this, 5);
        this.f85165r0 = new l(this, i);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        fnc.q qVar2 = uiState.f136653a;
        if (qVar2 != null) {
            TextClause textClause = qVar2.f136650a;
            TextLocalisedClause textLocalisedClause = qVar2.f136651b;
            Image image = qVar2.d;
            Clause clause = qVar2.e;
            NavBarWithToolbar navBarWithToolbar = d3().f6303c;
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setDescriptionText(textClause);
            navBarWithToolbar.setSecondDescriptionText(textLocalisedClause);
            navBarWithToolbar.setThirdDescriptionVisible(clause != null);
            navBarWithToolbar.setThirdDescriptionText(clause);
            navBarWithToolbar.setEndIconImage(image);
            navBarWithToolbar.l0();
        } else {
            NavBarWithToolbar portfolioDetailsNavBarWithToolbar = d3().f6303c;
            Intrinsics.checkNotNullExpressionValue(portfolioDetailsNavBarWithToolbar, "portfolioDetailsNavBarWithToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            portfolioDetailsNavBarWithToolbar.I0(t3Var, false);
        }
        TwinHorizontalButton twinHorizontalButton = d3().f6302b;
        p pVar = uiState.f136655c;
        if (pVar == null) {
            twinHorizontalButton.setPrimaryButtonVisible(false);
            twinHorizontalButton.setSecondaryButtonVisible(false);
        } else {
            twinHorizontalButton.setPrimaryButtonText(pVar.f136648a);
            twinHorizontalButton.setPrimaryButtonVisible(true);
            twinHorizontalButton.setSecondaryButtonVisible(pVar.f136649b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dmc.k) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f6303c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinHorizontalButton twinHorizontalButton = d3().f6302b;
        twinHorizontalButton.setPrimaryButtonWeight(0.8333333f);
        twinHorizontalButton.setSecondaryButtonWeight(0.16666667f);
        twinHorizontalButton.setSecondaryButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_more, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        twinHorizontalButton.setPrimaryButtonVisible(false);
        twinHorizontalButton.setSecondaryButtonVisible(false);
        ((j60.a) ((dmc.k) this.N.getValue()).o.get()).d(v.k(this.l0, this.m0, this.V));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f6303c.f59410q), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f.f121375b), null, new fnc.g(2, 4, fnc.o.class, d(), "onPlainTextDelegateActionClick", "onPlainTextDelegateActionClick(Lcom/revolut/core/ui_kit/delegates/PlainTextDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.l0.f53218h), null, new fnc.h(2, 4, fnc.o.class, d(), "onDialogRowClicked", "onDialogRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52371h.f121375b), null, new i(2, 4, fnc.o.class, d(), "onMainActionClicked", "onMainActionClicked(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.d), null, new fnc.j(2, 4, fnc.o.class, d(), "onListSubheaderStartImageClicked", "onListSubheaderStartImageClicked(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f85157a0.d), null, new exe.k(2, d(), fnc.o.class, "onTextDelegateClauseClick", "onTextDelegateClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 9), 3);
        RowDelegate rowDelegate = this.S;
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, new eq8.g(rd0.e.b(rowDelegate.f53218h), 27), null, new exe.k(i2, d(), fnc.o.class, "handleRecurringDepositParcel", "handleRecurringDepositParcel(Lcom/revolut/feature/robo/api/ui/widgets/RoboRecurringDepositWidgetContract$Parcel;)V", i, 10), 3);
        ihm.f fVar = rowDelegate.f53218h;
        com.revolut.kompot.navigable.a.g2(this, new eq8.g(rd0.e.b(fVar), 28), null, new exe.k(i2, d(), fnc.o.class, "handleInvestmentSectionParcel", "handleInvestmentSectionParcel(Lcom/revolut/feature/trading/managed_portfolios/api/widgets/ManagedPortfolioInvestmentSectionWidgetContract$Parcel;)V", i, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f6302b.c()), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f6302b.d()), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new eq8.g(rd0.e.b(fVar), 29), null, new fna.f(this, continuation, 1), 3);
    }

    public final c d3() {
        ViewBinding value = this.M.getValue(this, f85156s0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fnc.o d() {
        return (fnc.o) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f85162k0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
