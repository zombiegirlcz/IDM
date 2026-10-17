package u0g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f276195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276196c;
    public final Long d;
    public final Long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f276197g;

    public f(String id10, long j2, String name, Long l2, Long l3, String locationType, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        this.f276194a = id10;
        this.f276195b = j2;
        this.f276196c = name;
        this.d = l2;
        this.e = l3;
        this.f = locationType;
        this.f276197g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f276194a, fVar.f276194a) && this.f276195b == fVar.f276195b && Intrinsics.f(this.f276196c, fVar.f276196c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f276197g, fVar.f276197g);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(this.f276194a.hashCode() * 31, 31, this.f276195b), 31, this.f276196c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iC2 = p.a.c((iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f);
        String str = this.f276197g;
        return iC2 + (str != null ? str.hashCode() : 0);
    }
}
