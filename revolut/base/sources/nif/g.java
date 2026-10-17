package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f215830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f215832c;
    public final String d;
    public final Double e;

    public g(Long l2, String str, Long l3, String str2, Double d) {
        this.f215830a = l2;
        this.f215831b = str;
        this.f215832c = l3;
        this.d = str2;
        this.e = d;
    }

    public final Double a() {
        return this.e;
    }

    public final Long b() {
        return this.f215830a;
    }

    public final String c() {
        return this.f215831b;
    }

    public final Long d() {
        return this.f215832c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f215830a, gVar.f215830a) && Intrinsics.f(this.f215831b, gVar.f215831b) && Intrinsics.f(this.f215832c, gVar.f215832c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        Long l2 = this.f215830a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f215831b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.f215832c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.e;
        return iHashCode4 + (d != null ? d.hashCode() : 0);
    }
}
