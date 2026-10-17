package ip0;

import com.revolut.core.ui_kit.delegates.RoomPreviewLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class gb0 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f164392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f164393c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164395h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164396j;

    public gb0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp16;
        this.f164391a = listId;
        this.f164392b = c.d.f249513a;
        this.f164393c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164394g = i;
        this.f164395h = i;
        this.i = i;
        this.f164396j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RoomPreviewLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53544a() {
        return this.f164391a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gb0)) {
            return false;
        }
        gb0 gb0Var = (gb0) obj2;
        return Intrinsics.f(this.f164391a, gb0Var.f164391a) && Intrinsics.f(this.f164392b, gb0Var.f164392b) && Intrinsics.f(this.f164393c, gb0Var.f164393c) && Intrinsics.f(this.d, gb0Var.d) && Intrinsics.f(this.e, gb0Var.e) && Intrinsics.f(this.f, gb0Var.f) && this.f164394g == gb0Var.f164394g && this.f164395h == gb0Var.f164395h && this.i == gb0Var.i && this.f164396j == gb0Var.f164396j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f164394g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164394g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164392b, this.f164391a.hashCode() * 31, 31);
        p31.c cVar = this.f164393c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f164396j) + j6.a.b(this.i, j6.a.b(this.f164395h, j6.a.b(this.f164394g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.f164393c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164392b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52952p() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52948j() {
        return this.f164395h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52949l() {
        return this.f164396j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164395h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52951n() {
        return this.f164392b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52954r() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52953q() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164393c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof gb0 ? (gb0) oldItem : null) != null) {
            return new hb0(or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
