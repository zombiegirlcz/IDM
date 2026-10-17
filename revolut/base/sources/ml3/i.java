package ml3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f206593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f206595c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f206596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f206597h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f206598j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f206599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f206600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f206601n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ll3.a f206602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f206603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f206604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f206605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f206606t;

    public i(long j2, String point, String displayedName, String firstName, String lastName, String registeredAs, String str, String str2, boolean z, boolean z3, Long l2, String str3, int i, long j3, String str4, ll3.a type, String country, String appMode, String str5, String str6) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(registeredAs, "registeredAs");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        this.f206593a = j2;
        this.f206594b = point;
        this.f206595c = displayedName;
        this.d = firstName;
        this.e = lastName;
        this.f = registeredAs;
        this.f206596g = str;
        this.f206597h = str2;
        this.i = z;
        this.f206598j = z3;
        this.k = l2;
        this.f206599l = str3;
        this.f206600m = i;
        this.f206601n = j3;
        this.o = str4;
        this.f206602p = type;
        this.f206603q = country;
        this.f206604r = appMode;
        this.f206605s = str5;
        this.f206606t = str6;
    }

    public static i a(i iVar, int i, long j2) {
        long j3 = iVar.f206593a;
        String point = iVar.f206594b;
        String displayedName = iVar.f206595c;
        String firstName = iVar.d;
        String lastName = iVar.e;
        String registeredAs = iVar.f;
        String str = iVar.f206596g;
        String str2 = iVar.f206597h;
        boolean z = iVar.i;
        boolean z3 = iVar.f206598j;
        Long l2 = iVar.k;
        String str3 = iVar.f206599l;
        String str4 = iVar.o;
        ll3.a type = iVar.f206602p;
        String country = iVar.f206603q;
        String appMode = iVar.f206604r;
        String str5 = iVar.f206605s;
        String str6 = iVar.f206606t;
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(registeredAs, "registeredAs");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        return new i(j3, point, displayedName, firstName, lastName, registeredAs, str, str2, z, z3, l2, str3, i, j2, str4, type, country, appMode, str5, str6);
    }

    public final String b() {
        return this.f206604r;
    }

    public final String c() {
        return this.f206599l;
    }

    public final String d() {
        return this.f206597h;
    }

    public final String e() {
        return this.f206603q;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f206593a == iVar.f206593a && Intrinsics.f(this.f206594b, iVar.f206594b) && Intrinsics.f(this.f206595c, iVar.f206595c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f206596g, iVar.f206596g) && Intrinsics.f(this.f206597h, iVar.f206597h) && this.i == iVar.i && this.f206598j == iVar.f206598j && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f206599l, iVar.f206599l) && this.f206600m == iVar.f206600m && this.f206601n == iVar.f206601n && Intrinsics.f(this.o, iVar.o) && this.f206602p == iVar.f206602p && Intrinsics.f(this.f206603q, iVar.f206603q) && Intrinsics.f(this.f206604r, iVar.f206604r) && Intrinsics.f(this.f206605s, iVar.f206605s) && Intrinsics.f(this.f206606t, iVar.f206606t);
    }

    public final String f() {
        return this.f206606t;
    }

    public final String g() {
        return this.f206595c;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(Long.hashCode(this.f206593a) * 31, 31, this.f206594b), 31, this.f206595c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f206596g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f206597h;
        int iC2 = j6.a.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.f206598j);
        Long l2 = this.k;
        int iHashCode2 = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f206599l;
        int iC3 = a0.d.c(j6.a.b(this.f206600m, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f206601n);
        String str4 = this.o;
        int iC4 = p.a.c(p.a.c((this.f206602p.hashCode() + ((iC3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.f206603q), 31, this.f206604r);
        String str5 = this.f206605s;
        int iHashCode3 = (iC4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f206606t;
        return iHashCode3 + (str6 != null ? str6.hashCode() : 0);
    }

    public final long i() {
        return this.f206593a;
    }

    public final Long j() {
        return this.k;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.f206605s;
    }

    public final String m() {
        return this.o;
    }

    public final String n() {
        return this.f206594b;
    }

    public final String o() {
        return this.f;
    }

    public final long p() {
        return this.f206601n;
    }

    public final int q() {
        return this.f206600m;
    }

    public final ll3.a r() {
        return this.f206602p;
    }

    public final String s() {
        return this.f206596g;
    }

    public final boolean t() {
        return this.f206598j;
    }

    public final boolean u() {
        return this.i;
    }
}
