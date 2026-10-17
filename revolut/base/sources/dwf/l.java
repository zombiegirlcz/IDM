package dwf;

import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.transport.impl.ui.hub.ticket_details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PurchasedTransitTicket.Activated f120385w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar, PurchasedTransitTicket.Activated activated, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f120385w = activated;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f120385w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        PurchasedTransitTicket.Activated activated = this.f120385w;
        com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar = this.v;
        com.revolut.feature.transport.impl.ui.hub.ticket_details.a aVar2 = new com.revolut.feature.transport.impl.ui.hub.ticket_details.a(bVar, activated, null);
        this.u = 1;
        Object objB0 = u0.b0(bVar.X(), "EXTEND_ACTION_LOADING_TAG", aVar2, this);
        return objB0 == aVar ? aVar : objB0;
    }
}
