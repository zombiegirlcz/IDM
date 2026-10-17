package efl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f125374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f125375b;

    public i(dj0.d withdrawalAmount, h hVar) {
        Intrinsics.checkNotNullParameter(withdrawalAmount, "withdrawalAmount");
        this.f125374a = withdrawalAmount;
        this.f125375b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f125374a, iVar.f125374a) && this.f125375b == iVar.f125375b;
    }

    public final int hashCode() {
        int iHashCode = this.f125374a.hashCode() * 31;
        h hVar = this.f125375b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
