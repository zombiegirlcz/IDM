package jtc;

import aii.u;
import com.revolut.feature.second_device_login.api.SecondDeviceLoginDestination;
import com.revolut.feature.second_device_login.impl.ui.flow.SecondDeviceLoginFlow;
import com.revolut.feature.second_device_login.impl.ui.flow.SecondDeviceLoginFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof SecondDeviceLoginDestination)) {
            return null;
        }
        SecondDeviceLoginDestination secondDeviceLoginDestination = (SecondDeviceLoginDestination) destination;
        return new SecondDeviceLoginFlow(new SecondDeviceLoginFlowContract$InputData(secondDeviceLoginDestination.getF85355a(), secondDeviceLoginDestination.getF85356b()));
    }
}
