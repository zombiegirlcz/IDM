package sl;

import com.onfido.workflow.OnfidoWorkflow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class r implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnfidoWorkflow.WorkflowException f264063a;

    public r(OnfidoWorkflow.WorkflowException workflowException, int i) {
        workflowException = (i & 4) != 0 ? null : workflowException;
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter("", "taskDefId");
        this.f264063a = workflowException;
    }

    @Override // sl.x
    public final String a() {
        return "";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f264063a, ((r) obj2).f264063a);
    }

    @Override // sl.x
    public final String getId() {
        return "";
    }

    public final int hashCode() {
        OnfidoWorkflow.WorkflowException workflowException = this.f264063a;
        if (workflowException == null) {
            return 0;
        }
        return workflowException.hashCode();
    }

    public final String toString() {
        return "FinishFlowTask(id=, taskDefId=, error=" + this.f264063a + ")";
    }
}
