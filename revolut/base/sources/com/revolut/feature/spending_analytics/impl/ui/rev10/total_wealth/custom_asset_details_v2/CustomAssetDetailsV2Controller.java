package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ChartEmptyStateDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonLineChartDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.CustomAssetDetailsV2Controller;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ipd.g;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import ppd.u0;
import te0.w;
import urd.b;
import urd.c;
import urd.d;
import urd.e;
import urd.f;
import urd.n;
import urd.p;
import urd.r;
import urd.t;
import urd.u;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/custom_asset_details_v2/CustomAssetDetailsV2Controller;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lurd/e;", "Ldli/a;", "Lurd/f;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomAssetDetailsV2Controller extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CustomAssetDetailsV2Controller.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final c K;
    public final int L;
    public final h M;
    public final g N;
    public final RowDelegate O;
    public final CellDetailsDelegate P;
    public final FixedTabsDelegate Q;
    public final ComparisonLineChartDelegate R;
    public final ChartEmptyStateDelegate S;
    public final TextDelegate T;
    public final Object U;
    public final Object V;
    public final Object W;

    public CustomAssetDetailsV2Controller(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, urd.h.f);
        final int i = 0;
        this.N = new g(new Function0(this) { // from class: urd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetDetailsV2Controller f282283b;

            {
                this.f282283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomAssetDetailsV2Controller customAssetDetailsV2Controller = this.f282283b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetDetailsV2Controller.X;
                        gte.a aVarB = ((ppd.w) customAssetDetailsV2Controller.U.getValue()).f238566b.f238482a.b();
                        vc.s.j(aVarB);
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetDetailsV2Controller.X;
                        qji.b bVarU2 = customAssetDetailsV2Controller.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.di.CustomAssetDetailsV2Injector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetDetailsV2Controller.K;
                        cVar.getClass();
                        return new ppd.w(nVar, u0Var2, cVar);
                    case 2:
                        KProperty[] kPropertyArr3 = CustomAssetDetailsV2Controller.X;
                        return (d) ((ppd.w) customAssetDetailsV2Controller.U.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = CustomAssetDetailsV2Controller.X;
                        CustomAssetDetailsV2Controller customAssetDetailsV2Controller2 = this.f282283b;
                        return dli.f.a(customAssetDetailsV2Controller2, customAssetDetailsV2Controller2.d(), zhm.v.k(customAssetDetailsV2Controller2.O, customAssetDetailsV2Controller2.P, customAssetDetailsV2Controller2.Q, customAssetDetailsV2Controller2.R, customAssetDetailsV2Controller2.S, customAssetDetailsV2Controller2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        this.P = new CellDetailsDelegate();
        this.Q = new FixedTabsDelegate();
        this.R = new ComparisonLineChartDelegate();
        this.S = new ChartEmptyStateDelegate();
        this.T = new TextDelegate();
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: urd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetDetailsV2Controller f282283b;

            {
                this.f282283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomAssetDetailsV2Controller customAssetDetailsV2Controller = this.f282283b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetDetailsV2Controller.X;
                        gte.a aVarB = ((ppd.w) customAssetDetailsV2Controller.U.getValue()).f238566b.f238482a.b();
                        vc.s.j(aVarB);
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetDetailsV2Controller.X;
                        qji.b bVarU2 = customAssetDetailsV2Controller.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.di.CustomAssetDetailsV2Injector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetDetailsV2Controller.K;
                        cVar.getClass();
                        return new ppd.w(nVar, u0Var2, cVar);
                    case 2:
                        KProperty[] kPropertyArr3 = CustomAssetDetailsV2Controller.X;
                        return (d) ((ppd.w) customAssetDetailsV2Controller.U.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = CustomAssetDetailsV2Controller.X;
                        CustomAssetDetailsV2Controller customAssetDetailsV2Controller2 = this.f282283b;
                        return dli.f.a(customAssetDetailsV2Controller2, customAssetDetailsV2Controller2.d(), zhm.v.k(customAssetDetailsV2Controller2.O, customAssetDetailsV2Controller2.P, customAssetDetailsV2Controller2.Q, customAssetDetailsV2Controller2.R, customAssetDetailsV2Controller2.S, customAssetDetailsV2Controller2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: urd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetDetailsV2Controller f282283b;

            {
                this.f282283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomAssetDetailsV2Controller customAssetDetailsV2Controller = this.f282283b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetDetailsV2Controller.X;
                        gte.a aVarB = ((ppd.w) customAssetDetailsV2Controller.U.getValue()).f238566b.f238482a.b();
                        vc.s.j(aVarB);
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetDetailsV2Controller.X;
                        qji.b bVarU2 = customAssetDetailsV2Controller.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.di.CustomAssetDetailsV2Injector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetDetailsV2Controller.K;
                        cVar.getClass();
                        return new ppd.w(nVar, u0Var2, cVar);
                    case 2:
                        KProperty[] kPropertyArr3 = CustomAssetDetailsV2Controller.X;
                        return (d) ((ppd.w) customAssetDetailsV2Controller.U.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = CustomAssetDetailsV2Controller.X;
                        CustomAssetDetailsV2Controller customAssetDetailsV2Controller2 = this.f282283b;
                        return dli.f.a(customAssetDetailsV2Controller2, customAssetDetailsV2Controller2.d(), zhm.v.k(customAssetDetailsV2Controller2.O, customAssetDetailsV2Controller2.P, customAssetDetailsV2Controller2.Q, customAssetDetailsV2Controller2.R, customAssetDetailsV2Controller2.S, customAssetDetailsV2Controller2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: urd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetDetailsV2Controller f282283b;

            {
                this.f282283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CustomAssetDetailsV2Controller customAssetDetailsV2Controller = this.f282283b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetDetailsV2Controller.X;
                        gte.a aVarB = ((ppd.w) customAssetDetailsV2Controller.U.getValue()).f238566b.f238482a.b();
                        vc.s.j(aVarB);
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetDetailsV2Controller.X;
                        qji.b bVarU2 = customAssetDetailsV2Controller.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.di.CustomAssetDetailsV2Injector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetDetailsV2Controller.K;
                        cVar.getClass();
                        return new ppd.w(nVar, u0Var2, cVar);
                    case 2:
                        KProperty[] kPropertyArr3 = CustomAssetDetailsV2Controller.X;
                        return (d) ((ppd.w) customAssetDetailsV2Controller.U.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = CustomAssetDetailsV2Controller.X;
                        CustomAssetDetailsV2Controller customAssetDetailsV2Controller2 = this.f282283b;
                        return dli.f.a(customAssetDetailsV2Controller2, customAssetDetailsV2Controller2.d(), zhm.v.k(customAssetDetailsV2Controller2.O, customAssetDetailsV2Controller2.P, customAssetDetailsV2Controller2.Q, customAssetDetailsV2Controller2.R, customAssetDetailsV2Controller2.S, customAssetDetailsV2Controller2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return this.N.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [au0.f0, com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ?? textClause;
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        this.N.d(D2(), uiState.d);
        b bVar = uiState.f282280b;
        List list = uiState.f282281c;
        ?? r4 = d3().f174539b;
        Clause clause = bVar.f282271a;
        Clause clause2 = bVar.f282273c;
        ?? r110 = bVar.f282272b;
        r4.setTitleTopDescriptionVisible(clause != null);
        r4.setSecondDescriptionVisible(clause2 != null);
        ?? r56 = clause == null ? r110 : clause;
        if (clause != null) {
            textClause = r110;
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        NavBarWithToolbar.setToolbar$default(r4, r56, textClause, null, 4, null);
        r4.setTitleTopDescription(clause);
        r4.setTitle(r110, null);
        r4.setSecondDescriptionText(clause2);
        r4.setTopActions(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ppd.w) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.N.a(view);
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        this.N.b();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new urd.o(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.C0()), null, new p(this, null), 3);
        RowDelegate rowDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new urd.s(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new tzh.g(rd0.e.b(rowDelegate.f53226s), 27), null, new urd.o(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new tzh.g(rd0.e.b(rowDelegate.f53225r), 28), null, new t(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new tzh.g(rd0.e.b(rowDelegate.f53224q), 29), null, new u(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new n(rd0.e.b(this.P.e), 0), null, new urd.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52339c.f121375b), null, new r(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(rd0.e.b(this.R.f52114c.f121375b)), null, new r(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d), null, new r(this, continuation, 2), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
