package tof;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.joda.time.DateTime;
import tof.h5;

/* JADX INFO: loaded from: classes8.dex */
public final class a3 implements fd0.c, Serializable {
    public final h3 A;
    public final r A0;
    public final String A1;
    public final String B;
    public final n3 B0;
    public final ibd.i C;
    public final z0 C0;
    public final m1 C1;
    public final String D;
    public final w0 D0;
    public final d3 E;
    public final s E0;
    public final e5 F;
    public final String F0;
    public final z6 G;
    public final Boolean G0;
    public final z6 H;
    public final Double H0;
    public final String H1;
    public final x6 I;
    public final String I0;
    public final o3 J;
    public final jc J0;
    public final String K;
    public final String K0;
    public final String K1;
    public final boolean L;
    public final k6 L0;
    public final a1 L1;
    public final wi0.b M;
    public final q1 M0;
    public final boolean M1;
    public final boolean N;
    public final boolean N0;
    public final dj0.d N1;
    public final boolean O;
    public final y O0;
    public final v1 O1;
    public final List P;
    public final x P0;
    public final q2 P1;
    public final i3 Q;
    public final u Q0;
    public final l0 Q1;
    public final String R;
    public final a R0;
    public final String R1;
    public final d7 S;
    public final a S0;
    public final Long T;
    public final k T0;
    public final String U;
    public final m U0;
    public final r3 V;
    public final t6 V0;
    public final p3 W;
    public final z2 W0;
    public final t5 X;
    public final LocalDate X0;
    public final String Y;
    public final LocalDate Y0;
    public final i5 Z;
    public final uof.a Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272579a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e1 f272580a0;
    public final Boolean a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272581b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final g3 f272582b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final Boolean f272583b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272584c;
    public final a5 c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final x1 f272585c1;
    public final String d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final r6 f272586d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final h1 f272587d1;
    public final y6 e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final kq2.l f272588e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final m3 f272589e1;
    public final v6 f;
    public final boolean f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final String f272590f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f272591g;
    public final Boolean g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final String f272592g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f272593h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final i2 f272594h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final b1 f272595h1;
    public final DateTime i;
    public final e i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f272596j;
    public final String j0;
    public final dj0.d k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final q f272597k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final u1 f272598k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f272599l;
    public final String l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f272600m;
    public final boolean m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f272601n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final w6 f272602n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final String f272603n1;
    public final dj0.d o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final y2 f272604o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final j5 f272605o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dj0.d f272606p;
    public final w4 p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final q0 f272607p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dj0.d f272608q;
    public final String q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f272609r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f272610r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f272611s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final p5 f272612s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final dj0.d f272613s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f272614t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final x0 f272615t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final dj0.d f272616t1;
    public final v4 u;
    public final boolean u0;
    public final String v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final aef.a f272617v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final v5 f272618v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final double f272619w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Instant f272620w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f272621x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final r4 f272622x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final s1 f272623x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w5 f272624y;
    public final f5 y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final dj0.d f272625y1;
    public final p0 z;
    public final String z0;

    public a3(String legId, String groupId, String str, String str2, y6 type, v6 state, DateTime createdDate, DateTime startedDate, DateTime updatedDate, DateTime dateTime, dj0.d amount, dj0.d pocketFee, String str3, dj0.d exchangeFee, dj0.d transferFee, dj0.d counterPartyFee, dj0.d dVar, String str4, String str5, String str6, v4 v4Var, String str7, double d, boolean z, w5 pocket, p0 exchangeDirection, h3 h3Var, String str8, ibd.i iVar, String str9, d3 d3Var, e5 e5Var, z6 z6Var, z6 z6Var2, x6 transferInfo, o3 o3Var, String str10, boolean z3, wi0.b bVar, boolean z4, boolean z6, List list, i3 category, String analyticsGroupId, d7 d7Var, Long l2, String str11, r3 r3Var, p3 p3Var, t5 t5Var, String str12, i5 i5Var, e1 e1Var, g3 g3Var, a5 a5Var, r6 r6Var, kq2.l lVar, boolean z11, Boolean bool, i2 i2Var, e eVar, String str13, q qVar, String str14, boolean z12, w6 w6Var, y2 y2Var, w4 w4Var, String str15, boolean z29, p5 p5Var, x0 x0Var, boolean z31, aef.a aVar, Instant instant, r4 r4Var, f5 f5Var, String str16, r rVar, n3 n3Var, z0 z0Var, w0 w0Var, s sVar, String str17, Boolean bool2, Double d5, String str18, jc jcVar, String str19, k6 k6Var, q1 q1Var, boolean z41, y yVar, x xVar, u uVar, a aVar2, a aVar3, k kVar, m mVar, t6 t6Var, z2 z2Var, LocalDate localDate, LocalDate localDate2, uof.a aVar4, Boolean bool3, Boolean bool4, x1 x1Var, h1 h1Var, m3 m3Var, String str20, String str21, b1 b1Var, u1 u1Var, String str22, j5 j5Var, q0 q0Var, dj0.d dVar2, dj0.d dVar3, v5 v5Var, s1 s1Var, dj0.d dVar4, String str23, m1 m1Var, String str24, String str25, a1 ledgerOrigin, boolean z49, dj0.d amountWithCharges, v1 v1Var, q2 q2Var, l0 l0Var, String str26) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(startedDate, "startedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(pocketFee, "pocketFee");
        Intrinsics.checkNotNullParameter(exchangeFee, "exchangeFee");
        Intrinsics.checkNotNullParameter(transferFee, "transferFee");
        Intrinsics.checkNotNullParameter(counterPartyFee, "counterPartyFee");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(exchangeDirection, "exchangeDirection");
        Intrinsics.checkNotNullParameter(transferInfo, "transferInfo");
        Intrinsics.checkNotNullParameter(category, "category");
        h5.a links = h5.a.f272785a;
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(analyticsGroupId, "analyticsGroupId");
        Intrinsics.checkNotNullParameter(ledgerOrigin, "ledgerOrigin");
        Intrinsics.checkNotNullParameter(amountWithCharges, "amountWithCharges");
        this.f272579a = legId;
        this.f272581b = groupId;
        this.f272584c = str;
        this.d = str2;
        this.e = type;
        this.f = state;
        this.f272591g = createdDate;
        this.f272593h = startedDate;
        this.i = updatedDate;
        this.f272596j = dateTime;
        this.k = amount;
        this.f272599l = pocketFee;
        this.f272600m = str3;
        this.f272601n = exchangeFee;
        this.o = transferFee;
        this.f272606p = counterPartyFee;
        this.f272608q = dVar;
        this.f272609r = str4;
        this.f272611s = str5;
        this.f272614t = str6;
        this.u = v4Var;
        this.v = str7;
        this.f272619w = d;
        this.f272621x = z;
        this.f272624y = pocket;
        this.z = exchangeDirection;
        this.A = h3Var;
        this.B = str8;
        this.C = iVar;
        this.D = str9;
        this.E = d3Var;
        this.F = e5Var;
        this.G = z6Var;
        this.H = z6Var2;
        this.I = transferInfo;
        this.J = o3Var;
        this.K = str10;
        this.L = z3;
        this.M = bVar;
        this.N = z4;
        this.O = z6;
        this.P = list;
        this.Q = category;
        this.R = analyticsGroupId;
        this.S = d7Var;
        this.T = l2;
        this.U = str11;
        this.V = r3Var;
        this.W = p3Var;
        this.X = t5Var;
        this.Y = str12;
        this.Z = i5Var;
        this.f272580a0 = e1Var;
        this.f272582b0 = g3Var;
        this.c0 = a5Var;
        this.f272586d0 = r6Var;
        this.f272588e0 = lVar;
        this.f0 = z11;
        this.g0 = bool;
        this.f272594h0 = i2Var;
        this.i0 = eVar;
        this.j0 = str13;
        this.f272597k0 = qVar;
        this.l0 = str14;
        this.m0 = z12;
        this.f272602n0 = w6Var;
        this.f272604o0 = y2Var;
        this.p0 = w4Var;
        this.q0 = str15;
        this.f272610r0 = z29;
        this.f272612s0 = p5Var;
        this.f272615t0 = x0Var;
        this.u0 = z31;
        this.f272617v0 = aVar;
        this.f272620w0 = instant;
        this.f272622x0 = r4Var;
        this.y0 = f5Var;
        this.z0 = str16;
        this.A0 = rVar;
        this.B0 = n3Var;
        this.C0 = z0Var;
        this.D0 = w0Var;
        this.E0 = sVar;
        this.F0 = str17;
        this.G0 = bool2;
        this.H0 = d5;
        this.I0 = str18;
        this.J0 = jcVar;
        this.K0 = str19;
        this.L0 = k6Var;
        this.M0 = q1Var;
        this.N0 = z41;
        this.O0 = yVar;
        this.P0 = xVar;
        this.Q0 = uVar;
        this.R0 = aVar2;
        this.S0 = aVar3;
        this.T0 = kVar;
        this.U0 = mVar;
        this.V0 = t6Var;
        this.W0 = z2Var;
        this.X0 = localDate;
        this.Y0 = localDate2;
        this.Z0 = aVar4;
        this.a1 = bool3;
        this.f272583b1 = bool4;
        this.f272585c1 = x1Var;
        this.f272587d1 = h1Var;
        this.f272589e1 = m3Var;
        this.f272590f1 = str20;
        this.f272592g1 = str21;
        this.f272595h1 = b1Var;
        this.f272598k1 = u1Var;
        this.f272603n1 = str22;
        this.f272605o1 = j5Var;
        this.f272607p1 = q0Var;
        this.f272613s1 = dVar2;
        this.f272616t1 = dVar3;
        this.f272618v1 = v5Var;
        this.f272623x1 = s1Var;
        this.f272625y1 = dVar4;
        this.A1 = str23;
        this.C1 = m1Var;
        this.H1 = str24;
        this.K1 = str25;
        this.L1 = ledgerOrigin;
        this.M1 = z49;
        this.N1 = amountWithCharges;
        this.O1 = v1Var;
        this.P1 = q2Var;
        this.Q1 = l0Var;
        this.R1 = str26;
    }

    public static a3 b(a3 a3Var, y6 y6Var, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, double d, boolean z, p0 p0Var, o3 o3Var, i3 i3Var, int i, int i2, int i3) {
        String str;
        dj0.d counterPartyFee;
        String str2;
        String str3;
        dj0.d dVar4;
        dj0.d dVar5;
        double d5;
        String str4;
        p0 exchangeDirection;
        String str5;
        o3 o3Var2;
        String legId = a3Var.f272579a;
        String groupId = a3Var.f272581b;
        String str6 = a3Var.f272584c;
        String str7 = a3Var.d;
        y6 type = (i & 16) != 0 ? a3Var.e : y6Var;
        v6 state = a3Var.f;
        DateTime createdDate = a3Var.f272591g;
        DateTime startedDate = a3Var.f272593h;
        DateTime updatedDate = a3Var.i;
        DateTime dateTime = a3Var.f272596j;
        dj0.d amount = (i & 1024) != 0 ? a3Var.k : dVar;
        dj0.d dVar6 = (i & 2048) != 0 ? a3Var.f272599l : dVar2;
        String str8 = a3Var.f272600m;
        dj0.d exchangeFee = a3Var.f272601n;
        dj0.d dVar7 = a3Var.o;
        if ((i & 32768) != 0) {
            str = str6;
            counterPartyFee = a3Var.f272606p;
        } else {
            str = str6;
            counterPartyFee = dVar3;
        }
        dj0.d dVar8 = a3Var.f272608q;
        String str9 = a3Var.f272609r;
        String str10 = a3Var.f272611s;
        if ((i & 524288) != 0) {
            str2 = str10;
            str3 = a3Var.f272614t;
        } else {
            str2 = str10;
            str3 = null;
        }
        a3Var.getClass();
        String str11 = str3;
        v4 v4Var = (i & PKIFailureInfo.badSenderNonce) != 0 ? a3Var.u : null;
        String str12 = (i & 4194304) != 0 ? a3Var.v : null;
        if ((i & 8388608) != 0) {
            dVar4 = dVar6;
            dVar5 = dVar7;
            d5 = a3Var.f272619w;
        } else {
            dVar4 = dVar6;
            dVar5 = dVar7;
            d5 = d;
        }
        String str13 = str12;
        boolean z3 = (i & 16777216) != 0 ? a3Var.f272621x : z;
        w5 pocket = a3Var.f272624y;
        if ((i & 67108864) != 0) {
            str4 = str7;
            exchangeDirection = a3Var.z;
        } else {
            str4 = str7;
            exchangeDirection = p0Var;
        }
        double d6 = d5;
        h3 h3Var = a3Var.A;
        String str14 = a3Var.B;
        ibd.i iVar = a3Var.C;
        String str15 = a3Var.D;
        d3 d3Var = a3Var.E;
        e5 e5Var = a3Var.F;
        z6 z6Var = a3Var.G;
        z6 z6Var2 = a3Var.H;
        x6 transferInfo = a3Var.I;
        if ((i2 & 16) != 0) {
            str5 = str14;
            o3Var2 = a3Var.J;
        } else {
            str5 = str14;
            o3Var2 = o3Var;
        }
        String str16 = a3Var.K;
        boolean z4 = a3Var.L;
        wi0.b bVar = a3Var.M;
        boolean z6 = a3Var.N;
        boolean z11 = a3Var.O;
        List list = a3Var.P;
        i3 category = (i2 & 2048) != 0 ? a3Var.Q : i3Var;
        a3Var.getClass();
        a3Var.getClass();
        a3Var.getClass();
        String analyticsGroupId = a3Var.R;
        d7 d7Var = a3Var.S;
        Long l2 = a3Var.T;
        String str17 = a3Var.U;
        r3 r3Var = (i2 & 524288) != 0 ? a3Var.V : null;
        p3 p3Var = a3Var.W;
        t5 t5Var = a3Var.X;
        String str18 = (i2 & 4194304) != 0 ? a3Var.Y : null;
        i5 i5Var = (i2 & 8388608) != 0 ? a3Var.Z : null;
        e1 e1Var = a3Var.f272580a0;
        g3 g3Var = a3Var.f272582b0;
        a5 a5Var = a3Var.c0;
        r6 r6Var = a3Var.f272586d0;
        kq2.l lVar = a3Var.f272588e0;
        boolean z12 = a3Var.f0;
        Boolean bool = a3Var.g0;
        i2 i2Var = a3Var.f272594h0;
        e eVar = a3Var.i0;
        String str19 = a3Var.j0;
        q qVar = a3Var.f272597k0;
        String str20 = a3Var.l0;
        boolean z29 = a3Var.m0;
        w6 w6Var = a3Var.f272602n0;
        y2 y2Var = a3Var.f272604o0;
        w4 w4Var = a3Var.p0;
        String str21 = a3Var.q0;
        boolean z31 = a3Var.f272610r0;
        p5 p5Var = (i3 & 1024) != 0 ? a3Var.f272612s0 : null;
        x0 x0Var = a3Var.f272615t0;
        boolean z41 = a3Var.u0;
        aef.a aVar = a3Var.f272617v0;
        Instant instant = a3Var.f272620w0;
        r4 r4Var = a3Var.f272622x0;
        f5 f5Var = a3Var.y0;
        String str22 = a3Var.z0;
        r rVar = a3Var.A0;
        n3 n3Var = a3Var.B0;
        z0 z0Var = a3Var.C0;
        w0 w0Var = a3Var.D0;
        s sVar = a3Var.E0;
        String str23 = a3Var.F0;
        Boolean bool2 = a3Var.G0;
        Double d10 = a3Var.H0;
        String str24 = a3Var.I0;
        jc jcVar = a3Var.J0;
        String str25 = a3Var.K0;
        k6 k6Var = a3Var.L0;
        q1 q1Var = a3Var.M0;
        boolean z49 = a3Var.N0;
        y yVar = a3Var.O0;
        x xVar = a3Var.P0;
        u uVar = a3Var.Q0;
        a aVar2 = a3Var.R0;
        a aVar3 = a3Var.S0;
        k kVar = a3Var.T0;
        m mVar = a3Var.U0;
        t6 t6Var = a3Var.V0;
        z2 z2Var = a3Var.W0;
        LocalDate localDate = a3Var.X0;
        LocalDate localDate2 = a3Var.Y0;
        uof.a aVar4 = a3Var.Z0;
        Boolean bool3 = a3Var.a1;
        Boolean bool4 = a3Var.f272583b1;
        x1 x1Var = a3Var.f272585c1;
        h1 h1Var = a3Var.f272587d1;
        m3 m3Var = a3Var.f272589e1;
        String str26 = a3Var.f272590f1;
        String str27 = a3Var.f272592g1;
        b1 b1Var = a3Var.f272595h1;
        u1 u1Var = a3Var.f272598k1;
        String str28 = a3Var.f272603n1;
        j5 j5Var = a3Var.f272605o1;
        q0 q0Var = a3Var.f272607p1;
        dj0.d dVar9 = a3Var.f272613s1;
        dj0.d dVar10 = a3Var.f272616t1;
        v5 v5Var = a3Var.f272618v1;
        s1 s1Var = a3Var.f272623x1;
        dj0.d dVar11 = a3Var.f272625y1;
        String str29 = a3Var.A1;
        m1 m1Var = a3Var.C1;
        String str30 = a3Var.H1;
        String str31 = a3Var.K1;
        a1 ledgerOrigin = a3Var.L1;
        boolean z54 = a3Var.M1;
        dj0.d amountWithCharges = a3Var.N1;
        v1 v1Var = a3Var.O1;
        q2 q2Var = a3Var.P1;
        l0 l0Var = a3Var.Q1;
        String str32 = a3Var.R1;
        a3Var.getClass();
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(startedDate, "startedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        dj0.d pocketFee = dVar4;
        Intrinsics.checkNotNullParameter(pocketFee, "pocketFee");
        Intrinsics.checkNotNullParameter(exchangeFee, "exchangeFee");
        dj0.d transferFee = dVar5;
        Intrinsics.checkNotNullParameter(transferFee, "transferFee");
        Intrinsics.checkNotNullParameter(counterPartyFee, "counterPartyFee");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(exchangeDirection, "exchangeDirection");
        Intrinsics.checkNotNullParameter(transferInfo, "transferInfo");
        Intrinsics.checkNotNullParameter(category, "category");
        h5.a links = h5.a.f272785a;
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(analyticsGroupId, "analyticsGroupId");
        Intrinsics.checkNotNullParameter(ledgerOrigin, "ledgerOrigin");
        Intrinsics.checkNotNullParameter(amountWithCharges, "amountWithCharges");
        return new a3(legId, groupId, str, str4, type, state, createdDate, startedDate, updatedDate, dateTime, amount, pocketFee, str8, exchangeFee, dVar5, counterPartyFee, dVar8, str9, str2, str11, v4Var, str13, d6, z3, pocket, exchangeDirection, h3Var, str5, iVar, str15, d3Var, e5Var, z6Var, z6Var2, transferInfo, o3Var2, str16, z4, bVar, z6, z11, list, category, analyticsGroupId, d7Var, l2, str17, r3Var, p3Var, t5Var, str18, i5Var, e1Var, g3Var, a5Var, r6Var, lVar, z12, bool, i2Var, eVar, str19, qVar, str20, z29, w6Var, y2Var, w4Var, str21, z31, p5Var, x0Var, z41, aVar, instant, r4Var, f5Var, str22, rVar, n3Var, z0Var, w0Var, sVar, str23, bool2, d10, str24, jcVar, str25, k6Var, q1Var, z49, yVar, xVar, uVar, aVar2, aVar3, kVar, mVar, t6Var, z2Var, localDate, localDate2, aVar4, bool3, bool4, x1Var, h1Var, m3Var, str26, str27, b1Var, u1Var, str28, j5Var, q0Var, dVar9, dVar10, v5Var, s1Var, dVar11, str29, m1Var, str30, str31, ledgerOrigin, z54, amountWithCharges, v1Var, q2Var, l0Var, str32);
    }

    @Override // fd0.c
    public final String a() {
        return this.f272579a;
    }

    public final dj0.d c() {
        return this.k;
    }

    public final k d() {
        return this.T0;
    }

    public final String e() {
        return this.j0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        if (!Intrinsics.f(this.f272579a, a3Var.f272579a) || !Intrinsics.f(this.f272581b, a3Var.f272581b) || !Intrinsics.f(this.f272584c, a3Var.f272584c) || !Intrinsics.f(this.d, a3Var.d) || this.e != a3Var.e || this.f != a3Var.f || !this.f272591g.equals(a3Var.f272591g) || !this.f272593h.equals(a3Var.f272593h) || !this.i.equals(a3Var.i) || !Intrinsics.f(this.f272596j, a3Var.f272596j) || !Intrinsics.f(this.k, a3Var.k) || !Intrinsics.f(this.f272599l, a3Var.f272599l) || !Intrinsics.f(this.f272600m, a3Var.f272600m) || !this.f272601n.equals(a3Var.f272601n) || !this.o.equals(a3Var.o) || !Intrinsics.f(this.f272606p, a3Var.f272606p) || !Intrinsics.f(this.f272608q, a3Var.f272608q) || !Intrinsics.f(this.f272609r, a3Var.f272609r) || !Intrinsics.f(this.f272611s, a3Var.f272611s) || !Intrinsics.f(this.f272614t, a3Var.f272614t) || !Intrinsics.f(this.u, a3Var.u) || !Intrinsics.f(this.v, a3Var.v) || Double.compare(this.f272619w, a3Var.f272619w) != 0 || this.f272621x != a3Var.f272621x || !this.f272624y.equals(a3Var.f272624y) || this.z != a3Var.z || !this.A.equals(a3Var.A) || !Intrinsics.f(this.B, a3Var.B) || !Intrinsics.f(this.C, a3Var.C) || !Intrinsics.f(this.D, a3Var.D) || !Intrinsics.f(this.E, a3Var.E) || !Intrinsics.f(this.F, a3Var.F) || !Intrinsics.f(this.G, a3Var.G) || !Intrinsics.f(this.H, a3Var.H) || !this.I.equals(a3Var.I) || !Intrinsics.f(this.J, a3Var.J) || !Intrinsics.f(this.K, a3Var.K) || this.L != a3Var.L || !Intrinsics.f(this.M, a3Var.M) || this.N != a3Var.N || this.O != a3Var.O || !Intrinsics.f(this.P, a3Var.P) || !Intrinsics.f(this.Q, a3Var.Q)) {
            return false;
        }
        h5.a aVar = h5.a.f272785a;
        return aVar.equals(aVar) && Intrinsics.f(this.R, a3Var.R) && Intrinsics.f(this.S, a3Var.S) && Intrinsics.f(this.T, a3Var.T) && Intrinsics.f(this.U, a3Var.U) && Intrinsics.f(this.V, a3Var.V) && Intrinsics.f(this.W, a3Var.W) && Intrinsics.f(this.X, a3Var.X) && Intrinsics.f(this.Y, a3Var.Y) && Intrinsics.f(this.Z, a3Var.Z) && Intrinsics.f(this.f272580a0, a3Var.f272580a0) && Intrinsics.f(this.f272582b0, a3Var.f272582b0) && Intrinsics.f(this.c0, a3Var.c0) && Intrinsics.f(this.f272586d0, a3Var.f272586d0) && this.f272588e0 == a3Var.f272588e0 && this.f0 == a3Var.f0 && Intrinsics.f(this.g0, a3Var.g0) && Intrinsics.f(this.f272594h0, a3Var.f272594h0) && Intrinsics.f(this.i0, a3Var.i0) && Intrinsics.f(this.j0, a3Var.j0) && Intrinsics.f(this.f272597k0, a3Var.f272597k0) && Intrinsics.f(this.l0, a3Var.l0) && this.m0 == a3Var.m0 && this.f272602n0 == a3Var.f272602n0 && this.f272604o0 == a3Var.f272604o0 && Intrinsics.f(this.p0, a3Var.p0) && Intrinsics.f(this.q0, a3Var.q0) && this.f272610r0 == a3Var.f272610r0 && Intrinsics.f(this.f272612s0, a3Var.f272612s0) && Intrinsics.f(this.f272615t0, a3Var.f272615t0) && this.u0 == a3Var.u0 && this.f272617v0 == a3Var.f272617v0 && Intrinsics.f(this.f272620w0, a3Var.f272620w0) && Intrinsics.f(this.f272622x0, a3Var.f272622x0) && Intrinsics.f(this.y0, a3Var.y0) && Intrinsics.f(this.z0, a3Var.z0) && this.A0 == a3Var.A0 && Intrinsics.f(this.B0, a3Var.B0) && Intrinsics.f(this.C0, a3Var.C0) && Intrinsics.f(this.D0, a3Var.D0) && Intrinsics.f(this.E0, a3Var.E0) && Intrinsics.f(this.F0, a3Var.F0) && Intrinsics.f(this.G0, a3Var.G0) && Intrinsics.f(this.H0, a3Var.H0) && Intrinsics.f(this.I0, a3Var.I0) && Intrinsics.f(this.J0, a3Var.J0) && Intrinsics.f(this.K0, a3Var.K0) && Intrinsics.f(this.L0, a3Var.L0) && Intrinsics.f(this.M0, a3Var.M0) && this.N0 == a3Var.N0 && Intrinsics.f(this.O0, a3Var.O0) && Intrinsics.f(this.P0, a3Var.P0) && Intrinsics.f(this.Q0, a3Var.Q0) && Intrinsics.f(this.R0, a3Var.R0) && Intrinsics.f(this.S0, a3Var.S0) && Intrinsics.f(this.T0, a3Var.T0) && Intrinsics.f(this.U0, a3Var.U0) && Intrinsics.f(this.V0, a3Var.V0) && this.W0 == a3Var.W0 && Intrinsics.f(this.X0, a3Var.X0) && Intrinsics.f(this.Y0, a3Var.Y0) && Intrinsics.f(this.Z0, a3Var.Z0) && Intrinsics.f(this.a1, a3Var.a1) && Intrinsics.f(this.f272583b1, a3Var.f272583b1) && this.f272585c1 == a3Var.f272585c1 && this.f272587d1 == a3Var.f272587d1 && Intrinsics.f(this.f272589e1, a3Var.f272589e1) && Intrinsics.f(this.f272590f1, a3Var.f272590f1) && Intrinsics.f(this.f272592g1, a3Var.f272592g1) && Intrinsics.f(this.f272595h1, a3Var.f272595h1) && Intrinsics.f(this.f272598k1, a3Var.f272598k1) && Intrinsics.f(this.f272603n1, a3Var.f272603n1) && Intrinsics.f(this.f272605o1, a3Var.f272605o1) && this.f272607p1 == a3Var.f272607p1 && Intrinsics.f(this.f272613s1, a3Var.f272613s1) && Intrinsics.f(this.f272616t1, a3Var.f272616t1) && this.f272618v1 == a3Var.f272618v1 && Intrinsics.f(this.f272623x1, a3Var.f272623x1) && Intrinsics.f(this.f272625y1, a3Var.f272625y1) && Intrinsics.f(this.A1, a3Var.A1) && Intrinsics.f(this.C1, a3Var.C1) && Intrinsics.f(this.H1, a3Var.H1) && Intrinsics.f(this.K1, a3Var.K1) && this.L1 == a3Var.L1 && this.M1 == a3Var.M1 && this.N1.equals(a3Var.N1) && this.O1 == a3Var.O1 && this.P1 == a3Var.P1 && Intrinsics.f(this.Q1, a3Var.Q1) && Intrinsics.f(this.R1, a3Var.R1);
    }

    public final r f() {
        return this.A0;
    }

    public final i3 h() {
        return this.Q;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f272579a.hashCode() * 31, 31, this.f272581b);
        String str = this.f272584c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iF = m72.b.f(this.i, m72.b.f(this.f272593h, m72.b.f(this.f272591g, (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31, 31), 31), 31);
        DateTime dateTime = this.f272596j;
        int iC2 = ip0.v7.c(ip0.v7.c((iF + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.k), 31, this.f272599l);
        String str3 = this.f272600m;
        int iC3 = ip0.v7.c(ip0.v7.c(ip0.v7.c((iC2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f272601n), 31, this.o), 31, this.f272606p);
        dj0.d dVar = this.f272608q;
        int iHashCode2 = (iC3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str4 = this.f272609r;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f272611s;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f272614t;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 961;
        v4 v4Var = this.u;
        int iHashCode6 = (iHashCode5 + (v4Var == null ? 0 : v4Var.hashCode())) * 31;
        String str7 = this.v;
        int iHashCode7 = (this.A.hashCode() + ((this.z.hashCode() + ((this.f272624y.hashCode() + j6.a.c(m72.b.c((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, this.f272619w, 31), 31, this.f272621x)) * 31)) * 31)) * 31;
        String str8 = this.B;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ibd.i iVar = this.C;
        int iHashCode9 = (iHashCode8 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str9 = this.D;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        d3 d3Var = this.E;
        int iHashCode11 = (iHashCode10 + (d3Var == null ? 0 : d3Var.hashCode())) * 31;
        e5 e5Var = this.F;
        int iHashCode12 = (iHashCode11 + (e5Var == null ? 0 : e5Var.hashCode())) * 31;
        z6 z6Var = this.G;
        int iHashCode13 = (iHashCode12 + (z6Var == null ? 0 : z6Var.hashCode())) * 31;
        z6 z6Var2 = this.H;
        int iHashCode14 = (this.I.hashCode() + ((iHashCode13 + (z6Var2 == null ? 0 : z6Var2.hashCode())) * 31)) * 31;
        o3 o3Var = this.J;
        int iHashCode15 = (iHashCode14 + (o3Var == null ? 0 : o3Var.hashCode())) * 31;
        String str10 = this.K;
        int iC4 = j6.a.c((iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.L);
        wi0.b bVar = this.M;
        int iC5 = j6.a.c(j6.a.c((iC4 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.N), 31, this.O);
        List list = this.P;
        int iC6 = p.a.c((this.Q.hashCode() + ((iC5 + (list == null ? 0 : list.hashCode())) * 31)) * 923521, 31, this.R);
        d7 d7Var = this.S;
        int iHashCode16 = (iC6 + (d7Var == null ? 0 : d7Var.hashCode())) * 31;
        Long l2 = this.T;
        int iHashCode17 = (iHashCode16 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str11 = this.U;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        r3 r3Var = this.V;
        int iHashCode19 = (iHashCode18 + (r3Var == null ? 0 : r3Var.hashCode())) * 31;
        p3 p3Var = this.W;
        int iHashCode20 = (iHashCode19 + (p3Var == null ? 0 : p3Var.hashCode())) * 31;
        t5 t5Var = this.X;
        int iHashCode21 = (iHashCode20 + (t5Var == null ? 0 : t5Var.hashCode())) * 31;
        String str12 = this.Y;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        i5 i5Var = this.Z;
        int iHashCode23 = (iHashCode22 + (i5Var == null ? 0 : i5Var.hashCode())) * 31;
        e1 e1Var = this.f272580a0;
        int iHashCode24 = (iHashCode23 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        g3 g3Var = this.f272582b0;
        int iHashCode25 = (iHashCode24 + (g3Var == null ? 0 : g3Var.f272765a.hashCode())) * 31;
        a5 a5Var = this.c0;
        int iHashCode26 = (iHashCode25 + (a5Var == null ? 0 : a5Var.hashCode())) * 31;
        r6 r6Var = this.f272586d0;
        int iHashCode27 = (iHashCode26 + (r6Var == null ? 0 : r6Var.hashCode())) * 31;
        kq2.l lVar = this.f272588e0;
        int iC7 = j6.a.c((iHashCode27 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f0);
        Boolean bool = this.g0;
        int iHashCode28 = (iC7 + (bool == null ? 0 : bool.hashCode())) * 31;
        i2 i2Var = this.f272594h0;
        int iHashCode29 = (iHashCode28 + (i2Var == null ? 0 : i2Var.hashCode())) * 31;
        e eVar = this.i0;
        int iHashCode30 = (iHashCode29 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str13 = this.j0;
        int iHashCode31 = (iHashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        q qVar = this.f272597k0;
        int iHashCode32 = (iHashCode31 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str14 = this.l0;
        int iC8 = j6.a.c((iHashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.m0);
        w6 w6Var = this.f272602n0;
        int iHashCode33 = (iC8 + (w6Var == null ? 0 : w6Var.hashCode())) * 31;
        y2 y2Var = this.f272604o0;
        int iHashCode34 = (iHashCode33 + (y2Var == null ? 0 : y2Var.hashCode())) * 31;
        w4 w4Var = this.p0;
        int iHashCode35 = (iHashCode34 + (w4Var == null ? 0 : w4Var.hashCode())) * 31;
        String str15 = this.q0;
        int iC9 = j6.a.c((iHashCode35 + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.f272610r0);
        p5 p5Var = this.f272612s0;
        int iHashCode36 = (iC9 + (p5Var == null ? 0 : p5Var.hashCode())) * 31;
        x0 x0Var = this.f272615t0;
        int iC10 = j6.a.c((iHashCode36 + (x0Var == null ? 0 : x0Var.hashCode())) * 31, 31, this.u0);
        aef.a aVar = this.f272617v0;
        int iHashCode37 = (iC10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Instant instant = this.f272620w0;
        int iHashCode38 = (iHashCode37 + (instant == null ? 0 : instant.hashCode())) * 31;
        r4 r4Var = this.f272622x0;
        int iHashCode39 = (iHashCode38 + (r4Var == null ? 0 : r4Var.hashCode())) * 31;
        f5 f5Var = this.y0;
        int iHashCode40 = (iHashCode39 + (f5Var == null ? 0 : f5Var.hashCode())) * 31;
        String str16 = this.z0;
        int iHashCode41 = (iHashCode40 + (str16 == null ? 0 : str16.hashCode())) * 31;
        r rVar = this.A0;
        int iHashCode42 = (iHashCode41 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        n3 n3Var = this.B0;
        int iHashCode43 = (iHashCode42 + (n3Var == null ? 0 : n3Var.hashCode())) * 31;
        z0 z0Var = this.C0;
        int iHashCode44 = (iHashCode43 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        w0 w0Var = this.D0;
        int iHashCode45 = (iHashCode44 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        s sVar = this.E0;
        int iHashCode46 = (iHashCode45 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str17 = this.F0;
        int iHashCode47 = (iHashCode46 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool2 = this.G0;
        int iHashCode48 = (iHashCode47 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d = this.H0;
        int iHashCode49 = (iHashCode48 + (d == null ? 0 : d.hashCode())) * 31;
        String str18 = this.I0;
        int iHashCode50 = (iHashCode49 + (str18 == null ? 0 : str18.hashCode())) * 31;
        jc jcVar = this.J0;
        int iHashCode51 = (iHashCode50 + (jcVar == null ? 0 : jcVar.hashCode())) * 31;
        String str19 = this.K0;
        int iHashCode52 = (iHashCode51 + (str19 == null ? 0 : str19.hashCode())) * 31;
        k6 k6Var = this.L0;
        int iHashCode53 = (iHashCode52 + (k6Var == null ? 0 : k6Var.hashCode())) * 31;
        q1 q1Var = this.M0;
        int iC11 = j6.a.c((iHashCode53 + (q1Var == null ? 0 : q1Var.hashCode())) * 31, 31, this.N0);
        y yVar = this.O0;
        int iHashCode54 = (iC11 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        x xVar = this.P0;
        int iHashCode55 = (iHashCode54 + (xVar == null ? 0 : Integer.hashCode(xVar.f273151a))) * 31;
        u uVar = this.Q0;
        int iHashCode56 = (iHashCode55 + (uVar == null ? 0 : uVar.f273096a.hashCode())) * 31;
        a aVar2 = this.R0;
        int iHashCode57 = (iHashCode56 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.S0;
        int iHashCode58 = (iHashCode57 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        k kVar = this.T0;
        int iHashCode59 = (iHashCode58 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        m mVar = this.U0;
        int iHashCode60 = (iHashCode59 + (mVar == null ? 0 : mVar.f272922a.hashCode())) * 31;
        t6 t6Var = this.V0;
        int iHashCode61 = (iHashCode60 + (t6Var == null ? 0 : t6Var.hashCode())) * 31;
        z2 z2Var = this.W0;
        int iHashCode62 = (iHashCode61 + (z2Var == null ? 0 : z2Var.hashCode())) * 31;
        LocalDate localDate = this.X0;
        int iHashCode63 = (iHashCode62 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.Y0;
        int iHashCode64 = (iHashCode63 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        uof.a aVar4 = this.Z0;
        int iHashCode65 = (iHashCode64 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        Boolean bool3 = this.a1;
        int iHashCode66 = (iHashCode65 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f272583b1;
        int iHashCode67 = (iHashCode66 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        x1 x1Var = this.f272585c1;
        int iHashCode68 = (iHashCode67 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        h1 h1Var = this.f272587d1;
        int iHashCode69 = (iHashCode68 + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        m3 m3Var = this.f272589e1;
        int iHashCode70 = (iHashCode69 + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        String str20 = this.f272590f1;
        int iHashCode71 = (iHashCode70 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f272592g1;
        int iHashCode72 = (iHashCode71 + (str21 == null ? 0 : str21.hashCode())) * 31;
        b1 b1Var = this.f272595h1;
        int iHashCode73 = (iHashCode72 + (b1Var == null ? 0 : b1Var.f272639a.hashCode())) * 31;
        u1 u1Var = this.f272598k1;
        int iHashCode74 = (iHashCode73 + (u1Var == null ? 0 : u1Var.f273097a.hashCode())) * 31;
        String str22 = this.f272603n1;
        int iHashCode75 = (iHashCode74 + (str22 == null ? 0 : str22.hashCode())) * 31;
        j5 j5Var = this.f272605o1;
        int iHashCode76 = (iHashCode75 + (j5Var == null ? 0 : j5Var.hashCode())) * 31;
        q0 q0Var = this.f272607p1;
        int iHashCode77 = (iHashCode76 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        dj0.d dVar2 = this.f272613s1;
        int iHashCode78 = (iHashCode77 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f272616t1;
        int iHashCode79 = (iHashCode78 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        v5 v5Var = this.f272618v1;
        int iHashCode80 = (iHashCode79 + (v5Var == null ? 0 : v5Var.hashCode())) * 31;
        s1 s1Var = this.f272623x1;
        int iHashCode81 = (iHashCode80 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        dj0.d dVar4 = this.f272625y1;
        int iHashCode82 = (iHashCode81 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        String str23 = this.A1;
        int iHashCode83 = (iHashCode82 + (str23 == null ? 0 : str23.hashCode())) * 31;
        m1 m1Var = this.C1;
        int iHashCode84 = (iHashCode83 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        String str24 = this.H1;
        int iHashCode85 = (iHashCode84 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.K1;
        int iC12 = ip0.v7.c(j6.a.c((this.L1.hashCode() + ((iHashCode85 + (str25 == null ? 0 : str25.hashCode())) * 31)) * 31, 31, this.M1), 31, this.N1);
        v1 v1Var = this.O1;
        int iHashCode86 = (iC12 + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        q2 q2Var = this.P1;
        int iHashCode87 = (iHashCode86 + (q2Var == null ? 0 : q2Var.hashCode())) * 31;
        l0 l0Var = this.Q1;
        int iHashCode88 = (iHashCode87 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str26 = this.R1;
        return iHashCode88 + (str26 != null ? str26.hashCode() : 0);
    }

    public final n3 i() {
        return this.B0;
    }

    public final o3 k() {
        return this.J;
    }

    public final String l() {
        return this.A1;
    }

    public final p3 m() {
        return this.W;
    }

    public final r3 n() {
        return this.V;
    }

    public final boolean o() {
        return this.f272621x;
    }

    public final w0 p() {
        return this.D0;
    }

    public final z0 q() {
        return this.C0;
    }

    public final String r() {
        return this.f272579a;
    }

    public final String s() {
        return this.F0;
    }

    public final u1 t() {
        return this.f272598k1;
    }

    public final z6 u() {
        return this.G;
    }

    public final boolean v() {
        return this.f0;
    }

    public final z6 w() {
        return this.H;
    }

    public final x6 x() {
        return this.I;
    }

    public final y6 y() {
        return this.e;
    }
}
