package et3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129184a;

    public e(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f129184a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f129184a, ((e) obj2).f129184a);
    }

    public final int hashCode() {
        return this.f129184a.hashCode();
    }
}
