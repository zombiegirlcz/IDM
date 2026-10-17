package pb2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.ExecutionType;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ApmPaymentAuthorisationSummary f61991a;
        mii.q qVar = (mii.q) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (qVar instanceof mii.n) {
            com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b bVar = this.v;
            ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = (ApmPaymentAuthorisationPendingAction) ((h) ((j2) bVar.u.f22677a).getValue()).f234606a.getContent();
            bVar.C1(u0.b(((apmPaymentAuthorisationPendingAction == null || (f61991a = apmPaymentAuthorisationPendingAction.getF61991a()) == null) ? null : f61991a.f62003r) != ExecutionType.ONE_TIME ? ((v3a.b) bVar.f62756r).d(new ScheduledPaymentsInputData((RecurringPaymentAccount) null, (ScheduledPaymentsInputData.InitialAction) null, 7)) : com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b.I2(bVar)));
        }
        return Unit.f186387a;
    }
}
