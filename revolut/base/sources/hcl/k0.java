package hcl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151031c;
    public final String d;
    public final String e;
    public final n0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a3 f151032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d3 f151033h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f151034j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f151035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f151036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f151037n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f151038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f151039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f151040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l0 f151041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f151042t;
    public final Long u;

    public k0(String id10, String ref2, String type, String name, String symbol, n0 stateDetails, a3 a3Var, d3 d3Var, String currency, Integer num, String str, String exchange, String str2, int i, Integer num2, List allSymbols, String str3, List list, l0 l0Var, String str4, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(stateDetails, "stateDetails");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(allSymbols, "allSymbols");
        this.f151029a = id10;
        this.f151030b = ref2;
        this.f151031c = type;
        this.d = name;
        this.e = symbol;
        this.f = stateDetails;
        this.f151032g = a3Var;
        this.f151033h = d3Var;
        this.i = currency;
        this.f151034j = num;
        this.k = str;
        this.f151035l = exchange;
        this.f151036m = str2;
        this.f151037n = i;
        this.o = num2;
        this.f151038p = allSymbols;
        this.f151039q = str3;
        this.f151040r = list;
        this.f151041s = l0Var;
        this.f151042t = str4;
        this.u = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f151029a, k0Var.f151029a) && Intrinsics.f(this.f151030b, k0Var.f151030b) && Intrinsics.f(this.f151031c, k0Var.f151031c) && Intrinsics.f(this.d, k0Var.d) && Intrinsics.f(this.e, k0Var.e) && Intrinsics.f(this.f, k0Var.f) && Intrinsics.f(this.f151032g, k0Var.f151032g) && Intrinsics.f(this.f151033h, k0Var.f151033h) && Intrinsics.f(this.i, k0Var.i) && Intrinsics.f(this.f151034j, k0Var.f151034j) && Intrinsics.f(this.k, k0Var.k) && Intrinsics.f(this.f151035l, k0Var.f151035l) && Intrinsics.f(this.f151036m, k0Var.f151036m) && this.f151037n == k0Var.f151037n && Intrinsics.f(this.o, k0Var.o) && Intrinsics.f(this.f151038p, k0Var.f151038p) && Intrinsics.f(this.f151039q, k0Var.f151039q) && Intrinsics.f(this.f151040r, k0Var.f151040r) && Intrinsics.f(this.f151041s, k0Var.f151041s) && Intrinsics.f(this.f151042t, k0Var.f151042t) && Intrinsics.f(this.u, k0Var.u);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f151029a.hashCode() * 31, 31, this.f151030b), 31, this.f151031c), 31, this.d), 31, this.e)) * 31;
        a3 a3Var = this.f151032g;
        int iHashCode2 = (iHashCode + (a3Var == null ? 0 : a3Var.hashCode())) * 31;
        d3 d3Var = this.f151033h;
        int iC = p.a.c((iHashCode2 + (d3Var == null ? 0 : d3Var.hashCode())) * 31, 31, this.i);
        Integer num = this.f151034j;
        int iHashCode3 = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.k;
        int iC2 = p.a.c((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f151035l);
        String str2 = this.f151036m;
        int iB = j6.a.b(this.f151037n, (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num2 = this.o;
        int iD = p.a.d((iB + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f151038p);
        String str3 = this.f151039q;
        int iHashCode4 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f151040r;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        l0 l0Var = this.f151041s;
        int iHashCode6 = (iHashCode5 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str4 = this.f151042t;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.u;
        return iHashCode7 + (l2 != null ? l2.hashCode() : 0);
    }
}
