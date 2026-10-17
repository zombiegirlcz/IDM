package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114365c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114367h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114368j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114371n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114374r;

    public i(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f114363a = id10;
        this.f114364b = str;
        this.f114365c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114366g = l2;
        this.f114367h = l3;
        this.i = value;
        this.f114368j = instant;
        this.k = str2;
        this.f114369l = accountType;
        this.f114370m = str3;
        this.f114371n = p0Var;
        this.o = p0Var2;
        this.f114372p = j0Var;
        this.f114373q = o0Var;
        this.f114374r = accountHolderType;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114374r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114369l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114372p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114371n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114367h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f114363a, iVar.f114363a) && Intrinsics.f(this.f114364b, iVar.f114364b) && Intrinsics.f(this.f114365c, iVar.f114365c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && this.f == iVar.f && Intrinsics.f(this.f114366g, iVar.f114366g) && Intrinsics.f(this.f114367h, iVar.f114367h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f114368j, iVar.f114368j) && Intrinsics.f(this.k, iVar.k) && this.f114369l == iVar.f114369l && Intrinsics.f(this.f114370m, iVar.f114370m) && Intrinsics.f(this.f114371n, iVar.f114371n) && Intrinsics.f(this.o, iVar.o) && this.f114372p == iVar.f114372p && Intrinsics.f(this.f114373q, iVar.f114373q) && this.f114374r == iVar.f114374r;
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114364b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114370m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114363a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114363a.hashCode() * 31;
        String str = this.f114364b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114365c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114366g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114367h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114368j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114369l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114370m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114371n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114372p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114373q;
        return this.f114374r.hashCode() + ((iHashCode7 + (o0Var != null ? o0Var.hashCode() : 0)) * 31);
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
        return this.f114373q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114365c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114368j;
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
        return this.f114366g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
