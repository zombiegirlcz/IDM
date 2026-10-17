package a9g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2597c;
    public final d1 d;
    public final u0 e;
    public final f1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f2 f2598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f2599h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w0 f2600j;
    public final h1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f2602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2603n;
    public final r0 o;

    public v0(String id10, String status, String bookingReference, d1 traveller, u0 dates, f1 property, f2 pricing, r rVar, List rooms, w0 payment, h1 h1Var, String str, List list, String str2, r0 r0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(bookingReference, "bookingReference");
        Intrinsics.checkNotNullParameter(traveller, "traveller");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f2595a = id10;
        this.f2596b = status;
        this.f2597c = bookingReference;
        this.d = traveller;
        this.e = dates;
        this.f = property;
        this.f2598g = pricing;
        this.f2599h = rVar;
        this.i = rooms;
        this.f2600j = payment;
        this.k = h1Var;
        this.f2601l = str;
        this.f2602m = list;
        this.f2603n = str2;
        this.o = r0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f2595a, v0Var.f2595a) && Intrinsics.f(this.f2596b, v0Var.f2596b) && Intrinsics.f(this.f2597c, v0Var.f2597c) && Intrinsics.f(this.d, v0Var.d) && Intrinsics.f(this.e, v0Var.e) && Intrinsics.f(this.f, v0Var.f) && Intrinsics.f(this.f2598g, v0Var.f2598g) && Intrinsics.f(this.f2599h, v0Var.f2599h) && Intrinsics.f(this.i, v0Var.i) && Intrinsics.f(this.f2600j, v0Var.f2600j) && Intrinsics.f(this.k, v0Var.k) && Intrinsics.f(this.f2601l, v0Var.f2601l) && Intrinsics.f(this.f2602m, v0Var.f2602m) && Intrinsics.f(this.f2603n, v0Var.f2603n) && Intrinsics.f(this.o, v0Var.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f2598g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f2595a.hashCode() * 31, 31, this.f2596b), 31, this.f2597c)) * 31)) * 31)) * 31)) * 31;
        r rVar = this.f2599h;
        int iHashCode2 = (this.f2600j.hashCode() + p.a.d((iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.i)) * 31;
        h1 h1Var = this.k;
        int iHashCode3 = (iHashCode2 + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        String str = this.f2601l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f2602m;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f2603n;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r0 r0Var = this.o;
        return iHashCode6 + (r0Var != null ? r0Var.hashCode() : 0);
    }
}
