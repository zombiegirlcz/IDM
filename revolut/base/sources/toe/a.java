package toe;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.tax_residency.api.stamp_duty.StampDutyDestination$Pay;
import com.revolut.feature.tax_residency.impl.stamp_duty.flow.StampDutyFlow;
import kotlin.jvm.internal.Intrinsics;
import woe.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof ane.a)) {
            super.c(descriptor);
            return null;
        }
        ane.a aVar = (ane.a) descriptor;
        return aVar.a(new StampDutyFlow(new c(aVar.f7728b, aVar.f7727a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof StampDutyDestination$Pay)) {
            return null;
        }
        StampDutyDestination$Pay stampDutyDestination$Pay = (StampDutyDestination$Pay) destination;
        return new StampDutyFlow(new c(stampDutyDestination$Pay.f89990b, stampDutyDestination$Pay.f89989a));
    }
}
