package eh9;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ PaymentAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(PaymentAmountScreen paymentAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = paymentAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = (z) this.u.d();
        zVar.getClass();
        zVar.l2(new u(zVar, null, 2), new yi5.b(26));
        return Unit.f186387a;
    }
}
