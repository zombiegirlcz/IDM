package e9g;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import com.revolut.feature.travel.hotels.api.navigation.SearchResultsDestination;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsActiveBookingsDestination;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsHomeKompotDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCampaignHubDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsPropertyDetailsDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsKompotDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionKompotDestination;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f123988a;

    public b(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f123988a = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        return TravelHotelsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TravelHotelsRoomDetailsKompotDestination) {
            return new TravelHotelsFlow(new TravelHotelsFlowContract$InputData.RoomDetails(((TravelHotelsRoomDetailsKompotDestination) destination).f93655a));
        }
        if (destination instanceof TravelHotelsHomeKompotDestination) {
            TravelHotelsHomeKompotDestination travelHotelsHomeKompotDestination = (TravelHotelsHomeKompotDestination) destination;
            TravelHotelsHomeKompotDestination.EntryPoint entryPoint = travelHotelsHomeKompotDestination.f93632c;
            boolean z = ((entryPoint instanceof TravelHotelsHomeKompotDestination.EntryPoint.External) && y0.b("hotel-points").contains(((TravelHotelsHomeKompotDestination.EntryPoint.External) entryPoint).getF93633a())) ? false : true;
            r8g.a aVar = travelHotelsHomeKompotDestination.f93631b;
            return new TravelHotelsFlow(new TravelHotelsFlowContract$InputData.Home(z, (aVar == null ? -1 : a.f123987a[aVar.ordinal()]) == 1 ? TravelHotelsHomeFlowContract$PagerItem.TRANSFERS : null));
        }
        if (destination instanceof TravelHotelsRoomsSelectionKompotDestination) {
            return new TravelHotelsFlow(new TravelHotelsFlowContract$InputData.RoomsSelection(((TravelHotelsRoomsSelectionKompotDestination) destination).f93662a));
        }
        if (destination instanceof SearchResultsDestination) {
            SearchResultsDestination searchResultsDestination = (SearchResultsDestination) destination;
            return new TravelHotelsFlow(new TravelHotelsFlowContract$InputData.SearchResults(searchResultsDestination.f93621a, searchResultsDestination.f93622b));
        }
        if (destination instanceof TravelHotelsCheckoutDestination) {
            return new TravelHotelsFlow(new TravelHotelsFlowContract$InputData.Checkout(((TravelHotelsCheckoutDestination) destination).getF93649a()));
        }
        if (destination instanceof TravelHotelsBookingDetailsDestination) {
            return new TravelHotelsFlow(new TravelHotelsFlowContract$InputData.BookingDetails(((TravelHotelsBookingDetailsDestination) destination).getF93645a()));
        }
        if (destination instanceof TravelHotelsPropertyDetailsDestination) {
            TravelHotelsPropertyDetailsDestination travelHotelsPropertyDetailsDestination = (TravelHotelsPropertyDetailsDestination) destination;
            return new TravelHotelsFlow(new TravelHotelsFlowContract$InputData.Property(travelHotelsPropertyDetailsDestination.getF93653b(), travelHotelsPropertyDetailsDestination.getD(), travelHotelsPropertyDetailsDestination.getE()));
        }
        if (destination instanceof TravelHotelsCampaignHubDestination) {
            return new TravelHotelsFlow(new TravelHotelsFlowContract$InputData.CampaignHub(((TravelHotelsCampaignHubDestination) destination).getF93648a()));
        }
        if (destination instanceof TravelHotelsActiveBookingsDestination) {
            return new TravelHotelsFlow(TravelHotelsFlowContract$InputData.ActiveBookings.f93761a);
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f123988a;
    }
}
