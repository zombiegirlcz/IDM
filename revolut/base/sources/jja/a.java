package jja;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174805a;

    public a(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f174805a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f174805a, ((a) obj2).f174805a);
    }

    public final int hashCode() {
        return this.f174805a.hashCode();
    }
}
