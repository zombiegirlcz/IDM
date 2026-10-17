package th9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sqd.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PaymentReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(PaymentReviewScreen paymentReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = paymentReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.v, continuation, 0);
            case 1:
                return new n(this.v, continuation, 1);
            default:
                return new n(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentReviewScreen paymentReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                paymentReviewScreen.F2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                paymentReviewScreen.F2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVar = (v) paymentReviewScreen.R.getValue();
                vVar.getClass();
                vVar.l2(new h0(vVar, null, 26), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
