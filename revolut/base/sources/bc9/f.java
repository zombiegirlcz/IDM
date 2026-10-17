package bc9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14402b;

    public f(String stepName, String workflowStepId) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f14401a = stepName;
        this.f14402b = workflowStepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f14401a, fVar.f14401a) && Intrinsics.f(this.f14402b, fVar.f14402b);
    }

    public final int hashCode() {
        return this.f14402b.hashCode() + (this.f14401a.hashCode() * 31);
    }
}
