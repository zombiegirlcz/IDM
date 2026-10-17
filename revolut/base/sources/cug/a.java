package cug;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureDestination;
import com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureNegativeBalanceDestination;
import com.revolut.feature.wealth.account_closure.api.navigation.AccountProductClosureDestination;
import com.revolut.feature.wealth.account_closure.api.navigation.backend_reason.AccountClosureBackendReasonDestination;
import com.revolut.feature.wealth.account_closure.api.navigation.progress.AccountClosureProgressDestination;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlow;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.backend_reason.AccountClosureBackendReasonScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.backend_reason.AccountClosureBackendReasonScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof mtg.a)) {
            return null;
        }
        mtg.a aVar = (mtg.a) descriptor;
        return aVar.a(new AccountClosureFlow(new AccountClosureFlowContract$InputData.CloseAccountInputData(aVar.b())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AccountClosureDestination) {
            return new AccountClosureFlow(new AccountClosureFlowContract$InputData.CloseAccountInputData(((AccountClosureDestination) destination).getF94885a()));
        }
        if (destination instanceof AccountProductClosureDestination) {
            AccountProductClosureDestination accountProductClosureDestination = (AccountProductClosureDestination) destination;
            return new AccountClosureFlow(new AccountClosureFlowContract$InputData.CloseTradingProductInputData(accountProductClosureDestination.getF94890a(), accountProductClosureDestination.getF94891b(), accountProductClosureDestination.getF94892c()));
        }
        if (destination instanceof AccountClosureNegativeBalanceDestination) {
            return new AccountClosureFlow(new AccountClosureFlowContract$InputData.NegativeBalanceInputData(((AccountClosureNegativeBalanceDestination) destination).getF94888a()));
        }
        if (destination instanceof AccountClosureProgressDestination) {
            return new AccountClosureProgressScreen(new AccountClosureProgressScreenContract$InputData(((AccountClosureProgressDestination) destination).getF94894a()));
        }
        if (destination instanceof AccountClosureBackendReasonDestination) {
            return new AccountClosureBackendReasonScreen(new AccountClosureBackendReasonScreenContract$InputData(((AccountClosureBackendReasonDestination) destination).getF94893a()));
        }
        return null;
    }
}
