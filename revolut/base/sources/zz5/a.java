package zz5;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.customer_present.tips.impl.flow.tips.CustomerPresentTipsFlow;
import com.revolut.feature.customer_present.tips.impl.screen.tips_management.TipsManagementScreen;
import kotlin.jvm.internal.Intrinsics;
import yz5.c;
import yz5.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof d) {
            return ((d) descriptor).a(new TipsManagementScreen());
        }
        if (!(descriptor instanceof c)) {
            return null;
        }
        c cVar = (c) descriptor;
        return cVar.a(new CustomerPresentTipsFlow(cVar.b()));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
