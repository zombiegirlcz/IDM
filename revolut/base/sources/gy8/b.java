package gy8;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowControllerDescriptor;
import com.revolut.feature.kyc.vendors.shared.impl.uaepass.UaePassScreen;
import com.revolut.feature.kyc.vendors.shared.impl.uaepass.UaePassScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof UaePassFlowControllerDescriptor)) {
            return null;
        }
        UaePassFlowControllerDescriptor uaePassFlowControllerDescriptor = (UaePassFlowControllerDescriptor) descriptor;
        return uaePassFlowControllerDescriptor.a(new UaePassScreen(new UaePassScreenContract$InputData(uaePassFlowControllerDescriptor.f77911a)));
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
