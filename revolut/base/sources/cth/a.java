package cth;

import aii.u;
import com.revolut.feature.workflow.chat.api.navigation.WorkflowChatDestination;
import com.revolut.feature.workflow.chat.impl.ui.flow.WorkflowChatFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof WorkflowChatDestination) {
            return new WorkflowChatFlow();
        }
        return null;
    }
}
