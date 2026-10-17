package qu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu3.d f249191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f249193c;
    public final Long d;
    public final Long e;
    public final f f;

    public a(pu3.d debtType, String creditProvider, Long l2, Long l3, Long l4, f fVar) {
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(creditProvider, "creditProvider");
        this.f249191a = debtType;
        this.f249192b = creditProvider;
        this.f249193c = l2;
        this.d = l3;
        this.e = l4;
        this.f = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f249191a == aVar.f249191a && Intrinsics.f(this.f249192b, aVar.f249192b) && Intrinsics.f(this.f249193c, aVar.f249193c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f249191a.hashCode() * 31, 31, this.f249192b);
        Long l2 = this.f249193c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        f fVar = this.f;
        return iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
    }
}
