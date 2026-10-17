package pb9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f234666b;

    public f(String stepName, String workflowStepId) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f234665a = stepName;
        this.f234666b = workflowStepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f234665a, fVar.f234665a) && Intrinsics.f(this.f234666b, fVar.f234666b);
    }

    public final int hashCode() {
        return this.f234666b.hashCode() + (this.f234665a.hashCode() * 31);
    }
}
