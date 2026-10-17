package ks6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189163c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f189164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f189165h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f189166j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jo3.b f189167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jo3.b f189168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jo3.b f189169n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f189170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f189171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f189172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m0 f189173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f189174t;
    public final List u;
    public final long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f189175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f189176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f189177y;

    public i0(String id10, String state, String description, String channel, String str, String type, h0 h0Var, j0 j0Var, String str2, long j2, String currency, jo3.b bVar, jo3.b bVar2, jo3.b bVar3, String str3, String str4, List list, List list2, m0 m0Var, List list3, List list4, long j3, long j5, long j16, List list5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f189161a = id10;
        this.f189162b = state;
        this.f189163c = description;
        this.d = channel;
        this.e = str;
        this.f = type;
        this.f189164g = h0Var;
        this.f189165h = j0Var;
        this.i = str2;
        this.f189166j = j2;
        this.k = currency;
        this.f189167l = bVar;
        this.f189168m = bVar2;
        this.f189169n = bVar3;
        this.o = str3;
        this.f189170p = str4;
        this.f189171q = list;
        this.f189172r = list2;
        this.f189173s = m0Var;
        this.f189174t = list3;
        this.u = list4;
        this.v = j3;
        this.f189175w = j5;
        this.f189176x = j16;
        this.f189177y = list5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f189161a, i0Var.f189161a) && Intrinsics.f(this.f189162b, i0Var.f189162b) && Intrinsics.f(this.f189163c, i0Var.f189163c) && Intrinsics.f(this.d, i0Var.d) && Intrinsics.f(this.e, i0Var.e) && Intrinsics.f(this.f, i0Var.f) && Intrinsics.f(this.f189164g, i0Var.f189164g) && Intrinsics.f(this.f189165h, i0Var.f189165h) && Intrinsics.f(this.i, i0Var.i) && this.f189166j == i0Var.f189166j && Intrinsics.f(this.k, i0Var.k) && Intrinsics.f(this.f189167l, i0Var.f189167l) && Intrinsics.f(this.f189168m, i0Var.f189168m) && Intrinsics.f(this.f189169n, i0Var.f189169n) && Intrinsics.f(this.o, i0Var.o) && Intrinsics.f(this.f189170p, i0Var.f189170p) && Intrinsics.f(this.f189171q, i0Var.f189171q) && Intrinsics.f(this.f189172r, i0Var.f189172r) && Intrinsics.f(this.f189173s, i0Var.f189173s) && Intrinsics.f(this.f189174t, i0Var.f189174t) && Intrinsics.f(this.u, i0Var.u) && this.v == i0Var.v && this.f189175w == i0Var.f189175w && this.f189176x == i0Var.f189176x && Intrinsics.f(this.f189177y, i0Var.f189177y);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f189161a.hashCode() * 31, 31, this.f189162b), 31, this.f189163c), 31, this.d);
        String str = this.e;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        h0 h0Var = this.f189164g;
        int iHashCode = (iC2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        j0 j0Var = this.f189165h;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        String str2 = this.i;
        int iC3 = p.a.c(a0.d.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f189166j), 31, this.k);
        jo3.b bVar = this.f189167l;
        int iHashCode3 = (iC3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.f189168m;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.f189169n;
        int iHashCode5 = (iHashCode4 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f189170p;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f189171q;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f189172r;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        m0 m0Var = this.f189173s;
        int iHashCode10 = (iHashCode9 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        List list3 = this.f189174t;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.u;
        int iC4 = a0.d.c(a0.d.c(a0.d.c((iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31, 31, this.v), 31, this.f189175w), 31, this.f189176x);
        List list5 = this.f189177y;
        return iC4 + (list5 != null ? list5.hashCode() : 0);
    }
}
