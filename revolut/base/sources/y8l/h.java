package y8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f311678c;
    public final long d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f311679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f311680h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f311681j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f311682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f311683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f311684n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f311685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f311686q;

    public h(String id10, String str, b channel, long j2, String currency, long j3, String str2, String str3, Long l2, String str4, i iVar, i creator, i iVar2, String str5, String str6, k kVar, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.f311676a = id10;
        this.f311677b = str;
        this.f311678c = channel;
        this.d = j2;
        this.e = currency;
        this.f = j3;
        this.f311679g = str2;
        this.f311680h = str3;
        this.i = l2;
        this.f311681j = str4;
        this.k = iVar;
        this.f311682l = creator;
        this.f311683m = iVar2;
        this.f311684n = str5;
        this.o = str6;
        this.f311685p = kVar;
        this.f311686q = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f311676a, hVar.f311676a) && Intrinsics.f(this.f311677b, hVar.f311677b) && this.f311678c == hVar.f311678c && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f && Intrinsics.f(this.f311679g, hVar.f311679g) && Intrinsics.f(this.f311680h, hVar.f311680h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f311681j, hVar.f311681j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f311682l, hVar.f311682l) && Intrinsics.f(this.f311683m, hVar.f311683m) && Intrinsics.f(this.f311684n, hVar.f311684n) && Intrinsics.f(this.o, hVar.o) && Intrinsics.f(this.f311685p, hVar.f311685p) && Intrinsics.f(this.f311686q, hVar.f311686q);
    }

    public final int hashCode() {
        int iHashCode = this.f311676a.hashCode() * 31;
        String str = this.f311677b;
        int iC = a0.d.c(p.a.c(a0.d.c((this.f311678c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.f311679g;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f311680h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.f311681j;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        i iVar = this.k;
        int iHashCode6 = (this.f311682l.hashCode() + ((iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31;
        i iVar2 = this.f311683m;
        int iHashCode7 = (iHashCode6 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        String str5 = this.f311684n;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        k kVar = this.f311685p;
        int iHashCode10 = (iHashCode9 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        a aVar = this.f311686q;
        return iHashCode10 + (aVar != null ? aVar.hashCode() : 0);
    }
}
