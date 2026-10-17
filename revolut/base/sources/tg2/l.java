package tg2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function1 {
    public ApmPaymentAuthorisationPendingAction u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f271051w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Continuation continuation) {
        super(1, continuation);
        this.f271051w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.f271051w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction;
        PaymentMethodDetails.Creditor creditor;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        String str = 0;
        str = 0;
        o oVar = this.f271051w;
        if (i == 0) {
            yhm.o.b(obj2);
            ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction2 = (ApmPaymentAuthorisationPendingAction) zi0.c.I(((d) ((j2) oVar.f271054q.f22677a).getValue()).f271042a);
            sb4.i iVar = new sb4.i(oVar, apmPaymentAuthorisationPendingAction2, str, 19);
            this.u = apmPaymentAuthorisationPendingAction2;
            this.v = 1;
            if (q.t(oVar, iVar, this) == aVar) {
                return aVar;
            }
            apmPaymentAuthorisationPendingAction = apmPaymentAuthorisationPendingAction2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apmPaymentAuthorisationPendingAction = this.u;
            yhm.o.b(obj2);
        }
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationPendingAction.getF61991a().f61995g;
        PaymentMethodDetails.Upi upi2 = paymentMethodDetails instanceof PaymentMethodDetails.Upi ? (PaymentMethodDetails.Upi) paymentMethodDetails : null;
        if (upi2 != null && (creditor = upi2.f62071c) != null) {
            str = creditor.f62030a;
        }
        if (str == 0) {
            str = "";
        }
        oVar.C2(new e(str));
        return Unit.f186387a;
    }
}
