package qa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243920a;

    public b(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f243920a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f243920a, ((b) obj2).f243920a);
    }

    public final int hashCode() {
        return this.f243920a.hashCode();
    }

    public final String toString() {
        return p.a.p("Active(workflowId=", this.f243920a, ")");
    }
}
