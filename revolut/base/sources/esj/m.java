package esj;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ SetOverallBudgetScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SetOverallBudgetScreen setOverallBudgetScreen, Continuation continuation) {
        super(2, continuation);
        this.u = setOverallBudgetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0Var = (c0) this.u.T2();
        w wVar = (w) ((o) c0Var.t2()).f128977a.getContent();
        if (wVar != null) {
            c0Var.v2(new r(wVar.f));
        }
        return Unit.f186387a;
    }
}
