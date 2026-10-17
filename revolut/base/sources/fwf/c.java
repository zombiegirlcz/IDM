package fwf;

import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import com.revolut.feature.transport.impl.ui.hub.tickets.expired.ExpiredTicketsListScreen;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransportHubTicketsScreen f138619w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TransportHubTicketsScreen transportHubTicketsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138619w = transportHubTicketsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f138619w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f138619w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((PurchasedTransitTicket) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransportHubTicketsScreen transportHubTicketsScreen = this.f138619w;
        switch (i) {
            case 0:
                e action = (e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) transportHubTicketsScreen.f92540d0.getValue();
                Intrinsics.h(action);
                m mVar = (m) hVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                int i2 = l.f138628a[action.ordinal()];
                if (i2 == 1) {
                    mVar.x2(new fv6.n(29));
                    mVar.v.k(Unit.f186387a);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.C1(new com.revolut.kompot.common.b(new ExpiredTicketsListScreen(), (ModalDestination.Style) null, 6));
                }
                return Unit.f186387a;
            default:
                PurchasedTransitTicket ticket = (PurchasedTransitTicket) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar2 = (h) transportHubTicketsScreen.f92540d0.getValue();
                Intrinsics.h(ticket);
                m mVar2 = (m) hVar2;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(ticket, "ticket");
                mVar2.C1(new com.revolut.kompot.common.b(new TicketDetailsScreen(new TicketDetailsScreenContract$InputData.TicketDetails(ticket)), ModalDestination.Style.POPUP.f98311a, 4));
                return Unit.f186387a;
        }
    }
}
