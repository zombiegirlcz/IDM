package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114198c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114200h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114201j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114204n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114207r;

    public b0(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f114196a = id10;
        this.f114197b = str;
        this.f114198c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114199g = l2;
        this.f114200h = l3;
        this.i = value;
        this.f114201j = instant;
        this.k = str2;
        this.f114202l = accountType;
        this.f114203m = str3;
        this.f114204n = p0Var;
        this.o = p0Var2;
        this.f114205p = j0Var;
        this.f114206q = o0Var;
        this.f114207r = accountHolderType;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114207r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114202l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114205p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114204n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114200h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f114196a, b0Var.f114196a) && Intrinsics.f(this.f114197b, b0Var.f114197b) && Intrinsics.f(this.f114198c, b0Var.f114198c) && Intrinsics.f(this.d, b0Var.d) && this.e == b0Var.e && this.f == b0Var.f && Intrinsics.f(this.f114199g, b0Var.f114199g) && Intrinsics.f(this.f114200h, b0Var.f114200h) && Intrinsics.f(this.i, b0Var.i) && Intrinsics.f(this.f114201j, b0Var.f114201j) && Intrinsics.f(this.k, b0Var.k) && this.f114202l == b0Var.f114202l && Intrinsics.f(this.f114203m, b0Var.f114203m) && Intrinsics.f(this.f114204n, b0Var.f114204n) && Intrinsics.f(this.o, b0Var.o) && this.f114205p == b0Var.f114205p && Intrinsics.f(this.f114206q, b0Var.f114206q) && this.f114207r == b0Var.f114207r;
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114197b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114203m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114196a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114196a.hashCode() * 31;
        String str = this.f114197b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114198c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114199g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114200h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114201j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114202l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114203m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114204n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114205p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114206q;
        return this.f114207r.hashCode() + ((iHashCode7 + (o0Var != null ? o0Var.hashCode() : 0)) * 31);
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
        return this.f114206q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114198c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114201j;
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
        return this.f114199g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
