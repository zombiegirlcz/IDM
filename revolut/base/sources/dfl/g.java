package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114311c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114313h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114314j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114317n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114318p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114319q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114320r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dj0.d f114321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dj0.d f114322t;
    public final String u;
    public final String v;

    public g(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, dj0.d dVar, dj0.d dVar2, String symbol, String instrumentName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        this.f114309a = id10;
        this.f114310b = str;
        this.f114311c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114312g = l2;
        this.f114313h = l3;
        this.i = value;
        this.f114314j = instant;
        this.k = str2;
        this.f114315l = accountType;
        this.f114316m = str3;
        this.f114317n = p0Var;
        this.o = p0Var2;
        this.f114318p = j0Var;
        this.f114319q = o0Var;
        this.f114320r = accountHolderType;
        this.f114321s = dVar;
        this.f114322t = dVar2;
        this.u = symbol;
        this.v = instrumentName;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114320r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114315l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114318p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114317n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114313h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f114309a, gVar.f114309a) && Intrinsics.f(this.f114310b, gVar.f114310b) && Intrinsics.f(this.f114311c, gVar.f114311c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && Intrinsics.f(this.f114312g, gVar.f114312g) && Intrinsics.f(this.f114313h, gVar.f114313h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f114314j, gVar.f114314j) && Intrinsics.f(this.k, gVar.k) && this.f114315l == gVar.f114315l && Intrinsics.f(this.f114316m, gVar.f114316m) && Intrinsics.f(this.f114317n, gVar.f114317n) && Intrinsics.f(this.o, gVar.o) && this.f114318p == gVar.f114318p && Intrinsics.f(this.f114319q, gVar.f114319q) && this.f114320r == gVar.f114320r && Intrinsics.f(this.f114321s, gVar.f114321s) && Intrinsics.f(this.f114322t, gVar.f114322t) && Intrinsics.f(this.u, gVar.u) && Intrinsics.f(this.v, gVar.v);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114310b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114316m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114309a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114309a.hashCode() * 31;
        String str = this.f114310b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114311c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114312g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114313h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114314j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114315l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114316m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114317n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114318p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114319q;
        int iF = v7.f(this.f114320r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        dj0.d dVar = this.f114321s;
        int iHashCode8 = (iF + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f114322t;
        return this.v.hashCode() + p.a.c((iHashCode8 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31, this.u);
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
        return this.f114319q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114311c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114314j;
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
        return this.f114312g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
