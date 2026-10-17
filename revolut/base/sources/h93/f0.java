package h93;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 implements Comparable, Serializable {

    @NotNull
    public static final a0 Companion = new a0();
    public final Long A;
    public final Long B;
    public final boolean C;
    public final boolean D;
    public final q E;
    public final q F;
    public final l0 G;
    public final j0 H;
    public final String I;
    public final String J;
    public final Map K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final c0 O;
    public final Map P;
    public final Boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f150112c;
    public final boolean d;
    public final boolean e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i93.c f150113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b93.j f150114h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f150115j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f150116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f150117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f150118n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f150119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LocalDate f150120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f150121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Boolean f150122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c0 f150123t;
    public final String u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f150124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f150125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f150126y;
    public final String z;

    static {
        r rVar = r.NONE;
        b93.b.Companion.getClass();
        b93.j jVar = new b93.j(b93.b.f13538b, "");
        h hVar = new h(g.NONE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, e.UNKNOWN, null, null);
        q qVar = q.ACTIVE;
        new f0("", null, false, false, false, rVar, null, jVar, hVar, -1L, qVar, qVar, l0.UNKNOWN, j0.UNKNOWN, "", null, zhm.r0.g());
    }

    public f0(String id10, String str, boolean z, boolean z3, boolean z4, r state, i93.c cVar, b93.j design, String str2, String str3, h deliveryStatus, long j2, boolean z6, c cVar2, String str4, String str5, LocalDate localDate, Boolean bool, Boolean bool2, c0 c0Var, String walletId, boolean z11, boolean z12, boolean z29, boolean z31, String str6, Long l2, Long l3, boolean z41, boolean z49, q cvvStatus, q qVar, l0 l0Var, j0 j0Var, String cardName, String str7, Map tokenizationEligibility, boolean z54, boolean z74, boolean z83, c0 c0Var2, Map tokenisationEligibilities, Boolean bool3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(cvvStatus, "cvvStatus");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(tokenizationEligibility, "tokenizationEligibility");
        Intrinsics.checkNotNullParameter(tokenisationEligibilities, "tokenisationEligibilities");
        this.f150110a = id10;
        this.f150111b = str;
        this.f150112c = z;
        this.d = z3;
        this.e = z4;
        this.f = state;
        this.f150113g = cVar;
        this.f150114h = design;
        this.i = str2;
        this.f150115j = str3;
        this.k = deliveryStatus;
        this.f150116l = j2;
        this.f150117m = z6;
        this.f150118n = cVar2;
        this.o = str4;
        this.f150119p = str5;
        this.f150120q = localDate;
        this.f150121r = bool;
        this.f150122s = bool2;
        this.f150123t = c0Var;
        this.u = walletId;
        this.v = z11;
        this.f150124w = z12;
        this.f150125x = z29;
        this.f150126y = z31;
        this.z = str6;
        this.A = l2;
        this.B = l3;
        this.C = z41;
        this.D = z49;
        this.E = cvvStatus;
        this.F = qVar;
        this.G = l0Var;
        this.H = j0Var;
        this.I = cardName;
        this.J = str7;
        this.K = tokenizationEligibility;
        this.L = z54;
        this.M = z74;
        this.N = z83;
        this.O = c0Var2;
        this.P = tokenisationEligibilities;
        this.Q = bool3;
        this.R = (z31 || U() || z3 || x() || z4) ? false : true;
        this.S = (c0Var == c0.DECLINED_BY_FRAUD_DETECTOR_TRANSACTION || D() || Z() || !x()) ? false : true;
        this.T = l0Var == l0.BRAZIL_LOCAL;
        this.U = l0Var == l0.BRAZIL_GLOBAL;
        this.V = l0Var == l0.INDIA_LOCAL;
        this.W = l0Var == l0.INDIA_GLOBAL;
        this.X = l0Var == l0.MEXICO_MCY;
        this.Y = hx7.l.j().get(design.f13640b) == e93.b.MULTIBANCO;
    }

    public static f0 b(f0 f0Var, i93.c cVar) {
        String id10 = f0Var.f150110a;
        String str = f0Var.f150111b;
        boolean z = f0Var.f150112c;
        boolean z3 = f0Var.d;
        boolean z4 = f0Var.e;
        r state = f0Var.f;
        b93.j design = f0Var.f150114h;
        String str2 = f0Var.i;
        String str3 = f0Var.f150115j;
        h deliveryStatus = f0Var.k;
        long j2 = f0Var.f150116l;
        boolean z6 = f0Var.f150117m;
        c cVar2 = f0Var.f150118n;
        String str4 = f0Var.o;
        String str5 = f0Var.f150119p;
        LocalDate localDate = f0Var.f150120q;
        Boolean bool = f0Var.f150121r;
        Boolean bool2 = f0Var.f150122s;
        c0 c0Var = f0Var.f150123t;
        String walletId = f0Var.u;
        boolean z11 = f0Var.v;
        boolean z12 = f0Var.f150124w;
        boolean z29 = f0Var.f150125x;
        boolean z31 = f0Var.f150126y;
        String str6 = f0Var.z;
        Long l2 = f0Var.A;
        Long l3 = f0Var.B;
        boolean z41 = f0Var.C;
        boolean z49 = f0Var.D;
        q cvvStatus = f0Var.E;
        q qVar = f0Var.F;
        l0 l0Var = f0Var.G;
        j0 j0Var = f0Var.H;
        String cardName = f0Var.I;
        String str7 = f0Var.J;
        Map tokenizationEligibility = f0Var.K;
        boolean z54 = f0Var.L;
        boolean z74 = f0Var.M;
        boolean z83 = f0Var.N;
        c0 c0Var2 = f0Var.O;
        Map tokenisationEligibilities = f0Var.P;
        Boolean bool3 = f0Var.Q;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(cvvStatus, "cvvStatus");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(tokenizationEligibility, "tokenizationEligibility");
        Intrinsics.checkNotNullParameter(tokenisationEligibilities, "tokenisationEligibilities");
        return new f0(id10, str, z, z3, z4, state, cVar, design, str2, str3, deliveryStatus, j2, z6, cVar2, str4, str5, localDate, bool, bool2, c0Var, walletId, z11, z12, z29, z31, str6, l2, l3, z41, z49, cvvStatus, qVar, l0Var, j0Var, cardName, str7, tokenizationEligibility, z54, z74, z83, c0Var2, tokenisationEligibilities, bool3);
    }

    public final boolean A() {
        q qVar = q.BLOCKED;
        return this.E == qVar || this.F == qVar;
    }

    public final boolean B() {
        b93.a aVar = b93.b.Companion;
        aVar.getClass();
        b93.b bVar = b93.b.U;
        aVar.getClass();
        b93.b bVar2 = b93.b.T;
        aVar.getClass();
        return zhm.v.k(bVar, bVar2, b93.b.V).contains(this.f150114h.f13639a);
    }

    public final boolean C() {
        l0 l0Var = l0.CREDIT;
        l0 l0Var2 = this.G;
        return l0Var2 == l0Var || l0Var2 == l0.US_SECURED_CREDIT;
    }

    public final boolean D() {
        return this.f150123t == c0.CREDIT_FACILITY_DEACTIVATION;
    }

    public final boolean E() {
        c cVar = this.f150118n;
        return (cVar != null ? cVar.f150098a : null) == t.APPROVED && this.k.f150132a == g.NONE;
    }

    public final boolean F() {
        c cVar = this.f150118n;
        return (cVar != null ? cVar.f150098a : null) == t.IN_REVIEW;
    }

    public final boolean G() {
        c cVar = this.f150118n;
        return (cVar != null ? cVar.f150098a : null) == t.REJECTED;
    }

    public final boolean H() {
        return this.v && this.f150124w;
    }

    public final boolean J() {
        return this.v && !this.f150124w;
    }

    public final boolean K() {
        return this.f == r.EXPIRED;
    }

    public final boolean M() {
        return this.H == j0.PRO;
    }

    public final boolean N() {
        if (this.f150112c) {
            return false;
        }
        h hVar = this.k;
        if (hVar.f150132a.compareTo(g.ORDERED) < 0 || hVar.f150132a.compareTo(g.POSTED) > 0) {
            return false;
        }
        f fVar = hVar.f150137j;
        LocalDate localDate = fVar != null ? fVar.f150109b : hVar.i;
        return (localDate != null && R() && localDate.plusDays(1).toDateTimeAtStartOfDay().isBeforeNow()) ? false : true;
    }

    public final boolean P() {
        return this.H == j0.JOINT_ACCOUNT;
    }

    public final boolean R() {
        h hVar = this.k;
        g gVar = hVar.f150132a;
        return (gVar == g.DELIVERED || gVar == g.NONE || hVar.i == null || new LocalDate(hVar.i).compareTo((ReadablePartial) new LocalDate()) > 0) ? false : true;
    }

    public final boolean S() {
        return this.G == l0.INSTALMENT;
    }

    public final boolean U() {
        return this.f == r.PENDING;
    }

    public final boolean V() {
        return this.d && this.H == j0.RETAIL && this.G == l0.BRAZIL_GLOBAL;
    }

    public final boolean X() {
        return this.d && this.H == j0.RETAIL && !C() && this.G != l0.BRAZIL_GLOBAL;
    }

    public final boolean Y() {
        return this.f150112c && !this.d;
    }

    public final boolean Z() {
        return this.f150123t == c0.TEMPORARILY_SUSPENDED;
    }

    public final boolean a() {
        return e0() && this.C;
    }

    public final boolean a0() {
        return this.f150112c;
    }

    public final boolean b0() {
        return this.H == j0.YOUTH;
    }

    public final boolean c() {
        g gVar;
        return (this.f150112c || (gVar = this.k.f150132a) == g.DELIVERED || gVar == g.NONE || this.f == r.PENDING) ? false : true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        LocalDate localDate;
        LocalDate localDate2;
        f0 other = (f0) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z = this.f150112c;
        if (z && !other.f150112c) {
            return 1;
        }
        if (!z && other.f150112c) {
            return -1;
        }
        boolean z3 = this.d;
        if (z && other.f150112c && z3 && !other.d) {
            return 1;
        }
        if (z && other.f150112c && !z3 && other.d) {
            return -1;
        }
        return (z || (localDate = this.k.f150135g) == null || (localDate2 = other.k.f150135g) == null) ? this.f150110a.compareTo(other.f150110a) : localDate.compareTo((ReadablePartial) localDate2);
    }

    public final boolean d() {
        if (U()) {
            return false;
        }
        return this.f150126y ? this.k.f150132a == g.DELIVERED : !h0.b(this);
    }

    public final boolean d0() {
        return this.H == j0.YOUTH && this.f150112c;
    }

    public final h e() {
        return this.k;
    }

    public final boolean e0() {
        if (this.f150126y || x()) {
            return false;
        }
        h hVar = this.k;
        return hVar.f150132a.compareTo(g.POSTED) >= 0 && hVar.f150132a.compareTo(g.DELIVERED) < 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f150110a, f0Var.f150110a) && Intrinsics.f(this.f150111b, f0Var.f150111b) && this.f150112c == f0Var.f150112c && this.d == f0Var.d && this.e == f0Var.e && this.f == f0Var.f && Intrinsics.f(this.f150113g, f0Var.f150113g) && Intrinsics.f(this.f150114h, f0Var.f150114h) && Intrinsics.f(this.i, f0Var.i) && Intrinsics.f(this.f150115j, f0Var.f150115j) && Intrinsics.f(this.k, f0Var.k) && this.f150116l == f0Var.f150116l && this.f150117m == f0Var.f150117m && Intrinsics.f(this.f150118n, f0Var.f150118n) && Intrinsics.f(this.o, f0Var.o) && Intrinsics.f(this.f150119p, f0Var.f150119p) && Intrinsics.f(this.f150120q, f0Var.f150120q) && Intrinsics.f(this.f150121r, f0Var.f150121r) && Intrinsics.f(this.f150122s, f0Var.f150122s) && this.f150123t == f0Var.f150123t && Intrinsics.f(this.u, f0Var.u) && this.v == f0Var.v && this.f150124w == f0Var.f150124w && this.f150125x == f0Var.f150125x && this.f150126y == f0Var.f150126y && Intrinsics.f(this.z, f0Var.z) && Intrinsics.f(this.A, f0Var.A) && Intrinsics.f(this.B, f0Var.B) && this.C == f0Var.C && this.D == f0Var.D && this.E == f0Var.E && this.F == f0Var.F && this.G == f0Var.G && this.H == f0Var.H && Intrinsics.f(this.I, f0Var.I) && Intrinsics.f(this.J, f0Var.J) && Intrinsics.f(this.K, f0Var.K) && this.L == f0Var.L && this.M == f0Var.M && this.N == f0Var.N && this.O == f0Var.O && Intrinsics.f(this.P, f0Var.P) && Intrinsics.f(this.Q, f0Var.Q);
    }

    public final b93.j f() {
        return this.f150114h;
    }

    public final String getId() {
        return this.f150110a;
    }

    public final String getLabel() {
        return this.f150111b;
    }

    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f150110a.hashCode() * 31;
        String str = this.f150111b;
        int iHashCode2 = (this.f.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f150112c), 31, this.d), 31, this.e)) * 31;
        i93.c cVar = this.f150113g;
        int iHashCode3 = (this.f150114h.hashCode() + ((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f150115j;
        int iC = j6.a.c(a0.d.c((this.k.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.f150116l), 31, this.f150117m);
        c cVar2 = this.f150118n;
        int iHashCode5 = (iC + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f150119p;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LocalDate localDate = this.f150120q;
        int iHashCode8 = (iHashCode7 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Boolean bool = this.f150121r;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f150122s;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        c0 c0Var = this.f150123t;
        int iC2 = j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.c((iHashCode10 + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31, this.u), 31, this.v), 31, this.f150124w), 31, this.f150125x), 31, this.f150126y);
        String str6 = this.z;
        int iHashCode11 = (iC2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.A;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.B;
        int iHashCode13 = (this.E.hashCode() + j6.a.c(j6.a.c((iHashCode12 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.C), 31, this.D)) * 31;
        q qVar = this.F;
        int iHashCode14 = (iHashCode13 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l0 l0Var = this.G;
        int iHashCode15 = (iHashCode14 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        j0 j0Var = this.H;
        int iC3 = p.a.c((iHashCode15 + (j0Var == null ? 0 : j0Var.hashCode())) * 31, 31, this.I);
        String str7 = this.J;
        int iC4 = j6.a.c(j6.a.c(j6.a.c(p.a.e((iC3 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.K), 31, this.L), 31, this.M), 31, this.N);
        c0 c0Var2 = this.O;
        int iE = p.a.e((iC4 + (c0Var2 == null ? 0 : c0Var2.hashCode())) * 31, 31, this.P);
        Boolean bool3 = this.Q;
        return iE + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final LocalDate i() {
        return this.f150120q;
    }

    public final String k() {
        return this.f150115j;
    }

    public final Long l() {
        return this.A;
    }

    public final boolean m() {
        return this.f150126y;
    }

    public final Boolean n() {
        return this.f150122s;
    }

    public final boolean o() {
        return this.M;
    }

    public final boolean p() {
        return this.N;
    }

    public final Boolean q() {
        return this.f150121r;
    }

    public final String r() {
        return this.o;
    }

    public final c0 s() {
        return this.O;
    }

    public final boolean t() {
        return this.e;
    }

    public final r u() {
        return this.f;
    }

    public final l0 v() {
        return this.G;
    }

    public final boolean w() {
        return this.f == r.ACTIVE;
    }

    public final boolean x() {
        return this.f == r.BLOCKED;
    }

    public final boolean y() {
        return this.f == r.BLOCKED && this.f150123t == c0.FINCRIME_WORKFLOWS;
    }

    public /* synthetic */ f0(String str, String str2, boolean z, boolean z3, boolean z4, r rVar, i93.c cVar, b93.j jVar, h hVar, long j2, q qVar, q qVar2, l0 l0Var, j0 j0Var, String str3, String str4, Map map) {
        this(str, str2, z, z3, z4, rVar, cVar, jVar, null, null, hVar, j2, false, null, null, null, null, null, null, null, "", false, false, false, false, null, null, null, false, false, qVar, qVar2, l0Var, j0Var, str3, str4, map, false, false, false, null, zhm.r0.g(), null);
    }
}
