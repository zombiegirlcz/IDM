package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i0 {
    public final boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114263c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114265h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114266j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114269n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bfl.g f114273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Pair f114274t;
    public final dj0.d u;
    public final dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f114275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dj0.d f114276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f114277y;
    public final String z;

    public e(String id10, String compoundId, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str, WealthAccountType accountType, String str2, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, bfl.g side, Pair currencyPair, dj0.d net2, dj0.d total, q qVar, dj0.d price, String pocketId, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(net2, "net");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f114261a = id10;
        this.f114262b = compoundId;
        this.f114263c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114264g = l2;
        this.f114265h = l3;
        this.i = value;
        this.f114266j = instant;
        this.k = str;
        this.f114267l = accountType;
        this.f114268m = str2;
        this.f114269n = p0Var;
        this.o = p0Var2;
        this.f114270p = j0Var;
        this.f114271q = o0Var;
        this.f114272r = accountHolderType;
        this.f114273s = side;
        this.f114274t = currencyPair;
        this.u = net2;
        this.v = total;
        this.f114275w = qVar;
        this.f114276x = price;
        this.f114277y = pocketId;
        this.z = str3;
        this.A = z;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114272r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114267l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114270p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114269n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114265h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f114261a, eVar.f114261a) && Intrinsics.f(this.f114262b, eVar.f114262b) && Intrinsics.f(this.f114263c, eVar.f114263c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && Intrinsics.f(this.f114264g, eVar.f114264g) && Intrinsics.f(this.f114265h, eVar.f114265h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f114266j, eVar.f114266j) && Intrinsics.f(this.k, eVar.k) && this.f114267l == eVar.f114267l && Intrinsics.f(this.f114268m, eVar.f114268m) && Intrinsics.f(this.f114269n, eVar.f114269n) && Intrinsics.f(this.o, eVar.o) && this.f114270p == eVar.f114270p && Intrinsics.f(this.f114271q, eVar.f114271q) && this.f114272r == eVar.f114272r && this.f114273s == eVar.f114273s && Intrinsics.f(this.f114274t, eVar.f114274t) && Intrinsics.f(this.u, eVar.u) && Intrinsics.f(this.v, eVar.v) && Intrinsics.f(this.f114275w, eVar.f114275w) && Intrinsics.f(this.f114276x, eVar.f114276x) && Intrinsics.f(this.f114277y, eVar.f114277y) && Intrinsics.f(this.z, eVar.z) && this.A == eVar.A;
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114262b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114268m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114261a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c(p.a.c(this.f114261a.hashCode() * 31, 31, this.f114262b), 31, this.f114263c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114264g;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114265h;
        int iH = v7.h(this.i, (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114266j;
        int iHashCode2 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.k;
        int iE = m72.b.e(this.f114267l, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f114268m;
        int iHashCode3 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        p0 p0Var = this.f114269n;
        int iHashCode4 = (iHashCode3 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode5 = (iHashCode4 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114270p;
        int iHashCode6 = (iHashCode5 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114271q;
        int iC2 = v7.c(v7.c((this.f114274t.hashCode() + wp5.y.b(this.f114273s, v7.f(this.f114272r, (iHashCode6 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31), 31)) * 31, 31, this.u), 31, this.v);
        q qVar = this.f114275w;
        int iC3 = p.a.c(v7.c((iC2 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f114276x), 31, this.f114277y);
        String str3 = this.z;
        return Boolean.hashCode(this.A) + ((iC3 + (str3 != null ? str3.hashCode() : 0)) * 31);
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
        return this.f114271q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114263c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114266j;
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
        return this.f114264g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
