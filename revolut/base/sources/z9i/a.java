package z9i;

import aii.u;
import com.revolut.feature_restricted_access_malware.impl.destination.MaliciousSoftwarePromptDestination;
import com.revolut.feature_restricted_access_malware.impl.flow.MaliciousSoftwarePromptFlow;
import com.revolut.feature_restricted_access_malware.impl.flow.MaliciousSoftwarePromptFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof MaliciousSoftwarePromptDestination) {
            return new MaliciousSoftwarePromptFlow(new MaliciousSoftwarePromptFlowContract$InputData.Default(((MaliciousSoftwarePromptDestination) destination).getF97470a()));
        }
        return null;
    }
}
