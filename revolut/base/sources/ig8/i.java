package ig8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f161092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f161093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f161094c;
    public final h d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f161095g;

    public i(dj0.d currentBalance, dj0.d dVar, long j2, h state, boolean z, boolean z3, f fVar) {
        Intrinsics.checkNotNullParameter(currentBalance, "currentBalance");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f161092a = currentBalance;
        this.f161093b = dVar;
        this.f161094c = j2;
        this.d = state;
        this.e = z;
        this.f = z3;
        this.f161095g = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f161092a, iVar.f161092a) && Intrinsics.f(this.f161093b, iVar.f161093b) && this.f161094c == iVar.f161094c && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && this.f == iVar.f && Intrinsics.f(this.f161095g, iVar.f161095g);
    }

    public final int hashCode() {
        int iHashCode = this.f161092a.hashCode() * 31;
        dj0.d dVar = this.f161093b;
        int iC = j6.a.c(j6.a.c((this.d.hashCode() + a0.d.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f161094c)) * 31, 31, this.e), 31, this.f);
        f fVar = this.f161095g;
        return iC + (fVar != null ? fVar.hashCode() : 0);
    }
}
