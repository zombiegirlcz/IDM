package t3i;

import com.fourthline.orca.workflow.WorkflowSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowSession f267803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267804b;

    public q(WorkflowSession workflowSession, String validationCode) {
        Intrinsics.checkNotNullParameter(workflowSession, "workflowSession");
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        this.f267803a = workflowSession;
        this.f267804b = validationCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f267803a, qVar.f267803a) && Intrinsics.f(this.f267804b, qVar.f267804b);
    }

    public final int hashCode() {
        return (this.f267803a.hashCode() * 31) + this.f267804b.hashCode();
    }
}
