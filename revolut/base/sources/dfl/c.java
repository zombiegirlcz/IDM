package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114210c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114212h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114213j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114216n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bfl.g f114220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s0 f114221t;

    public c(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, bfl.g side, s0 transferRequestDetails) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(transferRequestDetails, "transferRequestDetails");
        this.f114208a = id10;
        this.f114209b = str;
        this.f114210c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114211g = l2;
        this.f114212h = l3;
        this.i = value;
        this.f114213j = instant;
        this.k = str2;
        this.f114214l = accountType;
        this.f114215m = str3;
        this.f114216n = p0Var;
        this.o = p0Var2;
        this.f114217p = j0Var;
        this.f114218q = o0Var;
        this.f114219r = accountHolderType;
        this.f114220s = side;
        this.f114221t = transferRequestDetails;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114219r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114214l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114217p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114216n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114212h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f114208a, cVar.f114208a) && Intrinsics.f(this.f114209b, cVar.f114209b) && Intrinsics.f(this.f114210c, cVar.f114210c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && Intrinsics.f(this.f114211g, cVar.f114211g) && Intrinsics.f(this.f114212h, cVar.f114212h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f114213j, cVar.f114213j) && Intrinsics.f(this.k, cVar.k) && this.f114214l == cVar.f114214l && Intrinsics.f(this.f114215m, cVar.f114215m) && Intrinsics.f(this.f114216n, cVar.f114216n) && Intrinsics.f(this.o, cVar.o) && this.f114217p == cVar.f114217p && Intrinsics.f(this.f114218q, cVar.f114218q) && this.f114219r == cVar.f114219r && this.f114220s == cVar.f114220s && Intrinsics.f(this.f114221t, cVar.f114221t);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114209b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114215m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114208a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114208a.hashCode() * 31;
        String str = this.f114209b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114210c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114211g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114212h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114213j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114214l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114215m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114216n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114217p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114218q;
        return this.f114221t.hashCode() + wp5.y.b(this.f114220s, v7.f(this.f114219r, (iHashCode7 + (o0Var != null ? o0Var.hashCode() : 0)) * 31, 31), 31);
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
        return this.f114218q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114210c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114213j;
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
        return this.f114211g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
