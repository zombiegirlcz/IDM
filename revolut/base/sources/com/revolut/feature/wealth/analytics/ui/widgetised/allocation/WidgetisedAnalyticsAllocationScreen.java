package com.revolut.feature.wealth.analytics.ui.widgetised.allocation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FlexibleBarChartDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dgg.b;
import dyg.d;
import dyg.g;
import dyg.i;
import dyg.j;
import dyg.k;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pyg.f;
import te0.w;
import tki.c;
import tx0.t3;
import vc.s;
import wp5.y;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/allocation/WidgetisedAnalyticsAllocationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Ldyg/k;", "Lpyg/f;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetisedAnalyticsAllocationScreen extends ViewController<q> implements c, f {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(WidgetisedAnalyticsAllocationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final FlexibleBarChartDelegate R;
    public final TabsDelegate S;
    public final TextDelegate T;
    public final ListSubheaderDelegate U;

    public WidgetisedAnalyticsAllocationScreen(WidgetisedAnalyticsAllocationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new b(this, inputData, 22));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dyg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsAllocationScreen f121107b;

            {
                this.f121107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsAllocationScreen.V;
                        return (j) ((ewg.i) this.f121107b.K.getValue()).f130223m.get();
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsAllocationScreen.V;
                        WidgetisedAnalyticsAllocationScreen widgetisedAnalyticsAllocationScreen = this.f121107b;
                        return tki.g.a(widgetisedAnalyticsAllocationScreen, widgetisedAnalyticsAllocationScreen.R2(), v.k(widgetisedAnalyticsAllocationScreen.P, widgetisedAnalyticsAllocationScreen.Q, new RowLoadingDelegate(), widgetisedAnalyticsAllocationScreen.U, widgetisedAnalyticsAllocationScreen.R, widgetisedAnalyticsAllocationScreen.S, widgetisedAnalyticsAllocationScreen.T), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: dyg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetisedAnalyticsAllocationScreen f121107b;

            {
                this.f121107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WidgetisedAnalyticsAllocationScreen.V;
                        return (j) ((ewg.i) this.f121107b.K.getValue()).f130223m.get();
                    default:
                        KProperty[] kPropertyArr2 = WidgetisedAnalyticsAllocationScreen.V;
                        WidgetisedAnalyticsAllocationScreen widgetisedAnalyticsAllocationScreen = this.f121107b;
                        return tki.g.a(widgetisedAnalyticsAllocationScreen, widgetisedAnalyticsAllocationScreen.R2(), v.k(widgetisedAnalyticsAllocationScreen.P, widgetisedAnalyticsAllocationScreen.Q, new RowLoadingDelegate(), widgetisedAnalyticsAllocationScreen.U, widgetisedAnalyticsAllocationScreen.R, widgetisedAnalyticsAllocationScreen.S, widgetisedAnalyticsAllocationScreen.T), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, dyg.b.f);
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        this.R = new FlexibleBarChartDelegate();
        this.S = new TabsDelegate();
        this.T = new TextDelegate();
        this.U = new ListSubheaderDelegate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        i iVar = uiState.f121118b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ?? r110 = iVar.f121115b;
        TextLocalisedClause textLocalisedClause = iVar.f121114a;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, r110, textLocalisedClause, null, 4, null);
        navBarWithToolbar.setTitle(iVar.f121115b, null);
        navBarWithToolbar.setTitleClickable(iVar.f121116c);
        navBarWithToolbar.setTitleTopDescription(textLocalisedClause);
        if (iVar.d) {
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        } else {
            navBarWithToolbar.l0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ewg.i) this.K.getValue();
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
        navBarWithToolbar.H0(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new dyg.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.B0()), new dyg.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new dyg.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52353c.f121375b), new dyg.f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53515c.f121375b), new dyg.f(this, continuation, 1), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.U;
        ViewController.P2(this, y.x(listSubheaderDelegate.e, listSubheaderDelegate.d, "mergeWith(...)"), new g(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.M.getValue();
    }

    @Override // pyg.f
    public final vkm.d r() {
        return rd0.e.b(this.T.d);
    }
}
