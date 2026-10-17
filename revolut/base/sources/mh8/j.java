package mh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205431a;

    public j(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f205431a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f205431a, ((j) obj2).f205431a);
    }

    public final int hashCode() {
        return this.f205431a.hashCode();
    }
}
