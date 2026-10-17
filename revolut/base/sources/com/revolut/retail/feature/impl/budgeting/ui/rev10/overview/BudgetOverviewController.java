package com.revolut.retail.feature.impl.budgeting.ui.rev10.overview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LimitProgressBarWithTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.overview.GoalsOverviewScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.overview.BudgetOverviewController;
import dli.a;
import dli.c;
import erj.p;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import uw0.d;
import uw0.f;
import uw0.h;
import vc.s;
import xki.e;
import yrj.b;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/overview/BudgetOverviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lurj/f;", "Luw0/f;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BudgetOverviewController extends ViewController<q> implements a, f {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(BudgetOverviewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final d L;
    public final String M;
    public final h N;
    public final ao.h O;
    public final Object P;
    public final Object Q;
    public final RowDelegate R;
    public final ListSubheaderDelegate S;
    public final FullScreenStateDelegate T;
    public final Object U;

    public BudgetOverviewController(GoalsOverviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = d.f283501a;
        this.M = getV();
        this.N = h.APPLICATION;
        this.O = s.t(this, b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: yrj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetOverviewController f316322b;

            {
                this.f316322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = BudgetOverviewController.V;
                        p pVar = (p) this.f316322b.Q.getValue();
                        switch (pVar.f128732a) {
                            case 0:
                                return (urj.e) pVar.d.get();
                            default:
                                return (urj.e) pVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = BudgetOverviewController.V;
                        BudgetOverviewController budgetOverviewController = this.f316322b;
                        return dli.f.a(budgetOverviewController, budgetOverviewController.R2(), v.k(budgetOverviewController.R, budgetOverviewController.S, budgetOverviewController.T, new RowLoadingDelegate(), new SegmentedGaugeChartLoadingDelegate(), new LimitProgressBarWithTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = w.y0(new yff.b(this, inputData, 21));
        this.R = new RowDelegate(null, null, 7);
        this.S = new ListSubheaderDelegate();
        this.T = new FullScreenStateDelegate();
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: yrj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetOverviewController f316322b;

            {
                this.f316322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BudgetOverviewController.V;
                        p pVar = (p) this.f316322b.Q.getValue();
                        switch (pVar.f128732a) {
                            case 0:
                                return (urj.e) pVar.d.get();
                            default:
                                return (urj.e) pVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = BudgetOverviewController.V;
                        BudgetOverviewController budgetOverviewController = this.f316322b;
                        return dli.f.a(budgetOverviewController, budgetOverviewController.R2(), v.k(budgetOverviewController.R, budgetOverviewController.S, budgetOverviewController.T, new RowLoadingDelegate(), new SegmentedGaugeChartLoadingDelegate(), new LimitProgressBarWithTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        urj.f uiState = (urj.f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f282327b;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_budgeting_overview_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_budgeting_overview_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53218h), null, new yrj.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52707c), null, new yrj.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new yph.b(rd0.e.b(this.T.f52371h.f121375b), 2), null, new yrj.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new yl6.b(this, null, 8), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final urj.e R2() {
        return (urj.e) this.P.getValue();
    }

    @Override // uw0.f
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getM() {
        return this.M;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    @Override // uw0.f
    public final uw0.e getType() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }

    @Override // uw0.f
    /* JADX INFO: renamed from: m, reason: from getter */
    public final h getN() {
        return this.N;
    }
}
