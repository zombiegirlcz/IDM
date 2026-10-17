package ztc;

import aii.u;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayDestination;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayInputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.SecurityDelayScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof rtc.a)) {
            return null;
        }
        rtc.a aVar = (rtc.a) descriptor;
        return aVar.a(new SecurityDelayScreen(new SecurityDelayInputData(aVar.f257220a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SecurityDelayDestination) {
            return new SecurityDelayScreen(new SecurityDelayInputData(((SecurityDelayDestination) destination).f85455b));
        }
        return null;
    }
}
