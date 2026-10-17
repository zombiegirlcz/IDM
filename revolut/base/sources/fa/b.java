package fa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133003a;

    public b(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f133003a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f133003a, ((b) obj2).f133003a);
    }

    public final int hashCode() {
        return this.f133003a.hashCode();
    }

    public final String toString() {
        return p.a.p("Workflow(workflowId=", this.f133003a, ")");
    }
}
