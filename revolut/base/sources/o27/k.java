package o27;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f221513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f221514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f221515c;

    public k(h amountVerificationInfo, i iVar, dj0.d totalProBalance) {
        Intrinsics.checkNotNullParameter(amountVerificationInfo, "amountVerificationInfo");
        Intrinsics.checkNotNullParameter(totalProBalance, "totalProBalance");
        this.f221513a = amountVerificationInfo;
        this.f221514b = iVar;
        this.f221515c = totalProBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f221513a, kVar.f221513a) && Intrinsics.f(this.f221514b, kVar.f221514b) && Intrinsics.f(this.f221515c, kVar.f221515c);
    }

    public final int hashCode() {
        int iHashCode = this.f221513a.hashCode() * 31;
        i iVar = this.f221514b;
        return this.f221515c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.f221512a.hashCode())) * 31);
    }
}
