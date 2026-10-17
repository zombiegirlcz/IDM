package kja;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184362b;

    public p(String name, String workflowStepId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f184361a = name;
        this.f184362b = workflowStepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f184361a, pVar.f184361a) && Intrinsics.f(this.f184362b, pVar.f184362b);
    }

    public final int hashCode() {
        return this.f184362b.hashCode() + (this.f184361a.hashCode() * 31);
    }
}
