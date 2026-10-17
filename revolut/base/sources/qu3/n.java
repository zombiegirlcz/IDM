package qu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu3.d f249214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249215c;
    public final Long d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f249216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f249217h;

    public n(String id10, pu3.d debtType, String creditProvider, Long l2, Long l3, Long l4, f fVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(creditProvider, "creditProvider");
        this.f249213a = id10;
        this.f249214b = debtType;
        this.f249215c = creditProvider;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.f249216g = fVar;
        this.f249217h = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f249213a, nVar.f249213a) && this.f249214b == nVar.f249214b && Intrinsics.f(this.f249215c, nVar.f249215c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && this.f249216g == nVar.f249216g && Intrinsics.f(this.f249217h, nVar.f249217h);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f249214b.hashCode() + (this.f249213a.hashCode() * 31)) * 31, 31, this.f249215c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        f fVar = this.f249216g;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Boolean bool = this.f249217h;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }
}
