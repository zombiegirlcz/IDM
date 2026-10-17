package ip0;

import com.revolut.core.ui_kit.delegates.StreakStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class eh0 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164101c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164103h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164104j;

    public eh0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp12;
        int i2 = R$attr.uikit_dp16;
        this.f164099a = listId;
        this.f164100b = i;
        this.f164101c = i;
        this.d = i2;
        this.e = i2;
        this.f = c.d.f249513a;
        this.f164102g = null;
        this.f164103h = null;
        this.i = null;
        this.f164104j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new StreakStepVerticalLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53056a() {
        return this.f164099a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof eh0)) {
            return false;
        }
        eh0 eh0Var = (eh0) obj2;
        return Intrinsics.f(this.f164099a, eh0Var.f164099a) && this.f164100b == eh0Var.f164100b && this.f164101c == eh0Var.f164101c && this.d == eh0Var.d && this.e == eh0Var.e && Intrinsics.f(this.f, eh0Var.f) && Intrinsics.f(this.f164102g, eh0Var.f164102g) && Intrinsics.f(this.f164103h, eh0Var.f164103h) && Intrinsics.f(this.i, eh0Var.i) && Intrinsics.f(this.f164104j, eh0Var.f164104j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52020l() {
        return this.f164100b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164100b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f164101c, j6.a.b(this.f164100b, this.f164099a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f164102g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164103h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164104j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52018h() {
        return this.f164102g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.f164103h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52021m() {
        return this.f164101c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164101c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52017g() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.f164104j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52019j() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164102g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52022n() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164103h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164104j = cVar;
    }
}
