package mbk;

import ack.c;
import ack.d;
import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.plan_gifting.api.PlanGiftingApi$Toggles;
import com.revolut.retail.feature.plan_gifting.api.navigation.PlanGiftingConfig;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.PlanGiftingReceiverFlow;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.PlanGiftingReceiverFlowContract$InputData;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.PlanGiftingSenderFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbk.b f204241a;

    public b(tbk.b planGiftingAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(planGiftingAvailabilityInteractor, "planGiftingAvailabilityInteractor");
        this.f204241a = planGiftingAvailabilityInteractor;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof lbk.b) {
            lbk.b bVar = (lbk.b) descriptor;
            return bVar.a(new PlanGiftingSenderFlow(new d(bVar.b().getF102455a(), bVar.b().getF102456b())));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return PlanGiftingApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!this.f204241a.a()) {
            return null;
        }
        if (destination instanceof PlanGiftingConfig.SenderDestination) {
            PlanGiftingConfig.SenderDestination senderDestination = (PlanGiftingConfig.SenderDestination) destination;
            return new PlanGiftingSenderFlow(new c(senderDestination.getF102453a(), senderDestination.getF102454b()));
        }
        if (!(destination instanceof PlanGiftingConfig.ReceiverDestination)) {
            return null;
        }
        PlanGiftingConfig.ReceiverDestination receiverDestination = (PlanGiftingConfig.ReceiverDestination) destination;
        return new PlanGiftingReceiverFlow(new PlanGiftingReceiverFlowContract$InputData(receiverDestination.getF102448a(), receiverDestination.getF102449b(), receiverDestination.getF102450c()));
    }
}
