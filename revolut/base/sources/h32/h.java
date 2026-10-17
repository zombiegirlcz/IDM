package h32;

import ack.n;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmed.ApmConfirmedScreenContract$Destination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k kVar = this.v;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            n nVar = new n(19);
            g gVar = new g(kVar, continuation, 1);
            this.u = 1;
            obj2 = n14.k.Q(kVar, null, null, nVar, gVar, this, 2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (!(eVar instanceof nii.c)) {
            if (!(eVar instanceof nii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar.f149014q.c(com.revolut.retail.core.navigation.a.c(u0.f(ApmConfirmedScreenContract$Destination.f62360b), new FinishCommand(null, null, null, 7)));
        }
        return Unit.f186387a;
    }
}
