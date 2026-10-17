package u7k;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui.details.b u;
    public final /* synthetic */ TransferLinkDetails.Active v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar, TransferLinkDetails.Active active, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
        this.v = active;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = this.u;
        return bVar.C1(bVar.f102189r.a(this.v));
    }
}
