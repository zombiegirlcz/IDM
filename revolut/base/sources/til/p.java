package til;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271585b;

    public p(String name, String workflowStepId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f271584a = name;
        this.f271585b = workflowStepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f271584a, pVar.f271584a) && Intrinsics.f(this.f271585b, pVar.f271585b);
    }

    public final int hashCode() {
        return this.f271585b.hashCode() + (this.f271584a.hashCode() * 31);
    }
}
