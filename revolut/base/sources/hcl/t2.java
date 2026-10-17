package hcl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151165c;
    public final String d;
    public final h2 e;
    public final b2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f151166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f151167h;
    public final c2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f151168j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d2 f151169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f151170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f151171n;
    public final k2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f151172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i2 f151173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o2 f151174r;

    public t2(String ref2, String symbol, String stockExchangeCode, String str, h2 lifecycle, b2 b2Var, z1 z1Var, a2 a2Var, c2 c2Var, List keyDrivers, List underlyingAssets, d2 issuer, List list, List list2, k2 k2Var, List list3, i2 i2Var, o2 o2Var) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(keyDrivers, "keyDrivers");
        Intrinsics.checkNotNullParameter(underlyingAssets, "underlyingAssets");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        this.f151163a = ref2;
        this.f151164b = symbol;
        this.f151165c = stockExchangeCode;
        this.d = str;
        this.e = lifecycle;
        this.f = b2Var;
        this.f151166g = z1Var;
        this.f151167h = a2Var;
        this.i = c2Var;
        this.f151168j = keyDrivers;
        this.k = underlyingAssets;
        this.f151169l = issuer;
        this.f151170m = list;
        this.f151171n = list2;
        this.o = k2Var;
        this.f151172p = list3;
        this.f151173q = i2Var;
        this.f151174r = o2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return Intrinsics.f(this.f151163a, t2Var.f151163a) && Intrinsics.f(this.f151164b, t2Var.f151164b) && Intrinsics.f(this.f151165c, t2Var.f151165c) && Intrinsics.f(this.d, t2Var.d) && Intrinsics.f(this.e, t2Var.e) && Intrinsics.f(this.f, t2Var.f) && Intrinsics.f(this.f151166g, t2Var.f151166g) && Intrinsics.f(this.f151167h, t2Var.f151167h) && Intrinsics.f(this.i, t2Var.i) && Intrinsics.f(this.f151168j, t2Var.f151168j) && Intrinsics.f(this.k, t2Var.k) && Intrinsics.f(this.f151169l, t2Var.f151169l) && Intrinsics.f(this.f151170m, t2Var.f151170m) && Intrinsics.f(this.f151171n, t2Var.f151171n) && Intrinsics.f(this.o, t2Var.o) && Intrinsics.f(this.f151172p, t2Var.f151172p) && Intrinsics.f(this.f151173q, t2Var.f151173q) && Intrinsics.f(this.f151174r, t2Var.f151174r);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f151163a.hashCode() * 31, 31, this.f151164b), 31, this.f151165c);
        String str = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        b2 b2Var = this.f;
        int iHashCode2 = (iHashCode + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        z1 z1Var = this.f151166g;
        int iHashCode3 = (iHashCode2 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        a2 a2Var = this.f151167h;
        int iHashCode4 = (iHashCode3 + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        c2 c2Var = this.i;
        int iHashCode5 = (this.f151169l.hashCode() + p.a.d(p.a.d((iHashCode4 + (c2Var == null ? 0 : c2Var.hashCode())) * 31, 31, this.f151168j), 31, this.k)) * 31;
        List list = this.f151170m;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f151171n;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        k2 k2Var = this.o;
        int iHashCode8 = (iHashCode7 + (k2Var == null ? 0 : k2Var.hashCode())) * 31;
        List list3 = this.f151172p;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        i2 i2Var = this.f151173q;
        int iHashCode10 = (iHashCode9 + (i2Var == null ? 0 : i2Var.hashCode())) * 31;
        o2 o2Var = this.f151174r;
        return iHashCode10 + (o2Var != null ? o2Var.hashCode() : 0);
    }
}
