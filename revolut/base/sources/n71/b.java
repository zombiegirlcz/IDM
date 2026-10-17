package n71;

import com.revolut.feature.address.models.Address;
import io3.l;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements Serializable {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212976c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f212977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Address f212978h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f212979j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f212980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f212981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f212982n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f212983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f212984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f212985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f212986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f212987t;
    public final l u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f212988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f212989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f212990y;
    public final String z;

    public b(String id10, String currency, String str, String str2, String str3, String str4, String str5, Address address, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, l pocketType, String str14, a aVar, c cVar, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f212974a = id10;
        this.f212975b = currency;
        this.f212976c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f212977g = str5;
        this.f212978h = address;
        this.i = str6;
        this.f212979j = bool;
        this.k = bool2;
        this.f212980l = bool3;
        this.f212981m = bool4;
        this.f212982n = str7;
        this.o = str8;
        this.f212983p = str9;
        this.f212984q = str10;
        this.f212985r = str11;
        this.f212986s = str12;
        this.f212987t = str13;
        this.u = pocketType;
        this.v = str14;
        this.f212988w = aVar;
        this.f212989x = cVar;
        this.f212990y = str15;
        this.z = str16;
        this.A = str17;
        this.B = str18;
        this.C = str19;
        this.D = str20;
        this.E = str21;
        this.F = str22;
    }

    public final a A() {
        return this.f212988w;
    }

    public final l B() {
        return this.u;
    }

    public final String C() {
        return this.f212982n;
    }

    public final String D() {
        return this.f212976c;
    }

    public final c E() {
        return this.f212989x;
    }

    public final String F() {
        return this.o;
    }

    public final String G() {
        return this.f212986s;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.B;
    }

    public final String c() {
        return this.C;
    }

    public final String d() {
        return this.f212983p;
    }

    public final Boolean e() {
        return this.f212980l;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f212974a, bVar.f212974a) && Intrinsics.f(this.f212975b, bVar.f212975b) && Intrinsics.f(this.f212976c, bVar.f212976c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f212977g, bVar.f212977g) && Intrinsics.f(this.f212978h, bVar.f212978h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f212979j, bVar.f212979j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f212980l, bVar.f212980l) && Intrinsics.f(this.f212981m, bVar.f212981m) && Intrinsics.f(this.f212982n, bVar.f212982n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f212983p, bVar.f212983p) && Intrinsics.f(this.f212984q, bVar.f212984q) && Intrinsics.f(this.f212985r, bVar.f212985r) && Intrinsics.f(this.f212986s, bVar.f212986s) && Intrinsics.f(this.f212987t, bVar.f212987t) && this.u == bVar.u && Intrinsics.f(this.v, bVar.v) && Intrinsics.f(this.f212988w, bVar.f212988w) && Intrinsics.f(this.f212989x, bVar.f212989x) && Intrinsics.f(this.f212990y, bVar.f212990y) && Intrinsics.f(this.z, bVar.z) && Intrinsics.f(this.A, bVar.A) && Intrinsics.f(this.B, bVar.B) && Intrinsics.f(this.C, bVar.C) && Intrinsics.f(this.D, bVar.D) && Intrinsics.f(this.E, bVar.E) && Intrinsics.f(this.F, bVar.F);
    }

    public final Address f() {
        return this.f212978h;
    }

    public final String getCurrency() {
        return this.f212975b;
    }

    public final String getId() {
        return this.f212974a;
    }

    public final String h() {
        return this.f212985r;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f212974a.hashCode() * 31, 31, this.f212975b);
        String str = this.f212976c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f212977g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Address address = this.f212978h;
        int iHashCode6 = (iHashCode5 + (address == null ? 0 : address.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f212979j;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f212980l;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f212981m;
        int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str7 = this.f212982n;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f212983p;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f212984q;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f212985r;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f212986s;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f212987t;
        int iC2 = t61.a.c(this.u, (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31, 31);
        String str14 = this.v;
        int iHashCode18 = (iC2 + (str14 == null ? 0 : str14.hashCode())) * 31;
        a aVar = this.f212988w;
        int iHashCode19 = (iHashCode18 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.f212989x;
        int iHashCode20 = (iHashCode19 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str15 = this.f212990y;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.z;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.A;
        int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.B;
        int iHashCode24 = (iHashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.C;
        int iHashCode25 = (iHashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.D;
        int iHashCode26 = (iHashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.E;
        int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.F;
        return iHashCode27 + (str22 != null ? str22.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public final String k() {
        return this.E;
    }

    public final String l() {
        return this.f212990y;
    }

    public final String m() {
        return this.i;
    }

    public final String n() {
        return this.f;
    }

    public final String o() {
        return this.A;
    }

    public final String p() {
        return this.z;
    }

    public final String q() {
        return this.D;
    }

    public final String r() {
        return this.f212984q;
    }

    public final String s() {
        return this.v;
    }

    public final String t() {
        return this.f212977g;
    }

    public final String u() {
        return this.f212987t;
    }

    public final String v() {
        return this.F;
    }

    public final Boolean w() {
        return this.f212981m;
    }

    public final Boolean x() {
        return this.k;
    }

    public final Boolean y() {
        return this.f212979j;
    }
}
