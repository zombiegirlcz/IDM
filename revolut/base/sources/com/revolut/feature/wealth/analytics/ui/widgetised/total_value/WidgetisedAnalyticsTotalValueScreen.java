package com.revolut.feature.wealth.analytics.ui.widgetised.total_value;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx0.v;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import ewg.n;
import ghk.t;
import gzg.e;
import gzg.g;
import gzg.i;
import gzg.j;
import gzg.k;
import gzg.l;
import gzg.m;
import gzg.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pyg.f;
import te0.w;
import tx0.t3;
import vc.s;
import vkm.d;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/total_value/WidgetisedAnalyticsTotalValueScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgzg/s;", "Lpyg/f;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetisedAnalyticsTotalValueScreen extends ViewController<q> implements dli.a, f {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(WidgetisedAnalyticsTotalValueScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final FixedTabsDelegate P;
    public final TabsDelegate Q;
    public final TrendViewDelegate R;
    public final FullScreenStateDelegate S;
    public final SelectableDelegate T;
    public final RowDelegate U;
    public final TextDelegate V;
    public final ListSubheaderDelegate W;

    public WidgetisedAnalyticsTotalValueScreen(WidgetisedAnalyticsTotalValueScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new t(this, inputData, 27));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gzg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsTotalValueScreen f148103b;

            {
                this.f148103b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsTotalValueScreen.X;
                        return (p) ((ewg.n) this.f148103b.K.getValue()).f130258p.get();
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsTotalValueScreen.X;
                        WidgetisedAnalyticsTotalValueScreen widgetisedAnalyticsTotalValueScreen = this.f148103b;
                        return dli.f.a(widgetisedAnalyticsTotalValueScreen, widgetisedAnalyticsTotalValueScreen.d(), zhm.v.k(widgetisedAnalyticsTotalValueScreen.P, widgetisedAnalyticsTotalValueScreen.Q, widgetisedAnalyticsTotalValueScreen.R, widgetisedAnalyticsTotalValueScreen.S, widgetisedAnalyticsTotalValueScreen.T, widgetisedAnalyticsTotalValueScreen.U, widgetisedAnalyticsTotalValueScreen.V, new RowLoadingDelegate(), widgetisedAnalyticsTotalValueScreen.W), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: gzg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsTotalValueScreen f148103b;

            {
                this.f148103b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsTotalValueScreen.X;
                        return (p) ((ewg.n) this.f148103b.K.getValue()).f130258p.get();
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsTotalValueScreen.X;
                        WidgetisedAnalyticsTotalValueScreen widgetisedAnalyticsTotalValueScreen = this.f148103b;
                        return dli.f.a(widgetisedAnalyticsTotalValueScreen, widgetisedAnalyticsTotalValueScreen.d(), zhm.v.k(widgetisedAnalyticsTotalValueScreen.P, widgetisedAnalyticsTotalValueScreen.Q, widgetisedAnalyticsTotalValueScreen.R, widgetisedAnalyticsTotalValueScreen.S, widgetisedAnalyticsTotalValueScreen.T, widgetisedAnalyticsTotalValueScreen.U, widgetisedAnalyticsTotalValueScreen.V, new RowLoadingDelegate(), widgetisedAnalyticsTotalValueScreen.W), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, e.f);
        this.P = new FixedTabsDelegate();
        this.Q = new TabsDelegate();
        this.R = new TrendViewDelegate(2000L);
        this.S = new FullScreenStateDelegate();
        this.T = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.U = new RowDelegate(null, null, 7);
        this.V = new TextDelegate();
        this.W = new ListSubheaderDelegate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        gzg.s uiState = (gzg.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        gzg.o oVar2 = uiState.f148121b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ?? r110 = oVar2.f148117b;
        TextLocalisedClause textLocalisedClause = oVar2.f148116a;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, r110, textLocalisedClause, null, 4, null);
        navBarWithToolbar.setTitle(oVar2.f148117b, null);
        navBarWithToolbar.setTitleTopDescription(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(oVar2.f148118c);
        navBarWithToolbar.setThirdDescriptionText(oVar2.d);
        navBarWithToolbar.setBottomTag(oVar2.f);
        navBarWithToolbar.H0(true);
        if (oVar2.e) {
            navBarWithToolbar.I0(t3.TWO_LINES, false);
            return;
        }
        navBarWithToolbar.l0();
        if (!navBarWithToolbar.isLaidOut() || navBarWithToolbar.isLayoutRequested()) {
            navBarWithToolbar.addOnLayoutChangeListener(new v(navBarWithToolbar, this, 6));
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
    public final xki.e R1() {
        return (n) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitleVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setTitleTopDescriptionVisible(true);
        navBarWithToolbar.setThirdDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionClickable(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.y0()), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.A0()), new gul.n(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52339c.f121375b), new gzg.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53515c.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.r()), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.r()), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f53218h), new m(this, null), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.W;
        ViewController.P2(this, y.x(listSubheaderDelegate.e, listSubheaderDelegate.d, "mergeWith(...)"), new gzg.f(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }

    @Override // pyg.f
    public final d r() {
        return rd0.e.b(this.V.d);
    }
}
