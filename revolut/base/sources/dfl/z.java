package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114533c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114535h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114536j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114539n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a0 f114543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f114544t;
    public final Long u;
    public final Boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Boolean f114545w;

    public z(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, a0 refundType, String str4, Long l4, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(refundType, "refundType");
        this.f114531a = id10;
        this.f114532b = str;
        this.f114533c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114534g = l2;
        this.f114535h = l3;
        this.i = value;
        this.f114536j = instant;
        this.k = str2;
        this.f114537l = accountType;
        this.f114538m = str3;
        this.f114539n = p0Var;
        this.o = p0Var2;
        this.f114540p = j0Var;
        this.f114541q = o0Var;
        this.f114542r = accountHolderType;
        this.f114543s = refundType;
        this.f114544t = str4;
        this.u = l4;
        this.v = bool;
        this.f114545w = bool2;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114542r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114537l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114540p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114539n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114535h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f114531a, zVar.f114531a) && Intrinsics.f(this.f114532b, zVar.f114532b) && Intrinsics.f(this.f114533c, zVar.f114533c) && Intrinsics.f(this.d, zVar.d) && this.e == zVar.e && this.f == zVar.f && Intrinsics.f(this.f114534g, zVar.f114534g) && Intrinsics.f(this.f114535h, zVar.f114535h) && Intrinsics.f(this.i, zVar.i) && Intrinsics.f(this.f114536j, zVar.f114536j) && Intrinsics.f(this.k, zVar.k) && this.f114537l == zVar.f114537l && Intrinsics.f(this.f114538m, zVar.f114538m) && Intrinsics.f(this.f114539n, zVar.f114539n) && Intrinsics.f(this.o, zVar.o) && this.f114540p == zVar.f114540p && Intrinsics.f(this.f114541q, zVar.f114541q) && this.f114542r == zVar.f114542r && this.f114543s == zVar.f114543s && Intrinsics.f(this.f114544t, zVar.f114544t) && Intrinsics.f(this.u, zVar.u) && Intrinsics.f(this.v, zVar.v) && Intrinsics.f(this.f114545w, zVar.f114545w);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114532b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114538m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114531a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114531a.hashCode() * 31;
        String str = this.f114532b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114533c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114534g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114535h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114536j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114537l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114538m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114539n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114540p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114541q;
        int iHashCode8 = (this.f114543s.hashCode() + v7.f(this.f114542r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31)) * 31;
        String str4 = this.f114544t;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.u;
        int iHashCode10 = (iHashCode9 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.v;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f114545w;
        return iHashCode11 + (bool2 != null ? bool2.hashCode() : 0);
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
        return this.f114541q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114533c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114536j;
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
        return this.f114534g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
