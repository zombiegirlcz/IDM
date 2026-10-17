package nq8;

import aii.e;
import aii.g;
import aii.u;
import ar8.c;
import ar8.d;
import com.revolut.feature.junior_transfer.api.navigation.JuniorAddMoneyByPocketDestination;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Destination;
import com.revolut.feature.junior_transfer.api.navigation.JuniorTransferKompotFeatureConfig;
import com.revolut.feature.junior_transfer.api.navigation.JuniorTransferKompotFeatureConfig$Withdrawal$Destination;
import com.revolut.feature.junior_transfer.impl.ui.add_money.JuniorAddMoneyFlow;
import com.revolut.feature.junior_transfer.impl.ui.add_money.JuniorAddMoneyFlowContract$InputData;
import com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.JuniorBlockInboundTransferFlow;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlow;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlowContract$InputData;
import hrf.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof lq8.a) {
            lq8.a aVar = (lq8.a) descriptor;
            return aVar.a(new JuniorBlockInboundTransferFlow(new c(aVar.b(), aVar.c(), new d(aVar.d()))));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return jq8.b.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorTransferKompotFeatureConfig.TopUp.Destination) {
            JuniorTransferKompotFeatureConfig.TopUp.Destination destination2 = (JuniorTransferKompotFeatureConfig.TopUp.Destination) destination;
            return new JuniorTransferFlow(new JuniorTransferFlowContract$InputData(destination2.f77421b, f.OUTGOING, 0L, destination2.f77422c));
        }
        if (destination instanceof JuniorTransferKompotFeatureConfig$Withdrawal$Destination) {
            return new JuniorTransferFlow(new JuniorTransferFlowContract$InputData(f.INCOMING, ((JuniorTransferKompotFeatureConfig$Withdrawal$Destination) destination).f77423a));
        }
        if (destination instanceof JuniorTransferKompotFeatureConfig.JuniorTopUpPromptDestination) {
            JuniorTransferKompotFeatureConfig.JuniorTopUpPromptDestination juniorTopUpPromptDestination = (JuniorTransferKompotFeatureConfig.JuniorTopUpPromptDestination) destination;
            return cr8.a.a(juniorTopUpPromptDestination.getF77417a(), juniorTopUpPromptDestination.getF77418b());
        }
        if (destination instanceof JuniorBlockInboundTransferNavigation$Destination) {
            JuniorBlockInboundTransferNavigation$Destination juniorBlockInboundTransferNavigation$Destination = (JuniorBlockInboundTransferNavigation$Destination) destination;
            return new JuniorBlockInboundTransferFlow(new c(juniorBlockInboundTransferNavigation$Destination.getF77406a(), juniorBlockInboundTransferNavigation$Destination.getF77407b(), ar8.e.f8531a));
        }
        if (!(destination instanceof JuniorAddMoneyByPocketDestination)) {
            return null;
        }
        JuniorAddMoneyByPocketDestination juniorAddMoneyByPocketDestination = (JuniorAddMoneyByPocketDestination) destination;
        return new JuniorAddMoneyFlow(new JuniorAddMoneyFlowContract$InputData(juniorAddMoneyByPocketDestination.getF77404a(), juniorAddMoneyByPocketDestination.getF77405b()));
    }
}
