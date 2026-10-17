package pb8;

import aii.u;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceDestination;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowancesListDestination;
import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlow;
import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlowContract$InputData;
import com.revolut.feature.junior_allowance.impl.ui.screen.list.JuniorAllowancesListScreen;
import dki.g;
import ec8.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorAllowanceDestination) {
            JuniorAllowanceDestination juniorAllowanceDestination = (JuniorAllowanceDestination) destination;
            return new JuniorAllowanceFlow(new JuniorAllowanceFlowContract$InputData(juniorAllowanceDestination.getF76813a(), juniorAllowanceDestination.getF76814b(), juniorAllowanceDestination.getF76815c(), juniorAllowanceDestination.getD()));
        }
        if (!(destination instanceof JuniorAllowancesListDestination)) {
            return null;
        }
        JuniorAllowancesListDestination juniorAllowancesListDestination = (JuniorAllowancesListDestination) destination;
        return new JuniorAllowancesListScreen(new h(juniorAllowancesListDestination.getF76820a(), juniorAllowancesListDestination.getF76821b()));
    }
}
