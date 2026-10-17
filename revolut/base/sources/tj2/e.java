package tj2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271602a;

    public e(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f271602a = workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f271602a, ((e) obj2).f271602a);
    }

    public final int hashCode() {
        return this.f271602a.hashCode();
    }
}
