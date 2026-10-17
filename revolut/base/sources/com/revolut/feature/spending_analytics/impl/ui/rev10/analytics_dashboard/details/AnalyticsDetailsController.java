package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ard.p0;
import aw0.o9;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ChartEmptyStateDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonLineChartDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonLineChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FlexibleBarChartDelegate;
import com.revolut.core.ui_kit.delegates.FlexibleBarChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import efm.r;
import ipd.c;
import ipd.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.k;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import te0.w;
import tx0.t3;
import uw0.d;
import uw0.f;
import uw0.h;
import vc.s;
import zhm.v;
import znc.j;
import znd.a0;
import znd.b0;
import znd.e;
import znd.i;
import znd.l;
import znd.m;
import znd.t;
import znd.u;
import znd.x;
import znd.y;
import znd.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/details/AnalyticsDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lznd/i;", "", "Luw0/f;", "Companion", "a", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsDetailsController extends ViewController<q> implements dli.a, k, f {
    public final /* synthetic */ c K;
    public final AnalyticsDetailsContract$InputData L;
    public final int M;
    public final d N;
    public final String O;
    public final h P;
    public final ao.h Q;
    public final g R;
    public final SegmentedGaugeChartDelegate S;
    public final FlexibleBarChartDelegate T;
    public final RowDelegate U;
    public final FullScreenStateDelegate V;
    public final ListSubheaderDelegate W;
    public final LargeActionButtonDelegate X;
    public final TabsDelegate Y;
    public final FixedTabsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ActionWidgetDelegate f87556a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final SwipeToActionDelegate f87557b0;
    public l0 c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ScrollerDelegate f87558d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f87559e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AnalyticsSpendingPeriod$Interval f87560h0;
    public long i0;
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(AnalyticsDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AnalyticsDetailsController(AnalyticsDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new c(inputData.f87546a);
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        this.N = d.f283501a;
        this.O = a0.d.r(inputData.f87547b.name(), getU());
        this.P = h.APPLICATION;
        this.Q = s.t(this, m.f);
        final int i = 0;
        this.R = new g(new Function0(this) { // from class: znd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDetailsController f323764b;

            {
                this.f323764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AnalyticsDetailsController analyticsDetailsController = this.f323764b;
                switch (i2) {
                    case 0:
                        AnalyticsDetailsController.Companion companion = AnalyticsDetailsController.INSTANCE;
                        gte.a aVarB = ((ppd.m) analyticsDetailsController.f87559e0.getValue()).f238473b.f238482a.b();
                        vc.s.j(aVarB);
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 1:
                        AnalyticsDetailsController.Companion companion2 = AnalyticsDetailsController.INSTANCE;
                        qji.b bVarU2 = analyticsDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.di.AnalyticsDetailsScreenInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData = analyticsDetailsController.L;
                        analyticsDetailsContract$InputData.getClass();
                        return new ppd.m(nVar, lVar2, analyticsDetailsContract$InputData);
                    case 2:
                        AnalyticsDetailsController.Companion companion3 = AnalyticsDetailsController.INSTANCE;
                        return (b) ((ppd.m) analyticsDetailsController.f87559e0.getValue()).f238476h.get();
                    default:
                        AnalyticsDetailsController.Companion companion4 = AnalyticsDetailsController.INSTANCE;
                        AnalyticsDetailsController analyticsDetailsController2 = this.f323764b;
                        return dli.f.a(analyticsDetailsController2, analyticsDetailsController2.R2(), zhm.v.k(analyticsDetailsController2.f87558d0, analyticsDetailsController2.U, new RowLoadingDelegate(), analyticsDetailsController2.V, new SegmentedGaugeChartLoadingDelegate(), new FlexibleBarChartLoadingDelegate(), analyticsDetailsController2.W, new ListSubheaderLoadingDelegate(), analyticsDetailsController2.Y, analyticsDetailsController2.X, new TabsLoadingDelegate(), analyticsDetailsController2.Z, new FixedTabsLoadingDelegate(), new ComparisonLineChartLoadingDelegate(), analyticsDetailsController2.f87556a0, analyticsDetailsController2.f87557b0), 0, null, null, null, 60);
                }
            }
        });
        SegmentedGaugeChartDelegate segmentedGaugeChartDelegate = new SegmentedGaugeChartDelegate();
        this.S = segmentedGaugeChartDelegate;
        FlexibleBarChartDelegate flexibleBarChartDelegate = new FlexibleBarChartDelegate();
        this.T = flexibleBarChartDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        this.V = new FullScreenStateDelegate();
        this.W = new ListSubheaderDelegate();
        this.X = new LargeActionButtonDelegate();
        this.Y = new TabsDelegate();
        this.Z = new FixedTabsDelegate();
        ComparisonLineChartDelegate comparisonLineChartDelegate = new ComparisonLineChartDelegate();
        this.f87556a0 = new ActionWidgetDelegate();
        this.f87557b0 = new SwipeToActionDelegate(rowDelegate, false);
        final int i2 = 1;
        final int i3 = 2;
        final int i5 = 3;
        this.f87558d0 = new ScrollerDelegate(v.k(segmentedGaugeChartDelegate, new SegmentedGaugeChartLoadingDelegate(), flexibleBarChartDelegate, new FlexibleBarChartLoadingDelegate(), comparisonLineChartDelegate, new ComparisonLineChartLoadingDelegate(), new ChartEmptyStateDelegate()), false);
        this.f87559e0 = w.y0(new Function0(this) { // from class: znd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDetailsController f323764b;

            {
                this.f323764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AnalyticsDetailsController analyticsDetailsController = this.f323764b;
                switch (i22) {
                    case 0:
                        AnalyticsDetailsController.Companion companion = AnalyticsDetailsController.INSTANCE;
                        gte.a aVarB = ((ppd.m) analyticsDetailsController.f87559e0.getValue()).f238473b.f238482a.b();
                        vc.s.j(aVarB);
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 1:
                        AnalyticsDetailsController.Companion companion2 = AnalyticsDetailsController.INSTANCE;
                        qji.b bVarU2 = analyticsDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.di.AnalyticsDetailsScreenInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData = analyticsDetailsController.L;
                        analyticsDetailsContract$InputData.getClass();
                        return new ppd.m(nVar, lVar2, analyticsDetailsContract$InputData);
                    case 2:
                        AnalyticsDetailsController.Companion companion3 = AnalyticsDetailsController.INSTANCE;
                        return (b) ((ppd.m) analyticsDetailsController.f87559e0.getValue()).f238476h.get();
                    default:
                        AnalyticsDetailsController.Companion companion4 = AnalyticsDetailsController.INSTANCE;
                        AnalyticsDetailsController analyticsDetailsController2 = this.f323764b;
                        return dli.f.a(analyticsDetailsController2, analyticsDetailsController2.R2(), zhm.v.k(analyticsDetailsController2.f87558d0, analyticsDetailsController2.U, new RowLoadingDelegate(), analyticsDetailsController2.V, new SegmentedGaugeChartLoadingDelegate(), new FlexibleBarChartLoadingDelegate(), analyticsDetailsController2.W, new ListSubheaderLoadingDelegate(), analyticsDetailsController2.Y, analyticsDetailsController2.X, new TabsLoadingDelegate(), analyticsDetailsController2.Z, new FixedTabsLoadingDelegate(), new ComparisonLineChartLoadingDelegate(), analyticsDetailsController2.f87556a0, analyticsDetailsController2.f87557b0), 0, null, null, null, 60);
                }
            }
        });
        this.f0 = w.y0(new Function0(this) { // from class: znd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDetailsController f323764b;

            {
                this.f323764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AnalyticsDetailsController analyticsDetailsController = this.f323764b;
                switch (i22) {
                    case 0:
                        AnalyticsDetailsController.Companion companion = AnalyticsDetailsController.INSTANCE;
                        gte.a aVarB = ((ppd.m) analyticsDetailsController.f87559e0.getValue()).f238473b.f238482a.b();
                        vc.s.j(aVarB);
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 1:
                        AnalyticsDetailsController.Companion companion2 = AnalyticsDetailsController.INSTANCE;
                        qji.b bVarU2 = analyticsDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.di.AnalyticsDetailsScreenInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData = analyticsDetailsController.L;
                        analyticsDetailsContract$InputData.getClass();
                        return new ppd.m(nVar, lVar2, analyticsDetailsContract$InputData);
                    case 2:
                        AnalyticsDetailsController.Companion companion3 = AnalyticsDetailsController.INSTANCE;
                        return (b) ((ppd.m) analyticsDetailsController.f87559e0.getValue()).f238476h.get();
                    default:
                        AnalyticsDetailsController.Companion companion4 = AnalyticsDetailsController.INSTANCE;
                        AnalyticsDetailsController analyticsDetailsController2 = this.f323764b;
                        return dli.f.a(analyticsDetailsController2, analyticsDetailsController2.R2(), zhm.v.k(analyticsDetailsController2.f87558d0, analyticsDetailsController2.U, new RowLoadingDelegate(), analyticsDetailsController2.V, new SegmentedGaugeChartLoadingDelegate(), new FlexibleBarChartLoadingDelegate(), analyticsDetailsController2.W, new ListSubheaderLoadingDelegate(), analyticsDetailsController2.Y, analyticsDetailsController2.X, new TabsLoadingDelegate(), analyticsDetailsController2.Z, new FixedTabsLoadingDelegate(), new ComparisonLineChartLoadingDelegate(), analyticsDetailsController2.f87556a0, analyticsDetailsController2.f87557b0), 0, null, null, null, 60);
                }
            }
        });
        this.g0 = w.y0(new Function0(this) { // from class: znd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDetailsController f323764b;

            {
                this.f323764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AnalyticsDetailsController analyticsDetailsController = this.f323764b;
                switch (i22) {
                    case 0:
                        AnalyticsDetailsController.Companion companion = AnalyticsDetailsController.INSTANCE;
                        gte.a aVarB = ((ppd.m) analyticsDetailsController.f87559e0.getValue()).f238473b.f238482a.b();
                        vc.s.j(aVarB);
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 1:
                        AnalyticsDetailsController.Companion companion2 = AnalyticsDetailsController.INSTANCE;
                        qji.b bVarU2 = analyticsDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.di.AnalyticsDetailsScreenInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData = analyticsDetailsController.L;
                        analyticsDetailsContract$InputData.getClass();
                        return new ppd.m(nVar, lVar2, analyticsDetailsContract$InputData);
                    case 2:
                        AnalyticsDetailsController.Companion companion3 = AnalyticsDetailsController.INSTANCE;
                        return (b) ((ppd.m) analyticsDetailsController.f87559e0.getValue()).f238476h.get();
                    default:
                        AnalyticsDetailsController.Companion companion4 = AnalyticsDetailsController.INSTANCE;
                        AnalyticsDetailsController analyticsDetailsController2 = this.f323764b;
                        return dli.f.a(analyticsDetailsController2, analyticsDetailsController2.R2(), zhm.v.k(analyticsDetailsController2.f87558d0, analyticsDetailsController2.U, new RowLoadingDelegate(), analyticsDetailsController2.V, new SegmentedGaugeChartLoadingDelegate(), new FlexibleBarChartLoadingDelegate(), analyticsDetailsController2.W, new ListSubheaderLoadingDelegate(), analyticsDetailsController2.Y, analyticsDetailsController2.X, new TabsLoadingDelegate(), analyticsDetailsController2.Z, new FixedTabsLoadingDelegate(), new ComparisonLineChartLoadingDelegate(), analyticsDetailsController2.f87556a0, analyticsDetailsController2.f87557b0), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getY() {
        return this.R.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        znd.h hVar = qVar instanceof znd.h ? (znd.h) qVar : null;
        if (hVar == null || hVar.f323757b) {
            this.R.d(D2(), uiState.d);
        }
        if (hVar == null || hVar.f323756a) {
            znd.g gVar = uiState.f323761b;
            if (gVar instanceof znd.d) {
                NavBarWithToolbar navBarWithToolbar = d3().f174539b;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar.H0(false);
                navBarWithToolbar.l0();
                znd.d dVar = (znd.d) gVar;
                MoneyClause moneyClause = dVar.f323740a;
                ?? r87 = dVar.f323741b;
                NavBarWithToolbar.setToolbar$default(navBarWithToolbar, r87, moneyClause, null, 4, null);
                navBarWithToolbar.setTitleTopDescription(r87);
                navBarWithToolbar.setTitle(moneyClause, null);
                navBarWithToolbar.setSecondDescriptionText(dVar.f323742c);
                navBarWithToolbar.setSecondDescriptionClickable(dVar.d);
                navBarWithToolbar.setSegmentedControl(dVar.e, dVar.f);
            } else if (gVar instanceof e) {
                NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
                NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar2.j0(false);
                navBarWithToolbar2.l0();
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                NavBarWithToolbar.setToolbar$default(navBarWithToolbar2, textClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 4, null);
                navBarWithToolbar2.setTitleTopDescription(null);
                navBarWithToolbar2.setTitle(null, null);
                navBarWithToolbar2.setSecondDescriptionText(null);
                navBarWithToolbar2.setSecondDescriptionClickable(false);
                e eVar = (e) gVar;
                navBarWithToolbar2.setSegmentedControl(eVar.f323746a, eVar.f323747b);
            } else if (gVar instanceof znd.f) {
                NavBarWithToolbar navBarWithToolbar3 = d3().f174539b;
                NavBarWithToolbar.Companion companion3 = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar3.H0(false);
                navBarWithToolbar3.I0(t3.DEFAULT, false);
                navBarWithToolbar3.setSecondDescriptionClickable(false);
            } else {
                if (gVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                NavBarWithToolbar navBarWithToolbar4 = d3().f174539b;
                NavBarWithToolbar.Companion companion4 = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar4.j0(false);
                navBarWithToolbar4.l0();
                navBarWithToolbar4.setSecondDescriptionClickable(false);
            }
        }
        if (hVar == null || hVar.f323758c) {
            boolean z = uiState.f323762c;
            Boolean boolValueOf = Boolean.valueOf(z);
            c cVar = this.K;
            if (boolValueOf.equals(cVar.f167733c)) {
                return;
            }
            cVar.f167733c = Boolean.valueOf(z);
            cVar.f167734g = cVar.a(null, null);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K.f167734g = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ppd.m) this.f87559e0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getQ() {
        return this.K.f167734g;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.c0 = new l0(m2());
        this.R.a(view);
        switch (l.f323771a[this.L.f87547b.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_section_spending_title, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_section_income_title, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_breakdown_screen, null, null, 14);
                break;
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_breakdown_screen, null, null, 14);
                break;
            case 5:
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_section_cashflow_title, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_section_freelancer_sales_title, null, null, 14);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        pd.b.p(view, textLocalisedClause);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setTitleTopDescriptionVisible(true);
        navBarWithToolbar.setTitleVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        RecyclerView.ItemAnimator itemAnimator = d3().f174540c.getItemAnimator();
        if (itemAnimator != null) {
            this.i0 = itemAnimator.getMoveDuration();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        this.R.b();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        c cVar = this.K;
        cVar.f167731a = 0;
        Continuation continuation = null;
        cVar.f167733c = null;
        cVar.f167734g = cVar.b();
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        com.revolut.kompot.navigable.a.g2(this, cj9.c.O(p0.a(recyclerView), 500L), null, new x(this, continuation, 0), 3);
        r rVarDoOnNext = w.a0(this.f87558d0.q(), new zmb.c(23)).doOnNext(new zmg.c(new znd.k(this, 0), 6)).distinctUntilChanged((kfm.d) new zmg.c(new j(1), 7)).filter(new zmg.c(new znd.k(this, 1), 8)).doOnNext(new zmg.c(new znd.k(this, 2), 9));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.d(rd0.e.b(rVarDoOnNext), zhm.h0.f322473a), null, null, 7);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53302c.f121375b), null, new u(this, continuation, 6), 3);
        RowDelegate rowDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, new z75.f(rd0.e.b(rowDelegate.f53220l), 19), null, new b0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new znd.s(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new z75.f(rd0.e.b(this.V.f52371h.f121375b), 15), null, new t(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52353c.f121375b), null, new u(this, continuation, 0), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.W;
        com.revolut.kompot.navigable.a.g2(this, new z75.f(h30.l.y(listSubheaderDelegate.d, listSubheaderDelegate.e, "merge(...)"), 16), null, new znd.v(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new z75.f(rd0.e.b(listSubheaderDelegate.f52707c), 17), null, new znd.w(this, null), 3);
        l0 l0Var = this.c0;
        if (l0Var == null) {
            Intrinsics.r("popupMenuDialogDisplayer");
            throw null;
        }
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(l0Var.f256113c), null, new u(this, continuation, 1), 3);
        TabsDelegate tabsDelegate = this.Y;
        com.revolut.kompot.navigable.a.g2(this, new z75.f(rd0.e.b(tabsDelegate.f53515c.f121375b), 18), null, new u(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.d.f121375b), null, new y(this, null), 3);
        r rVarFilter = tabsDelegate.e.f121375b.filter(new zmg.c(new zmb.c(22), 10));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new u(this, continuation, 3), 3);
        r map = tabsDelegate.f53515c.f121375b.filter(new zmg.c(new zmb.c(24), 11)).map(new zmg.c(new zmb.c(25), 12));
        r map2 = tabsDelegate.f.f121375b.map(new zmg.c(new zmb.c(19), 3));
        FixedTabsDelegate fixedTabsDelegate = this.Z;
        r rVarMerge = r.merge(map, map2, fixedTabsDelegate.f52339c.f121375b.map(new zmg.c(new zmb.c(20), 4)), fixedTabsDelegate.d.f121375b.map(new zmg.c(new zmb.c(21), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new u(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new x(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.y0()), null, new x(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabs) d3().f174539b.G0.getValue()).f), null, new z(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f87556a0.f51589c.f121375b), null, new u(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f87557b0.f), null, new a0(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.Q.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final znd.b R2() {
        return (znd.b) this.f0.getValue();
    }

    @Override // uw0.f
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getM() {
        return this.O;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.M;
    }

    @Override // uw0.f
    public final uw0.e getType() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.g0.getValue();
    }

    @Override // uw0.f
    /* JADX INFO: renamed from: m, reason: from getter */
    public final h getN() {
        return this.P;
    }
}
