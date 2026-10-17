package d4g;

import aii.e;
import aii.g;
import aii.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.api.TravelFlightsApi$Toggles$Flights;
import com.revolut.feature.travel.flights.api.navigation.TravelFlightsDestination;
import com.revolut.feature.travel.flights.impl.ui.flow.root.TravelFlightsFlow;
import com.revolut.feature.travel.flights.impl.ui.flow.root.TravelFlightsFlowContract$InputData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import n4g.c;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f111319a;

    public b(ImmutableSet deeplinkGateways, c flowFactory) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(flowFactory, "flowFactory");
        this.f111319a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof a4g.a)) {
            return null;
        }
        TravelFlightsFlowContract$InputData.Home inputData = TravelFlightsFlowContract$InputData.Home.f93215a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return ((a4g.a) descriptor).a(new TravelFlightsFlow(inputData));
    }

    @Override // nte.a
    public final List e() {
        return u.c(TravelFlightsApi$Toggles$Flights.f93205c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof TravelFlightsDestination)) {
            return null;
        }
        TravelFlightsDestination travelFlightsDestination = (TravelFlightsDestination) destination;
        String str = travelFlightsDestination.f93206a;
        TravelFlightsFlowContract$InputData inputData = str != null ? new TravelFlightsFlowContract$InputData.BookingDetails(str, travelFlightsDestination.f93207b) : TravelFlightsFlowContract$InputData.Home.f93215a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new TravelFlightsFlow(inputData);
    }

    @Override // aii.p
    public final Set h() {
        return this.f111319a;
    }
}
