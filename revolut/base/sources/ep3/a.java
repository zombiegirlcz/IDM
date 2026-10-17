package ep3;

import aii.u;
import com.revolut.feature.corporate_events.impl.navigation.CorporateEventsHomeFeatureConfig;
import com.revolut.feature.corporate_events.impl.ui.flow.home.CorporateEventsHomeFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CorporateEventsHomeFeatureConfig.CorporateEventsHomeDestination) {
            return new CorporateEventsHomeFlow(((CorporateEventsHomeFeatureConfig.CorporateEventsHomeDestination) destination).f66116a);
        }
        return null;
    }
}
