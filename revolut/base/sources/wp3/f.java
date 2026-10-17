package wp3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299026b;

    public f(String applicationId, String workflowId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f299025a = applicationId;
        this.f299026b = workflowId;
    }

    public final String a() {
        return this.f299025a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f299025a, fVar.f299025a) && Intrinsics.f(this.f299026b, fVar.f299026b);
    }

    public final int hashCode() {
        return this.f299026b.hashCode() + (this.f299025a.hashCode() * 31);
    }
}
