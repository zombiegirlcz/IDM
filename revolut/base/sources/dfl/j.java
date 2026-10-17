package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114377c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114379h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114380j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114383n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f114387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nel.z f114388t;
    public final dj0.d u;
    public final dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f114389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f114390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BigDecimal f114391y;

    public j(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, String str4, nel.z instrumentType, dj0.d dVar, dj0.d dVar2, String symbol, a aVar, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f114375a = id10;
        this.f114376b = str;
        this.f114377c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114378g = l2;
        this.f114379h = l3;
        this.i = value;
        this.f114380j = instant;
        this.k = str2;
        this.f114381l = accountType;
        this.f114382m = str3;
        this.f114383n = p0Var;
        this.o = p0Var2;
        this.f114384p = j0Var;
        this.f114385q = o0Var;
        this.f114386r = accountHolderType;
        this.f114387s = str4;
        this.f114388t = instrumentType;
        this.u = dVar;
        this.v = dVar2;
        this.f114389w = symbol;
        this.f114390x = aVar;
        this.f114391y = bigDecimal;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114386r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114381l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114384p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114383n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114379h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f114375a, jVar.f114375a) && Intrinsics.f(this.f114376b, jVar.f114376b) && Intrinsics.f(this.f114377c, jVar.f114377c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f && Intrinsics.f(this.f114378g, jVar.f114378g) && Intrinsics.f(this.f114379h, jVar.f114379h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f114380j, jVar.f114380j) && Intrinsics.f(this.k, jVar.k) && this.f114381l == jVar.f114381l && Intrinsics.f(this.f114382m, jVar.f114382m) && Intrinsics.f(this.f114383n, jVar.f114383n) && Intrinsics.f(this.o, jVar.o) && this.f114384p == jVar.f114384p && Intrinsics.f(this.f114385q, jVar.f114385q) && this.f114386r == jVar.f114386r && Intrinsics.f(this.f114387s, jVar.f114387s) && this.f114388t == jVar.f114388t && Intrinsics.f(this.u, jVar.u) && Intrinsics.f(this.v, jVar.v) && Intrinsics.f(this.f114389w, jVar.f114389w) && Intrinsics.f(this.f114390x, jVar.f114390x) && Intrinsics.f(this.f114391y, jVar.f114391y);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114376b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114382m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114375a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114375a.hashCode() * 31;
        String str = this.f114376b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114377c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114378g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114379h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114380j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114381l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114382m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114383n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114384p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114385q;
        int iF = v7.f(this.f114386r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        String str4 = this.f114387s;
        int iHashCode8 = (this.f114388t.hashCode() + ((iF + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        dj0.d dVar = this.u;
        int iHashCode9 = (iHashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.v;
        int iC2 = p.a.c((iHashCode9 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.f114389w);
        a aVar = this.f114390x;
        int iHashCode10 = (iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        BigDecimal bigDecimal = this.f114391y;
        return iHashCode10 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
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
        return this.f114385q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114377c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114380j;
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
        return this.f114378g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
