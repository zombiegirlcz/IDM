package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114351c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114353h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114354j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114357n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bfl.g f114361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f114362t;
    public final BigDecimal u;
    public final s0 v;

    public h0(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, bfl.g side, String symbol, BigDecimal executedQuantity, s0 s0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(executedQuantity, "executedQuantity");
        this.f114349a = id10;
        this.f114350b = str;
        this.f114351c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114352g = l2;
        this.f114353h = l3;
        this.i = value;
        this.f114354j = instant;
        this.k = str2;
        this.f114355l = accountType;
        this.f114356m = str3;
        this.f114357n = p0Var;
        this.o = p0Var2;
        this.f114358p = j0Var;
        this.f114359q = o0Var;
        this.f114360r = accountHolderType;
        this.f114361s = side;
        this.f114362t = symbol;
        this.u = executedQuantity;
        this.v = s0Var;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114360r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114355l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114358p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114357n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114353h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f114349a, h0Var.f114349a) && Intrinsics.f(this.f114350b, h0Var.f114350b) && Intrinsics.f(this.f114351c, h0Var.f114351c) && Intrinsics.f(this.d, h0Var.d) && this.e == h0Var.e && this.f == h0Var.f && Intrinsics.f(this.f114352g, h0Var.f114352g) && Intrinsics.f(this.f114353h, h0Var.f114353h) && Intrinsics.f(this.i, h0Var.i) && Intrinsics.f(this.f114354j, h0Var.f114354j) && Intrinsics.f(this.k, h0Var.k) && this.f114355l == h0Var.f114355l && Intrinsics.f(this.f114356m, h0Var.f114356m) && Intrinsics.f(this.f114357n, h0Var.f114357n) && Intrinsics.f(this.o, h0Var.o) && this.f114358p == h0Var.f114358p && Intrinsics.f(this.f114359q, h0Var.f114359q) && this.f114360r == h0Var.f114360r && this.f114361s == h0Var.f114361s && Intrinsics.f(this.f114362t, h0Var.f114362t) && Intrinsics.f(this.u, h0Var.u) && Intrinsics.f(this.v, h0Var.v);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114350b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114356m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114349a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114349a.hashCode() * 31;
        String str = this.f114350b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114351c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114352g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114353h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114354j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114355l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114356m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114357n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114358p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114359q;
        int iD = t61.a.d(this.u, p.a.c(wp5.y.b(this.f114361s, v7.f(this.f114360r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31), 31), 31, this.f114362t), 31);
        s0 s0Var = this.v;
        return iD + (s0Var != null ? s0Var.hashCode() : 0);
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
        return this.f114359q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114351c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114354j;
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
        return this.f114352g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
