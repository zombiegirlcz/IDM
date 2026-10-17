package o45;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f222123c;
    public final LocalDate d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f222124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f222125h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f222126j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f222127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f222128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f1 f222129n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f222130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f222131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v0 f222132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f0 f222133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b1 f222134t;
    public final c0 u;
    public final y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p0 f222135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j0 f222136x;

    public w1(String id10, String name, LocalDate disbursalDate, LocalDate finalRepaymentDate, String currency, String countryCode, long j2, long j3, Long l2, Long l3, long j5, long j16, double d, f1 state, String product, int i, int i2, v0 interestRate, f0 f0Var, b1 b1Var, c0 config, y0 y0Var, p0 p0Var, j0 j0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(finalRepaymentDate, "finalRepaymentDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f222121a = id10;
        this.f222122b = name;
        this.f222123c = disbursalDate;
        this.d = finalRepaymentDate;
        this.e = currency;
        this.f = countryCode;
        this.f222124g = j2;
        this.f222125h = j3;
        this.i = l2;
        this.f222126j = l3;
        this.k = j5;
        this.f222127l = j16;
        this.f222128m = d;
        this.f222129n = state;
        this.o = product;
        this.f222130p = i;
        this.f222131q = i2;
        this.f222132r = interestRate;
        this.f222133s = f0Var;
        this.f222134t = b1Var;
        this.u = config;
        this.v = y0Var;
        this.f222135w = p0Var;
        this.f222136x = j0Var;
    }

    public final c0 a() {
        return this.u;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final LocalDate d() {
        return this.f222123c;
    }

    public final LocalDate e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f222121a, w1Var.f222121a) && Intrinsics.f(this.f222122b, w1Var.f222122b) && Intrinsics.f(this.f222123c, w1Var.f222123c) && Intrinsics.f(this.d, w1Var.d) && Intrinsics.f(this.e, w1Var.e) && Intrinsics.f(this.f, w1Var.f) && this.f222124g == w1Var.f222124g && this.f222125h == w1Var.f222125h && Intrinsics.f(this.i, w1Var.i) && Intrinsics.f(this.f222126j, w1Var.f222126j) && this.k == w1Var.k && this.f222127l == w1Var.f222127l && Double.compare(this.f222128m, w1Var.f222128m) == 0 && Intrinsics.f(this.f222129n, w1Var.f222129n) && Intrinsics.f(this.o, w1Var.o) && this.f222130p == w1Var.f222130p && this.f222131q == w1Var.f222131q && Intrinsics.f(this.f222132r, w1Var.f222132r) && Intrinsics.f(this.f222133s, w1Var.f222133s) && Intrinsics.f(this.f222134t, w1Var.f222134t) && Intrinsics.f(this.u, w1Var.u) && Intrinsics.f(this.v, w1Var.v) && Intrinsics.f(this.f222135w, w1Var.f222135w) && Intrinsics.f(this.f222136x, w1Var.f222136x);
    }

    public final Long f() {
        return this.f222126j;
    }

    public final double g() {
        return this.f222128m;
    }

    public final String h() {
        return this.f222121a;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(p.a.c(p.a.c(wp5.y.a(wp5.y.a(p.a.c(this.f222121a.hashCode() * 31, 31, this.f222122b), 31, this.f222123c), 31, this.d), 31, this.e), 31, this.f), 31, this.f222124g), 31, this.f222125h);
        Long l2 = this.i;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f222126j;
        int iHashCode2 = (this.f222132r.hashCode() + j6.a.b(this.f222131q, j6.a.b(this.f222130p, p.a.c((this.f222129n.hashCode() + m72.b.c(a0.d.c(a0.d.c((iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.k), 31, this.f222127l), this.f222128m, 31)) * 31, 31, this.o), 31), 31)) * 31;
        f0 f0Var = this.f222133s;
        int iHashCode3 = (iHashCode2 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        b1 b1Var = this.f222134t;
        int iHashCode4 = (this.u.hashCode() + ((iHashCode3 + (b1Var == null ? 0 : b1Var.hashCode())) * 31)) * 31;
        y0 y0Var = this.v;
        int iHashCode5 = (iHashCode4 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        p0 p0Var = this.f222135w;
        int iHashCode6 = (iHashCode5 + (p0Var == null ? 0 : Integer.hashCode(p0Var.f222091a))) * 31;
        j0 j0Var = this.f222136x;
        return iHashCode6 + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final j0 i() {
        return this.f222136x;
    }

    public final p0 j() {
        return this.f222135w;
    }

    public final v0 k() {
        return this.f222132r;
    }

    public final b1 l() {
        return this.f222134t;
    }

    public final String m() {
        return this.f222122b;
    }

    public final f0 n() {
        return this.f222133s;
    }

    public final long o() {
        return this.f222125h;
    }

    public final Long p() {
        return this.i;
    }

    public final long q() {
        return this.f222124g;
    }

    public final String r() {
        return this.o;
    }

    public final y0 s() {
        return this.v;
    }

    public final int t() {
        return this.f222131q;
    }

    public final int u() {
        return this.f222130p;
    }

    public final f1 v() {
        return this.f222129n;
    }

    public final long w() {
        return this.k;
    }

    public final long x() {
        return this.f222127l;
    }
}
