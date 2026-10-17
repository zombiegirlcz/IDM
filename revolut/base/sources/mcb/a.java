package mcb;

import aii.u;
import com.revolut.feature.retail.privacy.api.navigation.RetailPrivacyDestination;
import com.revolut.feature.retail.privacy.impl.ui.flow.RetailPrivacyFlow;
import com.revolut.feature.retail.privacy.impl.ui.flow.RetailPrivacyFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RetailPrivacyDestination) {
            return new RetailPrivacyFlow(new RetailPrivacyFlowContract$InputData(((RetailPrivacyDestination) destination).getF82773b()));
        }
        return null;
    }
}
