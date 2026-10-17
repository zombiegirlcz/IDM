package fwf;

import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransportHubTicketsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransportHubTicketsScreen transportHubTicketsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transportHubTicketsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PurchasedTransitTicket.ToBeActivated) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PurchasedTransitTicket.ToBeActivated ticket = (PurchasedTransitTicket.ToBeActivated) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVar = (h) this.v.f92540d0.getValue();
        Intrinsics.h(ticket);
        m mVar = (m) hVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        ((rvf.i) mVar.f138632r).Z2(ticket);
        return Unit.f186387a;
    }
}
