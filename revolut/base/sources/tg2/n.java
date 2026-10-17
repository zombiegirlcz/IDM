package tg2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tg2.f;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = (ApmPaymentAuthorisationPendingAction) zi0.c.I(((d) ((j2) oVar.f271054q.f22677a).getValue()).f271042a);
            oz1.j jVar = oVar.f271053p;
            ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = ApmPaymentAuthorisationPaymentMethod.UPI;
            this.u = 1;
            if (jVar.d(apmPaymentAuthorisationPaymentMethod, apmPaymentAuthorisationPendingAction, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        oVar.C2(f.a.f271044a);
        return Unit.f186387a;
    }
}
