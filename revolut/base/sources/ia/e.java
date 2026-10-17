package ia;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lia/e;", "", "", "a", "Ljava/lang/String;", "getWorkflowStepId", "()Ljava/lang/String;", "workflowStepId", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("workflowStepId")
    @NotNull
    private final String workflowStepId;

    public e(String workflowStepId) {
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.workflowStepId = workflowStepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.workflowStepId, ((e) obj2).workflowStepId);
    }

    public final int hashCode() {
        return this.workflowStepId.hashCode();
    }

    public final String toString() {
        return p.a.p("NavigationHubCompleteDto(workflowStepId=", this.workflowStepId, ")");
    }
}
