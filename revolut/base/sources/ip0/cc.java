package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class cc implements qv0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv0.b f163710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bc f163711c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f163712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163713h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163714j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f163715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qv0.k f163716m;

    public cc(String listId, bv0.b bVar, int i) {
        bc.Companion.getClass();
        ac width = yb.f167295b;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(width, "width");
        qv0.k kVar = qv0.k.OutOfGroup;
        this.f163709a = listId;
        this.f163710b = bVar;
        this.f163711c = width;
        this.d = i2;
        this.e = i;
        this.f = i2;
        this.f163712g = i2;
        this.f163713h = null;
        this.i = null;
        this.f163714j = null;
        this.k = null;
        this.f163715l = c.d.f249513a;
        this.f163716m = kVar;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getF52162g() {
        return false;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f163716m = kVar;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f163709a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj2;
        return Intrinsics.f(this.f163709a, ccVar.f163709a) && Intrinsics.f(this.f163710b, ccVar.f163710b) && Intrinsics.f(this.f163711c, ccVar.f163711c) && this.d == ccVar.d && this.e == ccVar.e && this.f == ccVar.f && this.f163712g == ccVar.f163712g && Intrinsics.f(this.f163713h, ccVar.f163713h) && Intrinsics.f(this.i, ccVar.i) && Intrinsics.f(this.f163714j, ccVar.f163714j) && Intrinsics.f(this.k, ccVar.k) && Intrinsics.f(this.f163715l, ccVar.f163715l) && this.f163716m == ccVar.f163716m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.d;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getU() {
        return this.f163716m;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int iHashCode = this.f163709a.hashCode() * 31;
        bv0.b bVar = this.f163710b;
        int iC = j6.a.c(j6.a.b(this.f163712g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, (this.f163711c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31, false);
        p31.c cVar = this.f163713h;
        int iHashCode2 = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163714j;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return this.f163716m.hashCode() + h30.l.i(this.f163715l, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f163713h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163715l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163714j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f163712g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f163715l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f163714j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163713h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        cc ccVar = oldItem instanceof cc ? (cc) oldItem : null;
        if (ccVar != null) {
            return new dc(!Intrinsics.f(ccVar.f163711c, this.f163711c), !Intrinsics.f(ccVar.f163710b, this.f163710b), or0.b.m(ccVar, this));
        }
        return null;
    }
}
