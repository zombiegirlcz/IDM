package ztc;

import aii.u;
import com.revolut.feature.security_hub.api.SecurityHubApi$Toggles;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.feature.security_hub.api.navigation.SecurityHubInputData;
import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements ohi.a, nte.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof rtc.g)) {
            return null;
        }
        rtc.g gVar = (rtc.g) descriptor;
        return gVar.a(new SecurityHubFlow(new SecurityHubInputData(gVar.b().getF85462a(), gVar.b().getF85463b(), gVar.b().getF85464c(), gVar.b().getD())));
    }

    @Override // nte.a
    public final List e() {
        return SecurityHubApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof SecurityHubDestination)) {
            return null;
        }
        SecurityHubDestination securityHubDestination = (SecurityHubDestination) destination;
        return new SecurityHubFlow(new SecurityHubInputData(securityHubDestination.getF85460b(), securityHubDestination.getF85461c(), securityHubDestination.getD(), securityHubDestination.getE()));
    }
}
