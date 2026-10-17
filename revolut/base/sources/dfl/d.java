package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114239c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114241h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114242j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114245n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114248r;

    public d(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f114237a = id10;
        this.f114238b = str;
        this.f114239c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114240g = l2;
        this.f114241h = l3;
        this.i = value;
        this.f114242j = instant;
        this.k = str2;
        this.f114243l = accountType;
        this.f114244m = str3;
        this.f114245n = p0Var;
        this.o = p0Var2;
        this.f114246p = j0Var;
        this.f114247q = o0Var;
        this.f114248r = accountHolderType;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114248r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114243l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114246p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114245n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114241h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f114237a, dVar.f114237a) && Intrinsics.f(this.f114238b, dVar.f114238b) && Intrinsics.f(this.f114239c, dVar.f114239c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && Intrinsics.f(this.f114240g, dVar.f114240g) && Intrinsics.f(this.f114241h, dVar.f114241h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f114242j, dVar.f114242j) && Intrinsics.f(this.k, dVar.k) && this.f114243l == dVar.f114243l && Intrinsics.f(this.f114244m, dVar.f114244m) && Intrinsics.f(this.f114245n, dVar.f114245n) && Intrinsics.f(this.o, dVar.o) && this.f114246p == dVar.f114246p && Intrinsics.f(this.f114247q, dVar.f114247q) && this.f114248r == dVar.f114248r;
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114238b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114244m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114237a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114237a.hashCode() * 31;
        String str = this.f114238b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114239c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114240g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114241h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114242j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114243l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114244m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114245n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114246p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114247q;
        return this.f114248r.hashCode() + ((iHashCode7 + (o0Var != null ? o0Var.hashCode() : 0)) * 31);
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
        return this.f114247q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114239c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114242j;
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
        return this.f114240g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
