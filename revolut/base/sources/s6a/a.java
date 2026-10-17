package s6a;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.paynow.impl.flow.PayNowQrFlow;
import com.revolut.feature.paynow.impl.flow.PayNowQrFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof g7a.a) {
            g7a.a aVar = (g7a.a) descriptor;
            return aVar.a(new PayNowQrFlow(new PayNowQrFlowContract$InputData(aVar.f141139a, aVar.f141140b)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
