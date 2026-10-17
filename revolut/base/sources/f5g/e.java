package f5g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.bookings.TravelFlightsBookingsScreen;
import f5g.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsBookingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelFlightsBookingsScreen travelFlightsBookingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsBookingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.P.getValue();
        String listId = model.f52373a;
        k kVar = (k) iVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -152922999) {
            if (iHashCode != -152772284) {
                if (iHashCode == 464655934 && listId.equals("TRAVEL_FLIGHTS_BOOKINGS_PAST_OR_CANCELLED")) {
                    kVar.C2(h.a.f132318a);
                }
            } else if (listId.equals("TRAVEL_FLIGHTS_BOOKINGS_ERROR")) {
                kVar.l2(new ewa.d(kVar, null, 8), new yi5.b(26));
            }
        } else if (listId.equals("TRAVEL_FLIGHTS_BOOKINGS_EMPTY")) {
            kVar.C2(h.b.f132319a);
        }
        return Unit.f186387a;
    }
}
