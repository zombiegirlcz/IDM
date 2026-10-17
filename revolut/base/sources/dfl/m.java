package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends i0 {
    public final dj0.d A;
    public final String B;
    public final BigDecimal C;
    public final BigDecimal D;
    public final dj0.d E;
    public final boolean F;
    public final String G;
    public final boolean H;
    public final a I;
    public final Boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114430c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114432h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114433j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114436n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f114440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f114441t;
    public final nel.z u;
    public final bfl.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dj0.d f114442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k0 f114443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f114444y;
    public final dj0.d z;

    public m(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, String symbol, String instrumentName, nel.z instrumentType, bfl.g side, dj0.d dVar, k0 k0Var, List fees, dj0.d dVar2, dj0.d dVar3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, dj0.d dVar4, boolean z, String str5, boolean z3, a aVar, Boolean bool) {
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
        this.f114428a = id10;
        this.f114429b = str;
        this.f114430c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114431g = l2;
        this.f114432h = l3;
        this.i = value;
        this.f114433j = instant;
        this.k = str2;
        this.f114434l = accountType;
        this.f114435m = str3;
        this.f114436n = p0Var;
        this.o = p0Var2;
        this.f114437p = j0Var;
        this.f114438q = o0Var;
        this.f114439r = accountHolderType;
        this.f114440s = symbol;
        this.f114441t = instrumentName;
        this.u = instrumentType;
        this.v = side;
        this.f114442w = dVar;
        this.f114443x = k0Var;
        this.f114444y = fees;
        this.z = dVar2;
        this.A = dVar3;
        this.B = str4;
        this.C = bigDecimal;
        this.D = bigDecimal2;
        this.E = dVar4;
        this.F = z;
        this.G = str5;
        this.H = z3;
        this.I = aVar;
        this.J = bool;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114439r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114434l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114437p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114436n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114432h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f114428a, mVar.f114428a) && Intrinsics.f(this.f114429b, mVar.f114429b) && Intrinsics.f(this.f114430c, mVar.f114430c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && this.f == mVar.f && Intrinsics.f(this.f114431g, mVar.f114431g) && Intrinsics.f(this.f114432h, mVar.f114432h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f114433j, mVar.f114433j) && Intrinsics.f(this.k, mVar.k) && this.f114434l == mVar.f114434l && Intrinsics.f(this.f114435m, mVar.f114435m) && Intrinsics.f(this.f114436n, mVar.f114436n) && Intrinsics.f(this.o, mVar.o) && this.f114437p == mVar.f114437p && Intrinsics.f(this.f114438q, mVar.f114438q) && this.f114439r == mVar.f114439r && Intrinsics.f(this.f114440s, mVar.f114440s) && Intrinsics.f(this.f114441t, mVar.f114441t) && this.u == mVar.u && this.v == mVar.v && Intrinsics.f(this.f114442w, mVar.f114442w) && Intrinsics.f(this.f114443x, mVar.f114443x) && Intrinsics.f(this.f114444y, mVar.f114444y) && Intrinsics.f(this.z, mVar.z) && Intrinsics.f(this.A, mVar.A) && Intrinsics.f(this.B, mVar.B) && Intrinsics.f(this.C, mVar.C) && Intrinsics.f(this.D, mVar.D) && Intrinsics.f(this.E, mVar.E) && this.F == mVar.F && Intrinsics.f(this.G, mVar.G) && this.H == mVar.H && Intrinsics.f(this.I, mVar.I) && Intrinsics.f(this.J, mVar.J);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114429b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114435m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114428a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114428a.hashCode() * 31;
        String str = this.f114429b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114430c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114431g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114432h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114433j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114434l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114435m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114436n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114437p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114438q;
        int iB = wp5.y.b(this.v, (this.u.hashCode() + p.a.c(p.a.c(v7.f(this.f114439r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31), 31, this.f114440s), 31, this.f114441t)) * 31, 31);
        dj0.d dVar = this.f114442w;
        int iHashCode8 = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        k0 k0Var = this.f114443x;
        int iD = p.a.d((iHashCode8 + (k0Var == null ? 0 : k0Var.hashCode())) * 31, 31, this.f114444y);
        dj0.d dVar2 = this.z;
        int iHashCode9 = (iD + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.A;
        int iHashCode10 = (iHashCode9 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        String str4 = this.B;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.C;
        int iHashCode12 = (iHashCode11 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.D;
        int iHashCode13 = (iHashCode12 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        dj0.d dVar4 = this.E;
        int iC2 = j6.a.c((iHashCode13 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31, 31, this.F);
        String str5 = this.G;
        int iC3 = j6.a.c((iC2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.H);
        a aVar = this.I;
        int iHashCode14 = (iC3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.J;
        return iHashCode14 + (bool != null ? bool.hashCode() : 0);
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
        return this.f114438q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114430c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114433j;
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
        return this.f114431g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
