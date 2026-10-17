package com.revolut.feature.spending_analytics.impl.ui.budget.overview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.p;
import te0.w;
import umd.d;
import umd.f;
import umd.g;
import umd.i;
import umd.j;
import umd.m;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/overview/BudgetOverviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lumd/d;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BudgetOverviewController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(BudgetOverviewController.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/ScreenBudgetOverviewBinding;", 0))};
    public final BudgetOverviewContract$InputData K;
    public final int L;
    public final h M;
    public final CenteredAmountDelegate N;
    public final CellDetailsDelegate O;
    public final RowDelegate P;
    public final ListSubheaderDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public BudgetOverviewController(BudgetOverviewContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_budget_overview;
        this.M = s.t(this, f.f);
        this.N = new CenteredAmountDelegate(null);
        this.O = new CellDetailsDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new ListSubheaderDelegate();
        this.R = new FullScreenStateDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: umd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetOverviewController f281291b;

            {
                this.f281291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BudgetOverviewController budgetOverviewController = this.f281291b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BudgetOverviewController.V;
                        return (m) ((ppd.p) budgetOverviewController.U.getValue()).f238522c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BudgetOverviewController.V;
                        BudgetOverviewController budgetOverviewController2 = this.f281291b;
                        return dli.f.a(budgetOverviewController2, budgetOverviewController2.R2(), v.k(budgetOverviewController2.N, budgetOverviewController2.O, new CellDetailsLoadingDelegate(), budgetOverviewController2.P, budgetOverviewController2.Q, budgetOverviewController2.R), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = BudgetOverviewController.V;
                        qji.b bVarU2 = budgetOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.overview.di.BudgetOverviewInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        BudgetOverviewContract$InputData budgetOverviewContract$InputData = budgetOverviewController.K;
                        budgetOverviewContract$InputData.getClass();
                        return new ppd.p(nVar, oVar2, budgetOverviewContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: umd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetOverviewController f281291b;

            {
                this.f281291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BudgetOverviewController budgetOverviewController = this.f281291b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BudgetOverviewController.V;
                        return (m) ((ppd.p) budgetOverviewController.U.getValue()).f238522c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BudgetOverviewController.V;
                        BudgetOverviewController budgetOverviewController2 = this.f281291b;
                        return dli.f.a(budgetOverviewController2, budgetOverviewController2.R2(), v.k(budgetOverviewController2.N, budgetOverviewController2.O, new CellDetailsLoadingDelegate(), budgetOverviewController2.P, budgetOverviewController2.Q, budgetOverviewController2.R), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = BudgetOverviewController.V;
                        qji.b bVarU2 = budgetOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.overview.di.BudgetOverviewInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        BudgetOverviewContract$InputData budgetOverviewContract$InputData = budgetOverviewController.K;
                        budgetOverviewContract$InputData.getClass();
                        return new ppd.p(nVar, oVar2, budgetOverviewContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: umd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetOverviewController f281291b;

            {
                this.f281291b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BudgetOverviewController budgetOverviewController = this.f281291b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BudgetOverviewController.V;
                        return (m) ((ppd.p) budgetOverviewController.U.getValue()).f238522c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BudgetOverviewController.V;
                        BudgetOverviewController budgetOverviewController2 = this.f281291b;
                        return dli.f.a(budgetOverviewController2, budgetOverviewController2.R2(), v.k(budgetOverviewController2.N, budgetOverviewController2.O, new CellDetailsLoadingDelegate(), budgetOverviewController2.P, budgetOverviewController2.Q, budgetOverviewController2.R), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = BudgetOverviewController.V;
                        qji.b bVarU2 = budgetOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.overview.di.BudgetOverviewInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        BudgetOverviewContract$InputData budgetOverviewContract$InputData = budgetOverviewController.K;
                        budgetOverviewContract$InputData.getClass();
                        return new ppd.p(nVar, oVar2, budgetOverviewContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f153688b.setBackgroundType(uiState.f281288b);
        BasicNavBar basicNavBar = d3().f153689c;
        basicNavBar.setMenuItems(uiState.d);
        basicNavBar.setSubtitle(uiState.f281289c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f153689c;
        basicNavBar.setExpanded(false);
        basicNavBar.setTitleCentered(true);
        basicNavBar.setTitle(new TextLocalisedClause(R$string.analytics_budget_overview_toolbar_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f153689c.f59211b), null, new uea.e(this, null, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.e), null, new umd.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52707c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new j(this, null), 3);
    }

    public final hmd.f d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hmd.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
