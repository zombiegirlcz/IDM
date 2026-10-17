package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 extends i0 {
    public final List A;
    public final dj0.d B;
    public final dj0.d C;
    public final String D;
    public final BigDecimal E;
    public final BigDecimal F;
    public final dj0.d G;
    public final boolean H;
    public final String I;
    public final boolean J;
    public final a K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114294c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114296h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114297j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114300n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Pair f114304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Boolean f114305t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nel.z f114306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final bfl.g f114307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final dj0.d f114308y;
    public final k0 z;

    public f0(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, Pair pair, Boolean bool, String symbol, String instrumentName, nel.z instrumentType, bfl.g side, dj0.d dVar, k0 k0Var, List fees, dj0.d dVar2, dj0.d dVar3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, dj0.d dVar4, boolean z, String str5, boolean z3, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f114292a = id10;
        this.f114293b = str;
        this.f114294c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114295g = l2;
        this.f114296h = l3;
        this.i = value;
        this.f114297j = instant;
        this.k = str2;
        this.f114298l = accountType;
        this.f114299m = str3;
        this.f114300n = p0Var;
        this.o = p0Var2;
        this.f114301p = j0Var;
        this.f114302q = o0Var;
        this.f114303r = accountHolderType;
        this.f114304s = pair;
        this.f114305t = bool;
        this.u = symbol;
        this.v = instrumentName;
        this.f114306w = instrumentType;
        this.f114307x = side;
        this.f114308y = dVar;
        this.z = k0Var;
        this.A = fees;
        this.B = dVar2;
        this.C = dVar3;
        this.D = str4;
        this.E = bigDecimal;
        this.F = bigDecimal2;
        this.G = dVar4;
        this.H = z;
        this.I = str5;
        this.J = z3;
        this.K = aVar;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114303r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114298l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114301p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114300n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114296h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f114292a, f0Var.f114292a) && Intrinsics.f(this.f114293b, f0Var.f114293b) && Intrinsics.f(this.f114294c, f0Var.f114294c) && Intrinsics.f(this.d, f0Var.d) && this.e == f0Var.e && this.f == f0Var.f && Intrinsics.f(this.f114295g, f0Var.f114295g) && Intrinsics.f(this.f114296h, f0Var.f114296h) && Intrinsics.f(this.i, f0Var.i) && Intrinsics.f(this.f114297j, f0Var.f114297j) && Intrinsics.f(this.k, f0Var.k) && this.f114298l == f0Var.f114298l && Intrinsics.f(this.f114299m, f0Var.f114299m) && Intrinsics.f(this.f114300n, f0Var.f114300n) && Intrinsics.f(this.o, f0Var.o) && this.f114301p == f0Var.f114301p && Intrinsics.f(this.f114302q, f0Var.f114302q) && this.f114303r == f0Var.f114303r && Intrinsics.f(this.f114304s, f0Var.f114304s) && Intrinsics.f(this.f114305t, f0Var.f114305t) && Intrinsics.f(this.u, f0Var.u) && Intrinsics.f(this.v, f0Var.v) && this.f114306w == f0Var.f114306w && this.f114307x == f0Var.f114307x && Intrinsics.f(this.f114308y, f0Var.f114308y) && Intrinsics.f(this.z, f0Var.z) && Intrinsics.f(this.A, f0Var.A) && Intrinsics.f(this.B, f0Var.B) && Intrinsics.f(this.C, f0Var.C) && Intrinsics.f(this.D, f0Var.D) && Intrinsics.f(this.E, f0Var.E) && Intrinsics.f(this.F, f0Var.F) && Intrinsics.f(this.G, f0Var.G) && this.H == f0Var.H && Intrinsics.f(this.I, f0Var.I) && this.J == f0Var.J && Intrinsics.f(this.K, f0Var.K);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114293b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114299m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114292a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114292a.hashCode() * 31;
        String str = this.f114293b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114294c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114295g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114296h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114297j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114298l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114299m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114300n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114301p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114302q;
        int iF = v7.f(this.f114303r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        Pair pair = this.f114304s;
        int iHashCode8 = (iF + (pair == null ? 0 : pair.hashCode())) * 31;
        Boolean bool = this.f114305t;
        int iB = wp5.y.b(this.f114307x, (this.f114306w.hashCode() + p.a.c(p.a.c((iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.u), 31, this.v)) * 31, 31);
        dj0.d dVar = this.f114308y;
        int iHashCode9 = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        k0 k0Var = this.z;
        int iD = p.a.d((iHashCode9 + (k0Var == null ? 0 : k0Var.hashCode())) * 31, 31, this.A);
        dj0.d dVar2 = this.B;
        int iHashCode10 = (iD + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.C;
        int iHashCode11 = (iHashCode10 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        String str4 = this.D;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.E;
        int iHashCode13 = (iHashCode12 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.F;
        int iHashCode14 = (iHashCode13 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        dj0.d dVar4 = this.G;
        int iC2 = j6.a.c((iHashCode14 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31, 31, this.H);
        String str5 = this.I;
        int iC3 = j6.a.c((iC2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.J);
        a aVar = this.K;
        return iC3 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // dfl.i0
    public final long i() {
        return this.f;
    }

    @Override // dfl.i0
    public final String k() {
        return this.d;
    }

    @Override // dfl.i0
    public final o0 l() {
        return this.f114302q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114294c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114297j;
    }

    @Override // dfl.i0
    public final String o() {
        return this.k;
    }

    @Override // dfl.i0
    public final q0 p() {
        return this.e;
    }

    @Override // dfl.i0
    public final Long q() {
        return this.f114295g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
