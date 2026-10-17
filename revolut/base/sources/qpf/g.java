package qpf;

import aii.u;
import com.revolut.feature.transfer.core.api.TransferCoreApi$Toggles;
import com.revolut.feature.transfer.core.api.cancellation.TransferCancellationDestination;
import com.revolut.feature.transfer.core.api.cancellation.TransferCancellationInputData;
import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationFeatureConfig$BridgeDestination;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceFeatureConfig$BridgeDestination;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferLocateFeatureConfig$BridgeDestination;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferRecallFeatureConfig$BridgeDestination;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterFeatureConfig;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlow;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlowContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlow;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlowContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.transfer.cancellation.TransferCancellationDialogScreen;
import com.revolut.feature.transfer.core.impl.ui.transfer.locate.TransferLocateScreen;
import com.revolut.feature.transfer.core.impl.ui.transfer.recall.TransferRecallScreen;
import com.revolut.feature.transfer.core.impl.ui.troubleshooter.TransferTroubleshooterScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements ohi.a, nte.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return TransferCoreApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AdditionalInformationFeatureConfig$BridgeDestination) {
            AdditionalInformationFeatureConfig$BridgeDestination additionalInformationFeatureConfig$BridgeDestination = (AdditionalInformationFeatureConfig$BridgeDestination) destination;
            return new AdditionalInformationFlow(new AdditionalInformationFlowContract$InputData(additionalInformationFeatureConfig$BridgeDestination.f92153a, additionalInformationFeatureConfig$BridgeDestination.f92154b));
        }
        if (destination instanceof ReferenceFeatureConfig$BridgeDestination) {
            ReferenceFeatureConfig$BridgeDestination referenceFeatureConfig$BridgeDestination = (ReferenceFeatureConfig$BridgeDestination) destination;
            return new ReferenceFlow(new ReferenceFlowContract$InputData(referenceFeatureConfig$BridgeDestination.f92158a, referenceFeatureConfig$BridgeDestination.f92159b));
        }
        if (destination instanceof TransferCancellationDestination) {
            return new TransferCancellationDialogScreen(new TransferCancellationInputData(((TransferCancellationDestination) destination).f92117a));
        }
        if (destination instanceof TransferTroubleshooterFeatureConfig.BridgeDestination) {
            return new TransferTroubleshooterScreen(((TransferTroubleshooterFeatureConfig.BridgeDestination) destination).f92172a);
        }
        if (destination instanceof TransferRecallFeatureConfig$BridgeDestination) {
            return new TransferRecallScreen(((TransferRecallFeatureConfig$BridgeDestination) destination).f92167a);
        }
        if (destination instanceof TransferLocateFeatureConfig$BridgeDestination) {
            return new TransferLocateScreen(((TransferLocateFeatureConfig$BridgeDestination) destination).f92163a);
        }
        return null;
    }
}
