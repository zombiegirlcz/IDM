package ip0;

import com.revolut.core.ui_kit.delegates.FanChartDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class rh implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.k1 f166185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.s3 f166186c;
    public final Object d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166188h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f166189j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f166190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f166191m;

    public rh(String listId, aw0.k1 k1Var, aw0.s3 fanData, ruk.f fVar, int i) {
        fVar = (i & 8) != 0 ? null : fVar;
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(fanData, "fanData");
        this.f166184a = listId;
        this.f166185b = k1Var;
        this.f166186c = fanData;
        this.d = fVar;
        this.e = c.d.f249513a;
        this.f = null;
        this.f166187g = null;
        this.f166188h = null;
        this.i = null;
        this.f166189j = i2;
        this.k = i3;
        this.f166190l = i3;
        this.f166191m = i3;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FanChartDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF98597a() {
        return this.f166184a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rh)) {
            return false;
        }
        rh rhVar = (rh) obj2;
        return Intrinsics.f(this.f166184a, rhVar.f166184a) && Intrinsics.f(this.f166185b, rhVar.f166185b) && Intrinsics.f(this.f166186c, rhVar.f166186c) && Intrinsics.f(this.d, rhVar.d) && Intrinsics.f(this.e, rhVar.e) && Intrinsics.f(this.f, rhVar.f) && Intrinsics.f(this.f166187g, rhVar.f166187g) && Intrinsics.f(this.f166188h, rhVar.f166188h) && Intrinsics.f(this.i, rhVar.i) && this.f166189j == rhVar.f166189j && this.k == rhVar.k && this.f166190l == rhVar.f166190l && this.f166191m == rhVar.f166191m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.f166189j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166189j = i;
    }

    public final int hashCode() {
        int iHashCode = this.f166184a.hashCode() * 31;
        aw0.k1 k1Var = this.f166185b;
        int iHashCode2 = (this.f166186c.hashCode() + ((iHashCode + (k1Var == null ? 0 : k1Var.hashCode())) * 31)) * 31;
        Object obj2 = this.d;
        int i = h30.l.i(this.e, (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f;
        int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166187g;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166188h;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f166191m) + j6.a.b(this.f166190l, j6.a.b(this.k, j6.a.b(this.f166189j, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.f166187g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166188h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.f166191m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.f166188h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
        return this.f166190l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166187g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof rh ? (rh) oldItem : null) == null) {
            return null;
        }
        rh rhVar = (rh) oldItem;
        return new sh(!Intrinsics.f(rhVar.f166185b, this.f166185b), !rhVar.f166186c.equals(this.f166186c));
    }
}
