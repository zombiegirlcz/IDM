package com.revolut.feature.wealth.analytics.ui.widgetised.dashboard;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BarChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import ip0.md;
import iyg.h;
import iyg.i;
import iyg.j;
import iyg.l;
import iyg.m;
import iyg.n;
import iyg.p;
import iyg.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pyg.f;
import te0.w;
import tw0.x0;
import vc.s;
import vkm.d;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/WidgetisedAnalyticsDashboardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liyg/h;", "Ldli/a;", "Liyg/j;", "Lpyg/f;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetisedAnalyticsDashboardScreen extends ViewController<h> implements dli.a, f {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(WidgetisedAnalyticsDashboardScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TextDelegate K;
    public final HeaderDelegate L;
    public final ListSubheaderDelegate M;
    public final ActionSubheaderDelegate N;
    public final ReferralContactDelegate O;
    public final ErrorWidgetDelegate P;
    public final BarChartWidgetDelegate Q;
    public final SimpleTileWidgetDelegate R;
    public final LineChartTileWidgetDelegate S;
    public final ChartWithDetailsWidgetDelegate T;
    public final x0 U;
    public final ao.h V;
    public final koi.h W;
    public final Object X;
    public final Object Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f95062a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f95063b0;

    public WidgetisedAnalyticsDashboardScreen(WidgetisedAnalyticsDashboardContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new TextDelegate();
        this.L = new HeaderDelegate();
        this.M = new ListSubheaderDelegate();
        this.N = new ActionSubheaderDelegate();
        this.O = new ReferralContactDelegate();
        this.P = new ErrorWidgetDelegate();
        this.Q = new BarChartWidgetDelegate();
        this.R = new SimpleTileWidgetDelegate();
        this.S = new LineChartTileWidgetDelegate();
        this.T = new ChartWithDetailsWidgetDelegate();
        this.U = new x0();
        this.V = s.t(this, l.f);
        this.W = new koi.h(null, false, true, 1);
        this.X = w.y0(new md(this, inputData, 18));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: iyg.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsDashboardScreen f169742b;

            {
                this.f169742b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsDashboardScreen.c0;
                        return (i) ((ewg.j) this.f169742b.X.getValue()).f130229j.get();
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsDashboardScreen.c0;
                        WidgetisedAnalyticsDashboardScreen widgetisedAnalyticsDashboardScreen = this.f169742b;
                        return dli.f.a(widgetisedAnalyticsDashboardScreen, widgetisedAnalyticsDashboardScreen.R2(), zhm.v.k(widgetisedAnalyticsDashboardScreen.M, new ListSubheaderLoadingDelegate(), widgetisedAnalyticsDashboardScreen.N, widgetisedAnalyticsDashboardScreen.S, widgetisedAnalyticsDashboardScreen.T, widgetisedAnalyticsDashboardScreen.R, new LineChartLoadingTileWidgetDelegate(), new ChartWithDetailsLoadingWidgetDelegate(), new TileLoadingWidgetDelegate(), widgetisedAnalyticsDashboardScreen.Q, widgetisedAnalyticsDashboardScreen.P, widgetisedAnalyticsDashboardScreen.K, widgetisedAnalyticsDashboardScreen.L, new HeaderLoadingDelegate(), new ScrollerBoxDelegate(zhm.u.c(widgetisedAnalyticsDashboardScreen.O))), R$id.recyclerView, null, widgetisedAnalyticsDashboardScreen.W, null, 40);
                }
            }
        });
        this.Z = R$layout.screen_recycler_navbar;
        this.f95062a0 = R$style.UiKitTheme_TransparentSlider;
        final int i2 = 1;
        this.f95063b0 = w.y0(new Function0(this) { // from class: iyg.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsDashboardScreen f169742b;

            {
                this.f169742b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsDashboardScreen.c0;
                        return (i) ((ewg.j) this.f169742b.X.getValue()).f130229j.get();
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsDashboardScreen.c0;
                        WidgetisedAnalyticsDashboardScreen widgetisedAnalyticsDashboardScreen = this.f169742b;
                        return dli.f.a(widgetisedAnalyticsDashboardScreen, widgetisedAnalyticsDashboardScreen.R2(), zhm.v.k(widgetisedAnalyticsDashboardScreen.M, new ListSubheaderLoadingDelegate(), widgetisedAnalyticsDashboardScreen.N, widgetisedAnalyticsDashboardScreen.S, widgetisedAnalyticsDashboardScreen.T, widgetisedAnalyticsDashboardScreen.R, new LineChartLoadingTileWidgetDelegate(), new ChartWithDetailsLoadingWidgetDelegate(), new TileLoadingWidgetDelegate(), widgetisedAnalyticsDashboardScreen.Q, widgetisedAnalyticsDashboardScreen.P, widgetisedAnalyticsDashboardScreen.K, widgetisedAnalyticsDashboardScreen.L, new HeaderLoadingDelegate(), new ScrollerBoxDelegate(zhm.u.c(widgetisedAnalyticsDashboardScreen.O))), R$id.recyclerView, null, widgetisedAnalyticsDashboardScreen.W, null, 40);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getS() {
        return Integer.valueOf(this.f95062a0);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ewg.j) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_analytics_widgetised_dashboard_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        x0.a(this.U, recyclerView, this.W, false, null, 28);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new m(this, null, 0), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.M;
        ViewController.P2(this, rd0.e.b(listSubheaderDelegate.f52707c), new n(this, null), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(listSubheaderDelegate.e), rd0.e.b(listSubheaderDelegate.d)), new iyg.o(this, null), 3);
        ActionSubheaderDelegate actionSubheaderDelegate = this.N;
        ViewController.P2(this, rd0.e.b(actionSubheaderDelegate.f51587c.f121375b), new m(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(actionSubheaderDelegate.d.f121375b), new m(this, null, 2), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(this.S.f), rd0.e.b(this.T.f), rd0.e.b(this.R.f), rd0.e.b(this.Q.f), rd0.e.b(this.P.f)), new p(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52395j), new iyg.q(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.q()), new r(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.f95063b0.getValue();
    }

    @Override // pyg.f
    public final d r() {
        return rd0.e.b(this.K.d);
    }
}
