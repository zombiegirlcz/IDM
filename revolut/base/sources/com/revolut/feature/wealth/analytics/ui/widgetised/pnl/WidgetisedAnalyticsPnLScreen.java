package com.revolut.feature.wealth.analytics.ui.widgetised.pnl;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import ao.h;
import buf.u;
import bx0.v;
import bzg.c;
import bzg.d;
import bzg.g;
import bzg.i;
import bzg.j;
import bzg.l;
import bzg.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FlexibleBarChartDelegate;
import com.revolut.core.ui_kit.delegates.FlexibleBarChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ewg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pyg.f;
import te0.w;
import tx0.t3;
import vc.s;
import wp5.y;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/pnl/WidgetisedAnalyticsPnLScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbzg/n;", "Lpyg/f;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetisedAnalyticsPnLScreen extends ViewController<q> implements dli.a, f {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(WidgetisedAnalyticsPnLScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final FixedTabsDelegate P;
    public final TabsDelegate Q;
    public final TrendViewDelegate R;
    public final CellDetailsDelegate S;
    public final FullScreenStateDelegate T;
    public final RowDelegate U;
    public final ListSubheaderDelegate V;
    public final FlexibleBarChartDelegate W;
    public final TextDelegate X;

    public WidgetisedAnalyticsPnLScreen(WidgetisedAnalyticsPnLScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: bzg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsPnLScreen f19988b;

            {
                this.f19988b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsPnLScreen.Y;
                        WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen = this.f19988b;
                        return dli.f.a(widgetisedAnalyticsPnLScreen, widgetisedAnalyticsPnLScreen.d(), zhm.v.k(widgetisedAnalyticsPnLScreen.P, widgetisedAnalyticsPnLScreen.Q, widgetisedAnalyticsPnLScreen.R, widgetisedAnalyticsPnLScreen.S, widgetisedAnalyticsPnLScreen.U, widgetisedAnalyticsPnLScreen.T, new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), widgetisedAnalyticsPnLScreen.V, widgetisedAnalyticsPnLScreen.W, widgetisedAnalyticsPnLScreen.X, new FlexibleBarChartLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsPnLScreen.Y;
                        return (m) ((ewg.m) this.f19988b.L.getValue()).f130248m.get();
                }
            }
        });
        this.L = w.y0(new u(this, inputData, 11));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: bzg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsPnLScreen f19988b;

            {
                this.f19988b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsPnLScreen.Y;
                        WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen = this.f19988b;
                        return dli.f.a(widgetisedAnalyticsPnLScreen, widgetisedAnalyticsPnLScreen.d(), zhm.v.k(widgetisedAnalyticsPnLScreen.P, widgetisedAnalyticsPnLScreen.Q, widgetisedAnalyticsPnLScreen.R, widgetisedAnalyticsPnLScreen.S, widgetisedAnalyticsPnLScreen.U, widgetisedAnalyticsPnLScreen.T, new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), widgetisedAnalyticsPnLScreen.V, widgetisedAnalyticsPnLScreen.W, widgetisedAnalyticsPnLScreen.X, new FlexibleBarChartLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsPnLScreen.Y;
                        return (m) ((ewg.m) this.f19988b.L.getValue()).f130248m.get();
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, c.f);
        this.P = new FixedTabsDelegate();
        this.Q = new TabsDelegate();
        this.R = new TrendViewDelegate(2000L);
        this.S = new CellDetailsDelegate();
        this.T = new FullScreenStateDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new ListSubheaderDelegate();
        this.W = new FlexibleBarChartDelegate();
        this.X = new TextDelegate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        l lVar = uiState.f20009b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ?? r110 = lVar.f20005b;
        TextLocalisedClause textLocalisedClause = lVar.f20004a;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, r110, textLocalisedClause, null, 4, null);
        navBarWithToolbar.setTitle(r110, null);
        navBarWithToolbar.setTitleTopDescription(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(lVar.f20006c);
        navBarWithToolbar.setThirdDescriptionText(lVar.d);
        List list = lVar.e;
        if (list == null) {
            list = f0.f322471a;
        }
        navBarWithToolbar.setSegmentedControl(list, lVar.f);
        navBarWithToolbar.H0(true);
        if (lVar.f20007g) {
            navBarWithToolbar.I0(t3.DEFAULT, false);
            return;
        }
        navBarWithToolbar.l0();
        if (!navBarWithToolbar.isLaidOut() || navBarWithToolbar.isLayoutRequested()) {
            navBarWithToolbar.addOnLayoutChangeListener(new v(navBarWithToolbar, this, 1));
            return;
        }
        ViewGroup.LayoutParams layoutParams = navBarWithToolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        navBarWithToolbar.setMinimumHeight(d3().f174539b.getHeight());
        navBarWithToolbar.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitleVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setThirdDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setTitleTopDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionClickable(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new bzg.f(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174539b.y0()), new bzg.f(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((FixedTabs) d3().f174539b.G0.getValue()).f), new bzg.e(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52339c.f121375b), new bzg.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53515c.f121375b), new bzg.e(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.R.r()), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f), new bzg.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f53218h), new i(this, null), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.V;
        ViewController.P2(this, y.x(listSubheaderDelegate.e, listSubheaderDelegate.d, "mergeWith(...)"), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.f52353c.f121375b), new bzg.e(this, continuation, 0), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bzg.m d() {
        return (bzg.m) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.K.getValue();
    }

    @Override // pyg.f
    public final vkm.d r() {
        return rd0.e.b(this.X.d);
    }
}
