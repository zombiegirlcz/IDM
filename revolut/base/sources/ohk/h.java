package ohk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225394a;

    public h(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f225394a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f225394a, ((h) obj2).f225394a);
    }

    public final int hashCode() {
        return this.f225394a.hashCode();
    }
}
