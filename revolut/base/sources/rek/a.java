package rek;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesDestination;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlow;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof aek.a)) {
            return null;
        }
        aek.a aVar = (aek.a) descriptor;
        return aVar.a(new PodNomineesFlow(new PodNomineesFlowContract$InputData(aVar.c(), aVar.b())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PodNomineesDestination) {
            return new PodNomineesFlow(new PodNomineesFlowContract$InputData());
        }
        return null;
    }
}
