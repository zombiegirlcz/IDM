package ll4;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw4.q f196536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f196537c;
    public final String d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f196538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f196539h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f196540j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f196541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xi0.b f196542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f196543n;
    public final Long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f196544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f196545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a0 f196546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f196547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f196548t;
    public final b u;
    public final dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f196549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f196550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f196551y;

    public u(String facilityId, yw4.q state, String pocketId, String walletId, String str, long j2, long j3, long j5, Long l2, long j16, long j22, double d, xi0.b currency, long j42, Long l3, Long l4, Double d5, a0 a0Var, a aVar, long j46, b bVar, dj0.d ongoingStatementBalance, boolean z) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(ongoingStatementBalance, "ongoingStatementBalance");
        this.f196535a = facilityId;
        this.f196536b = state;
        this.f196537c = pocketId;
        this.d = walletId;
        this.e = str;
        this.f = j2;
        this.f196538g = j3;
        this.f196539h = j5;
        this.i = l2;
        this.f196540j = j16;
        this.k = j22;
        this.f196541l = d;
        this.f196542m = currency;
        this.f196543n = j42;
        this.o = l3;
        this.f196544p = l4;
        this.f196545q = d5;
        this.f196546r = a0Var;
        this.f196547s = aVar;
        this.f196548t = j46;
        this.u = bVar;
        this.v = ongoingStatementBalance;
        this.f196549w = z;
        this.f196550x = l2 == null;
        this.f196551y = j16 > 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f196535a, uVar.f196535a) && this.f196536b == uVar.f196536b && Intrinsics.f(this.f196537c, uVar.f196537c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && this.f == uVar.f && this.f196538g == uVar.f196538g && this.f196539h == uVar.f196539h && Intrinsics.f(this.i, uVar.i) && this.f196540j == uVar.f196540j && this.k == uVar.k && Double.compare(this.f196541l, uVar.f196541l) == 0 && Intrinsics.f(this.f196542m, uVar.f196542m) && this.f196543n == uVar.f196543n && Intrinsics.f(this.o, uVar.o) && Intrinsics.f(this.f196544p, uVar.f196544p) && Intrinsics.f(this.f196545q, uVar.f196545q) && Intrinsics.f(this.f196546r, uVar.f196546r) && Intrinsics.f(this.f196547s, uVar.f196547s) && this.f196548t == uVar.f196548t && Intrinsics.f(this.u, uVar.u) && Intrinsics.f(this.v, uVar.v) && this.f196549w == uVar.f196549w;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f196536b.hashCode() + (this.f196535a.hashCode() * 31)) * 31, 31, this.f196537c), 31, this.d);
        String str = this.e;
        int iC2 = a0.d.c(a0.d.c(a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f196538g), 31, this.f196539h);
        Long l2 = this.i;
        int iC3 = a0.d.c(h30.l.j(this.f196542m, m72.b.c(a0.d.c(a0.d.c((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f196540j), 31, this.k), this.f196541l, 31), 31), 31, this.f196543n);
        Long l3 = this.o;
        int iHashCode = (iC3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f196544p;
        int iHashCode2 = (iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31;
        Double d = this.f196545q;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        a0 a0Var = this.f196546r;
        int iHashCode4 = (iHashCode3 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        a aVar = this.f196547s;
        int iC4 = a0.d.c((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f196548t);
        b bVar = this.u;
        return Boolean.hashCode(this.f196549w) + v7.c((iC4 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.v);
    }
}
