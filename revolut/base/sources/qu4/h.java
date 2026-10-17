package qu4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ CreditCardRepayPaymentAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = creditCardRepayPaymentAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = (u) this.u.R2();
        uVar.getClass();
        yji.l.b1(uVar, rd0.e.n(ngm.n.K(new p40.v(uVar, null, 24)), h0.f322473a), null, new r(uVar, null, 0), 3);
        return Unit.f186387a;
    }
}
