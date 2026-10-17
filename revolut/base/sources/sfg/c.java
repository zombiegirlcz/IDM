package sfg;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesAirlineDetailsDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesFlightSearchDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesFlightSearchResultDetailsDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesRecommendedFlightsDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesTransferDestination;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlowContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f262476a;

    public c(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f262476a = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        return TravelMilesApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TravelMilesDestination) {
            return new TravelMilesFlow(new TravelMilesFlowContract$InputData.Home(((TravelMilesDestination) destination).f94149a));
        }
        if (destination instanceof TravelMilesRecommendedFlightsDestination) {
            TravelMilesRecommendedFlightsDestination travelMilesRecommendedFlightsDestination = (TravelMilesRecommendedFlightsDestination) destination;
            return new TravelMilesRecommendedFlightsFlow(new TravelMilesRecommendedFlightsFlowContract$InputData.RecommendedFlights(travelMilesRecommendedFlightsDestination.getF94157a(), travelMilesRecommendedFlightsDestination.getF94158b(), travelMilesRecommendedFlightsDestination.getF94159c(), travelMilesRecommendedFlightsDestination.getD()));
        }
        if (destination instanceof TravelMilesFlightSearchResultDetailsDestination) {
            TravelMilesFlightSearchResultDetailsDestination travelMilesFlightSearchResultDetailsDestination = (TravelMilesFlightSearchResultDetailsDestination) destination;
            return new TravelMilesRecommendedFlightsFlow(new TravelMilesRecommendedFlightsFlowContract$InputData.FlightSearchResultDetails(travelMilesFlightSearchResultDetailsDestination.getF94154a(), travelMilesFlightSearchResultDetailsDestination.getF94155b(), travelMilesFlightSearchResultDetailsDestination.getD(), travelMilesFlightSearchResultDetailsDestination.getF94156c()));
        }
        if (destination instanceof TravelMilesFlightSearchDestination) {
            TravelMilesFlightSearchDestination travelMilesFlightSearchDestination = (TravelMilesFlightSearchDestination) destination;
            return new TravelMilesFlow(new TravelMilesFlowContract$InputData.Home(null, new TravelMilesFlowContract$InputData.Home.FlightSearchParams(travelMilesFlightSearchDestination.getF94152a(), travelMilesFlightSearchDestination.getF94153b())));
        }
        if (destination instanceof TravelMilesAirlineDetailsDestination) {
            return new TravelMilesFlow(new TravelMilesFlowContract$InputData.AirlineDetails(((TravelMilesAirlineDetailsDestination) destination).getF94148a()));
        }
        if (!(destination instanceof TravelMilesTransferDestination)) {
            return null;
        }
        TravelMilesTransferDestination travelMilesTransferDestination = (TravelMilesTransferDestination) destination;
        return new TravelMilesFlow(new TravelMilesFlowContract$InputData.Transfer(travelMilesTransferDestination.getF94160a(), travelMilesTransferDestination.getF94161b()));
    }

    @Override // aii.p
    public final Set h() {
        return this.f262476a;
    }
}
