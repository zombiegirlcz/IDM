package y7k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ PaymentLinksAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PaymentLinksAmountScreen paymentLinksAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = paymentLinksAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar2 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.u.R2();
        aVar2.getClass();
        aVar2.l2(new y5g.d(aVar2, null, 6), new yi5.b(26));
        return Unit.f186387a;
    }
}
