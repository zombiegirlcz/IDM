package duh;

import aii.u;
import com.revolut.feature.workflow.engine.rfi.api.navigation.RfiScreeningDestination;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlow;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof RfiScreeningDestination)) {
            return null;
        }
        RfiScreeningDestination.InputData inputData = ((RfiScreeningDestination) destination).f96539b;
        return new ScreeningFlow(new ScreeningFlowContract$InputData(inputData.getF96540a(), inputData.a()));
    }
}
