package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f3 {
    public final String A;
    public final String A0;
    public final String B;
    public final Long B0;
    public final String C;
    public final String C0;
    public final String D;
    public final String D0;
    public final String E;
    public final i0 E0;
    public final boolean F;
    public final String F0;
    public final k3 G;
    public final Boolean G0;
    public final Boolean H;
    public final String H0;
    public final Boolean I;
    public final String I0;
    public final String J;
    public final Integer K;
    public final Double L;
    public final String M;
    public final String N;
    public final String O;
    public final long P;
    public final String Q;
    public final k2 R;
    public final Long S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final p X;
    public final n Y;
    public final j Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215798a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final r2 f215799a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215800b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final k f215801b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215802c;
    public final f c0;
    public final String d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final m4 f215803d0;
    public final long e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final g3 f215804e0;
    public final long f;
    public final a0 f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f215805g;
    public final g g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f215806h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final b1 f215807h0;
    public final String i;
    public final z0 i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f215808j;
    public final String j0;
    public final String k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final a2 f215809k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f215810l;
    public final String l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f215811m;
    public final e3 m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f215812n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final x0 f215813n0;
    public final Long o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final a1 f215814o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f215815p;
    public final o p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f215816q;
    public final String q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f215817r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final n4 f215818r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f215819s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final s3 f215820s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f215821t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final s1 f215822t0;
    public final String u;
    public final a u0;
    public final Double v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final a f215823v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f215824w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final h f215825w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f215826x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final i f215827x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f215828y;
    public final z2 y0;
    public final Boolean z;
    public final String z0;

    public f3(String legId, String groupId, String type, String state, long j2, long j3, long j5, long j16, String currency, long j22, String pocketId, String pocketType, String category, Long l2, Long l3, String str, String str2, String str3, String str4, long j42, String str5, Double d, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, String str12, boolean z, k3 k3Var, Boolean bool3, Boolean bool4, String str13, Integer num, Double d5, String str14, String str15, String str16, long j46, String analyticsGroupId, k2 k2Var, Long l4, String str17, String str18, String str19, String str20, p pVar, n nVar, j jVar, r2 r2Var, k kVar, f fVar, m4 m4Var, g3 g3Var, a0 a0Var, g gVar, b1 b1Var, z0 z0Var, String str21, a2 a2Var, String str22, e3 e3Var, x0 x0Var, a1 a1Var, o oVar, String str23, n4 n4Var, s3 s3Var, s1 s1Var, a aVar, a aVar2, h hVar, i iVar, z2 z2Var, String str24, String str25, Long l5, String str26, String str27, i0 i0Var, String str28, Boolean bool5, String str29, String str30) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(analyticsGroupId, "analyticsGroupId");
        this.f215798a = legId;
        this.f215800b = groupId;
        this.f215802c = type;
        this.d = state;
        this.e = j2;
        this.f = j3;
        this.f215805g = j5;
        this.f215806h = j16;
        this.i = currency;
        this.f215808j = j22;
        this.k = pocketId;
        this.f215810l = pocketType;
        this.f215811m = category;
        this.f215812n = l2;
        this.o = l3;
        this.f215815p = str;
        this.f215816q = str2;
        this.f215817r = str3;
        this.f215819s = str4;
        this.f215821t = j42;
        this.u = str5;
        this.v = d;
        this.f215824w = str6;
        this.f215826x = str7;
        this.f215828y = bool;
        this.z = bool2;
        this.A = str8;
        this.B = str9;
        this.C = str10;
        this.D = str11;
        this.E = str12;
        this.F = z;
        this.G = k3Var;
        this.H = bool3;
        this.I = bool4;
        this.J = str13;
        this.K = num;
        this.L = d5;
        this.M = str14;
        this.N = str15;
        this.O = str16;
        this.P = j46;
        this.Q = analyticsGroupId;
        this.R = k2Var;
        this.S = l4;
        this.T = str17;
        this.U = str18;
        this.V = str19;
        this.W = str20;
        this.X = pVar;
        this.Y = nVar;
        this.Z = jVar;
        this.f215799a0 = r2Var;
        this.f215801b0 = kVar;
        this.c0 = fVar;
        this.f215803d0 = m4Var;
        this.f215804e0 = g3Var;
        this.f0 = a0Var;
        this.g0 = gVar;
        this.f215807h0 = b1Var;
        this.i0 = z0Var;
        this.j0 = str21;
        this.f215809k0 = a2Var;
        this.l0 = str22;
        this.m0 = e3Var;
        this.f215813n0 = x0Var;
        this.f215814o0 = a1Var;
        this.p0 = oVar;
        this.q0 = str23;
        this.f215818r0 = n4Var;
        this.f215820s0 = s3Var;
        this.f215822t0 = s1Var;
        this.u0 = aVar;
        this.f215823v0 = aVar2;
        this.f215825w0 = hVar;
        this.f215827x0 = iVar;
        this.y0 = z2Var;
        this.z0 = str24;
        this.A0 = str25;
        this.B0 = l5;
        this.C0 = str26;
        this.D0 = str27;
        this.E0 = i0Var;
        this.F0 = str28;
        this.G0 = bool5;
        this.H0 = str29;
        this.I0 = str30;
    }

    public static f3 a(f3 f3Var, k2 k2Var, Long l2, int i) {
        String legId = f3Var.f215798a;
        String groupId = f3Var.f215800b;
        String type = f3Var.f215802c;
        String state = f3Var.d;
        long j2 = f3Var.e;
        long j3 = f3Var.f;
        long j5 = f3Var.f215805g;
        long j16 = f3Var.f215806h;
        String currency = f3Var.i;
        long j22 = f3Var.f215808j;
        String pocketId = f3Var.k;
        String pocketType = f3Var.f215810l;
        String category = f3Var.f215811m;
        Long l3 = f3Var.f215812n;
        Long l4 = f3Var.o;
        String str = f3Var.f215815p;
        String str2 = f3Var.f215816q;
        String str3 = f3Var.f215817r;
        String str4 = f3Var.f215819s;
        long j42 = f3Var.f215821t;
        String str5 = f3Var.u;
        Double d = f3Var.v;
        String str6 = f3Var.f215824w;
        String str7 = f3Var.f215826x;
        Boolean bool = f3Var.f215828y;
        Boolean bool2 = f3Var.z;
        String str8 = f3Var.A;
        String str9 = f3Var.B;
        String str10 = f3Var.C;
        String str11 = f3Var.D;
        String str12 = f3Var.E;
        boolean z = f3Var.F;
        k3 k3Var = f3Var.G;
        Boolean bool3 = f3Var.H;
        Boolean bool4 = f3Var.I;
        String str13 = f3Var.J;
        Integer num = f3Var.K;
        Double d5 = f3Var.L;
        String str14 = f3Var.M;
        String str15 = f3Var.N;
        String str16 = f3Var.O;
        long j46 = f3Var.P;
        String analyticsGroupId = f3Var.Q;
        Long l5 = (i & 4096) != 0 ? f3Var.S : l2;
        String str17 = f3Var.T;
        String str18 = f3Var.U;
        String str19 = f3Var.V;
        String str20 = f3Var.W;
        p pVar = f3Var.X;
        n nVar = f3Var.Y;
        j jVar = f3Var.Z;
        r2 r2Var = f3Var.f215799a0;
        k kVar = f3Var.f215801b0;
        f fVar = f3Var.c0;
        m4 m4Var = f3Var.f215803d0;
        g3 g3Var = f3Var.f215804e0;
        a0 a0Var = f3Var.f0;
        g gVar = f3Var.g0;
        b1 b1Var = f3Var.f215807h0;
        z0 z0Var = f3Var.i0;
        String str21 = f3Var.j0;
        a2 a2Var = f3Var.f215809k0;
        String str22 = f3Var.l0;
        e3 e3Var = f3Var.m0;
        x0 x0Var = f3Var.f215813n0;
        a1 a1Var = f3Var.f215814o0;
        o oVar = f3Var.p0;
        String str23 = f3Var.q0;
        n4 n4Var = f3Var.f215818r0;
        s3 s3Var = f3Var.f215820s0;
        s1 s1Var = f3Var.f215822t0;
        a aVar = f3Var.u0;
        a aVar2 = f3Var.f215823v0;
        h hVar = f3Var.f215825w0;
        i iVar = f3Var.f215827x0;
        z2 z2Var = f3Var.y0;
        String str24 = f3Var.z0;
        String str25 = f3Var.A0;
        Long l22 = f3Var.B0;
        String str26 = f3Var.C0;
        String str27 = f3Var.D0;
        i0 i0Var = f3Var.E0;
        String str28 = f3Var.F0;
        Boolean bool5 = f3Var.G0;
        String str29 = f3Var.H0;
        String str30 = f3Var.I0;
        f3Var.getClass();
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(analyticsGroupId, "analyticsGroupId");
        return new f3(legId, groupId, type, state, j2, j3, j5, j16, currency, j22, pocketId, pocketType, category, l3, l4, str, str2, str3, str4, j42, str5, d, str6, str7, bool, bool2, str8, str9, str10, str11, str12, z, k3Var, bool3, bool4, str13, num, d5, str14, str15, str16, j46, analyticsGroupId, k2Var, l5, str17, str18, str19, str20, pVar, nVar, jVar, r2Var, kVar, fVar, m4Var, g3Var, a0Var, gVar, b1Var, z0Var, str21, a2Var, str22, e3Var, x0Var, a1Var, oVar, str23, n4Var, s3Var, s1Var, aVar, aVar2, hVar, iVar, z2Var, str24, str25, l22, str26, str27, i0Var, str28, bool5, str29, str30);
    }

    public final String A() {
        return this.F0;
    }

    public final String A0() {
        return this.C;
    }

    public final String B() {
        return this.O;
    }

    public final String B0() {
        return this.l0;
    }

    public final long C() {
        return this.e;
    }

    public final String C0() {
        return this.D;
    }

    public final a0 D() {
        return this.f0;
    }

    public final Boolean D0() {
        return this.H;
    }

    public final String E() {
        return this.i;
    }

    public final String E0() {
        return this.f215802c;
    }

    public final String F() {
        return this.f215815p;
    }

    public final long F0() {
        return this.f215805g;
    }

    public final String G() {
        return this.A0;
    }

    public final m4 G0() {
        return this.f215803d0;
    }

    public final e3 H() {
        return this.m0;
    }

    public final String H0() {
        return this.q0;
    }

    public final Boolean I() {
        return this.f215828y;
    }

    public final n4 I0() {
        return this.f215818r0;
    }

    public final String J() {
        return this.M;
    }

    public final boolean J0() {
        return this.F;
    }

    public final i0 K() {
        return this.E0;
    }

    public final String L() {
        return this.B;
    }

    public final Double M() {
        return this.v;
    }

    public final String N() {
        return this.f215826x;
    }

    public final String O() {
        return this.f215824w;
    }

    public final a P() {
        return this.u0;
    }

    public final g3 Q() {
        return this.f215804e0;
    }

    public final String R() {
        return this.f215800b;
    }

    public final String S() {
        return this.N;
    }

    public final x0 T() {
        return this.f215813n0;
    }

    public final z0 U() {
        return this.i0;
    }

    public final String V() {
        return this.E;
    }

    public final a1 W() {
        return this.f215814o0;
    }

    public final b1 X() {
        return this.f215807h0;
    }

    public final String Y() {
        return this.f215798a;
    }

    public final k3 Z() {
        return this.G;
    }

    public final String a0() {
        return this.f215817r;
    }

    public final Integer b() {
        return this.K;
    }

    public final String b0() {
        return this.V;
    }

    public final Double c() {
        return this.L;
    }

    public final String c0() {
        return this.W;
    }

    public final f d() {
        return this.c0;
    }

    public final Long d0() {
        return this.B0;
    }

    public final long e() {
        return this.f215806h;
    }

    public final String e0() {
        return this.C0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return Intrinsics.f(this.f215798a, f3Var.f215798a) && Intrinsics.f(this.f215800b, f3Var.f215800b) && Intrinsics.f(this.f215802c, f3Var.f215802c) && Intrinsics.f(this.d, f3Var.d) && this.e == f3Var.e && this.f == f3Var.f && this.f215805g == f3Var.f215805g && this.f215806h == f3Var.f215806h && Intrinsics.f(this.i, f3Var.i) && this.f215808j == f3Var.f215808j && Intrinsics.f(this.k, f3Var.k) && Intrinsics.f(this.f215810l, f3Var.f215810l) && Intrinsics.f(this.f215811m, f3Var.f215811m) && Intrinsics.f(this.f215812n, f3Var.f215812n) && Intrinsics.f(this.o, f3Var.o) && Intrinsics.f(this.f215815p, f3Var.f215815p) && Intrinsics.f(this.f215816q, f3Var.f215816q) && Intrinsics.f(this.f215817r, f3Var.f215817r) && Intrinsics.f(this.f215819s, f3Var.f215819s) && this.f215821t == f3Var.f215821t && Intrinsics.f(this.u, f3Var.u) && Intrinsics.f(this.v, f3Var.v) && Intrinsics.f(this.f215824w, f3Var.f215824w) && Intrinsics.f(this.f215826x, f3Var.f215826x) && Intrinsics.f(this.f215828y, f3Var.f215828y) && Intrinsics.f(this.z, f3Var.z) && Intrinsics.f(this.A, f3Var.A) && Intrinsics.f(this.B, f3Var.B) && Intrinsics.f(this.C, f3Var.C) && Intrinsics.f(this.D, f3Var.D) && Intrinsics.f(this.E, f3Var.E) && this.F == f3Var.F && Intrinsics.f(this.G, f3Var.G) && Intrinsics.f(this.H, f3Var.H) && Intrinsics.f(this.I, f3Var.I) && Intrinsics.f(this.J, f3Var.J) && Intrinsics.f(this.K, f3Var.K) && Intrinsics.f(this.L, f3Var.L) && Intrinsics.f(this.M, f3Var.M) && Intrinsics.f(this.N, f3Var.N) && Intrinsics.f(this.O, f3Var.O) && this.P == f3Var.P && Intrinsics.f(this.Q, f3Var.Q) && Intrinsics.f(this.R, f3Var.R) && Intrinsics.f(this.S, f3Var.S) && Intrinsics.f(this.T, f3Var.T) && Intrinsics.f(this.U, f3Var.U) && Intrinsics.f(this.V, f3Var.V) && Intrinsics.f(this.W, f3Var.W) && Intrinsics.f(this.X, f3Var.X) && Intrinsics.f(this.Y, f3Var.Y) && Intrinsics.f(this.Z, f3Var.Z) && Intrinsics.f(this.f215799a0, f3Var.f215799a0) && Intrinsics.f(this.f215801b0, f3Var.f215801b0) && Intrinsics.f(this.c0, f3Var.c0) && Intrinsics.f(this.f215803d0, f3Var.f215803d0) && Intrinsics.f(this.f215804e0, f3Var.f215804e0) && Intrinsics.f(this.f0, f3Var.f0) && Intrinsics.f(this.g0, f3Var.g0) && Intrinsics.f(this.f215807h0, f3Var.f215807h0) && Intrinsics.f(this.i0, f3Var.i0) && Intrinsics.f(this.j0, f3Var.j0) && Intrinsics.f(this.f215809k0, f3Var.f215809k0) && Intrinsics.f(this.l0, f3Var.l0) && Intrinsics.f(this.m0, f3Var.m0) && Intrinsics.f(this.f215813n0, f3Var.f215813n0) && Intrinsics.f(this.f215814o0, f3Var.f215814o0) && Intrinsics.f(this.p0, f3Var.p0) && Intrinsics.f(this.q0, f3Var.q0) && Intrinsics.f(this.f215818r0, f3Var.f215818r0) && Intrinsics.f(this.f215820s0, f3Var.f215820s0) && Intrinsics.f(this.f215822t0, f3Var.f215822t0) && Intrinsics.f(this.u0, f3Var.u0) && Intrinsics.f(this.f215823v0, f3Var.f215823v0) && Intrinsics.f(this.f215825w0, f3Var.f215825w0) && Intrinsics.f(this.f215827x0, f3Var.f215827x0) && Intrinsics.f(this.y0, f3Var.y0) && Intrinsics.f(this.z0, f3Var.z0) && Intrinsics.f(this.A0, f3Var.A0) && Intrinsics.f(this.B0, f3Var.B0) && Intrinsics.f(this.C0, f3Var.C0) && Intrinsics.f(this.D0, f3Var.D0) && Intrinsics.f(this.E0, f3Var.E0) && Intrinsics.f(this.F0, f3Var.F0) && Intrinsics.f(this.G0, f3Var.G0) && Intrinsics.f(this.H0, f3Var.H0) && Intrinsics.f(this.I0, f3Var.I0);
    }

    public final g f() {
        return this.g0;
    }

    public final s1 f0() {
        return this.f215822t0;
    }

    public final long g() {
        return this.f215821t;
    }

    public final String g0() {
        return this.z0;
    }

    public final long h() {
        return this.P;
    }

    public final String h0() {
        return this.I0;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(a0.d.c(p.a.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(p.a.c(p.a.c(p.a.c(this.f215798a.hashCode() * 31, 31, this.f215800b), 31, this.f215802c), 31, this.d), 31, this.e), 31, this.f), 31, this.f215805g), 31, this.f215806h), 31, this.i), 31, this.f215808j), 31, this.k), 31, this.f215810l), 31, this.f215811m);
        Long l2 = this.f215812n;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.o;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.f215815p;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215816q;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215817r;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f215819s;
        int iC2 = a0.d.c((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f215821t);
        String str5 = this.u;
        int iHashCode6 = (iC2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.v;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        String str6 = this.f215824w;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215826x;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f215828y;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.z;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.A;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.B;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.C;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.D;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.E;
        int iC3 = j6.a.c((iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.F);
        k3 k3Var = this.G;
        int iHashCode16 = (iC3 + (k3Var == null ? 0 : k3Var.hashCode())) * 31;
        Boolean bool3 = this.H;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.I;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str13 = this.J;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.K;
        int iHashCode20 = (iHashCode19 + (num == null ? 0 : num.hashCode())) * 31;
        Double d5 = this.L;
        int iHashCode21 = (iHashCode20 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str14 = this.M;
        int iHashCode22 = (iHashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.N;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.O;
        int iC4 = p.a.c(a0.d.c((iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31, 31, this.P), 31, this.Q);
        k2 k2Var = this.R;
        int iHashCode24 = (iC4 + (k2Var == null ? 0 : k2Var.f215899a.hashCode())) * 31;
        Long l4 = this.S;
        int iHashCode25 = (iHashCode24 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str17 = this.T;
        int iHashCode26 = (iHashCode25 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.U;
        int iHashCode27 = (iHashCode26 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.V;
        int iHashCode28 = (iHashCode27 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.W;
        int iHashCode29 = (iHashCode28 + (str20 == null ? 0 : str20.hashCode())) * 31;
        p pVar = this.X;
        int iHashCode30 = (iHashCode29 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        n nVar = this.Y;
        int iHashCode31 = (iHashCode30 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        j jVar = this.Z;
        int iHashCode32 = (iHashCode31 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        r2 r2Var = this.f215799a0;
        int iHashCode33 = (iHashCode32 + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
        k kVar = this.f215801b0;
        int iHashCode34 = (iHashCode33 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        f fVar = this.c0;
        int iHashCode35 = (iHashCode34 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        m4 m4Var = this.f215803d0;
        int iHashCode36 = (iHashCode35 + (m4Var == null ? 0 : m4Var.hashCode())) * 31;
        g3 g3Var = this.f215804e0;
        int iHashCode37 = (iHashCode36 + (g3Var == null ? 0 : g3Var.hashCode())) * 31;
        a0 a0Var = this.f0;
        int iHashCode38 = (iHashCode37 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        g gVar = this.g0;
        int iHashCode39 = (iHashCode38 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        b1 b1Var = this.f215807h0;
        int iHashCode40 = (iHashCode39 + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        z0 z0Var = this.i0;
        int iHashCode41 = (iHashCode40 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        String str21 = this.j0;
        int iHashCode42 = (iHashCode41 + (str21 == null ? 0 : str21.hashCode())) * 31;
        a2 a2Var = this.f215809k0;
        int iHashCode43 = (iHashCode42 + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        String str22 = this.l0;
        int iHashCode44 = (iHashCode43 + (str22 == null ? 0 : str22.hashCode())) * 31;
        e3 e3Var = this.m0;
        int iHashCode45 = (iHashCode44 + (e3Var == null ? 0 : e3Var.hashCode())) * 31;
        x0 x0Var = this.f215813n0;
        int iHashCode46 = (iHashCode45 + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        a1 a1Var = this.f215814o0;
        int iHashCode47 = (iHashCode46 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        o oVar = this.p0;
        int iHashCode48 = (iHashCode47 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str23 = this.q0;
        int iHashCode49 = (iHashCode48 + (str23 == null ? 0 : str23.hashCode())) * 31;
        n4 n4Var = this.f215818r0;
        int iHashCode50 = (iHashCode49 + (n4Var == null ? 0 : n4Var.hashCode())) * 31;
        s3 s3Var = this.f215820s0;
        int iHashCode51 = (iHashCode50 + (s3Var == null ? 0 : s3Var.hashCode())) * 31;
        s1 s1Var = this.f215822t0;
        int iHashCode52 = (iHashCode51 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        a aVar = this.u0;
        int iHashCode53 = (iHashCode52 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f215823v0;
        int iHashCode54 = (iHashCode53 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        h hVar = this.f215825w0;
        int iHashCode55 = (iHashCode54 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.f215827x0;
        int iHashCode56 = (iHashCode55 + (iVar == null ? 0 : iVar.f215856a.hashCode())) * 31;
        z2 z2Var = this.y0;
        int iHashCode57 = (iHashCode56 + (z2Var == null ? 0 : z2Var.hashCode())) * 31;
        String str24 = this.z0;
        int iHashCode58 = (iHashCode57 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.A0;
        int iHashCode59 = (iHashCode58 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Long l5 = this.B0;
        int iHashCode60 = (iHashCode59 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str26 = this.C0;
        int iHashCode61 = (iHashCode60 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.D0;
        int iHashCode62 = (iHashCode61 + (str27 == null ? 0 : str27.hashCode())) * 31;
        i0 i0Var = this.E0;
        int iHashCode63 = (iHashCode62 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        String str28 = this.F0;
        int iHashCode64 = (iHashCode63 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Boolean bool5 = this.G0;
        int iHashCode65 = (iHashCode64 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str29 = this.H0;
        int iHashCode66 = (iHashCode65 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.I0;
        return iHashCode66 + (str30 != null ? str30.hashCode() : 0);
    }

    public final String i() {
        return this.Q;
    }

    public final String i0() {
        return this.D0;
    }

    public final h j() {
        return this.f215825w0;
    }

    public final long j0() {
        return this.f215808j;
    }

    public final i k() {
        return this.f215827x0;
    }

    public final String k0() {
        return this.k;
    }

    public final j l() {
        return this.Z;
    }

    public final String l0() {
        return this.f215810l;
    }

    public final Long m() {
        return this.o;
    }

    public final a2 m0() {
        return this.f215809k0;
    }

    public final k n() {
        return this.f215801b0;
    }

    public final String n0() {
        return this.T;
    }

    public final Long o() {
        return this.S;
    }

    public final s3 o0() {
        return this.f215820s0;
    }

    public final n p() {
        return this.Y;
    }

    public final String p0() {
        return this.u;
    }

    public final String q() {
        return this.j0;
    }

    public final String q0() {
        return this.f215819s;
    }

    public final Boolean r() {
        return this.z;
    }

    public final k2 r0() {
        return this.R;
    }

    public final String s() {
        return this.A;
    }

    public final String s0() {
        return this.H0;
    }

    public final String t() {
        return this.f215811m;
    }

    public final String t0() {
        return this.U;
    }

    public final Boolean u() {
        return this.I;
    }

    public final Boolean u0() {
        return this.G0;
    }

    public final String v() {
        return this.J;
    }

    public final r2 v0() {
        return this.f215799a0;
    }

    public final z2 w() {
        return this.y0;
    }

    public final long w0() {
        return this.f;
    }

    public final o x() {
        return this.p0;
    }

    public final String x0() {
        return this.d;
    }

    public final Long y() {
        return this.f215812n;
    }

    public final String y0() {
        return this.f215816q;
    }

    public final p z() {
        return this.X;
    }

    public final a z0() {
        return this.f215823v0;
    }
}
