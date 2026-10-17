package jh9;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ FormAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FormAmountScreen formAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = formAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.u.d();
        PaymentData paymentData = ((f) ((j2) pVar.v.f22677a).getValue()).f174161b;
        if (paymentData != null) {
            pVar.l2(new jec.p(pVar, paymentData, null, 6), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
