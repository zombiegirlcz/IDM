package u0g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276172c;
    public final String d;
    public final String e;
    public final rzf.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f276173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f276174h;
    public final hzf.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0g.b f276175j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lzf.a f276176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f276177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hzf.a f276178n;
    public final jzf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f276179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f276180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wzf.a f276181r;

    public a(String id10, String status, String createdDate, String date, String str, rzf.g experience, List list, String str2, hzf.b bVar, a0g.b pricing, String str3, lzf.a cashback, String str4, hzf.a aVar, jzf.b bVar2, List list2, String str5, wzf.a aVar2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        this.f276170a = id10;
        this.f276171b = status;
        this.f276172c = createdDate;
        this.d = date;
        this.e = str;
        this.f = experience;
        this.f276173g = list;
        this.f276174h = str2;
        this.i = bVar;
        this.f276175j = pricing;
        this.k = str3;
        this.f276176l = cashback;
        this.f276177m = str4;
        this.f276178n = aVar;
        this.o = bVar2;
        this.f276179p = list2;
        this.f276180q = str5;
        this.f276181r = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f276170a, aVar.f276170a) && Intrinsics.f(this.f276171b, aVar.f276171b) && Intrinsics.f(this.f276172c, aVar.f276172c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f276173g, aVar.f276173g) && Intrinsics.f(this.f276174h, aVar.f276174h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f276175j, aVar.f276175j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f276176l, aVar.f276176l) && Intrinsics.f(this.f276177m, aVar.f276177m) && Intrinsics.f(this.f276178n, aVar.f276178n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f276179p, aVar.f276179p) && Intrinsics.f(this.f276180q, aVar.f276180q) && Intrinsics.f(this.f276181r, aVar.f276181r);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f276170a.hashCode() * 31, 31, this.f276171b), 31, this.f276172c), 31, this.d);
        String str = this.e;
        int iHashCode = (this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.f276173g;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f276174h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        hzf.b bVar = this.i;
        int iHashCode4 = (this.f276175j.hashCode() + ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        String str3 = this.k;
        int iHashCode5 = (this.f276176l.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f276177m;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        hzf.a aVar = this.f276178n;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jzf.b bVar2 = this.o;
        int iHashCode8 = (iHashCode7 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        List list2 = this.f276179p;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.f276180q;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        wzf.a aVar2 = this.f276181r;
        return iHashCode10 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
