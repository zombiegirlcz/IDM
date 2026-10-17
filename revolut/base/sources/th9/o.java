package th9;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PaymentReviewScreen paymentReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = paymentReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVar = (v) this.v.R.getValue();
        String listId = model.f51781a;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "BREAKDOWN_PREFIX_PAYMENT_BREAKDOWN_FEES_ITEM")) {
            b bVar = ((a) ((j2) vVar.f271355t.f22677a).getValue()).f271329c;
            if (bVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ApmQuote apmQuote = bVar.f271330a;
            if (apmQuote != null) {
                vVar.C1(((q12.l) vVar.f271351p).c(apmQuote));
            }
        }
        return Unit.f186387a;
    }
}
