package qk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246953a;

    public d(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f246953a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f246953a, ((d) obj2).f246953a);
    }

    public final int hashCode() {
        return this.f246953a.hashCode();
    }
}
