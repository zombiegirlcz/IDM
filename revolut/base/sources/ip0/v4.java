package ip0;

import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class v4 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4 f166763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166764c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166766h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166767j;
    public final int k;

    public v4(String listId, w4 ratio, int i) {
        ratio = (i & 2) != 0 ? w4.NORMAL : ratio;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166762a = listId;
        this.f166763b = ratio;
        this.f166764c = positionInBox;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166765g = null;
        this.f166766h = i2;
        this.i = i2;
        this.f166767j = i2;
        this.k = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new BigTileLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52438a() {
        return this.f166762a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj2;
        return Intrinsics.f(this.f166762a, v4Var.f166762a) && this.f166763b == v4Var.f166763b && Intrinsics.f(this.f166764c, v4Var.f166764c) && Intrinsics.f(this.d, v4Var.d) && Intrinsics.f(this.e, v4Var.e) && Intrinsics.f(this.f, v4Var.f) && Intrinsics.f(this.f166765g, v4Var.f166765g) && this.f166766h == v4Var.f166766h && this.i == v4Var.i && this.f166767j == v4Var.f166767j && this.k == v4Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f166766h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166766h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166764c, (this.f166763b.hashCode() + (this.f166762a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166765g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166767j, j6.a.b(this.i, j6.a.b(this.f166766h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52447p() {
        return this.f166765g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166764c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52448q() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
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
        return this.f166764c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52450s() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52449r() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166765g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52445m() {
        return this.f166767j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }
}
