package x0g;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.api.TravelExperiencesApi$Toggles;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesDestination;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlow;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f301637a;

    public c(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f301637a = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        return TravelExperiencesApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TravelExperiencesDestination.Home) {
            return new TravelExperiencesHomeFlow(TravelExperiencesHomeFlowContract$InputData.Home.f92981a);
        }
        if (destination instanceof TravelExperiencesDestination.ExperienceDetails) {
            return new TravelExperiencesHomeFlow(new TravelExperiencesHomeFlowContract$InputData.Experience(((TravelExperiencesDestination.ExperienceDetails) destination).f92921b));
        }
        if (destination instanceof TravelExperiencesDestination.BookingDetails) {
            return new TravelExperiencesHomeFlow(new TravelExperiencesHomeFlowContract$InputData.Booking(((TravelExperiencesDestination.BookingDetails) destination).f92920b));
        }
        if (destination instanceof TravelExperiencesDestination.ExperiencesSearchResults) {
            TravelExperiencesDestination.ExperiencesSearchResults experiencesSearchResults = (TravelExperiencesDestination.ExperiencesSearchResults) destination;
            String str = experiencesSearchResults.f92926b;
            LocationId.DestinationId.a(str);
            return new TravelExperiencesHomeFlow(new TravelExperiencesHomeFlowContract$InputData.SearchResults(str, experiencesSearchResults.f92927c, experiencesSearchResults.d, experiencesSearchResults.e));
        }
        if (destination instanceof TravelExperiencesDestination.ExperiencesDestinationDiscovery) {
            TravelExperiencesDestination.ExperiencesDestinationDiscovery experiencesDestinationDiscovery = (TravelExperiencesDestination.ExperiencesDestinationDiscovery) destination;
            String f92923b = experiencesDestinationDiscovery.getF92923b();
            LocationId.DestinationId.a(f92923b);
            return new TravelExperiencesHomeFlow(new TravelExperiencesHomeFlowContract$InputData.Discovery(f92923b, experiencesDestinationDiscovery.getF92924c()));
        }
        if (destination instanceof TravelExperiencesDestination.ExperiencesSearch) {
            return new TravelExperiencesHomeFlow(new TravelExperiencesHomeFlowContract$InputData.Search(((TravelExperiencesDestination.ExperiencesSearch) destination).f92925b));
        }
        if (destination instanceof TravelExperiencesDestination.ActiveBookings) {
            return new TravelExperiencesHomeFlow(TravelExperiencesHomeFlowContract$InputData.ActiveBookings.f92976a);
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f301637a;
    }
}
