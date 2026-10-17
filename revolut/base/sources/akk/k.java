package akk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f5982b;

    public k(String planId, hha.i iVar) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f5981a = planId;
        this.f5982b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f5981a, kVar.f5981a) && this.f5982b == kVar.f5982b;
    }

    public final int hashCode() {
        int iHashCode = this.f5981a.hashCode() * 31;
        hha.i iVar = this.f5982b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
