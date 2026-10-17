package ip0;

import com.revolut.core.ui_kit.delegates.RoomListingCardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class bb0 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f163575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f163576c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163578h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163579j;

    public bb0(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f163574a = listId;
        this.f163575b = c.d.f249513a;
        this.f163576c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163577g = i;
        this.f163578h = i;
        this.i = i;
        this.f163579j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RoomListingCardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53056a() {
        return this.f163574a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bb0)) {
            return false;
        }
        bb0 bb0Var = (bb0) obj2;
        return Intrinsics.f(this.f163574a, bb0Var.f163574a) && Intrinsics.f(this.f163575b, bb0Var.f163575b) && Intrinsics.f(this.f163576c, bb0Var.f163576c) && Intrinsics.f(this.d, bb0Var.d) && Intrinsics.f(this.e, bb0Var.e) && Intrinsics.f(this.f, bb0Var.f) && this.f163577g == bb0Var.f163577g && this.f163578h == bb0Var.f163578h && this.i == bb0Var.i && this.f163579j == bb0Var.f163579j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52020l() {
        return this.f163577g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163577g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163575b, this.f163574a.hashCode() * 31, 31);
        p31.c cVar = this.f163576c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f163579j) + j6.a.b(this.i, j6.a.b(this.f163578h, j6.a.b(this.f163577g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52018h() {
        return this.f163576c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163575b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52021m() {
        return this.f163578h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.f163579j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163578h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52017g() {
        return this.f163575b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52019j() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163576c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52022n() {
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
}
