package pil;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f236620b;

    public c(String workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f236619a = workflowId;
        this.f236620b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f236619a, cVar.f236619a) && this.f236620b == cVar.f236620b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236620b) + (this.f236619a.hashCode() * 31);
    }
}
