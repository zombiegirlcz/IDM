package m86;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlow;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f203437a = y0.b(new b());

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof i86.a) {
            return ((i86.a) descriptor).a(new DeviceManagementFlow(DeviceManagementDestination.Config.Home.f71934a));
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DeviceManagementDestination) {
            return new DeviceManagementFlow(((DeviceManagementDestination) destination).getF71931b());
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f203437a;
    }
}
