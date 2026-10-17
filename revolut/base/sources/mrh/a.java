package mrh;

import aii.u;
import com.revolut.feature.wealth_protection.sso.api.WealthProtectionSsoDestination;
import com.revolut.feature.wealth_protection.sso.impl.ui.WealthProtectionSsoFlow;
import com.revolut.feature.wealth_protection.sso.impl.ui.WealthProtectionSsoFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof WealthProtectionSsoDestination)) {
            return null;
        }
        WealthProtectionSsoDestination wealthProtectionSsoDestination = (WealthProtectionSsoDestination) destination;
        return new WealthProtectionSsoFlow(new WealthProtectionSsoFlowContract$InputData(wealthProtectionSsoDestination.getF96299b().getF96303a(), wealthProtectionSsoDestination.getF96299b().getF96304b(), wealthProtectionSsoDestination.getF96299b().getF96305c(), wealthProtectionSsoDestination.getF96299b().getD()));
    }
}
