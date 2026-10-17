package r6g;

import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$Child;
import com.revolut.feature.travel.flights.models.domain.search.ChildPassenger;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelFlightsPassengersPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelFlightsPassengersPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a) travelFlightsPassengersPickerScreen.e3()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a aVar3 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a) travelFlightsPassengersPickerScreen.e3();
                h hVar = (h) ((j2) aVar3.f93386s.f22677a).getValue();
                int i2 = hVar.f251841a;
                List list = hVar.f251842b;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    LocalDate localDate = ((TravelFlightsPassengersPickerScreenContract$Child) it8.next()).f93376b;
                    if (localDate == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList.add(new ChildPassenger(localDate));
                }
                aVar3.C2(new i(new Passengers(i2, arrayList), hVar.f251843c));
                return Unit.f186387a;
        }
    }
}
