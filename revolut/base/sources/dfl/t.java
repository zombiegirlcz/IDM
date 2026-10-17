package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114474c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114476h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114477j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114480n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f114484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f114485t;
    public final String u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f114486w;

    public t(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, String str4, Long l4, String symbol, List allLinkedSymbols, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(allLinkedSymbols, "allLinkedSymbols");
        this.f114472a = id10;
        this.f114473b = str;
        this.f114474c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114475g = l2;
        this.f114476h = l3;
        this.i = value;
        this.f114477j = instant;
        this.k = str2;
        this.f114478l = accountType;
        this.f114479m = str3;
        this.f114480n = p0Var;
        this.o = p0Var2;
        this.f114481p = j0Var;
        this.f114482q = o0Var;
        this.f114483r = accountHolderType;
        this.f114484s = str4;
        this.f114485t = l4;
        this.u = symbol;
        this.v = allLinkedSymbols;
        this.f114486w = str5;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114483r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114478l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114481p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114480n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114476h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f114472a, tVar.f114472a) && Intrinsics.f(this.f114473b, tVar.f114473b) && Intrinsics.f(this.f114474c, tVar.f114474c) && Intrinsics.f(this.d, tVar.d) && this.e == tVar.e && this.f == tVar.f && Intrinsics.f(this.f114475g, tVar.f114475g) && Intrinsics.f(this.f114476h, tVar.f114476h) && Intrinsics.f(this.i, tVar.i) && Intrinsics.f(this.f114477j, tVar.f114477j) && Intrinsics.f(this.k, tVar.k) && this.f114478l == tVar.f114478l && Intrinsics.f(this.f114479m, tVar.f114479m) && Intrinsics.f(this.f114480n, tVar.f114480n) && Intrinsics.f(this.o, tVar.o) && this.f114481p == tVar.f114481p && Intrinsics.f(this.f114482q, tVar.f114482q) && this.f114483r == tVar.f114483r && Intrinsics.f(this.f114484s, tVar.f114484s) && Intrinsics.f(this.f114485t, tVar.f114485t) && Intrinsics.f(this.u, tVar.u) && Intrinsics.f(this.v, tVar.v) && Intrinsics.f(this.f114486w, tVar.f114486w);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114473b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114479m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114472a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114472a.hashCode() * 31;
        String str = this.f114473b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114474c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114475g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114476h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114477j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114478l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114479m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114480n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114481p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114482q;
        int iF = v7.f(this.f114483r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        String str4 = this.f114484s;
        int iHashCode8 = (iF + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.f114485t;
        int iD = p.a.d(p.a.c((iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.u), 31, this.v);
        String str5 = this.f114486w;
        return iD + (str5 != null ? str5.hashCode() : 0);
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
        return this.f114482q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114474c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114477j;
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
        return this.f114475g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
