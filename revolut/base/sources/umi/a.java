package umi;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.oauth.api.consent.ConsentFlowDestination;
import com.revolut.oauth.impl.ui.consent.flow.ConsentFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ConsentFlowDestination) {
            return new ConsentFlow(((ConsentFlowDestination) destination).f98482b);
        }
        return null;
    }
}
