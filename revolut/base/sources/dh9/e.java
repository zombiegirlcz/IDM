package dh9;

import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ com.revolut.feature.pay_bills_taxes.impl.ui_payment.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
        com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar2 = this.u;
        return aVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(finishCommand, ((v3a.b) aVar2.f78759q).d(new ScheduledPaymentsInputData((RecurringPaymentAccount) null, (ScheduledPaymentsInputData.InitialAction) null, 7)))));
    }
}
