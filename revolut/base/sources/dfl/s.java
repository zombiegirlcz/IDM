package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends i0 {
    public final boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114455c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114457h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114458j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114461n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f114465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bfl.g f114466t;
    public final ej0.b u;
    public final BigDecimal v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k0 f114467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BigDecimal f114468x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final dj0.d f114469y;
    public final boolean z;

    public s(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, String symbol, bfl.g side, ej0.b bVar, BigDecimal bigDecimal, k0 k0Var, BigDecimal leverage, dj0.d exposure, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        this.f114453a = id10;
        this.f114454b = str;
        this.f114455c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114456g = l2;
        this.f114457h = l3;
        this.i = value;
        this.f114458j = instant;
        this.k = str2;
        this.f114459l = accountType;
        this.f114460m = str3;
        this.f114461n = p0Var;
        this.o = p0Var2;
        this.f114462p = j0Var;
        this.f114463q = o0Var;
        this.f114464r = accountHolderType;
        this.f114465s = symbol;
        this.f114466t = side;
        this.u = bVar;
        this.v = bigDecimal;
        this.f114467w = k0Var;
        this.f114468x = leverage;
        this.f114469y = exposure;
        this.z = z;
        this.A = z3;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114464r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114459l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114462p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114461n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114457h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f114453a, sVar.f114453a) && Intrinsics.f(this.f114454b, sVar.f114454b) && Intrinsics.f(this.f114455c, sVar.f114455c) && Intrinsics.f(this.d, sVar.d) && this.e == sVar.e && this.f == sVar.f && Intrinsics.f(this.f114456g, sVar.f114456g) && Intrinsics.f(this.f114457h, sVar.f114457h) && Intrinsics.f(this.i, sVar.i) && Intrinsics.f(this.f114458j, sVar.f114458j) && Intrinsics.f(this.k, sVar.k) && this.f114459l == sVar.f114459l && Intrinsics.f(this.f114460m, sVar.f114460m) && Intrinsics.f(this.f114461n, sVar.f114461n) && Intrinsics.f(this.o, sVar.o) && this.f114462p == sVar.f114462p && Intrinsics.f(this.f114463q, sVar.f114463q) && this.f114464r == sVar.f114464r && Intrinsics.f(this.f114465s, sVar.f114465s) && this.f114466t == sVar.f114466t && Intrinsics.f(this.u, sVar.u) && Intrinsics.f(this.v, sVar.v) && Intrinsics.f(this.f114467w, sVar.f114467w) && Intrinsics.f(this.f114468x, sVar.f114468x) && Intrinsics.f(this.f114469y, sVar.f114469y) && this.z == sVar.z && this.A == sVar.A;
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114454b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114460m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114453a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114453a.hashCode() * 31;
        String str = this.f114454b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114455c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114456g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114457h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114458j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114459l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114460m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114461n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114462p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114463q;
        int iB = wp5.y.b(this.f114466t, p.a.c(v7.f(this.f114464r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31), 31, this.f114465s), 31);
        ej0.b bVar = this.u;
        int iHashCode8 = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        BigDecimal bigDecimal = this.v;
        int iHashCode9 = (iHashCode8 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        k0 k0Var = this.f114467w;
        return Boolean.hashCode(this.A) + j6.a.c(v7.c(t61.a.d(this.f114468x, (iHashCode9 + (k0Var != null ? k0Var.hashCode() : 0)) * 31, 31), 31, this.f114469y), 31, this.z);
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
        return this.f114463q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114455c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114458j;
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
        return this.f114456g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
