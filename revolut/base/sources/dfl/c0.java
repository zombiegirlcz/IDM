package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114224c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114226h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114227j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114230n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f114234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f114235t;
    public final String u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f114236w;

    public c0(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, String str4, Long l4, String symbol, List allLinkedSymbols, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(allLinkedSymbols, "allLinkedSymbols");
        this.f114222a = id10;
        this.f114223b = str;
        this.f114224c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114225g = l2;
        this.f114226h = l3;
        this.i = value;
        this.f114227j = instant;
        this.k = str2;
        this.f114228l = accountType;
        this.f114229m = str3;
        this.f114230n = p0Var;
        this.o = p0Var2;
        this.f114231p = j0Var;
        this.f114232q = o0Var;
        this.f114233r = accountHolderType;
        this.f114234s = str4;
        this.f114235t = l4;
        this.u = symbol;
        this.v = allLinkedSymbols;
        this.f114236w = str5;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114233r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114228l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114231p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114230n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114226h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f114222a, c0Var.f114222a) && Intrinsics.f(this.f114223b, c0Var.f114223b) && Intrinsics.f(this.f114224c, c0Var.f114224c) && Intrinsics.f(this.d, c0Var.d) && this.e == c0Var.e && this.f == c0Var.f && Intrinsics.f(this.f114225g, c0Var.f114225g) && Intrinsics.f(this.f114226h, c0Var.f114226h) && Intrinsics.f(this.i, c0Var.i) && Intrinsics.f(this.f114227j, c0Var.f114227j) && Intrinsics.f(this.k, c0Var.k) && this.f114228l == c0Var.f114228l && Intrinsics.f(this.f114229m, c0Var.f114229m) && Intrinsics.f(this.f114230n, c0Var.f114230n) && Intrinsics.f(this.o, c0Var.o) && this.f114231p == c0Var.f114231p && Intrinsics.f(this.f114232q, c0Var.f114232q) && this.f114233r == c0Var.f114233r && Intrinsics.f(this.f114234s, c0Var.f114234s) && Intrinsics.f(this.f114235t, c0Var.f114235t) && Intrinsics.f(this.u, c0Var.u) && Intrinsics.f(this.v, c0Var.v) && Intrinsics.f(this.f114236w, c0Var.f114236w);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114223b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114229m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114222a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114222a.hashCode() * 31;
        String str = this.f114223b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114224c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114225g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114226h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114227j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114228l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114229m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114230n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114231p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114232q;
        int iF = v7.f(this.f114233r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        String str4 = this.f114234s;
        int iHashCode8 = (iF + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.f114235t;
        int iD = p.a.d(p.a.c((iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.u), 31, this.v);
        String str5 = this.f114236w;
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
        return this.f114232q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114224c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114227j;
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
        return this.f114225g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
