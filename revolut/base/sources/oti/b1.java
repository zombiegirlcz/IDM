package oti;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();
    public static final Lazy[] v = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new oqj.d(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f229604c;
    public final long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f229605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f229606h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f229607j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f229608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f229609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f229610n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f229611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f229612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Long f229613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f229614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f229615t;
    public final e1 u;

    public /* synthetic */ b1(int i, String str, String str2, long j2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l2, Long l3, String str11, String str12, int i2, Long l4, int i3, List list, e1 e1Var) {
        if (2097151 != (i & 2097151)) {
            qlm.j1.f(z0.f229709a.getDescriptor(), i, 2097151);
            throw null;
        }
        this.f229602a = str;
        this.f229603b = str2;
        this.f229604c = j2;
        this.d = j3;
        this.e = str3;
        this.f = str4;
        this.f229605g = str5;
        this.f229606h = str6;
        this.i = str7;
        this.f229607j = str8;
        this.k = str9;
        this.f229608l = str10;
        this.f229609m = l2;
        this.f229610n = l3;
        this.o = str11;
        this.f229611p = str12;
        this.f229612q = i2;
        this.f229613r = l4;
        this.f229614s = i3;
        this.f229615t = list;
        this.u = e1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f229602a, b1Var.f229602a) && Intrinsics.f(this.f229603b, b1Var.f229603b) && this.f229604c == b1Var.f229604c && this.d == b1Var.d && Intrinsics.f(this.e, b1Var.e) && Intrinsics.f(this.f, b1Var.f) && Intrinsics.f(this.f229605g, b1Var.f229605g) && Intrinsics.f(this.f229606h, b1Var.f229606h) && Intrinsics.f(this.i, b1Var.i) && Intrinsics.f(this.f229607j, b1Var.f229607j) && Intrinsics.f(this.k, b1Var.k) && Intrinsics.f(this.f229608l, b1Var.f229608l) && Intrinsics.f(this.f229609m, b1Var.f229609m) && Intrinsics.f(this.f229610n, b1Var.f229610n) && Intrinsics.f(this.o, b1Var.o) && Intrinsics.f(this.f229611p, b1Var.f229611p) && this.f229612q == b1Var.f229612q && Intrinsics.f(this.f229613r, b1Var.f229613r) && this.f229614s == b1Var.f229614s && Intrinsics.f(this.f229615t, b1Var.f229615t) && Intrinsics.f(this.u, b1Var.u);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(a0.d.c(a0.d.c(p.a.c(this.f229602a.hashCode() * 31, 31, this.f229603b), 31, this.f229604c), 31, this.d), 31, this.e), 31, this.f), 31, this.f229605g), 31, this.f229606h), 31, this.i), 31, this.f229607j), 31, this.k);
        String str = this.f229608l;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f229609m;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f229610n;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.o;
        int iB = j6.a.b(this.f229612q, p.a.c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f229611p), 31);
        Long l4 = this.f229613r;
        int iB2 = j6.a.b(this.f229614s, (iB + (l4 == null ? 0 : l4.hashCode())) * 31, 31);
        List list = this.f229615t;
        int iHashCode4 = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
        e1 e1Var = this.u;
        return iHashCode4 + (e1Var != null ? e1Var.hashCode() : 0);
    }

    public b1(String id10, String state, long j2, long j3, String cityName, String cipName, String cipLocation, String terminalName, String airportDescription, String airportTimeZone, String iataCode, String str, Long l2, Long l3, String str2, String countryCode, int i, Long l4, int i2, ArrayList arrayList, e1 e1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(cipName, "cipName");
        Intrinsics.checkNotNullParameter(cipLocation, "cipLocation");
        Intrinsics.checkNotNullParameter(terminalName, "terminalName");
        Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
        Intrinsics.checkNotNullParameter(airportTimeZone, "airportTimeZone");
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f229602a = id10;
        this.f229603b = state;
        this.f229604c = j2;
        this.d = j3;
        this.e = cityName;
        this.f = cipName;
        this.f229605g = cipLocation;
        this.f229606h = terminalName;
        this.i = airportDescription;
        this.f229607j = airportTimeZone;
        this.k = iataCode;
        this.f229608l = str;
        this.f229609m = l2;
        this.f229610n = l3;
        this.o = str2;
        this.f229611p = countryCode;
        this.f229612q = i;
        this.f229613r = l4;
        this.f229614s = i2;
        this.f229615t = arrayList;
        this.u = e1Var;
    }
}
