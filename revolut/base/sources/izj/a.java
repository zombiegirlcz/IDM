package izj;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsDestination;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SettingsLimitsDestination) {
            return new SettingsLimitsFlow(((SettingsLimitsDestination) destination).f101780a);
        }
        return null;
    }
}
