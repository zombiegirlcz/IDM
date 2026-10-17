package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114505c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114507h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114508j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114511n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f114515s;

    public w(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f114503a = id10;
        this.f114504b = str;
        this.f114505c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114506g = l2;
        this.f114507h = l3;
        this.i = value;
        this.f114508j = instant;
        this.k = str2;
        this.f114509l = accountType;
        this.f114510m = str3;
        this.f114511n = p0Var;
        this.o = p0Var2;
        this.f114512p = j0Var;
        this.f114513q = o0Var;
        this.f114514r = accountHolderType;
        this.f114515s = str4;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114514r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114509l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114512p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114511n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114507h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f114503a, wVar.f114503a) && Intrinsics.f(this.f114504b, wVar.f114504b) && Intrinsics.f(this.f114505c, wVar.f114505c) && Intrinsics.f(this.d, wVar.d) && this.e == wVar.e && this.f == wVar.f && Intrinsics.f(this.f114506g, wVar.f114506g) && Intrinsics.f(this.f114507h, wVar.f114507h) && Intrinsics.f(this.i, wVar.i) && Intrinsics.f(this.f114508j, wVar.f114508j) && Intrinsics.f(this.k, wVar.k) && this.f114509l == wVar.f114509l && Intrinsics.f(this.f114510m, wVar.f114510m) && Intrinsics.f(this.f114511n, wVar.f114511n) && Intrinsics.f(this.o, wVar.o) && this.f114512p == wVar.f114512p && Intrinsics.f(this.f114513q, wVar.f114513q) && this.f114514r == wVar.f114514r && Intrinsics.f(this.f114515s, wVar.f114515s);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114504b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114510m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114503a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114503a.hashCode() * 31;
        String str = this.f114504b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114505c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114506g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114507h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114508j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114509l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114510m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114511n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114512p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114513q;
        int iF = v7.f(this.f114514r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        String str4 = this.f114515s;
        return iF + (str4 != null ? str4.hashCode() : 0);
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
        return this.f114513q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114505c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114508j;
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
        return this.f114506g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
