package fwf;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.transport.impl.ui.help.TransportHelpFlow;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ TransportHubTicketsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TransportHubTicketsScreen transportHubTicketsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transportHubTicketsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) ((h) this.u.f92540d0.getValue());
        mVar.getClass();
        yji.l.j2(mVar, new TransportHelpFlow(), null, null, 3);
        return Unit.f186387a;
    }
}
