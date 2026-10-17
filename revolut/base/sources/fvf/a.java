package fvf;

import aii.u;
import com.revolut.feature.transport.api.navigation.TransportFlowDestination;
import com.revolut.feature.transport.api.navigation.TransportFlowInputData;
import com.revolut.feature.transport.api.navigation.TransportTermsDestination;
import com.revolut.feature.transport.api.navigation.TransportTicketDetailsDestination;
import com.revolut.feature.transport.impl.ui.TransportFlow;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.terms.TransportTermsScreen;
import com.revolut.feature.transport.impl.ui.terms.TransportTermsScreenContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TransportFlowDestination) {
            return new TransportFlow((TransportFlowInputData) ((TransportFlowDestination) destination).f98300a);
        }
        if (destination instanceof TransportTermsDestination) {
            return new TransportTermsScreen(new TransportTermsScreenContract$InputData(((TransportTermsDestination) destination).getF92500a()));
        }
        if (!(destination instanceof TransportTicketDetailsDestination)) {
            return null;
        }
        TransportTicketDetailsDestination transportTicketDetailsDestination = (TransportTicketDetailsDestination) destination;
        if (transportTicketDetailsDestination instanceof TransportTicketDetailsDestination.ById) {
            return new TicketDetailsScreen(new TicketDetailsScreenContract$InputData.TicketId(((TransportTicketDetailsDestination.ById) transportTicketDetailsDestination).getF92501a()));
        }
        if (transportTicketDetailsDestination instanceof TransportTicketDetailsDestination.ByTicket) {
            return new TicketDetailsScreen(new TicketDetailsScreenContract$InputData.TicketDetails(((TransportTicketDetailsDestination.ByTicket) transportTicketDetailsDestination).getF92502a()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
