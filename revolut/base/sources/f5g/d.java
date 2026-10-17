package f5g;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.bookings.TravelFlightsBookingsScreen;
import f5g.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TravelFlightsBookingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelFlightsBookingsScreen travelFlightsBookingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelFlightsBookingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) ((i) this.u.P.getValue())).C2(h.a.f132318a);
        return Unit.f186387a;
    }
}
