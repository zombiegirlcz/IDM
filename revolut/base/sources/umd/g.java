package umd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BudgetOverviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BudgetOverviewController budgetOverviewController, Continuation continuation) {
        super(2, continuation);
        this.v = budgetOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f53228a, "BUDGET_OVERVIEW_ADD_CATEGORY")) {
            this.v.R2().I2();
        }
        return Unit.f186387a;
    }
}
