package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f272705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f272706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272707c;
    public final String d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f272708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f272709h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f272710j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f272711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f272712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f272713n;
    public final Long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f272714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Long f272715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Long f272716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Long f272717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f272718t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f272719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g1 f272720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b95.a f272721y;

    public e1(d1 d1Var, f1 f1Var, String str, String str2, Long l2, Long l3, Long l4, Long l5, Long l22, Long l31, Long l37, Long l39, Long l51, Long l52, Long l60, Long l66, Long l69, Long l79, Long l81, Long l82, String str3, String str4, String str5, g1 g1Var, b95.a aVar) {
        this.f272705a = d1Var;
        this.f272706b = f1Var;
        this.f272707c = str;
        this.d = str2;
        this.e = l2;
        this.f = l3;
        this.f272708g = l4;
        this.f272709h = l5;
        this.i = l22;
        this.f272710j = l31;
        this.k = l37;
        this.f272711l = l39;
        this.f272712m = l51;
        this.f272713n = l52;
        this.o = l60;
        this.f272714p = l66;
        this.f272715q = l69;
        this.f272716r = l79;
        this.f272717s = l81;
        this.f272718t = l82;
        this.u = str3;
        this.v = str4;
        this.f272719w = str5;
        this.f272720x = g1Var;
        this.f272721y = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return this.f272705a == e1Var.f272705a && this.f272706b == e1Var.f272706b && Intrinsics.f(this.f272707c, e1Var.f272707c) && Intrinsics.f(this.d, e1Var.d) && Intrinsics.f(this.e, e1Var.e) && Intrinsics.f(this.f, e1Var.f) && Intrinsics.f(this.f272708g, e1Var.f272708g) && Intrinsics.f(this.f272709h, e1Var.f272709h) && Intrinsics.f(this.i, e1Var.i) && Intrinsics.f(this.f272710j, e1Var.f272710j) && Intrinsics.f(this.k, e1Var.k) && Intrinsics.f(this.f272711l, e1Var.f272711l) && Intrinsics.f(this.f272712m, e1Var.f272712m) && Intrinsics.f(this.f272713n, e1Var.f272713n) && Intrinsics.f(this.o, e1Var.o) && Intrinsics.f(this.f272714p, e1Var.f272714p) && Intrinsics.f(this.f272715q, e1Var.f272715q) && Intrinsics.f(this.f272716r, e1Var.f272716r) && Intrinsics.f(this.f272717s, e1Var.f272717s) && Intrinsics.f(this.f272718t, e1Var.f272718t) && Intrinsics.f(this.u, e1Var.u) && Intrinsics.f(this.v, e1Var.v) && Intrinsics.f(this.f272719w, e1Var.f272719w) && Intrinsics.f(this.f272720x, e1Var.f272720x) && this.f272721y == e1Var.f272721y;
    }

    public final int hashCode() {
        d1 d1Var = this.f272705a;
        int iHashCode = (d1Var == null ? 0 : d1Var.hashCode()) * 31;
        f1 f1Var = this.f272706b;
        int iHashCode2 = (iHashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        String str = this.f272707c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f272708g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f272709h;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.i;
        int iHashCode9 = (iHashCode8 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.f272710j;
        int iHashCode10 = (iHashCode9 + (l31 == null ? 0 : l31.hashCode())) * 31;
        Long l37 = this.k;
        int iHashCode11 = (iHashCode10 + (l37 == null ? 0 : l37.hashCode())) * 31;
        Long l39 = this.f272711l;
        int iHashCode12 = (iHashCode11 + (l39 == null ? 0 : l39.hashCode())) * 31;
        Long l51 = this.f272712m;
        int iHashCode13 = (iHashCode12 + (l51 == null ? 0 : l51.hashCode())) * 31;
        Long l52 = this.f272713n;
        int iHashCode14 = (iHashCode13 + (l52 == null ? 0 : l52.hashCode())) * 31;
        Long l60 = this.o;
        int iHashCode15 = (iHashCode14 + (l60 == null ? 0 : l60.hashCode())) * 31;
        Long l66 = this.f272714p;
        int iHashCode16 = (iHashCode15 + (l66 == null ? 0 : l66.hashCode())) * 31;
        Long l69 = this.f272715q;
        int iHashCode17 = (iHashCode16 + (l69 == null ? 0 : l69.hashCode())) * 31;
        Long l79 = this.f272716r;
        int iHashCode18 = (iHashCode17 + (l79 == null ? 0 : l79.hashCode())) * 31;
        Long l81 = this.f272717s;
        int iHashCode19 = (iHashCode18 + (l81 == null ? 0 : l81.hashCode())) * 31;
        Long l82 = this.f272718t;
        int iHashCode20 = (iHashCode19 + (l82 == null ? 0 : l82.hashCode())) * 31;
        String str3 = this.u;
        int iHashCode21 = (iHashCode20 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.v;
        int iHashCode22 = (iHashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f272719w;
        int iHashCode23 = (iHashCode22 + (str5 == null ? 0 : str5.hashCode())) * 31;
        g1 g1Var = this.f272720x;
        int iHashCode24 = (iHashCode23 + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        b95.a aVar = this.f272721y;
        return iHashCode24 + (aVar != null ? aVar.hashCode() : 0);
    }
}
