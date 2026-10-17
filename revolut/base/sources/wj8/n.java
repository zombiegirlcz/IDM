package wj8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298012a;

    public n(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f298012a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f298012a, ((n) obj2).f298012a);
    }

    public final int hashCode() {
        return this.f298012a.hashCode();
    }
}
