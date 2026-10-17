package su4;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditCardRepayPaymentReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditCardRepayPaymentReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Object obj3 = model.f51674g;
        com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar2 = (com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) kVarE3;
        aVar2.H2(aVar2.z, new sl5.a(aVar2, obj3 instanceof xm4.a ? (xm4.a) obj3 : null, 19));
        return Unit.f186387a;
    }
}
