package vkc;

import aii.u;
import com.revolut.feature.rfi_tool.api.RfiToolDestination;
import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ohi.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RfiToolDestination) {
            return new RfiToolFlow(((RfiToolDestination) destination).f84994b);
        }
        return null;
    }
}
