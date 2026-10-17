package e69;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((ApmPaymentAuthorisationPendingAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b targetCurrency;
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = (ApmPaymentAuthorisationPendingAction) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ApmPaymentAuthorisationSummary f61991a = apmPaymentAuthorisationPendingAction.getF61991a();
        o oVar = u.Companion;
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationPendingAction.getF61991a().f61995g;
        PaymentMethodDetails.MasavRequestToPay masavRequestToPay = paymentMethodDetails instanceof PaymentMethodDetails.MasavRequestToPay ? (PaymentMethodDetails.MasavRequestToPay) paymentMethodDetails : null;
        String str = masavRequestToPay != null ? masavRequestToPay.f62041b : null;
        g69.d dVar = this.v.o;
        dj0.d dVar2 = f61991a.f;
        if (dVar2 == null || (targetCurrency = dVar2.f115083b) == null) {
            xi0.b.Companion.getClass();
            targetCurrency = xi0.b.f306283w;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return nim.a.u(new g69.b(dVar, targetCurrency, str, null), dVar.f140893c.e(w4l.h.f294642c));
    }
}
