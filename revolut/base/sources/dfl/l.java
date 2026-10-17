package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.FeeType;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends i0 {
    public final BigDecimal A;
    public final YearMonth B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114411c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114413h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114414j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114417n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f114421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FeeType f114422t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Long f114423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f114424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f114425y;
    public final boolean z;

    public l(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, a aVar, FeeType feeType, String transactionId, String assetType, Long l4, boolean z, String description, boolean z3, BigDecimal bigDecimal, YearMonth yearMonth) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(feeType, "feeType");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f114409a = id10;
        this.f114410b = str;
        this.f114411c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114412g = l2;
        this.f114413h = l3;
        this.i = value;
        this.f114414j = instant;
        this.k = str2;
        this.f114415l = accountType;
        this.f114416m = str3;
        this.f114417n = p0Var;
        this.o = p0Var2;
        this.f114418p = j0Var;
        this.f114419q = o0Var;
        this.f114420r = accountHolderType;
        this.f114421s = aVar;
        this.f114422t = feeType;
        this.u = transactionId;
        this.v = assetType;
        this.f114423w = l4;
        this.f114424x = z;
        this.f114425y = description;
        this.z = z3;
        this.A = bigDecimal;
        this.B = yearMonth;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114420r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114415l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114418p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114417n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114413h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f114409a, lVar.f114409a) && Intrinsics.f(this.f114410b, lVar.f114410b) && Intrinsics.f(this.f114411c, lVar.f114411c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && this.f == lVar.f && Intrinsics.f(this.f114412g, lVar.f114412g) && Intrinsics.f(this.f114413h, lVar.f114413h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f114414j, lVar.f114414j) && Intrinsics.f(this.k, lVar.k) && this.f114415l == lVar.f114415l && Intrinsics.f(this.f114416m, lVar.f114416m) && Intrinsics.f(this.f114417n, lVar.f114417n) && Intrinsics.f(this.o, lVar.o) && this.f114418p == lVar.f114418p && Intrinsics.f(this.f114419q, lVar.f114419q) && this.f114420r == lVar.f114420r && Intrinsics.f(this.f114421s, lVar.f114421s) && this.f114422t == lVar.f114422t && Intrinsics.f(this.u, lVar.u) && Intrinsics.f(this.v, lVar.v) && Intrinsics.f(this.f114423w, lVar.f114423w) && this.f114424x == lVar.f114424x && Intrinsics.f(this.f114425y, lVar.f114425y) && this.z == lVar.z && Intrinsics.f(this.A, lVar.A) && Intrinsics.f(this.B, lVar.B);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114410b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114416m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114409a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114409a.hashCode() * 31;
        String str = this.f114410b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114411c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114412g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114413h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114414j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114415l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114416m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114417n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114418p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114419q;
        int iF = v7.f(this.f114420r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        a aVar = this.f114421s;
        int iC2 = p.a.c(p.a.c((this.f114422t.hashCode() + ((iF + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.u), 31, this.v);
        Long l4 = this.f114423w;
        int iC3 = j6.a.c(p.a.c(j6.a.c((iC2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f114424x), 31, this.f114425y), 31, this.z);
        BigDecimal bigDecimal = this.A;
        int iHashCode8 = (iC3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        YearMonth yearMonth = this.B;
        return iHashCode8 + (yearMonth != null ? yearMonth.hashCode() : 0);
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
        return this.f114419q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114411c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114414j;
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
        return this.f114412g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
