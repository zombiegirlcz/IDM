package db;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112624a;

    public n(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f112624a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f112624a, ((n) obj2).f112624a);
    }

    public final int hashCode() {
        return this.f112624a.hashCode();
    }

    public final String toString() {
        return p.a.p("StartInnerFlow(workflowId=", this.f112624a, ")");
    }
}
