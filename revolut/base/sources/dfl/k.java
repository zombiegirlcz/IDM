package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114394c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114396h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114397j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114400n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f114404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BigDecimal f114405t;
    public final dj0.d u;

    public k(String id10, String compoundId, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str, WealthAccountType accountType, String str2, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, a exchangedValue, BigDecimal rate, dj0.d fees) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(exchangedValue, "exchangedValue");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f114392a = id10;
        this.f114393b = compoundId;
        this.f114394c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114395g = l2;
        this.f114396h = l3;
        this.i = value;
        this.f114397j = instant;
        this.k = str;
        this.f114398l = accountType;
        this.f114399m = str2;
        this.f114400n = p0Var;
        this.o = p0Var2;
        this.f114401p = j0Var;
        this.f114402q = o0Var;
        this.f114403r = accountHolderType;
        this.f114404s = exchangedValue;
        this.f114405t = rate;
        this.u = fees;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114403r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114398l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114401p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114400n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114396h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f114392a, kVar.f114392a) && Intrinsics.f(this.f114393b, kVar.f114393b) && Intrinsics.f(this.f114394c, kVar.f114394c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && this.f == kVar.f && Intrinsics.f(this.f114395g, kVar.f114395g) && Intrinsics.f(this.f114396h, kVar.f114396h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f114397j, kVar.f114397j) && Intrinsics.f(this.k, kVar.k) && this.f114398l == kVar.f114398l && Intrinsics.f(this.f114399m, kVar.f114399m) && Intrinsics.f(this.f114400n, kVar.f114400n) && Intrinsics.f(this.o, kVar.o) && this.f114401p == kVar.f114401p && Intrinsics.f(this.f114402q, kVar.f114402q) && this.f114403r == kVar.f114403r && Intrinsics.f(this.f114404s, kVar.f114404s) && Intrinsics.f(this.f114405t, kVar.f114405t) && Intrinsics.f(this.u, kVar.u);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114393b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114399m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114392a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c(p.a.c(this.f114392a.hashCode() * 31, 31, this.f114393b), 31, this.f114394c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114395g;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114396h;
        int iH = v7.h(this.i, (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114397j;
        int iHashCode2 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.k;
        int iE = m72.b.e(this.f114398l, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f114399m;
        int iHashCode3 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        p0 p0Var = this.f114400n;
        int iHashCode4 = (iHashCode3 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode5 = (iHashCode4 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114401p;
        int iHashCode6 = (iHashCode5 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114402q;
        return this.u.hashCode() + t61.a.d(this.f114405t, (this.f114404s.hashCode() + v7.f(this.f114403r, (iHashCode6 + (o0Var != null ? o0Var.hashCode() : 0)) * 31, 31)) * 31, 31);
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
        return this.f114402q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114394c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114397j;
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
        return this.f114395g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }

    public final a s() {
        a aVar = this.f114404s;
        if (aVar.f114177a < 0) {
            return aVar;
        }
        q qVar = this.i;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return (a) qVar;
    }

    public final a t() {
        a aVar = this.f114404s;
        if (aVar.f114177a >= 0) {
            return aVar;
        }
        q qVar = this.i;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return (a) qVar;
    }
}
