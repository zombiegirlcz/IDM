package dp3;

import aii.p;
import aii.u;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsContract$InputData;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsController;
import com.revolut.feature.corporate_events.navigation.CorporateEventDetailsDestination;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CorporateEventDetailsDestination)) {
            return null;
        }
        CorporateEventDetailsDestination corporateEventDetailsDestination = (CorporateEventDetailsDestination) destination;
        return new CorporateEventDetailsController(new CorporateEventDetailsContract$InputData(corporateEventDetailsDestination.f66155a, corporateEventDetailsDestination.f66156b, corporateEventDetailsDestination.f66157c));
    }
}
