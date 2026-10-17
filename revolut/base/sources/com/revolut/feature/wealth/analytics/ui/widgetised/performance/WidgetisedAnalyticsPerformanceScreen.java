package com.revolut.feature.wealth.analytics.ui.widgetised.performance;

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
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ewg.l;
import kotlin.Lazy;
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
import v0f.p;
import vc.s;
import vkm.d;
import wp5.y;
import wrj.m;
import wyc.u;
import wyg.b;
import wyg.c;
import wyg.k;
import wyg.n;
import wyg.r;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/performance/WidgetisedAnalyticsPerformanceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwyg/f;", "Lpyg/f;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetisedAnalyticsPerformanceScreen extends ViewController<q> implements dli.a, f {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(WidgetisedAnalyticsPerformanceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final TabsDelegate P;
    public final Object Q;
    public final Object R;
    public final ListSubheaderDelegate S;
    public final SelectableDelegate T;
    public final int U;
    public final h V;
    public final Object W;

    public WidgetisedAnalyticsPerformanceScreen(WidgetisedAnalyticsPerformanceContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: wyg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen f301289b;

            {
                this.f301289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsPerformanceScreen.X;
                        return (c) ((ewg.l) this.f301289b.L.getValue()).f130240m.get();
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsPerformanceScreen.X;
                        WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen = this.f301289b;
                        return dli.f.a(widgetisedAnalyticsPerformanceScreen, widgetisedAnalyticsPerformanceScreen.d(), zhm.v.k((RowDelegate) widgetisedAnalyticsPerformanceScreen.M.getValue(), widgetisedAnalyticsPerformanceScreen.S, new RowLoadingDelegate(), (FullScreenStateDelegate) widgetisedAnalyticsPerformanceScreen.N.getValue(), (TrendViewDelegate) widgetisedAnalyticsPerformanceScreen.Q.getValue(), (FixedTabsDelegate) widgetisedAnalyticsPerformanceScreen.O.getValue(), widgetisedAnalyticsPerformanceScreen.P, (TextDelegate) widgetisedAnalyticsPerformanceScreen.R.getValue(), widgetisedAnalyticsPerformanceScreen.T), 0, null, null, null, 60);
                }
            }
        });
        this.L = w.y0(new m(this, inputData, 7));
        Lazy lazyY0 = w.y0(new u(2));
        this.M = lazyY0;
        this.N = w.y0(new u(3));
        this.O = w.y0(new u(4));
        this.P = new TabsDelegate();
        this.Q = w.y0(new u(5));
        this.R = w.y0(new u(6));
        this.S = new ListSubheaderDelegate();
        this.T = new SelectableDelegate((RowDelegate) lazyY0.getValue());
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, wyg.h.f);
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: wyg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen f301289b;

            {
                this.f301289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsPerformanceScreen.X;
                        return (c) ((ewg.l) this.f301289b.L.getValue()).f130240m.get();
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsPerformanceScreen.X;
                        WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen = this.f301289b;
                        return dli.f.a(widgetisedAnalyticsPerformanceScreen, widgetisedAnalyticsPerformanceScreen.d(), zhm.v.k((RowDelegate) widgetisedAnalyticsPerformanceScreen.M.getValue(), widgetisedAnalyticsPerformanceScreen.S, new RowLoadingDelegate(), (FullScreenStateDelegate) widgetisedAnalyticsPerformanceScreen.N.getValue(), (TrendViewDelegate) widgetisedAnalyticsPerformanceScreen.Q.getValue(), (FixedTabsDelegate) widgetisedAnalyticsPerformanceScreen.O.getValue(), widgetisedAnalyticsPerformanceScreen.P, (TextDelegate) widgetisedAnalyticsPerformanceScreen.R.getValue(), widgetisedAnalyticsPerformanceScreen.T), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        wyg.f uiState = (wyg.f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        b bVar = uiState.f301287b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ?? r110 = bVar.f301282b;
        TextLocalisedClause textLocalisedClause = bVar.f301281a;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, r110, textLocalisedClause, null, 4, null);
        navBarWithToolbar.setTitle(bVar.f301282b, null);
        navBarWithToolbar.setTitleTopDescription(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(bVar.f301283c);
        navBarWithToolbar.setSecondDescriptionClickable(bVar.d);
        navBarWithToolbar.setThirdDescriptionText(bVar.e);
        navBarWithToolbar.setBottomTag(bVar.f301284g);
        navBarWithToolbar.H0(true);
        if (bVar.f) {
            navBarWithToolbar.I0(t3.DEFAULT, false);
            return;
        }
        navBarWithToolbar.l0();
        if (!navBarWithToolbar.isLaidOut() || navBarWithToolbar.isLayoutRequested()) {
            navBarWithToolbar.addOnLayoutChangeListener(new v(navBarWithToolbar, this, 14));
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
        return (l) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.I0(t3.DEFAULT, false);
        navBarWithToolbar.setTitleVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setThirdDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setTitleTopDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionClickable(true);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new n(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174539b.y0()), new n(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.A0()), new wyg.m(this, continuation, i), 3);
        ?? r62 = this.M;
        ViewController.P2(this, new p(new wvl.b(rd0.e.b(((RowDelegate) r62.getValue()).f53218h), 8), 18), new wyg.m(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new wyg.o(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FixedTabsDelegate) this.O.getValue()).f52339c.f121375b), new wyg.p(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53515c.f121375b), new wyg.q(this, null), 3);
        ViewController.P2(this, rd0.e.b(((TrendViewDelegate) this.Q.getValue()).r()), new r(this, null), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.S;
        ViewController.P2(this, y.x(listSubheaderDelegate.e, listSubheaderDelegate.d, "mergeWith(...)"), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.r()), new wyg.l(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53226s), new wyg.m(this, continuation, 0), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.V.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c d() {
        return (c) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pyg.f
    public final d r() {
        return rd0.e.b(((TextDelegate) this.R.getValue()).d);
    }
}
