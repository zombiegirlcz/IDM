package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114280c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114282h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114283j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114286n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f114290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f114291t;
    public final String u;
    public final String v;

    public e0(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, String str4, Long l4, String symbol, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f114278a = id10;
        this.f114279b = str;
        this.f114280c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114281g = l2;
        this.f114282h = l3;
        this.i = value;
        this.f114283j = instant;
        this.k = str2;
        this.f114284l = accountType;
        this.f114285m = str3;
        this.f114286n = p0Var;
        this.o = p0Var2;
        this.f114287p = j0Var;
        this.f114288q = o0Var;
        this.f114289r = accountHolderType;
        this.f114290s = str4;
        this.f114291t = l4;
        this.u = symbol;
        this.v = str5;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114289r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114284l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114287p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114286n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114282h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f114278a, e0Var.f114278a) && Intrinsics.f(this.f114279b, e0Var.f114279b) && Intrinsics.f(this.f114280c, e0Var.f114280c) && Intrinsics.f(this.d, e0Var.d) && this.e == e0Var.e && this.f == e0Var.f && Intrinsics.f(this.f114281g, e0Var.f114281g) && Intrinsics.f(this.f114282h, e0Var.f114282h) && Intrinsics.f(this.i, e0Var.i) && Intrinsics.f(this.f114283j, e0Var.f114283j) && Intrinsics.f(this.k, e0Var.k) && this.f114284l == e0Var.f114284l && Intrinsics.f(this.f114285m, e0Var.f114285m) && Intrinsics.f(this.f114286n, e0Var.f114286n) && Intrinsics.f(this.o, e0Var.o) && this.f114287p == e0Var.f114287p && Intrinsics.f(this.f114288q, e0Var.f114288q) && this.f114289r == e0Var.f114289r && Intrinsics.f(this.f114290s, e0Var.f114290s) && Intrinsics.f(this.f114291t, e0Var.f114291t) && Intrinsics.f(this.u, e0Var.u) && Intrinsics.f(this.v, e0Var.v);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114279b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114285m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114278a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114278a.hashCode() * 31;
        String str = this.f114279b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114280c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114281g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114282h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114283j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114284l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114285m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114286n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114287p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114288q;
        int iF = v7.f(this.f114289r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        String str4 = this.f114290s;
        int iHashCode8 = (iF + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.f114291t;
        int iC2 = p.a.c((iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.u);
        String str5 = this.v;
        return iC2 + (str5 != null ? str5.hashCode() : 0);
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
        return this.f114288q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114280c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114283j;
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
        return this.f114281g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
