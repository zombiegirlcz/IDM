package avj;

import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventScreen;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelItineraryAddEventScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(TravelItineraryAddEventScreen travelItineraryAddEventScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelItineraryAddEventScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.v, continuation, 0);
            default:
                return new k(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelItineraryAddEventScreen travelItineraryAddEventScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) travelItineraryAddEventScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) travelItineraryAddEventScreen.d();
                a aVar3 = (a) ((j2) bVar.f101637s.f22677a).getValue();
                LocalDate localDate = aVar3.f10047b;
                LocalTime localTime = aVar3.f10048c;
                Continuation continuation = null;
                if (localDate == null || localTime == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Date or time cannot be null when adding a custom event: date: " + localDate + ", time: " + localTime);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    String str = aVar3.f10046a;
                    LocalDateTime localDateTimeOf = LocalDateTime.of(localDate, localTime);
                    Intrinsics.checkNotNullExpressionValue(localDateTimeOf, "of(...)");
                    bVar.l2(new av7.l(bVar, new puj.f(str, localDateTimeOf, aVar3.d, null), continuation, 2), new n(bVar, 0));
                }
                break;
        }
        return Unit.f186387a;
    }
}
