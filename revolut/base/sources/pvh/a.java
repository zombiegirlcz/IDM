package pvh;

import aii.u;
import com.revolut.feature.workflow.sso.api.navigation.WorkflowSsoDestination;
import com.revolut.feature.workflow.sso.impl.ui.flow.WorkflowSsoFlow;
import com.revolut.feature.workflow.sso.impl.ui.flow.WorkflowSsoFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof WorkflowSsoDestination) {
            return new WorkflowSsoFlow(new WorkflowSsoFlowContract$InputData(((WorkflowSsoDestination) destination).getF96612b().getF96613a()));
        }
        return null;
    }
}
