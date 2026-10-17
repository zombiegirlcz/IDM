package ahi;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature_workflow_reminder_api.WorkflowReminderDestination;
import com.revolut.feature_workflow_reminder_impl.ui.flow.WorkflowReminderFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
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
        if (destination instanceof WorkflowReminderDestination) {
            return new WorkflowReminderFlow();
        }
        return null;
    }
}
