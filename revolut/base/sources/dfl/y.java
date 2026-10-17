package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114519c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114521h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114522j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114525n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f114529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f114530t;

    public y(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, String symbol, String instrumentName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        this.f114517a = id10;
        this.f114518b = str;
        this.f114519c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114520g = l2;
        this.f114521h = l3;
        this.i = value;
        this.f114522j = instant;
        this.k = str2;
        this.f114523l = accountType;
        this.f114524m = str3;
        this.f114525n = p0Var;
        this.o = p0Var2;
        this.f114526p = j0Var;
        this.f114527q = o0Var;
        this.f114528r = accountHolderType;
        this.f114529s = symbol;
        this.f114530t = instrumentName;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114528r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114523l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114526p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114525n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114521h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f114517a, yVar.f114517a) && Intrinsics.f(this.f114518b, yVar.f114518b) && Intrinsics.f(this.f114519c, yVar.f114519c) && Intrinsics.f(this.d, yVar.d) && this.e == yVar.e && this.f == yVar.f && Intrinsics.f(this.f114520g, yVar.f114520g) && Intrinsics.f(this.f114521h, yVar.f114521h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f114522j, yVar.f114522j) && Intrinsics.f(this.k, yVar.k) && this.f114523l == yVar.f114523l && Intrinsics.f(this.f114524m, yVar.f114524m) && Intrinsics.f(this.f114525n, yVar.f114525n) && Intrinsics.f(this.o, yVar.o) && this.f114526p == yVar.f114526p && Intrinsics.f(this.f114527q, yVar.f114527q) && this.f114528r == yVar.f114528r && Intrinsics.f(this.f114529s, yVar.f114529s) && Intrinsics.f(this.f114530t, yVar.f114530t);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114518b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114524m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114517a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114517a.hashCode() * 31;
        String str = this.f114518b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114519c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114520g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114521h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114522j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114523l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114524m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114525n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114526p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114527q;
        return this.f114530t.hashCode() + p.a.c(v7.f(this.f114528r, (iHashCode7 + (o0Var != null ? o0Var.hashCode() : 0)) * 31, 31), 31, this.f114529s);
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
        return this.f114527q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114519c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114522j;
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
        return this.f114520g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
