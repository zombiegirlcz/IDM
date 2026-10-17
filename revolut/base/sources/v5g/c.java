package v5g;

import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$SearchParameters;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.flights.models.domain.search.LocationPoint;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsDiscoverScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelFlightsDiscoverScreen travelFlightsDiscoverScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsDiscoverScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarD = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.discover.a) gVarD;
        aVar2.getClass();
        y yVar = aVar2.f93336q;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f93337r;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "SEARCH_BUTTON_ID")) {
            d dVar = (d) ((j2) yVar.f22677a).getValue();
            TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters = dVar.f286218a;
            LocationPoint locationPoint = travelFlightsDiscoverScreenContract$SearchParameters.f93332a;
            LocationPoint locationPoint2 = travelFlightsDiscoverScreenContract$SearchParameters.f93333b;
            ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM fullscreen_slide_from_bottom = ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
            if (locationPoint == null) {
                oki.h.v2(aVar3, TravelFlightsDiscoverScreenContract$ModalStep.OriginSelection.f93329a, fullscreen_slide_from_bottom);
            } else if (locationPoint2 == null) {
                oki.h.v2(aVar3, TravelFlightsDiscoverScreenContract$ModalStep.DestinationSelection.f93328a, fullscreen_slide_from_bottom);
            } else if (travelFlightsDiscoverScreenContract$SearchParameters.f93334c == null) {
                TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters2 = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                oki.h.v2(aVar3, new TravelFlightsDiscoverScreenContract$ModalStep.DatesSelection(travelFlightsDiscoverScreenContract$SearchParameters2.f93334c, travelFlightsDiscoverScreenContract$SearchParameters2.d), fullscreen_slide_from_bottom);
            } else {
                Intrinsics.checkNotNullParameter(travelFlightsDiscoverScreenContract$SearchParameters, "<this>");
                LocationPoint locationPoint3 = travelFlightsDiscoverScreenContract$SearchParameters.f93332a;
                if (locationPoint3 == null || !locationPoint3.equals(locationPoint2)) {
                    FlightSearchQuery flightSearchQueryE = ifk.b.E(dVar.f286218a);
                    if (flightSearchQueryE != null) {
                        aVar2.f93335p.a(flightSearchQueryE);
                        aVar2.l2(new v06.i(aVar2, flightSearchQueryE, null, 13), new yi5.b(26));
                    }
                } else {
                    aVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.travel_flights_search_results_error_same_airport_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_search_results_error_same_airport_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
                }
            }
        }
        return Unit.f186387a;
    }
}
