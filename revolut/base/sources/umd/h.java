package umd;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BudgetOverviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BudgetOverviewController budgetOverviewController, Continuation continuation) {
        super(2, continuation);
        this.v = budgetOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        String listId = model.f51832a;
        mVarE3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "BUDGET_OVERVIEW_UPCOMING_CELL")) {
            mVarE3.l1().M0(new rmd.d(mVarE3.o.f87511a));
        }
        return Unit.f186387a;
    }
}
