package su4;

import aw0.n6;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreen;
import dx4.z2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardRepayPaymentReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardRepayPaymentReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xm4.f fVar;
        z2 z2Var;
        int i = this.u;
        CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) creditCardRepayPaymentReviewScreen.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar3 = (com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) creditCardRepayPaymentReviewScreen.R2();
                h hVar = (h) ((i) ((j2) aVar3.z.f22677a).getValue()).f265649a.getContent();
                if (hVar != null && (fVar = hVar.f265642b) != null && (z2Var = fVar.f307086b) != null) {
                    aVar3.I(z2Var, null);
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar5 = (com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) creditCardRepayPaymentReviewScreen.R2();
                h hVar2 = (h) ((i) ((j2) aVar5.z.f22677a).getValue()).f265649a.getContent();
                z2 z2Var2 = hVar2 != null ? hVar2.f265646j : null;
                if (z2Var2 != null) {
                    aVar5.I(z2Var2, new m(aVar5, 1));
                } else {
                    aVar5.K2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
