package p35;

import ip0.v7;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 implements Serializable {
    public final List A;
    public final dj0.d B;
    public final dj0.d C;
    public final dj0.d D;
    public final boolean E;
    public final dj0.d F;
    public final wi0.b G;
    public final dj0.d H;
    public final y0 I;
    public final boolean J;
    public final Long K;
    public final int L;
    public final boolean M;
    public final List N;
    public final List O;
    public final dj0.d P;
    public final d0 Q;
    public final boolean R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f232623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f232624c;
    public final String d;
    public final g0 e;
    public final double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f232625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f232626h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ZonedDateTime f232627j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f232628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f232629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f232630n;
    public final h0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f232631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f232632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b0 f232633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f232634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f232635t;
    public final dj0.d u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f232636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f232637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f232638y;
    public final boolean z;

    public e0(String id10, long j2, String currency, String str, g0 state, double d, int i, int i2, String name, ZonedDateTime disburseDateTime, String str2, List payments, double d5, dj0.d minPartialRepaymentAmount, h0 h0Var, boolean z, Integer num, b0 payoffAmountBreakdown, b0 maxPartialRepaymentAmountBreakdown, int i3, dj0.d leftPrincipalAmount, int i5, long j3, List paidRepayments, boolean z3, boolean z4, List renegotiations, dj0.d dVar, dj0.d dVar2, dj0.d fullOutstandingBalance, boolean z6, dj0.d oneTimeFee, wi0.b countryCode, dj0.d totalRepayable, y0 toggleStatus, boolean z11, Long l2, int i6, boolean z12, List repaymentRequests, List repaymentSources, dj0.d dVar3, d0 countryConfig, boolean z29) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(disburseDateTime, "disburseDateTime");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(minPartialRepaymentAmount, "minPartialRepaymentAmount");
        Intrinsics.checkNotNullParameter(payoffAmountBreakdown, "payoffAmountBreakdown");
        Intrinsics.checkNotNullParameter(maxPartialRepaymentAmountBreakdown, "maxPartialRepaymentAmountBreakdown");
        Intrinsics.checkNotNullParameter(leftPrincipalAmount, "leftPrincipalAmount");
        Intrinsics.checkNotNullParameter(paidRepayments, "paidRepayments");
        Intrinsics.checkNotNullParameter(renegotiations, "renegotiations");
        Intrinsics.checkNotNullParameter(fullOutstandingBalance, "fullOutstandingBalance");
        Intrinsics.checkNotNullParameter(oneTimeFee, "oneTimeFee");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(totalRepayable, "totalRepayable");
        Intrinsics.checkNotNullParameter(toggleStatus, "toggleStatus");
        Intrinsics.checkNotNullParameter(repaymentRequests, "repaymentRequests");
        Intrinsics.checkNotNullParameter(repaymentSources, "repaymentSources");
        Intrinsics.checkNotNullParameter(countryConfig, "countryConfig");
        this.f232622a = id10;
        this.f232623b = j2;
        this.f232624c = currency;
        this.d = str;
        this.e = state;
        this.f = d;
        this.f232625g = i;
        this.f232626h = i2;
        this.i = name;
        this.f232627j = disburseDateTime;
        this.k = str2;
        this.f232628l = payments;
        this.f232629m = d5;
        this.f232630n = minPartialRepaymentAmount;
        this.o = h0Var;
        this.f232631p = z;
        this.f232632q = num;
        this.f232633r = payoffAmountBreakdown;
        this.f232634s = maxPartialRepaymentAmountBreakdown;
        this.f232635t = i3;
        this.u = leftPrincipalAmount;
        this.v = i5;
        this.f232636w = j3;
        this.f232637x = paidRepayments;
        this.f232638y = z3;
        this.z = z4;
        this.A = renegotiations;
        this.B = dVar;
        this.C = dVar2;
        this.D = fullOutstandingBalance;
        this.E = z6;
        this.F = oneTimeFee;
        this.G = countryCode;
        this.H = totalRepayable;
        this.I = toggleStatus;
        this.J = z11;
        this.K = l2;
        this.L = i6;
        this.M = z12;
        this.N = repaymentRequests;
        this.O = repaymentSources;
        this.P = dVar3;
        this.Q = countryConfig;
        this.R = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f232622a, e0Var.f232622a) && this.f232623b == e0Var.f232623b && Intrinsics.f(this.f232624c, e0Var.f232624c) && Intrinsics.f(this.d, e0Var.d) && this.e == e0Var.e && Double.compare(this.f, e0Var.f) == 0 && this.f232625g == e0Var.f232625g && this.f232626h == e0Var.f232626h && Intrinsics.f(this.i, e0Var.i) && Intrinsics.f(this.f232627j, e0Var.f232627j) && Intrinsics.f(this.k, e0Var.k) && Intrinsics.f(this.f232628l, e0Var.f232628l) && Double.compare(this.f232629m, e0Var.f232629m) == 0 && Intrinsics.f(this.f232630n, e0Var.f232630n) && Intrinsics.f(this.o, e0Var.o) && this.f232631p == e0Var.f232631p && Intrinsics.f(this.f232632q, e0Var.f232632q) && Intrinsics.f(this.f232633r, e0Var.f232633r) && Intrinsics.f(this.f232634s, e0Var.f232634s) && this.f232635t == e0Var.f232635t && Intrinsics.f(this.u, e0Var.u) && this.v == e0Var.v && this.f232636w == e0Var.f232636w && Intrinsics.f(this.f232637x, e0Var.f232637x) && this.f232638y == e0Var.f232638y && this.z == e0Var.z && Intrinsics.f(this.A, e0Var.A) && Intrinsics.f(this.B, e0Var.B) && Intrinsics.f(this.C, e0Var.C) && Intrinsics.f(this.D, e0Var.D) && this.E == e0Var.E && Intrinsics.f(this.F, e0Var.F) && Intrinsics.f(this.G, e0Var.G) && Intrinsics.f(this.H, e0Var.H) && Intrinsics.f(this.I, e0Var.I) && this.J == e0Var.J && Intrinsics.f(this.K, e0Var.K) && this.L == e0Var.L && this.M == e0Var.M && Intrinsics.f(this.N, e0Var.N) && Intrinsics.f(this.O, e0Var.O) && Intrinsics.f(this.P, e0Var.P) && Intrinsics.f(this.Q, e0Var.Q) && this.R == e0Var.R;
    }

    public final String getId() {
        return this.f232622a;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(this.f232622a.hashCode() * 31, 31, this.f232623b), 31, this.f232624c);
        String str = this.d;
        int iH = h30.l.h(this.f232627j, p.a.c(j6.a.b(this.f232626h, j6.a.b(this.f232625g, m72.b.c((this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, this.f, 31), 31), 31), 31, this.i), 31);
        String str2 = this.k;
        int iC2 = v7.c(m72.b.c(p.a.d((iH + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f232628l), this.f232629m, 31), 31, this.f232630n);
        h0 h0Var = this.o;
        int iC3 = j6.a.c((iC2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31, 31, this.f232631p);
        Integer num = this.f232632q;
        int iD = p.a.d(j6.a.c(j6.a.c(p.a.d(a0.d.c(j6.a.b(this.v, v7.c(j6.a.b(this.f232635t, (this.f232634s.hashCode() + ((this.f232633r.hashCode() + ((iC3 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31), 31, this.u), 31), 31, this.f232636w), 31, this.f232637x), 31, this.f232638y), 31, this.z), 31, this.A);
        dj0.d dVar = this.B;
        int iHashCode = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.C;
        int iC4 = j6.a.c((this.I.hashCode() + v7.c(p.a.c(v7.c(j6.a.c(v7.c((iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.D), 31, this.E), 31, this.F), 31, this.G.f297794a), 31, this.H)) * 31, 31, this.J);
        Long l2 = this.K;
        int iD2 = p.a.d(p.a.d(j6.a.c(j6.a.b(this.L, (iC4 + (l2 == null ? 0 : l2.hashCode())) * 31, 31), 31, this.M), 31, this.N), 31, this.O);
        dj0.d dVar3 = this.P;
        return Boolean.hashCode(this.R) + ((this.Q.hashCode() + ((iD2 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31)) * 31);
    }
}
