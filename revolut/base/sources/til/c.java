package til;

import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowControllerDescriptor$InputData f271576a;

    public c(WorkflowControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f271576a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f271576a, ((c) obj2).f271576a);
    }

    public final int hashCode() {
        return this.f271576a.hashCode();
    }
}
