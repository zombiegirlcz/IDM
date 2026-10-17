package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114492c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114494h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114495j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114498n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f114502s;

    public v(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f114490a = id10;
        this.f114491b = str;
        this.f114492c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114493g = l2;
        this.f114494h = l3;
        this.i = value;
        this.f114495j = instant;
        this.k = str2;
        this.f114496l = accountType;
        this.f114497m = str3;
        this.f114498n = p0Var;
        this.o = p0Var2;
        this.f114499p = j0Var;
        this.f114500q = o0Var;
        this.f114501r = accountHolderType;
        this.f114502s = arrayList;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114501r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114496l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114499p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114498n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114494h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f114490a, vVar.f114490a) && Intrinsics.f(this.f114491b, vVar.f114491b) && Intrinsics.f(this.f114492c, vVar.f114492c) && Intrinsics.f(this.d, vVar.d) && this.e == vVar.e && this.f == vVar.f && Intrinsics.f(this.f114493g, vVar.f114493g) && Intrinsics.f(this.f114494h, vVar.f114494h) && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f114495j, vVar.f114495j) && Intrinsics.f(this.k, vVar.k) && this.f114496l == vVar.f114496l && Intrinsics.f(this.f114497m, vVar.f114497m) && Intrinsics.f(this.f114498n, vVar.f114498n) && Intrinsics.f(this.o, vVar.o) && this.f114499p == vVar.f114499p && Intrinsics.f(this.f114500q, vVar.f114500q) && this.f114501r == vVar.f114501r && Intrinsics.f(this.f114502s, vVar.f114502s);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114491b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114497m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114490a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114490a.hashCode() * 31;
        String str = this.f114491b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114492c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114493g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114494h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114495j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114496l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114497m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114498n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114499p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114500q;
        int iF = v7.f(this.f114501r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        List list = this.f114502s;
        return iF + (list != null ? list.hashCode() : 0);
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
        return this.f114500q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114492c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114495j;
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
        return this.f114493g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }
}
