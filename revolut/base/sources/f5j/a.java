package f5j;

import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentification;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements Serializable {
    public final String A;
    public final BeneficiaryIdentification B;
    public final String C;
    public final Instant D;
    public final String E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132331c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f132332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f132333h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f132334j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f132335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Address f132336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f132337n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f132338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f132339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f132340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Boolean f132341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f132342t;
    public final Map u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f132343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f132344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f132345y;
    public final long z;

    public a(String id10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, r rVar, Address address, String str11, String str12, String str13, t tVar, String str14, Boolean bool, e eVar, Map map, b bVar, List settings, boolean z, int i, long j2, String str15, BeneficiaryIdentification beneficiaryIdentification, String str16, Instant instant, String str17) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f132329a = id10;
        this.f132330b = str;
        this.f132331c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f132332g = str6;
        this.f132333h = str7;
        this.i = str8;
        this.f132334j = str9;
        this.k = str10;
        this.f132335l = rVar;
        this.f132336m = address;
        this.f132337n = str11;
        this.o = str12;
        this.f132338p = str13;
        this.f132339q = tVar;
        this.f132340r = str14;
        this.f132341s = bool;
        this.f132342t = eVar;
        this.u = map;
        this.v = bVar;
        this.f132343w = settings;
        this.f132344x = z;
        this.f132345y = i;
        this.z = j2;
        this.A = str15;
        this.B = beneficiaryIdentification;
        this.C = str16;
        this.D = instant;
        this.E = str17;
    }

    public static a a(a aVar, int i, long j2, String str, int i2) {
        boolean z;
        int i3;
        String str2;
        long j3;
        String id10 = aVar.f132329a;
        String str3 = aVar.f132330b;
        String str4 = aVar.f132331c;
        String str5 = aVar.d;
        String str6 = aVar.e;
        String str7 = aVar.f;
        String str8 = aVar.f132332g;
        String str9 = aVar.f132333h;
        String str10 = aVar.i;
        String str11 = aVar.f132334j;
        String str12 = aVar.k;
        r rVar = aVar.f132335l;
        Address address = aVar.f132336m;
        String str13 = aVar.f132337n;
        String str14 = aVar.o;
        String str15 = aVar.f132338p;
        t tVar = aVar.f132339q;
        String str16 = aVar.f132340r;
        Boolean bool = aVar.f132341s;
        e eVar = aVar.f132342t;
        Map map = aVar.u;
        b bVar = aVar.v;
        List settings = aVar.f132343w;
        boolean z3 = aVar.f132344x;
        if ((i2 & 16777216) != 0) {
            z = z3;
            i3 = aVar.f132345y;
        } else {
            z = z3;
            i3 = i;
        }
        int i5 = i3;
        if ((i2 & 33554432) != 0) {
            str2 = str5;
            j3 = aVar.z;
        } else {
            str2 = str5;
            j3 = j2;
        }
        long j5 = j3;
        String str17 = (i2 & 67108864) != 0 ? aVar.A : str;
        BeneficiaryIdentification beneficiaryIdentification = aVar.B;
        String str18 = aVar.C;
        Instant instant = aVar.D;
        String str19 = aVar.E;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new a(id10, str3, str4, str2, str6, str7, str8, str9, str10, str11, str12, rVar, address, str13, str14, str15, tVar, str16, bool, eVar, map, bVar, settings, z, i5, j5, str17, beneficiaryIdentification, str18, instant, str19);
    }

    public final String b() {
        return this.f132330b;
    }

    public final boolean c() {
        String strB = c.b(this);
        wi0.b.Companion.getClass();
        wi0.a aVar = wi0.b.Companion;
        if (!Intrinsics.f(strB, "HR")) {
            return false;
        }
        xi0.b.Companion.getClass();
        return Intrinsics.f(this.f132337n, xi0.b.f306279q.f306286a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f132329a, aVar.f132329a) && Intrinsics.f(this.f132330b, aVar.f132330b) && Intrinsics.f(this.f132331c, aVar.f132331c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f132332g, aVar.f132332g) && Intrinsics.f(this.f132333h, aVar.f132333h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f132334j, aVar.f132334j) && Intrinsics.f(this.k, aVar.k) && this.f132335l == aVar.f132335l && Intrinsics.f(this.f132336m, aVar.f132336m) && Intrinsics.f(this.f132337n, aVar.f132337n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f132338p, aVar.f132338p) && this.f132339q == aVar.f132339q && Intrinsics.f(this.f132340r, aVar.f132340r) && Intrinsics.f(this.f132341s, aVar.f132341s) && this.f132342t == aVar.f132342t && Intrinsics.f(this.u, aVar.u) && Intrinsics.f(this.v, aVar.v) && Intrinsics.f(this.f132343w, aVar.f132343w) && this.f132344x == aVar.f132344x && this.f132345y == aVar.f132345y && this.z == aVar.z && Intrinsics.f(this.A, aVar.A) && Intrinsics.f(this.B, aVar.B) && Intrinsics.f(this.C, aVar.C) && Intrinsics.f(this.D, aVar.D) && Intrinsics.f(this.E, aVar.E);
    }

    public final String getId() {
        return this.f132329a;
    }

    public final int hashCode() {
        int iHashCode = this.f132329a.hashCode() * 31;
        String str = this.f132330b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132331c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132332g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132333h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f132334j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        r rVar = this.f132335l;
        int iHashCode12 = (iHashCode11 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Address address = this.f132336m;
        int iHashCode13 = (iHashCode12 + (address == null ? 0 : address.hashCode())) * 31;
        String str11 = this.f132337n;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.o;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f132338p;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        t tVar = this.f132339q;
        int iHashCode17 = (iHashCode16 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str14 = this.f132340r;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.f132341s;
        int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        e eVar = this.f132342t;
        int iHashCode20 = (iHashCode19 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Map map = this.u;
        int iHashCode21 = (iHashCode20 + (map == null ? 0 : map.hashCode())) * 31;
        b bVar = this.v;
        int iC = a0.d.c(j6.a.b(this.f132345y, j6.a.c(p.a.d((iHashCode21 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f132343w), 31, this.f132344x), 31), 31, this.z);
        String str15 = this.A;
        int iHashCode22 = (iC + (str15 == null ? 0 : str15.hashCode())) * 31;
        BeneficiaryIdentification beneficiaryIdentification = this.B;
        int iHashCode23 = (iHashCode22 + (beneficiaryIdentification == null ? 0 : beneficiaryIdentification.hashCode())) * 31;
        String str16 = this.C;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Instant instant = this.D;
        int iHashCode25 = (iHashCode24 + (instant == null ? 0 : instant.hashCode())) * 31;
        String str17 = this.E;
        return iHashCode25 + (str17 != null ? str17.hashCode() : 0);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, r rVar, Address address, String str12, String str13, String str14, t tVar, String str15, Boolean bool, e eVar, Map map, b bVar, List list, boolean z, int i, long j2, String str16, BeneficiaryIdentification beneficiaryIdentification, Instant instant, String str17, int i2) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, str4, str5, str6, (i2 & 64) != 0 ? null : str7, str8, (i2 & 256) != 0 ? null : str9, (i2 & 512) != 0 ? null : str10, (i2 & 1024) != 0 ? null : str11, rVar, address, str12, str13, (32768 & i2) != 0 ? null : str14, (65536 & i2) != 0 ? null : tVar, str15, (262144 & i2) != 0 ? null : bool, (524288 & i2) != 0 ? null : eVar, map, bVar, (4194304 & i2) != 0 ? f0.f322471a : list, (8388608 & i2) != 0 ? false : z, (16777216 & i2) != 0 ? 0 : i, (33554432 & i2) != 0 ? 0L : j2, (67108864 & i2) != 0 ? null : str16, (134217728 & i2) != 0 ? null : beneficiaryIdentification, (String) null, (536870912 & i2) != 0 ? null : instant, (i2 & 1073741824) != 0 ? null : str17);
    }
}
