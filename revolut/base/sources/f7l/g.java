package f7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132655c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c7l.a f132656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c7l.a f132657h;

    public g(String targetCurrency, String str, String transferType, String str2, String str3, Long l2, c7l.a aVar, c7l.a aVar2) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        this.f132653a = targetCurrency;
        this.f132654b = str;
        this.f132655c = transferType;
        this.d = str2;
        this.e = str3;
        this.f = l2;
        this.f132656g = aVar;
        this.f132657h = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f132653a, gVar.f132653a) && Intrinsics.f(this.f132654b, gVar.f132654b) && Intrinsics.f(this.f132655c, gVar.f132655c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f132656g == gVar.f132656g && this.f132657h == gVar.f132657h;
    }

    public final int hashCode() {
        int iHashCode = this.f132653a.hashCode() * 31;
        String str = this.f132654b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f132655c);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        c7l.a aVar = this.f132656g;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c7l.a aVar2 = this.f132657h;
        return iHashCode5 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
