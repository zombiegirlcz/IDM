package n3f;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 {
    public final v A;
    public final s B;
    public final String C;
    public final String D;
    public final WealthAccountType E;
    public final String F;
    public final t G;
    public final String H;
    public final String I;
    public final String J;
    public final boolean K;
    public final boolean L;
    public final String M;
    public final r N;
    public final w O;
    public final x P;
    public final n Q;
    public final String R;
    public final Boolean S;
    public final String T;
    public final String U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212019c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f212020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f212021h;
    public final y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f212022j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f212023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f212024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f212025n;
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f212026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f212027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f212028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f212029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f212030t;
    public final o u;
    public final p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Instant f212031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f212032x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f212033y;
    public final boolean z;

    public c0(String tradeId, String str, String ref2, String holdingId, String state, Long l2, Long l3, long j2, y yVar, c cVar, i iVar, f fVar, u uVar, h hVar, q qVar, e eVar, l lVar, z zVar, d dVar, m mVar, o oVar, p value, Instant instant, boolean z, boolean z3, boolean z4, v vVar, s sVar, String str2, String str3, WealthAccountType accountType, String str4, t tVar, String str5, String str6, String str7, boolean z6, boolean z11, String str8, r rVar, w wVar, x xVar, n nVar, String accountHolderType, Boolean bool, String str9, String str10) {
        Intrinsics.checkNotNullParameter(tradeId, "tradeId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f212017a = tradeId;
        this.f212018b = str;
        this.f212019c = ref2;
        this.d = holdingId;
        this.e = state;
        this.f = l2;
        this.f212020g = l3;
        this.f212021h = j2;
        this.i = yVar;
        this.f212022j = cVar;
        this.k = iVar;
        this.f212023l = fVar;
        this.f212024m = uVar;
        this.f212025n = hVar;
        this.o = qVar;
        this.f212026p = eVar;
        this.f212027q = lVar;
        this.f212028r = zVar;
        this.f212029s = dVar;
        this.f212030t = mVar;
        this.u = oVar;
        this.v = value;
        this.f212031w = instant;
        this.f212032x = z;
        this.f212033y = z3;
        this.z = z4;
        this.A = vVar;
        this.B = sVar;
        this.C = str2;
        this.D = str3;
        this.E = accountType;
        this.F = str4;
        this.G = tVar;
        this.H = str5;
        this.I = str6;
        this.J = str7;
        this.K = z6;
        this.L = z11;
        this.M = str8;
        this.N = rVar;
        this.O = wVar;
        this.P = xVar;
        this.Q = nVar;
        this.R = accountHolderType;
        this.S = bool;
        this.T = str9;
        this.U = str10;
    }

    public final boolean A() {
        return this.L;
    }

    public final y B() {
        return this.i;
    }

    public final boolean C() {
        return this.f212033y;
    }

    public final String D() {
        return this.f212017a;
    }

    public final String E() {
        return this.M;
    }

    public final Long F() {
        return this.f212020g;
    }

    public final p G() {
        return this.v;
    }

    public final String a() {
        return this.R;
    }

    public final WealthAccountType b() {
        return this.E;
    }

    public final String c() {
        return this.J;
    }

    public final c d() {
        return this.f212022j;
    }

    public final String e() {
        return this.D;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f212017a, c0Var.f212017a) && Intrinsics.f(this.f212018b, c0Var.f212018b) && Intrinsics.f(this.f212019c, c0Var.f212019c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f212020g, c0Var.f212020g) && this.f212021h == c0Var.f212021h && Intrinsics.f(this.i, c0Var.i) && Intrinsics.f(this.f212022j, c0Var.f212022j) && Intrinsics.f(this.k, c0Var.k) && Intrinsics.f(this.f212023l, c0Var.f212023l) && Intrinsics.f(this.f212024m, c0Var.f212024m) && Intrinsics.f(this.f212025n, c0Var.f212025n) && Intrinsics.f(this.o, c0Var.o) && Intrinsics.f(this.f212026p, c0Var.f212026p) && Intrinsics.f(this.f212027q, c0Var.f212027q) && Intrinsics.f(this.f212028r, c0Var.f212028r) && Intrinsics.f(this.f212029s, c0Var.f212029s) && Intrinsics.f(this.f212030t, c0Var.f212030t) && Intrinsics.f(this.u, c0Var.u) && Intrinsics.f(this.v, c0Var.v) && Intrinsics.f(this.f212031w, c0Var.f212031w) && this.f212032x == c0Var.f212032x && this.f212033y == c0Var.f212033y && this.z == c0Var.z && Intrinsics.f(this.A, c0Var.A) && Intrinsics.f(this.B, c0Var.B) && Intrinsics.f(this.C, c0Var.C) && Intrinsics.f(this.D, c0Var.D) && this.E == c0Var.E && Intrinsics.f(this.F, c0Var.F) && Intrinsics.f(this.G, c0Var.G) && Intrinsics.f(this.H, c0Var.H) && Intrinsics.f(this.I, c0Var.I) && Intrinsics.f(this.J, c0Var.J) && this.K == c0Var.K && this.L == c0Var.L && Intrinsics.f(this.M, c0Var.M) && Intrinsics.f(this.N, c0Var.N) && Intrinsics.f(this.O, c0Var.O) && Intrinsics.f(this.P, c0Var.P) && Intrinsics.f(this.Q, c0Var.Q) && Intrinsics.f(this.R, c0Var.R) && Intrinsics.f(this.S, c0Var.S) && Intrinsics.f(this.T, c0Var.T) && Intrinsics.f(this.U, c0Var.U);
    }

    public final boolean f() {
        return this.z;
    }

    public final e g() {
        return this.f212026p;
    }

    public final Long h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.f212017a.hashCode() * 31;
        String str = this.f212018b;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f212019c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f212020g;
        int iC2 = a0.d.c((iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f212021h);
        y yVar = this.i;
        int iHashCode3 = (iC2 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        c cVar = this.f212022j;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        i iVar = this.k;
        int iHashCode5 = (iHashCode4 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        f fVar = this.f212023l;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        u uVar = this.f212024m;
        int iHashCode7 = (iHashCode6 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        h hVar = this.f212025n;
        int iHashCode8 = (iHashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        q qVar = this.o;
        int iHashCode9 = (iHashCode8 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        e eVar = this.f212026p;
        int iHashCode10 = (iHashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        l lVar = this.f212027q;
        int iHashCode11 = (iHashCode10 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        z zVar = this.f212028r;
        int iHashCode12 = (iHashCode11 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        d dVar = this.f212029s;
        int iHashCode13 = (iHashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m mVar = this.f212030t;
        int iHashCode14 = (iHashCode13 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        o oVar = this.u;
        int iHashCode15 = (this.v.hashCode() + ((iHashCode14 + (oVar == null ? 0 : oVar.hashCode())) * 31)) * 31;
        Instant instant = this.f212031w;
        int iC3 = j6.a.c(j6.a.c(j6.a.c((iHashCode15 + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.f212032x), 31, this.f212033y), 31, this.z);
        v vVar = this.A;
        int iHashCode16 = (iC3 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        s sVar = this.B;
        int iHashCode17 = (iHashCode16 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str2 = this.C;
        int iHashCode18 = (iHashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.D;
        int iE = m72.b.e(this.E, (iHashCode18 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.F;
        int iHashCode19 = (iE + (str4 == null ? 0 : str4.hashCode())) * 31;
        t tVar = this.G;
        int iHashCode20 = (iHashCode19 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str5 = this.H;
        int iHashCode21 = (iHashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.I;
        int iHashCode22 = (iHashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.J;
        int iC4 = j6.a.c(j6.a.c((iHashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.K), 31, this.L);
        String str8 = this.M;
        int iHashCode23 = (iC4 + (str8 == null ? 0 : str8.hashCode())) * 31;
        r rVar = this.N;
        int iHashCode24 = (iHashCode23 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        w wVar = this.O;
        int iHashCode25 = (iHashCode24 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        x xVar = this.P;
        int iHashCode26 = (iHashCode25 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        n nVar = this.Q;
        int iC5 = p.a.c((iHashCode26 + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.R);
        Boolean bool = this.S;
        int iHashCode27 = (iC5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.T;
        int iHashCode28 = (iHashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.U;
        return iHashCode28 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String i() {
        return this.f212018b;
    }

    public final long j() {
        return this.f212021h;
    }

    public final String k() {
        return this.T;
    }

    public final String l() {
        return this.U;
    }

    public final boolean m() {
        return this.K;
    }

    public final i n() {
        return this.k;
    }

    public final m o() {
        return this.f212030t;
    }

    public final o p() {
        return this.u;
    }

    public final String q() {
        return this.d;
    }

    public final n r() {
        return this.Q;
    }

    public final q s() {
        return this.o;
    }

    public final String t() {
        return this.F;
    }

    public final String u() {
        return this.f212019c;
    }

    public final v v() {
        return this.A;
    }

    public final Instant w() {
        return this.f212031w;
    }

    public final boolean x() {
        return this.f212032x;
    }

    public final String y() {
        return this.C;
    }

    public final String z() {
        return this.e;
    }
}
