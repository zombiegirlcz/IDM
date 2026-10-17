package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.YearMonth;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114338c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114340h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114341j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114344n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final YearMonth f114348s;

    public h(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, YearMonth yearMonth) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f114336a = id10;
        this.f114337b = str;
        this.f114338c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114339g = l2;
        this.f114340h = l3;
        this.i = value;
        this.f114341j = instant;
        this.k = str2;
        this.f114342l = accountType;
        this.f114343m = str3;
        this.f114344n = p0Var;
        this.o = p0Var2;
        this.f114345p = j0Var;
        this.f114346q = o0Var;
        this.f114347r = accountHolderType;
        this.f114348s = yearMonth;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114347r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114342l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114345p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114344n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114340h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f114336a, hVar.f114336a) && Intrinsics.f(this.f114337b, hVar.f114337b) && Intrinsics.f(this.f114338c, hVar.f114338c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f && Intrinsics.f(this.f114339g, hVar.f114339g) && Intrinsics.f(this.f114340h, hVar.f114340h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f114341j, hVar.f114341j) && Intrinsics.f(this.k, hVar.k) && this.f114342l == hVar.f114342l && Intrinsics.f(this.f114343m, hVar.f114343m) && Intrinsics.f(this.f114344n, hVar.f114344n) && Intrinsics.f(this.o, hVar.o) && this.f114345p == hVar.f114345p && Intrinsics.f(this.f114346q, hVar.f114346q) && this.f114347r == hVar.f114347r && Intrinsics.f(this.f114348s, hVar.f114348s);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114337b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114343m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114336a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114336a.hashCode() * 31;
        String str = this.f114337b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114338c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114339g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114340h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114341j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114342l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114343m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114344n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114345p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114346q;
        int iF = v7.f(this.f114347r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        YearMonth yearMonth = this.f114348s;
        return iF + (yearMonth != null ? yearMonth.hashCode() : 0);
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
        return this.f114346q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114338c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114341j;
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
        return this.f114339g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
