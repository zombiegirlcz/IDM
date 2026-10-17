package esj;

import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SetOverallBudgetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(SetOverallBudgetScreen setOverallBudgetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = setOverallBudgetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SetOverallBudgetScreen setOverallBudgetScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((c0) setOverallBudgetScreen.T2()).f128963w, false, null, 3);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0Var = (c0) setOverallBudgetScreen.T2();
                j60.a.v(c0Var.f128963w, false, new es.e(c0Var, 2), 1);
                break;
        }
        return Unit.f186387a;
    }
}
