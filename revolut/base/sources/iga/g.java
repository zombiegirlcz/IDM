package iga;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161105a;

    public g(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f161105a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f161105a, ((g) obj2).f161105a);
    }

    public final int hashCode() {
        return this.f161105a.hashCode();
    }
}
