package f2e;

import java.time.Instant;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x {
    public static final Lazy[] A;

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131747c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f131748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f131749h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f131750j;
    public final Double k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f131751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a0 f131752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f131753n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f131754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f131755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f131756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f131757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f131758t;
    public final List u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j0 f131759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Instant f131760x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d0 f131761y;
    public final a2 z;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        A = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, yhm.j.c(kVar, new i(2)), yhm.j.c(kVar, new i(3)), null, null, null, null};
    }

    public /* synthetic */ x(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, Double d, Double d5, a0 a0Var, r rVar, boolean z3, boolean z4, boolean z6, u uVar, String str10, String str11, List list, List list2, j0 j0Var, Instant instant, d0 d0Var, a2 a2Var) {
        if (57 != (i & 57)) {
            qlm.j1.f(v.f131727a.getDescriptor(), i, 57);
            throw null;
        }
        this.f131745a = str;
        if ((i & 2) == 0) {
            this.f131746b = null;
        } else {
            this.f131746b = str2;
        }
        if ((i & 4) == 0) {
            this.f131747c = null;
        } else {
            this.f131747c = str3;
        }
        this.d = str4;
        this.e = str5;
        this.f = str6;
        if ((i & 64) == 0) {
            this.f131748g = false;
        } else {
            this.f131748g = z;
        }
        if ((i & 128) == 0) {
            this.f131749h = null;
        } else {
            this.f131749h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.f131750j = null;
        } else {
            this.f131750j = str9;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = d;
        }
        if ((i & 2048) == 0) {
            this.f131751l = null;
        } else {
            this.f131751l = d5;
        }
        if ((i & 4096) == 0) {
            this.f131752m = null;
        } else {
            this.f131752m = a0Var;
        }
        if ((i & 8192) == 0) {
            this.f131753n = null;
        } else {
            this.f131753n = rVar;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z3;
        }
        if ((32768 & i) == 0) {
            this.f131754p = false;
        } else {
            this.f131754p = z4;
        }
        if ((65536 & i) == 0) {
            this.f131755q = false;
        } else {
            this.f131755q = z6;
        }
        if ((131072 & i) == 0) {
            this.f131756r = null;
        } else {
            this.f131756r = uVar;
        }
        if ((262144 & i) == 0) {
            this.f131757s = null;
        } else {
            this.f131757s = str10;
        }
        if ((524288 & i) == 0) {
            this.f131758t = null;
        } else {
            this.f131758t = str11;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = list;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = list2;
        }
        if ((4194304 & i) == 0) {
            this.f131759w = null;
        } else {
            this.f131759w = j0Var;
        }
        if ((8388608 & i) == 0) {
            this.f131760x = null;
        } else {
            this.f131760x = instant;
        }
        if ((16777216 & i) == 0) {
            this.f131761y = null;
        } else {
            this.f131761y = d0Var;
        }
        if ((i & 33554432) == 0) {
            this.z = null;
        } else {
            this.z = a2Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f131745a, xVar.f131745a) && Intrinsics.f(this.f131746b, xVar.f131746b) && Intrinsics.f(this.f131747c, xVar.f131747c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && this.f131748g == xVar.f131748g && Intrinsics.f(this.f131749h, xVar.f131749h) && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f131750j, xVar.f131750j) && Intrinsics.f(this.k, xVar.k) && Intrinsics.f(this.f131751l, xVar.f131751l) && Intrinsics.f(this.f131752m, xVar.f131752m) && Intrinsics.f(this.f131753n, xVar.f131753n) && this.o == xVar.o && this.f131754p == xVar.f131754p && this.f131755q == xVar.f131755q && Intrinsics.f(this.f131756r, xVar.f131756r) && Intrinsics.f(this.f131757s, xVar.f131757s) && Intrinsics.f(this.f131758t, xVar.f131758t) && Intrinsics.f(this.u, xVar.u) && Intrinsics.f(this.v, xVar.v) && Intrinsics.f(this.f131759w, xVar.f131759w) && Intrinsics.f(this.f131760x, xVar.f131760x) && Intrinsics.f(this.f131761y, xVar.f131761y) && Intrinsics.f(this.z, xVar.z);
    }

    public final int hashCode() {
        int iHashCode = this.f131745a.hashCode() * 31;
        String str = this.f131746b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f131747c;
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f131748g);
        String str3 = this.f131749h;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f131750j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.k;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f131751l;
        int iHashCode7 = (iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        a0 a0Var = this.f131752m;
        int iHashCode8 = (iHashCode7 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        r rVar = this.f131753n;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode8 + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.o), 31, this.f131754p), 31, this.f131755q);
        u uVar = this.f131756r;
        int iHashCode9 = (iC2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str6 = this.f131757s;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f131758t;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.u;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.v;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        j0 j0Var = this.f131759w;
        int iHashCode14 = (iHashCode13 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        Instant instant = this.f131760x;
        int iHashCode15 = (iHashCode14 + (instant == null ? 0 : instant.hashCode())) * 31;
        d0 d0Var = this.f131761y;
        int iHashCode16 = (iHashCode15 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        a2 a2Var = this.z;
        return iHashCode16 + (a2Var != null ? a2Var.hashCode() : 0);
    }

    public x(String id10, String str, String str2, String brandId, String name, String logoUrl, boolean z, String str3, String str4, String str5, Double d, Double d5, a0 a0Var, r rVar, boolean z3, boolean z4, boolean z6, u uVar, String str6, String str7, List list, List list2, j0 j0Var, Instant instant, d0 d0Var, a2 a2Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f131745a = id10;
        this.f131746b = str;
        this.f131747c = str2;
        this.d = brandId;
        this.e = name;
        this.f = logoUrl;
        this.f131748g = z;
        this.f131749h = str3;
        this.i = str4;
        this.f131750j = str5;
        this.k = d;
        this.f131751l = d5;
        this.f131752m = a0Var;
        this.f131753n = rVar;
        this.o = z3;
        this.f131754p = z4;
        this.f131755q = z6;
        this.f131756r = uVar;
        this.f131757s = str6;
        this.f131758t = str7;
        this.u = list;
        this.v = list2;
        this.f131759w = j0Var;
        this.f131760x = instant;
        this.f131761y = d0Var;
        this.z = a2Var;
    }
}
