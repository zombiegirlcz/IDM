package br0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f17861c;
    public final Integer d;
    public final Boolean e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17863h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17864j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f17865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f17866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f17867n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f17869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f17870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f17871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f17872t;
    public final boolean u;

    public a(boolean z, boolean z3, Boolean bool, Integer num, Boolean bool2, Boolean bool3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83, boolean z89, boolean z96, boolean z100, boolean z101) {
        this.f17859a = z;
        this.f17860b = z3;
        this.f17861c = bool;
        this.d = num;
        this.e = bool2;
        this.f = bool3;
        this.f17862g = z4;
        this.f17863h = z6;
        this.i = z11;
        this.f17864j = z12;
        this.k = z29;
        this.f17865l = z31;
        this.f17866m = z41;
        this.f17867n = z49;
        this.o = z54;
        this.f17868p = z74;
        this.f17869q = z83;
        this.f17870r = z89;
        this.f17871s = z96;
        this.f17872t = z100;
        this.u = z101;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f17859a == aVar.f17859a && this.f17860b == aVar.f17860b && Intrinsics.f(this.f17861c, aVar.f17861c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f17862g == aVar.f17862g && this.f17863h == aVar.f17863h && this.i == aVar.i && this.f17864j == aVar.f17864j && this.k == aVar.k && this.f17865l == aVar.f17865l && this.f17866m == aVar.f17866m && this.f17867n == aVar.f17867n && this.o == aVar.o && this.f17868p == aVar.f17868p && this.f17869q == aVar.f17869q && this.f17870r == aVar.f17870r && this.f17871s == aVar.f17871s && this.f17872t == aVar.f17872t && this.u == aVar.u;
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f17859a) * 31, 31, this.f17860b);
        Boolean bool = this.f17861c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        return Boolean.hashCode(this.u) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31, 31, this.f17862g), 31, this.f17863h), 31, this.i), 31, this.f17864j), 31, this.k), 31, this.f17865l), 31, this.f17866m), 31, this.f17867n), 31, this.o), 31, this.f17868p), 31, this.f17869q), 31, this.f17870r), 31, this.f17871s), 31, this.f17872t);
    }
}
