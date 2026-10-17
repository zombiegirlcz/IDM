package u7k;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferLinkDetails.Active f277948w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar, TransferLinkDetails.Active active, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f277948w = active;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b0(this.v, this.f277948w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        TransferLinkDetails.Active active = this.f277948w;
        com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = this.v;
        a0 a0Var = new a0(bVar, active, null);
        this.u = 1;
        Object objB = pu7.a.B(bVar.k, "ACTION_TASK_NAME", a0Var, this);
        return objB == aVar ? aVar : objB;
    }
}
