package dwf;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.transport.impl.ui.help.TransportHelpFlow;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ TicketDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TicketDetailsScreen ticketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = ticketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar = (com.revolut.feature.transport.impl.ui.hub.ticket_details.b) this.u.R2();
        bVar.getClass();
        yji.l.j2(bVar, new TransportHelpFlow(), null, null, 3);
        return Unit.f186387a;
    }
}
