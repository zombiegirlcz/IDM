package com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.m6;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ox0.b0;
import ppd.r;
import smd.d;
import smd.e;
import smd.f;
import smd.k;
import smd.l;
import smd.n;
import smd.p;
import smd.u;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/category_budgets/CategoryBudgetsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsmd/k;", "Ldli/a;", "Lsmd/l;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryBudgetsController extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CategoryBudgetsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final CategoryBudgetsContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final DraggableDelegate O;
    public final ListSubheaderDelegate P;
    public final RowLoadingDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CategoryBudgetsController(CategoryBudgetsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, n.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: smd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryBudgetsController f264431b;

            {
                this.f264431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CategoryBudgetsController categoryBudgetsController = this.f264431b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryBudgetsController.V;
                        qd0.b bVarN = ((ppd.r) categoryBudgetsController.U.getValue()).f238533b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CategoryBudgetsController.V;
                        return (u) ((ppd.r) categoryBudgetsController.U.getValue()).f238534c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CategoryBudgetsController.V;
                        CategoryBudgetsController categoryBudgetsController2 = this.f264431b;
                        return dli.f.a(categoryBudgetsController2, categoryBudgetsController2.R2(), zhm.v.k(categoryBudgetsController2.R, categoryBudgetsController2.O, categoryBudgetsController2.P, categoryBudgetsController2.Q), categoryBudgetsController2.d3().d.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CategoryBudgetsController.V;
                        qji.b bVarU2 = categoryBudgetsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.di.CategoryBudgetsInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        CategoryBudgetsContract$InputData categoryBudgetsContract$InputData = categoryBudgetsController.K;
                        categoryBudgetsContract$InputData.getClass();
                        return new ppd.r(nVar, oVar2, categoryBudgetsContract$InputData);
                }
            }
        });
        this.O = new DraggableDelegate(new RowDelegate(new scl.h(this, 19), null, 6), null);
        this.P = new ListSubheaderDelegate();
        this.Q = new RowLoadingDelegate();
        this.R = new FullScreenStateDelegate();
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: smd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryBudgetsController f264431b;

            {
                this.f264431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CategoryBudgetsController categoryBudgetsController = this.f264431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryBudgetsController.V;
                        qd0.b bVarN = ((ppd.r) categoryBudgetsController.U.getValue()).f238533b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CategoryBudgetsController.V;
                        return (u) ((ppd.r) categoryBudgetsController.U.getValue()).f238534c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CategoryBudgetsController.V;
                        CategoryBudgetsController categoryBudgetsController2 = this.f264431b;
                        return dli.f.a(categoryBudgetsController2, categoryBudgetsController2.R2(), zhm.v.k(categoryBudgetsController2.R, categoryBudgetsController2.O, categoryBudgetsController2.P, categoryBudgetsController2.Q), categoryBudgetsController2.d3().d.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CategoryBudgetsController.V;
                        qji.b bVarU2 = categoryBudgetsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.di.CategoryBudgetsInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        CategoryBudgetsContract$InputData categoryBudgetsContract$InputData = categoryBudgetsController.K;
                        categoryBudgetsContract$InputData.getClass();
                        return new ppd.r(nVar, oVar2, categoryBudgetsContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: smd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryBudgetsController f264431b;

            {
                this.f264431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CategoryBudgetsController categoryBudgetsController = this.f264431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryBudgetsController.V;
                        qd0.b bVarN = ((ppd.r) categoryBudgetsController.U.getValue()).f238533b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CategoryBudgetsController.V;
                        return (u) ((ppd.r) categoryBudgetsController.U.getValue()).f238534c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CategoryBudgetsController.V;
                        CategoryBudgetsController categoryBudgetsController2 = this.f264431b;
                        return dli.f.a(categoryBudgetsController2, categoryBudgetsController2.R2(), zhm.v.k(categoryBudgetsController2.R, categoryBudgetsController2.O, categoryBudgetsController2.P, categoryBudgetsController2.Q), categoryBudgetsController2.d3().d.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CategoryBudgetsController.V;
                        qji.b bVarU2 = categoryBudgetsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.di.CategoryBudgetsInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        CategoryBudgetsContract$InputData categoryBudgetsContract$InputData = categoryBudgetsController.K;
                        categoryBudgetsContract$InputData.getClass();
                        return new ppd.r(nVar, oVar2, categoryBudgetsContract$InputData);
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: smd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryBudgetsController f264431b;

            {
                this.f264431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CategoryBudgetsController categoryBudgetsController = this.f264431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryBudgetsController.V;
                        qd0.b bVarN = ((ppd.r) categoryBudgetsController.U.getValue()).f238533b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CategoryBudgetsController.V;
                        return (u) ((ppd.r) categoryBudgetsController.U.getValue()).f238534c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CategoryBudgetsController.V;
                        CategoryBudgetsController categoryBudgetsController2 = this.f264431b;
                        return dli.f.a(categoryBudgetsController2, categoryBudgetsController2.R2(), zhm.v.k(categoryBudgetsController2.R, categoryBudgetsController2.O, categoryBudgetsController2.P, categoryBudgetsController2.Q), categoryBudgetsController2.d3().d.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CategoryBudgetsController.V;
                        qji.b bVarU2 = categoryBudgetsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.di.CategoryBudgetsInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        CategoryBudgetsContract$InputData categoryBudgetsContract$InputData = categoryBudgetsController.K;
                        categoryBudgetsContract$InputData.getClass();
                        return new ppd.r(nVar, oVar2, categoryBudgetsContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174534c.setMenuItems(uiState.f264429c);
        ActionFooterView actionFooterView = d3().f174533b;
        f fVar = uiState.f264428b;
        if (fVar instanceof d) {
            actionFooterView.setVisibility(8);
        } else {
            if (!(fVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            actionFooterView.setVisibility(0);
            e eVar = (e) fVar;
            actionFooterView.setModel(new aw0.e(true, eVar.f264412b, b0.ABOVE_BUTTONS, m6.c(n6.Companion, eVar.f264411a, LargeActionButton.ButtonStyle.f58725a, null, "category_budgets_submit", eVar.f264413c, null, null, null, 972), null, null, 48));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_budget_categories_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_budget_categories_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.analytics_budget_categories_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.e), null, new smd.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52707c), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new smd.q(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.o.f57403b), null, new sek.q(this, continuation, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new smd.q(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new smd.r(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final u d() {
        return (u) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
