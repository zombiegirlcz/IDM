package kr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class n2 {

    @NotNull
    public static final m2 Companion = new m2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f188540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f188541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f188542c;
    public final double d;
    public final double e;
    public final double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f188543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f188544h;
    public final double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f188545j;
    public final double k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f188546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f188547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final double f188548n;

    public /* synthetic */ n2(int i, long j2, double d, double d5, double d6, double d10, double d15, double d41, double d51, double d68, double d81, double d82, double d95, double d100, double d101) {
        if (16383 != (i & 16383)) {
            qlm.j1.f(l2.f188524a.getDescriptor(), i, 16383);
            throw null;
        }
        this.f188540a = j2;
        this.f188541b = d;
        this.f188542c = d5;
        this.d = d6;
        this.e = d10;
        this.f = d15;
        this.f188543g = d41;
        this.f188544h = d51;
        this.i = d68;
        this.f188545j = d81;
        this.k = d82;
        this.f188546l = d95;
        this.f188547m = d100;
        this.f188548n = d101;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return this.f188540a == n2Var.f188540a && Double.compare(this.f188541b, n2Var.f188541b) == 0 && Double.compare(this.f188542c, n2Var.f188542c) == 0 && Double.compare(this.d, n2Var.d) == 0 && Double.compare(this.e, n2Var.e) == 0 && Double.compare(this.f, n2Var.f) == 0 && Double.compare(this.f188543g, n2Var.f188543g) == 0 && Double.compare(this.f188544h, n2Var.f188544h) == 0 && Double.compare(this.i, n2Var.i) == 0 && Double.compare(this.f188545j, n2Var.f188545j) == 0 && Double.compare(this.k, n2Var.k) == 0 && Double.compare(this.f188546l, n2Var.f188546l) == 0 && Double.compare(this.f188547m, n2Var.f188547m) == 0 && Double.compare(this.f188548n, n2Var.f188548n) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f188548n) + m72.b.c(m72.b.c(m72.b.c(m72.b.c(m72.b.c(m72.b.c(m72.b.c(m72.b.c(m72.b.c(m72.b.c(m72.b.c(m72.b.c(Long.hashCode(this.f188540a) * 31, this.f188541b, 31), this.f188542c, 31), this.d, 31), this.e, 31), this.f, 31), this.f188543g, 31), this.f188544h, 31), this.i, 31), this.f188545j, 31), this.k, 31), this.f188546l, 31), this.f188547m, 31);
    }

    public n2(long j2, double d, double d5, double d6, double d10, double d15, double d41, double d51, double d68, double d81, double d82, double d95, double d100, double d101) {
        this.f188540a = j2;
        this.f188541b = d;
        this.f188542c = d5;
        this.d = d6;
        this.e = d10;
        this.f = d15;
        this.f188543g = d41;
        this.f188544h = d51;
        this.i = d68;
        this.f188545j = d81;
        this.k = d82;
        this.f188546l = d95;
        this.f188547m = d100;
        this.f188548n = d101;
    }
}
