package su4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CreditCardRepayPaymentReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = creditCardRepayPaymentReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) this.u.R2()).J2();
        return Unit.f186387a;
    }
}
