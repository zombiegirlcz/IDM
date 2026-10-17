package com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.BudgetUpcomingPaymentsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.BudgetUpcomingPaymentsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import z3f.b;
import zhm.v;
import zmd.e;
import zmd.f;
import zmd.g;
import zmd.i;
import zmd.l;
import zmd.m;
import zmd.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/upcoming_payments/BudgetUpcomingPaymentsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzmd/i;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BudgetUpcomingPaymentsController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BudgetUpcomingPaymentsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BudgetUpcomingPaymentsContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public BudgetUpcomingPaymentsController(BudgetUpcomingPaymentsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, l.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        this.O = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zmd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetUpcomingPaymentsController f323471b;

            {
                this.f323471b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BudgetUpcomingPaymentsController budgetUpcomingPaymentsController = this.f323471b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BudgetUpcomingPaymentsController.S;
                        return (o) ((ppd.q) budgetUpcomingPaymentsController.R.getValue()).f238528c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BudgetUpcomingPaymentsController.S;
                        BudgetUpcomingPaymentsController budgetUpcomingPaymentsController2 = this.f323471b;
                        return dli.f.a(budgetUpcomingPaymentsController2, budgetUpcomingPaymentsController2.R2(), v.k(budgetUpcomingPaymentsController2.M, new RowLoadingDelegate(), budgetUpcomingPaymentsController2.N), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = BudgetUpcomingPaymentsController.S;
                        qji.b bVarU2 = budgetUpcomingPaymentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.di.BudgetUpcomingPaymentsInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        BudgetUpcomingPaymentsContract$InputData budgetUpcomingPaymentsContract$InputData = budgetUpcomingPaymentsController.K;
                        budgetUpcomingPaymentsContract$InputData.getClass();
                        return new ppd.q(nVar, oVar2, budgetUpcomingPaymentsContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zmd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetUpcomingPaymentsController f323471b;

            {
                this.f323471b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BudgetUpcomingPaymentsController budgetUpcomingPaymentsController = this.f323471b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BudgetUpcomingPaymentsController.S;
                        return (o) ((ppd.q) budgetUpcomingPaymentsController.R.getValue()).f238528c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BudgetUpcomingPaymentsController.S;
                        BudgetUpcomingPaymentsController budgetUpcomingPaymentsController2 = this.f323471b;
                        return dli.f.a(budgetUpcomingPaymentsController2, budgetUpcomingPaymentsController2.R2(), v.k(budgetUpcomingPaymentsController2.M, new RowLoadingDelegate(), budgetUpcomingPaymentsController2.N), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = BudgetUpcomingPaymentsController.S;
                        qji.b bVarU2 = budgetUpcomingPaymentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.di.BudgetUpcomingPaymentsInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        BudgetUpcomingPaymentsContract$InputData budgetUpcomingPaymentsContract$InputData = budgetUpcomingPaymentsController.K;
                        budgetUpcomingPaymentsContract$InputData.getClass();
                        return new ppd.q(nVar, oVar2, budgetUpcomingPaymentsContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zmd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetUpcomingPaymentsController f323471b;

            {
                this.f323471b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BudgetUpcomingPaymentsController budgetUpcomingPaymentsController = this.f323471b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BudgetUpcomingPaymentsController.S;
                        return (o) ((ppd.q) budgetUpcomingPaymentsController.R.getValue()).f238528c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BudgetUpcomingPaymentsController.S;
                        BudgetUpcomingPaymentsController budgetUpcomingPaymentsController2 = this.f323471b;
                        return dli.f.a(budgetUpcomingPaymentsController2, budgetUpcomingPaymentsController2.R2(), v.k(budgetUpcomingPaymentsController2.M, new RowLoadingDelegate(), budgetUpcomingPaymentsController2.N), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = BudgetUpcomingPaymentsController.S;
                        qji.b bVarU2 = budgetUpcomingPaymentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.di.BudgetUpcomingPaymentsInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        BudgetUpcomingPaymentsContract$InputData budgetUpcomingPaymentsContract$InputData = budgetUpcomingPaymentsController.K;
                        budgetUpcomingPaymentsContract$InputData.getClass();
                        return new ppd.q(nVar, oVar2, budgetUpcomingPaymentsContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        zmd.h hVar = uiState.f323466b;
        if (hVar.equals(g.f323464a)) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else if (hVar.equals(e.f323462a)) {
            navBarWithToolbar.l0();
            navBarWithToolbar.setSecondDescriptionVisible(false);
        } else {
            if (!(hVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            navBarWithToolbar.setSecondDescriptionText(((f) hVar).f323463a);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ppd.q) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_budget_upcoming_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_budget_upcoming_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new b(this, null, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new n(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final zmd.o R2() {
        return (zmd.o) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
