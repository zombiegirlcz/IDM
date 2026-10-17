package og2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PaymentMethodDetails.Creditor creditor;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m mVar = this.v;
        String str = null;
        if (i == 0) {
            yhm.o.b(obj2);
            ack.n nVar = new ack.n(19);
            j jVar = new j(mVar, null, 0);
            this.u = 1;
            obj2 = n14.k.Q(mVar, null, null, nVar, jVar, this, 2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (!(eVar instanceof nii.c)) {
            if (!(eVar instanceof nii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = (ApmPaymentAuthorisationSummary) ((d) ((j2) mVar.f225006p.f22677a).getValue()).f224998a.getContent();
            PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary != null ? apmPaymentAuthorisationSummary.f61995g : null;
            PaymentMethodDetails.Upi upi2 = paymentMethodDetails instanceof PaymentMethodDetails.Upi ? (PaymentMethodDetails.Upi) paymentMethodDetails : null;
            if (upi2 != null && (creditor = upi2.f62071c) != null) {
                str = creditor.f62030a;
            }
            if (str == null) {
                str = "";
            }
            mVar.C2(new e(str));
        }
        return Unit.f186387a;
    }
}
