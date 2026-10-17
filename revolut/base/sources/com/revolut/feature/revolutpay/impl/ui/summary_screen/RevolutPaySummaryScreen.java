package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import android.content.Context;
import android.view.View;
import android.webkit.WebViewClient;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import au0.z0;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolutpay.impl.R$id;
import com.revolut.feature.revolutpay.impl.R$layout;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.tracking.v3.RevolutPayBasicContext;
import efm.r;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import o9c.a0;
import o9c.b0;
import o9c.c0;
import o9c.d0;
import o9c.e0;
import o9c.f0;
import o9c.i;
import o9c.j;
import o9c.m;
import o9c.n;
import o9c.p;
import o9c.v;
import o9c.x;
import o9c.y;
import o9c.z;
import p7c.u;
import te0.w;
import tx0.p2;
import tx0.t3;
import vc.s;
import yy0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;", "Ldli/a;", "Lo9c/f0;", "Lin0/g;", "Lno/k;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPaySummaryScreen extends ViewController<RevolutPaySummaryScreenContract$OutputData> implements dli.a, g, k {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f84518b0 = {o0.f186429a.j(new h0(RevolutPaySummaryScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/impl/databinding/ScreenRevolutPaySummaryBinding;", 0))};
    public AnalyticsContext K;
    public final int L;
    public final h M;
    public NavBarWithBigTile N;
    public final Object O;
    public final RowDelegate P;
    public final ActionWidgetDelegate Q;
    public final CellDetailsDelegate R;
    public final CellDetailsActionDelegate S;
    public final CellDetailsBadgeDelegate T;
    public final AttributeSelectorSmallDelegate U;
    public final FullScreenStateDelegate V;
    public final InputChecklistDelegate W;
    public final HighlightTileDelegate X;
    public final TextDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f84519a0;

    public RevolutPaySummaryScreen(RevolutPaySummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_revolut_pay_summary;
        this.M = s.t(this, o9c.b.f);
        this.O = w.y0(new nsh.e(this, inputData, 29));
        this.P = new RowDelegate(null, null, 7);
        this.Q = new ActionWidgetDelegate();
        this.R = new CellDetailsDelegate();
        this.S = new CellDetailsActionDelegate();
        this.T = new CellDetailsBadgeDelegate();
        this.U = new AttributeSelectorSmallDelegate();
        this.V = new FullScreenStateDelegate();
        this.W = new InputChecklistDelegate();
        this.X = new HighlightTileDelegate();
        this.Y = new TextDelegate();
        final int i = 1;
        this.Z = w.y0(new Function0(this) { // from class: o9c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPaySummaryScreen f223185b;

            {
                this.f223185b = this;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPaySummaryScreen.f84518b0;
                        RevolutPaySummaryScreen revolutPaySummaryScreen = this.f223185b;
                        return dli.f.a(revolutPaySummaryScreen, revolutPaySummaryScreen.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(revolutPaySummaryScreen.U), false), new CellDetailsLoadingDelegate(), revolutPaySummaryScreen.P, revolutPaySummaryScreen.Q, revolutPaySummaryScreen.R, revolutPaySummaryScreen.S, revolutPaySummaryScreen.T, new CellDetailsTotalDelegate(), new PlainTextDelegate(), revolutPaySummaryScreen.W, revolutPaySummaryScreen.X, revolutPaySummaryScreen.V, revolutPaySummaryScreen.Y), R$id.revolutPaySummaryScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = RevolutPaySummaryScreen.f84518b0;
                        return (u) ((p7c.u) this.f223185b.O.getValue()).f233726w.get();
                }
            }
        });
        final int i2 = 0;
        this.f84519a0 = w.y0(new Function0(this) { // from class: o9c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPaySummaryScreen f223185b;

            {
                this.f223185b = this;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutPaySummaryScreen.f84518b0;
                        RevolutPaySummaryScreen revolutPaySummaryScreen = this.f223185b;
                        return dli.f.a(revolutPaySummaryScreen, revolutPaySummaryScreen.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(revolutPaySummaryScreen.U), false), new CellDetailsLoadingDelegate(), revolutPaySummaryScreen.P, revolutPaySummaryScreen.Q, revolutPaySummaryScreen.R, revolutPaySummaryScreen.S, revolutPaySummaryScreen.T, new CellDetailsTotalDelegate(), new PlainTextDelegate(), revolutPaySummaryScreen.W, revolutPaySummaryScreen.X, revolutPaySummaryScreen.V, revolutPaySummaryScreen.Y), R$id.revolutPaySummaryScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = RevolutPaySummaryScreen.f84518b0;
                        return (u) ((p7c.u) this.f223185b.O.getValue()).f233726w.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        View revolutPaySummaryScreenNavBarWithToolbar;
        f0 uiState = (f0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        RevolutPayBasicContext revolutPayBasicContext = uiState.f;
        String str = uiState.d;
        companion.getClass();
        this.K = new AnalyticsContext(AnalyticsContext.Companion.a(revolutPayBasicContext));
        e0 e0Var = qVar instanceof e0 ? (e0) qVar : null;
        d0 d0Var = uiState.f223192a;
        c0 c0Var = d0Var.f223190c;
        List<? extends NavBarMenuItem> list = uiState.f223194c;
        if (e0Var == null || e0Var.f223191a) {
            if (c0Var instanceof v) {
                revolutPaySummaryScreenNavBarWithToolbar = f3();
            } else {
                if (!(c0Var instanceof b0)) {
                    throw new NoWhenBranchMatchedException();
                }
                revolutPaySummaryScreenNavBarWithToolbar = d3().d;
                Intrinsics.checkNotNullExpressionValue(revolutPaySummaryScreenNavBarWithToolbar, "revolutPaySummaryScreenNavBarWithToolbar");
            }
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f203387c;
            controllerContainerCoordinatorLayout.removeView(d3().d);
            NavBarWithBigTile navBarWithBigTile = this.N;
            if (navBarWithBigTile != null) {
                controllerContainerCoordinatorLayout.removeView(navBarWithBigTile);
            }
            controllerContainerCoordinatorLayout.addView(revolutPaySummaryScreenNavBarWithToolbar);
        }
        int i = d0Var.f223188a;
        if (c0Var instanceof b0) {
            b0 b0Var = (b0) c0Var;
            NavBarWithToolbar navBarWithToolbar = d3().d;
            navBarWithToolbar.setHeaderDisclaimerSticky(d0Var.f223189b);
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(i));
            navBarWithToolbar.setMenuItems(list);
            if (b0Var instanceof o9c.w) {
                navBarWithToolbar.setToolbarTitle(((o9c.w) b0Var).f223246a);
                NavBarWithToolbar navBarWithToolbar2 = d3().d;
                navBarWithToolbar2.l0();
                navBarWithToolbar2.j0(false);
            } else if (b0Var instanceof x) {
                NavBarWithToolbar navBarWithToolbar3 = d3().d;
                navBarWithToolbar3.l0();
                navBarWithToolbar3.j0(false);
            } else if (b0Var instanceof y) {
                y yVar = (y) b0Var;
                TextLocalisedClause textLocalisedClause = yVar.f223249a;
                navBarWithToolbar.setEndImage(nz8.d.L(yVar.f223251c));
                navBarWithToolbar.setTitle(textLocalisedClause, null);
                navBarWithToolbar.setToolbarTitle(textLocalisedClause);
                navBarWithToolbar.setDescriptionText(yVar.f223250b);
                navBarWithToolbar.setDescriptionVisible(true);
                navBarWithToolbar.l0();
                navBarWithToolbar.H0(false);
            } else if (b0Var instanceof a0) {
                navBarWithToolbar.setEndImage((l) null);
                navBarWithToolbar.setDescriptionText(null);
                navBarWithToolbar.setDescriptionVisible(false);
                navBarWithToolbar.H0(false);
                navBarWithToolbar.I0(t3.PROFILE, false);
            } else {
                if (!(b0Var instanceof z)) {
                    throw new NoWhenBranchMatchedException();
                }
                NavBarWithToolbar navBarWithToolbar4 = d3().d;
                navBarWithToolbar4.l0();
                navBarWithToolbar4.j0(false);
            }
        } else {
            if (!(c0Var instanceof v)) {
                throw new NoWhenBranchMatchedException();
            }
            v vVar = (v) c0Var;
            NavBarWithBigTile navBarWithBigTileF3 = f3();
            navBarWithBigTileF3.setNavigationButtonIcon(Integer.valueOf(i));
            navBarWithBigTileF3.setDuoAvatar(vVar.f223242a, r0.DEFAULT);
            navBarWithBigTileF3.setTitle(new z0(vVar.f223243b, false));
            navBarWithBigTileF3.setDescription(new au0.o0(vVar.f223244c));
            navBarWithBigTileF3.setLayoutType(s0.CENTERED_HORIZONTALLY);
            navBarWithBigTileF3.setHeightMode(p2.f275222a);
            navBarWithBigTileF3.setLoadingState(false);
        }
        d3().f203386b.setModel(uiState.f223193b.f223220a);
        WebView webView = d3().e;
        if (str == null) {
            webView.setVisibility(8);
            return;
        }
        webView.setVisibility(0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        String url2 = webView.getUrl();
        if (url2 == null || kotlin.text.d0.W(url2)) {
            webView.loadUrl(str);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.revolut_pay_order_summary_checkout_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().d.f59410q), new o9c.c(this, null, 1), 3);
        NavBarWithBigTile navBarWithBigTile = this.N;
        if (navBarWithBigTile != null) {
            ViewController.P2(this, rd0.e.b(navBarWithBigTile.f59357t), new o9c.c(this, null, 0), 3);
        }
        ViewController.P2(this, rd0.e.b((ihm.f) d3().d.f59406n.f258290b), new o9c.d(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.V.f52371h.f121375b), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o.f57403b), new o9c.d(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new n(this, null), 3);
        CellDetailsActionDelegate cellDetailsActionDelegate = this.S;
        ViewController.P2(this, rd0.e.b(cellDetailsActionDelegate.f51780c), new o9c.o(this, null), 3);
        ViewController.P2(this, rd0.e.b(cellDetailsActionDelegate.d), new p(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f203386b.f), new o9c.c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f203386b.e), new o9c.d(this, continuation, 0), 3);
        RowDelegate rowDelegate = this.P;
        ihm.f fVar = rowDelegate.f53218h;
        ihm.f fVar2 = rowDelegate.f53218h;
        ViewController.P2(this, rd0.e.b(fVar), new o9c.e(this, null), 3);
        r rVarFilter = fVar2.filter(new o5i.a(16, new o95.b(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new o9c.f(this, null), 3);
        r rVarFilter2 = fVar2.filter(new o5i.a(17, new o95.b(6)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter2), new o9c.g(this, null), 3);
        r rVarFilter3 = fVar2.filter(new o5i.a(18, new o95.b(7)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter3), new o9c.h(this, null), 3);
        r rVarFilter4 = fVar2.filter(new o5i.a(19, new o95.b(8)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter4), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.p()), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51589c.f121375b), new o9c.d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.W.f52518c), new o9c.k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.X.f52437c), new o9c.l(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Y.d), new o9c.d(this, continuation, 2), 3);
    }

    public final m7c.d d3() {
        ViewBinding value = this.M.getValue(this, f84518b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m7c.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final o9c.u R2() {
        return (o9c.u) this.Z.getValue();
    }

    public final NavBarWithBigTile f3() {
        NavBarWithBigTile navBarWithBigTile = this.N;
        if (navBarWithBigTile != null) {
            return navBarWithBigTile;
        }
        Context context = d3().f203385a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NavBarWithBigTile navBarWithBigTile2 = new NavBarWithBigTile(context, null);
        navBarWithBigTile2.setId(com.revolut.retail.common.ui.R$id.navBarWithBigTile);
        navBarWithBigTile2.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
        this.N = navBarWithBigTile2;
        ViewController.P2(this, rd0.e.b(navBarWithBigTile2.f59357t), new o9c.c(this, null, 0), 3);
        return navBarWithBigTile2;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f84519a0.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
