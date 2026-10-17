package ip0;

import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class qj implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f165989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.l0 f165990c;
    public final nj d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mj f165991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sj f165992h;
    public final oj i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165993j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f165994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f165995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f165996n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f165997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public qv0.c f165998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p31.c f165999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p31.c f166000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p31.c f166001t;
    public p31.c u;

    public qj(String listId, Clause clause, aw0.l0 legend, nj dataset, boolean z, boolean z3, mj mjVar, sj sjVar, oj ojVar, int i, int i2, qoc.v vVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(legend, "legend");
        Intrinsics.checkNotNullParameter(dataset, "dataset");
        int i3 = R$attr.uikit_dp16;
        this.f165988a = listId;
        this.f165989b = clause;
        this.f165990c = legend;
        this.d = dataset;
        this.e = z;
        this.f = z3;
        this.f165991g = mjVar;
        this.f165992h = sjVar;
        this.i = ojVar;
        this.f165993j = i;
        this.k = i2;
        this.f165994l = vVar;
        this.f165995m = i3;
        this.f165996n = i3;
        this.o = i3;
        this.f165997p = i3;
        this.f165998q = c.d.f249513a;
        this.f165999r = null;
        this.f166000s = null;
        this.f166001t = null;
        this.u = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ForecastDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.f165994l;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51573a() {
        return this.f165988a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qj)) {
            return false;
        }
        qj qjVar = (qj) obj2;
        return Intrinsics.f(this.f165988a, qjVar.f165988a) && Intrinsics.f(this.f165989b, qjVar.f165989b) && Intrinsics.f(this.f165990c, qjVar.f165990c) && Intrinsics.f(this.d, qjVar.d) && this.e == qjVar.e && this.f == qjVar.f && Intrinsics.f(this.f165991g, qjVar.f165991g) && Intrinsics.f(this.f165992h, qjVar.f165992h) && Intrinsics.f(this.i, qjVar.i) && this.f165993j == qjVar.f165993j && this.k == qjVar.k && Intrinsics.f(this.f165994l, qjVar.f165994l) && this.f165995m == qjVar.f165995m && this.f165996n == qjVar.f165996n && this.o == qjVar.o && this.f165997p == qjVar.f165997p && Intrinsics.f(this.f165998q, qjVar.f165998q) && Intrinsics.f(this.f165999r, qjVar.f165999r) && Intrinsics.f(this.f166000s, qjVar.f166000s) && Intrinsics.f(this.f166001t, qjVar.f166001t) && Intrinsics.f(this.u, qjVar.u);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51584r() {
        return this.f165995m;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165995m = i;
    }

    public final int hashCode() {
        int iHashCode = this.f165988a.hashCode() * 31;
        Clause clause = this.f165989b;
        int iC = j6.a.c(j6.a.c((this.d.hashCode() + ((this.f165990c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
        mj mjVar = this.f165991g;
        int iHashCode2 = (iC + (mjVar == null ? 0 : mjVar.hashCode())) * 31;
        sj sjVar = this.f165992h;
        int iHashCode3 = (iHashCode2 + (sjVar == null ? 0 : sjVar.hashCode())) * 31;
        oj ojVar = this.i;
        int iB = j6.a.b(this.k, j6.a.b(this.f165993j, (iHashCode3 + (ojVar == null ? 0 : ojVar.hashCode())) * 31, 31), 31);
        Object obj2 = this.f165994l;
        int i = h30.l.i(this.f165998q, j6.a.b(this.f165997p, j6.a.b(this.o, j6.a.b(this.f165996n, j6.a.b(this.f165995m, (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f165999r;
        int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166000s;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166001t;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.u;
        return iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51581n() {
        return this.f165999r;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165998q = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f166000s;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166001t = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51585s() {
        return this.f165996n;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f165997p;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165996n = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51580m() {
        return this.f165998q;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51583q() {
        return this.u;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51582p() {
        return this.f166001t;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165999r = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51586t() {
        return this.o;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166000s = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.u = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        qj qjVar = oldItem instanceof qj ? (qj) oldItem : null;
        if (qjVar == null) {
            return null;
        }
        boolean z6 = !Intrinsics.f(qjVar.f165989b, this.f165989b);
        boolean z11 = !qjVar.f165990c.equals(this.f165990c);
        boolean z12 = !qjVar.d.equals(this.d);
        boolean z29 = qjVar.e != this.e;
        boolean z31 = qjVar.f != this.f;
        boolean z41 = !Intrinsics.f(qjVar.f165991g, this.f165991g);
        if (qjVar.f165993j != this.f165993j) {
            z = false;
            z3 = z41;
            z4 = true;
        } else {
            z = false;
            z3 = z41;
            z4 = false;
        }
        if (qjVar.k != this.k) {
            z = true;
        }
        return new pj(z6, z11, z12, z29, z31, z3, z4, z, !Intrinsics.f(qjVar.f165992h, this.f165992h), or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(qjVar.i, this.i));
    }
}
