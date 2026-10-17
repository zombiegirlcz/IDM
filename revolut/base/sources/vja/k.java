package vja;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289672b;

    public k(String stepName, String workflowStepId) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f289671a = stepName;
        this.f289672b = workflowStepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f289671a, kVar.f289671a) && Intrinsics.f(this.f289672b, kVar.f289672b);
    }

    public final int hashCode() {
        return this.f289672b.hashCode() + (this.f289671a.hashCode() * 31);
    }
}
