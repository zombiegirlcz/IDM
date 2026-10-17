package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.CellWithLinearGaugeDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WidgetContainerDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BarChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CellWithLinearGaugeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CellWithLinearProgressDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CellWithProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonBarsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.EarthMapLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.EarthMapWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalBarsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileWithHalfPieWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import e5d.d;
import h30.l;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import sdl.y;
import sl3.i;
import sl5.g;
import snd.a0;
import snd.b0;
import snd.c0;
import snd.d0;
import snd.x;
import snd.z;
import te0.w;
import tki.c;
import tw0.x0;
import uw0.f;
import vc.s;
import vkm.t0;
import xki.e;
import z4l.j;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lsnd/q;", "", "Luw0/f;", "Le5d/d;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsDashboardController extends ViewController<q> implements c, k, f, d {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f87528r0 = {o0.f186429a.j(new h0(AnalyticsDashboardController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ ipd.c K;
    public final AnalyticsDashboardContract$InputData L;
    public final h M;
    public final int N;
    public final Object O;
    public final int P;
    public final uw0.c Q;
    public final String R;
    public final uw0.h S;
    public final Lazy T;
    public final j U;
    public AnalyticsSpendingPeriod$Interval V;
    public final RowDelegate W;
    public final ActionSubheaderDelegate X;
    public final ListSubheaderDelegate Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SimpleTileWidgetDelegate f87529a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellWithLinearGaugeDelegate f87530b0;
    public final ComparisonLineChartWidgetDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ChartWithDetailsWidgetDelegate f87531d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final CellWithLinearGaugeWidgetDelegate f87532e0;
    public final HorizontalBarsTileWidgetDelegate f0;
    public final ComparisonBarsTileWidgetDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final TileWithHalfPieWidgetDelegate f87533h0;
    public final BarChartWidgetDelegate i0;
    public final CellWithLinearProgressDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ComparisonLineChartLoadingWidgetDelegate f87534k0;
    public final EarthMapWidgetDelegate l0;
    public final TextDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final AirTipDelegate f87535n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ScrollerDelegate f87536o0;
    public final Object p0;
    public final Object q0;

    public AnalyticsDashboardController(AnalyticsDashboardContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new ipd.c(null);
        this.L = inputData;
        this.M = s.t(this, snd.s.f);
        this.N = R$style.UiKitTheme_Transparent;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: snd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDashboardController f264555b;

            {
                this.f264555b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AnalyticsDashboardController analyticsDashboardController = this.f264555b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AnalyticsDashboardController.f87528r0;
                        return (f) ((ppd.k) analyticsDashboardController.q0.getValue()).f238456n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AnalyticsDashboardController.f87528r0;
                        AnalyticsDashboardController analyticsDashboardController2 = this.f264555b;
                        return tki.g.a(analyticsDashboardController2, analyticsDashboardController2.d(), zhm.v.k(analyticsDashboardController2.W, analyticsDashboardController2.X, analyticsDashboardController2.Y, analyticsDashboardController2.Z, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TileLoadingWidgetDelegate(), new CellWithProgressLoadingWidgetDelegate(), new ChartWithDetailsLoadingWidgetDelegate(), new ComparisonLineChartLoadingWidgetDelegate(), analyticsDashboardController2.f87536o0, analyticsDashboardController2.l0, new EarthMapLoadingWidgetDelegate(), analyticsDashboardController2.m0, analyticsDashboardController2.f87535n0), 0, null, analyticsDashboardController2.U, null, 44);
                    default:
                        KProperty[] kPropertyArr3 = AnalyticsDashboardController.f87528r0;
                        qji.b bVarU2 = analyticsDashboardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.di.AnalyticsDashboardInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        AnalyticsDashboardContract$InputData analyticsDashboardContract$InputData = analyticsDashboardController.L;
                        analyticsDashboardContract$InputData.getClass();
                        return new ppd.k(nVar, lVar2, analyticsDashboardController, analyticsDashboardContract$InputData);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar;
        this.Q = uw0.c.f283500a;
        this.R = getU();
        this.S = uw0.h.APPLICATION;
        this.T = yhm.j.b(new y(25));
        final int i2 = 1;
        this.U = new j((List) f0.f322471a, false, true, true);
        this.W = new RowDelegate(null, null, 7);
        this.X = new ActionSubheaderDelegate();
        this.Y = new ListSubheaderDelegate();
        this.Z = new FullScreenStateDelegate();
        SimpleTileWidgetDelegate simpleTileWidgetDelegate = new SimpleTileWidgetDelegate();
        this.f87529a0 = simpleTileWidgetDelegate;
        CellWithLinearGaugeDelegate cellWithLinearGaugeDelegate = new CellWithLinearGaugeDelegate();
        this.f87530b0 = cellWithLinearGaugeDelegate;
        ComparisonLineChartWidgetDelegate comparisonLineChartWidgetDelegate = new ComparisonLineChartWidgetDelegate();
        this.c0 = comparisonLineChartWidgetDelegate;
        ChartWithDetailsWidgetDelegate chartWithDetailsWidgetDelegate = new ChartWithDetailsWidgetDelegate();
        this.f87531d0 = chartWithDetailsWidgetDelegate;
        CellWithLinearGaugeWidgetDelegate cellWithLinearGaugeWidgetDelegate = new CellWithLinearGaugeWidgetDelegate();
        this.f87532e0 = cellWithLinearGaugeWidgetDelegate;
        HorizontalBarsTileWidgetDelegate horizontalBarsTileWidgetDelegate = new HorizontalBarsTileWidgetDelegate();
        this.f0 = horizontalBarsTileWidgetDelegate;
        ComparisonBarsTileWidgetDelegate comparisonBarsTileWidgetDelegate = new ComparisonBarsTileWidgetDelegate();
        this.g0 = comparisonBarsTileWidgetDelegate;
        TileWithHalfPieWidgetDelegate tileWithHalfPieWidgetDelegate = new TileWithHalfPieWidgetDelegate();
        this.f87533h0 = tileWithHalfPieWidgetDelegate;
        BarChartWidgetDelegate barChartWidgetDelegate = new BarChartWidgetDelegate();
        this.i0 = barChartWidgetDelegate;
        CellWithLinearProgressDelegate cellWithLinearProgressDelegate = new CellWithLinearProgressDelegate();
        this.j0 = cellWithLinearProgressDelegate;
        ComparisonLineChartLoadingWidgetDelegate comparisonLineChartLoadingWidgetDelegate = new ComparisonLineChartLoadingWidgetDelegate();
        this.f87534k0 = comparisonLineChartLoadingWidgetDelegate;
        this.l0 = new EarthMapWidgetDelegate();
        this.m0 = new TextDelegate();
        this.f87535n0 = new AirTipDelegate();
        final int i3 = 2;
        this.f87536o0 = new ScrollerDelegate(v.k(cellWithLinearGaugeDelegate, new WidgetContainerDelegate(v.k(simpleTileWidgetDelegate, comparisonLineChartWidgetDelegate, chartWithDetailsWidgetDelegate, new ChartWithDetailsLoadingWidgetDelegate(), barChartWidgetDelegate, cellWithLinearGaugeWidgetDelegate, horizontalBarsTileWidgetDelegate, comparisonBarsTileWidgetDelegate, new TileLoadingWidgetDelegate(), new CellWithProgressLoadingWidgetDelegate(), tileWithHalfPieWidgetDelegate)), comparisonLineChartWidgetDelegate, chartWithDetailsWidgetDelegate, new ChartWithDetailsLoadingWidgetDelegate(), comparisonLineChartLoadingWidgetDelegate, cellWithLinearProgressDelegate), false);
        this.p0 = w.y0(new Function0(this) { // from class: snd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDashboardController f264555b;

            {
                this.f264555b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AnalyticsDashboardController analyticsDashboardController = this.f264555b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnalyticsDashboardController.f87528r0;
                        return (f) ((ppd.k) analyticsDashboardController.q0.getValue()).f238456n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AnalyticsDashboardController.f87528r0;
                        AnalyticsDashboardController analyticsDashboardController2 = this.f264555b;
                        return tki.g.a(analyticsDashboardController2, analyticsDashboardController2.d(), zhm.v.k(analyticsDashboardController2.W, analyticsDashboardController2.X, analyticsDashboardController2.Y, analyticsDashboardController2.Z, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TileLoadingWidgetDelegate(), new CellWithProgressLoadingWidgetDelegate(), new ChartWithDetailsLoadingWidgetDelegate(), new ComparisonLineChartLoadingWidgetDelegate(), analyticsDashboardController2.f87536o0, analyticsDashboardController2.l0, new EarthMapLoadingWidgetDelegate(), analyticsDashboardController2.m0, analyticsDashboardController2.f87535n0), 0, null, analyticsDashboardController2.U, null, 44);
                    default:
                        KProperty[] kPropertyArr3 = AnalyticsDashboardController.f87528r0;
                        qji.b bVarU2 = analyticsDashboardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.di.AnalyticsDashboardInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        AnalyticsDashboardContract$InputData analyticsDashboardContract$InputData = analyticsDashboardController.L;
                        analyticsDashboardContract$InputData.getClass();
                        return new ppd.k(nVar, lVar2, analyticsDashboardController, analyticsDashboardContract$InputData);
                }
            }
        });
        this.q0 = w.y0(new Function0(this) { // from class: snd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDashboardController f264555b;

            {
                this.f264555b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AnalyticsDashboardController analyticsDashboardController = this.f264555b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnalyticsDashboardController.f87528r0;
                        return (f) ((ppd.k) analyticsDashboardController.q0.getValue()).f238456n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AnalyticsDashboardController.f87528r0;
                        AnalyticsDashboardController analyticsDashboardController2 = this.f264555b;
                        return tki.g.a(analyticsDashboardController2, analyticsDashboardController2.d(), zhm.v.k(analyticsDashboardController2.W, analyticsDashboardController2.X, analyticsDashboardController2.Y, analyticsDashboardController2.Z, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TileLoadingWidgetDelegate(), new CellWithProgressLoadingWidgetDelegate(), new ChartWithDetailsLoadingWidgetDelegate(), new ComparisonLineChartLoadingWidgetDelegate(), analyticsDashboardController2.f87536o0, analyticsDashboardController2.l0, new EarthMapLoadingWidgetDelegate(), analyticsDashboardController2.m0, analyticsDashboardController2.f87535n0), 0, null, analyticsDashboardController2.U, null, 44);
                    default:
                        KProperty[] kPropertyArr3 = AnalyticsDashboardController.f87528r0;
                        qji.b bVarU2 = analyticsDashboardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.di.AnalyticsDashboardInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        AnalyticsDashboardContract$InputData analyticsDashboardContract$InputData = analyticsDashboardController.L;
                        analyticsDashboardContract$InputData.getClass();
                        return new ppd.k(nVar, lVar2, analyticsDashboardController, analyticsDashboardContract$InputData);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getO() {
        return Integer.valueOf(this.N);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        snd.q uiState = (snd.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f264553b);
    }

    @Override // e5d.d
    /* JADX INFO: renamed from: I0, reason: from getter */
    public final AirTipDelegate getF87535n0() {
        return this.f87535n0;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K.f167734g = analyticsContext;
    }

    @Override // e5d.d
    public final ScreenContentRecyclerView O() {
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        return recyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ppd.k) this.q0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getL() {
        return this.K.f167734g;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_dashboard_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_dashboard_title, null, null, 14), null);
        gte.a aVarB = ((ppd.k) this.q0.getValue()).f238449b.f238482a.b();
        s.j(aVarB);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c) ? R$drawable.uikit_icn_24_cross : R$drawable.uikit_icn_24_back_button_arrow));
        x0 x0Var = (x0) this.T.getValue();
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        x0.a(x0Var, recyclerView, this.U, false, null, 28);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ipd.c cVar = this.K;
        int i = 0;
        cVar.f167731a = 0;
        Continuation continuation = null;
        cVar.f167733c = null;
        cVar.f167734g = cVar.b();
        int i2 = 17;
        int i3 = 1;
        int i5 = 2;
        com.revolut.kompot.navigable.a.g2(this, new t0(((b) d()).z.B(new i(i2)), 1), null, new a0(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new snd.w(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new a0(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, new ryj.w(rd0.e.b(this.Z.f52371h.f121375b), i2), null, new b0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.f53218h), null, new c0(this, null), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.Y;
        com.revolut.kompot.navigable.a.g2(this, l.y(listSubheaderDelegate.d, listSubheaderDelegate.e, "merge(...)"), null, new d0(this, null), 3);
        ActionSubheaderDelegate actionSubheaderDelegate = this.X;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(actionSubheaderDelegate.f51587c.f121375b), null, new snd.w(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(actionSubheaderDelegate.d.f121375b), null, new snd.w(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listSubheaderDelegate.f52707c), null, new x(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(this.f87529a0.f), rd0.e.b(this.c0.f), rd0.e.b(this.f87532e0.f), rd0.e.b(this.f0.f), rd0.e.b(this.g0.f), rd0.e.b(this.i0.f), rd0.e.b(this.j0.f), rd0.e.b(this.f87534k0.f), rd0.e.b(this.l0.f), rd0.e.b(this.f87531d0.f), rd0.e.b(this.f87533h0.f)), null, new snd.y(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, kii.e.t(this.f87530b0.e, "hide(...)"), null, new z(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.r(new g(6), new s6e.v(new ryj.w(rd0.e.b(this.f87536o0.q()), 18), this, 9)), null, new a0(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.m0.d), null, new a0(this, continuation, i3), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, f87528r0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final snd.f R2() {
        return (snd.f) this.O.getValue();
    }

    @Override // uw0.f
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getO() {
        return this.R;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    @Override // uw0.f
    public final uw0.e getType() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.p0.getValue();
    }

    @Override // uw0.f
    /* JADX INFO: renamed from: m, reason: from getter */
    public final uw0.h getP() {
        return this.S;
    }
}
