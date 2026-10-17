package pfk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lha.o f235641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235642b;

    public i(lha.o currentUserRole, String currentPlanId) {
        Intrinsics.checkNotNullParameter(currentUserRole, "currentUserRole");
        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
        this.f235641a = currentUserRole;
        this.f235642b = currentPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f235641a == iVar.f235641a && Intrinsics.f(this.f235642b, iVar.f235642b);
    }

    public final int hashCode() {
        return this.f235642b.hashCode() + (this.f235641a.hashCode() * 31);
    }
}
