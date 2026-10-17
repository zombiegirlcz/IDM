package a7g;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$BaggageInfoParcel;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.search.ChildPassenger;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TravelFlightsSearchScreen travelFlightsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.o;
        TravelFlightsSearchScreenContract$BaggageInfoParcel travelFlightsSearchScreenContract$BaggageInfoParcel = obj3 instanceof TravelFlightsSearchScreenContract$BaggageInfoParcel ? (TravelFlightsSearchScreenContract$BaggageInfoParcel) obj3 : null;
        if (travelFlightsSearchScreenContract$BaggageInfoParcel != null) {
            v vVarE3 = this.v.d();
            ArrayList baggageItems = travelFlightsSearchScreenContract$BaggageInfoParcel.f93405a;
            com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) vVarE3;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(baggageItems, "baggageItems");
            FlightSearchQuery flightSearchQuery = ((r) ((j2) bVar.f93427w.f22677a).getValue()).f1892a;
            com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f93428x;
            List list = flightSearchQuery.e.f93596b;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    ChildPassenger childPassenger = (ChildPassenger) it8.next();
                    m7g.i iVar = m7g.j.Companion;
                    LocalDate dateOfBirth = childPassenger.f93564a;
                    LocalDate departureDate = flightSearchQuery.f93579c;
                    LocalDate localDate = flightSearchQuery.d;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
                    Intrinsics.checkNotNullParameter(departureDate, "departureDate");
                    if (localDate != null) {
                        departureDate = localDate;
                    }
                    if (m7g.i.a(dateOfBirth, departureDate) == m7g.j.INFANT) {
                        z = true;
                        break;
                    }
                }
            }
            oki.h.v2(aVar2, new TravelFlightsSearchScreenContract$ModalStep.BaggageDescription(baggageItems, z), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
