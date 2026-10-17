package dfl;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i0 {
    public final String A;
    public final bel.a B;
    public final bel.a C;
    public final n0 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114181c;
    public final String d;
    public final q0 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f114182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f114183h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f114184j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WealthAccountType f114185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f114186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f114187n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f114188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f114189q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cfl.j f114190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bfl.g f114191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f114192t;
    public final boolean u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f114193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Boolean f114194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f114195y;
    public final Boolean z;

    public b(String id10, String str, String ref2, String holdingId, q0 state, long j2, Long l2, Long l3, q value, Instant instant, String str2, WealthAccountType accountType, String str3, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j accountHolderType, bfl.g side, String str4, boolean z, String str5, f fVar, Boolean bool, Boolean bool2, Boolean bool3, String str6, bel.a aVar, bel.a aVar2, n0 n0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f114179a = id10;
        this.f114180b = str;
        this.f114181c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = j2;
        this.f114182g = l2;
        this.f114183h = l3;
        this.i = value;
        this.f114184j = instant;
        this.k = str2;
        this.f114185l = accountType;
        this.f114186m = str3;
        this.f114187n = p0Var;
        this.o = p0Var2;
        this.f114188p = j0Var;
        this.f114189q = o0Var;
        this.f114190r = accountHolderType;
        this.f114191s = side;
        this.f114192t = str4;
        this.u = z;
        this.v = str5;
        this.f114193w = fVar;
        this.f114194x = bool;
        this.f114195y = bool2;
        this.z = bool3;
        this.A = str6;
        this.B = aVar;
        this.C = aVar2;
        this.D = n0Var;
    }

    @Override // dfl.i0
    public final cfl.j a() {
        return this.f114190r;
    }

    @Override // dfl.i0
    public final WealthAccountType b() {
        return this.f114185l;
    }

    @Override // dfl.i0
    public final j0 c() {
        return this.f114188p;
    }

    @Override // dfl.i0
    public final p0 d() {
        return this.f114187n;
    }

    @Override // dfl.i0
    public final Long e() {
        return this.f114183h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f114179a, bVar.f114179a) && Intrinsics.f(this.f114180b, bVar.f114180b) && Intrinsics.f(this.f114181c, bVar.f114181c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && Intrinsics.f(this.f114182g, bVar.f114182g) && Intrinsics.f(this.f114183h, bVar.f114183h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f114184j, bVar.f114184j) && Intrinsics.f(this.k, bVar.k) && this.f114185l == bVar.f114185l && Intrinsics.f(this.f114186m, bVar.f114186m) && Intrinsics.f(this.f114187n, bVar.f114187n) && Intrinsics.f(this.o, bVar.o) && this.f114188p == bVar.f114188p && Intrinsics.f(this.f114189q, bVar.f114189q) && this.f114190r == bVar.f114190r && this.f114191s == bVar.f114191s && Intrinsics.f(this.f114192t, bVar.f114192t) && this.u == bVar.u && Intrinsics.f(this.v, bVar.v) && this.f114193w == bVar.f114193w && Intrinsics.f(this.f114194x, bVar.f114194x) && Intrinsics.f(this.f114195y, bVar.f114195y) && Intrinsics.f(this.z, bVar.z) && Intrinsics.f(this.A, bVar.A) && Intrinsics.f(this.B, bVar.B) && Intrinsics.f(this.C, bVar.C) && Intrinsics.f(this.D, bVar.D);
    }

    @Override // dfl.i0
    public final String f() {
        return this.f114180b;
    }

    @Override // dfl.i0
    public final String g() {
        return this.f114186m;
    }

    @Override // dfl.i0
    public final String getId() {
        return this.f114179a;
    }

    @Override // dfl.i0
    public final p0 h() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.f114179a.hashCode() * 31;
        String str = this.f114180b;
        int iC = a0.d.c(com.revolut.data.database.models.openbanking.d.d(this.e, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f114181c), 31, this.d), 31), 31, this.f);
        Long l2 = this.f114182g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f114183h;
        int iH = v7.h(this.i, (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        Instant instant = this.f114184j;
        int iHashCode3 = (iH + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.k;
        int iE = m72.b.e(this.f114185l, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f114186m;
        int iHashCode4 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        p0 p0Var = this.f114187n;
        int iHashCode5 = (iHashCode4 + (p0Var == null ? 0 : p0Var.f114449a.hashCode())) * 31;
        p0 p0Var2 = this.o;
        int iHashCode6 = (iHashCode5 + (p0Var2 == null ? 0 : p0Var2.f114449a.hashCode())) * 31;
        j0 j0Var = this.f114188p;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        o0 o0Var = this.f114189q;
        int iB = wp5.y.b(this.f114191s, v7.f(this.f114190r, (iHashCode7 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31), 31);
        String str4 = this.f114192t;
        int iC2 = j6.a.c((iB + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.u);
        String str5 = this.v;
        int iHashCode8 = (iC2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        f fVar = this.f114193w;
        int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Boolean bool = this.f114194x;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f114195y;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.z;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.A;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        bel.a aVar = this.B;
        int iHashCode14 = (iHashCode13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        bel.a aVar2 = this.C;
        int iHashCode15 = (iHashCode14 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        n0 n0Var = this.D;
        return iHashCode15 + (n0Var != null ? n0Var.f114445a.hashCode() : 0);
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
        return this.f114189q;
    }

    @Override // dfl.i0
    public final String m() {
        return this.f114181c;
    }

    @Override // dfl.i0
    public final Instant n() {
        return this.f114184j;
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
        return this.f114182g;
    }

    @Override // dfl.i0
    public final q r() {
        return this.i;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, q0 q0Var, long j2, Long l2, Long l3, q qVar, Instant instant, String str5, WealthAccountType wealthAccountType, String str6, p0 p0Var, p0 p0Var2, j0 j0Var, o0 o0Var, cfl.j jVar, bfl.g gVar, String str7, boolean z, String str8, f fVar, Boolean bool, Boolean bool2, Boolean bool3, String str9, bel.a aVar, bel.a aVar2) {
        this(str, str2, str3, str4, q0Var, j2, l2, l3, qVar, instant, str5, wealthAccountType, str6, p0Var, p0Var2, j0Var, o0Var, jVar, gVar, str7, z, str8, fVar, bool, bool2, bool3, str9, aVar, aVar2, null);
    }
}
