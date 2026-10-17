package ip0;

import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class nf0 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of0 f165500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f165501c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165503h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165504j;
    public final int k;

    public nf0(String listId, of0 backgroundType) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f165499a = listId;
        this.f165500b = backgroundType;
        this.f165501c = positionInBox;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f165502g = null;
        this.f165503h = i;
        this.i = i;
        this.f165504j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SmallCardLoadingDelegate(null);
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52438a() {
        return this.f165499a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nf0)) {
            return false;
        }
        nf0 nf0Var = (nf0) obj2;
        return Intrinsics.f(this.f165499a, nf0Var.f165499a) && this.f165500b == nf0Var.f165500b && Intrinsics.f(this.f165501c, nf0Var.f165501c) && Intrinsics.f(this.d, nf0Var.d) && Intrinsics.f(this.e, nf0Var.e) && Intrinsics.f(this.f, nf0Var.f) && Intrinsics.f(this.f165502g, nf0Var.f165502g) && this.f165503h == nf0Var.f165503h && this.i == nf0Var.i && this.f165504j == nf0Var.f165504j && this.k == nf0Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f165503h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165503h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165501c, (this.f165500b.hashCode() + (this.f165499a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165502g;
        return Integer.hashCode(this.k) + j6.a.b(this.f165504j, j6.a.b(this.i, j6.a.b(this.f165503h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52447p() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165501c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52448q() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52444l() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52446n() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f165501c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52450s() {
        return this.f165502g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52449r() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52445m() {
        return this.f165504j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165502g = cVar;
    }
}
