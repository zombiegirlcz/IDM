package ol1;

import aii.u;
import com.revolut.feature.apm.aani.api.navigation.AaniDestination;
import com.revolut.feature.apm.aani.impl.ui.AaniFlow;
import com.revolut.feature.apm.aani.impl.ui.AaniFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AaniDestination) {
            return new AaniFlow(new AaniFlowContract$InputData(((AaniDestination) destination).f61105a));
        }
        return null;
    }
}
