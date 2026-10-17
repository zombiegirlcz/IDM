package x6d;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.shared.consent.prompt.builder.impl.ConsentPromptBridgeFeatureConfig$ConsentPromptDestination;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.ConsentPromptFlow;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.ConsentPromptFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof ConsentPromptBridgeFeatureConfig$ConsentPromptDestination)) {
            return null;
        }
        ConsentPromptBridgeFeatureConfig$ConsentPromptDestination consentPromptBridgeFeatureConfig$ConsentPromptDestination = (ConsentPromptBridgeFeatureConfig$ConsentPromptDestination) destination;
        return new ConsentPromptFlow(new ConsentPromptFlowContract$InputData(consentPromptBridgeFeatureConfig$ConsentPromptDestination.f86094a, consentPromptBridgeFeatureConfig$ConsentPromptDestination.f86095b, false));
    }
}
