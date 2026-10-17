package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114325c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114327h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114328j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114331n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s0 f114335s;

    public g0(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, s0 s0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f114323a = id10;
        this.f114324b = str;
        this.f114325c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114326g = l2;
        this.f114327h = l3;
        this.i = value;
        this.f114328j = instant;
        this.k = str2;
        this.f114329l = accountType;
        this.f114330m = str3;
        this.f114331n = p0Var;
        this.o = p0Var2;
        this.f114332p = j0Var;
        this.f114333q = o0Var;
        this.f114334r = accountHolderType;
        this.f114335s = s0Var;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114334r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114329l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114332p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114331n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114327h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f114323a, g0Var.f114323a) && Intrinsics.f(this.f114324b, g0Var.f114324b) && Intrinsics.f(this.f114325c, g0Var.f114325c) && Intrinsics.f(this.d, g0Var.d) && this.e == g0Var.e && this.f == g0Var.f && Intrinsics.f(this.f114326g, g0Var.f114326g) && Intrinsics.f(this.f114327h, g0Var.f114327h) && Intrinsics.f(this.i, g0Var.i) && Intrinsics.f(this.f114328j, g0Var.f114328j) && Intrinsics.f(this.k, g0Var.k) && this.f114329l == g0Var.f114329l && Intrinsics.f(this.f114330m, g0Var.f114330m) && Intrinsics.f(this.f114331n, g0Var.f114331n) && Intrinsics.f(this.o, g0Var.o) && this.f114332p == g0Var.f114332p && Intrinsics.f(this.f114333q, g0Var.f114333q) && this.f114334r == g0Var.f114334r && Intrinsics.f(this.f114335s, g0Var.f114335s);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114324b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114330m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114323a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114323a.hashCode() * 31;
        String str = this.f114324b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114325c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114326g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114327h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114328j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114329l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114330m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114331n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114332p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114333q;
        int iF = v7.f(this.f114334r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        s0 s0Var = this.f114335s;
        return iF + (s0Var != null ? s0Var.hashCode() : 0);
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
        return this.f114333q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114325c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114328j;
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
        return this.f114326g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
