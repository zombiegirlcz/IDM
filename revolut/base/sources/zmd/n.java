package zmd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.BudgetUpcomingPaymentsController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BudgetUpcomingPaymentsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BudgetUpcomingPaymentsController budgetUpcomingPaymentsController, Continuation continuation) {
        super(2, continuation);
        this.v = budgetUpcomingPaymentsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        boolean z = obj3 instanceof qua.p;
        Continuation continuation = null;
        BudgetUpcomingPaymentsController budgetUpcomingPaymentsController = this.v;
        if (z) {
            o oVarE3 = budgetUpcomingPaymentsController.R2();
            qua.p recurringPayment = (qua.p) obj3;
            oVarE3.getClass();
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            oVarE3.l2(new zah.f(oVarE3, recurringPayment, continuation, 18), new yi5.b(26));
        } else if (Intrinsics.f(obj3, b.f323460a)) {
            o oVarE32 = budgetUpcomingPaymentsController.R2();
            j jVar = (j) ((d) ((j2) oVarE32.f323476t.f22677a).getValue()).f323461a.getContent();
            if (jVar != null) {
                oVarE32.C1(new BridgeDestination(((rae.c) oVarE32.f323473q).h(jVar.f323467a)));
            }
        } else if (Intrinsics.f(obj3, a.f323459a)) {
            o oVarE33 = budgetUpcomingPaymentsController.R2();
            j jVar2 = (j) ((d) ((j2) oVarE33.f323476t.f22677a).getValue()).f323461a.getContent();
            if (jVar2 != null) {
                oVarE33.C1(new BridgeDestination(((rae.d) oVarE33.f323474r).n(jVar2.f323467a, null)));
            }
        }
        return Unit.f186387a;
    }
}
