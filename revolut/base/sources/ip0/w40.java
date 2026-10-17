package ip0;

import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class w40 implements tw0.y, qv0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166931c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166933h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166934j;
    public qv0.k k;

    public w40(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        qv0.k kVar = qv0.k.OutOfGroup;
        this.f166929a = listId;
        this.f166930b = i;
        this.f166931c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
        this.f166932g = null;
        this.f166933h = null;
        this.i = null;
        this.f166934j = null;
        this.k = kVar;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getF52162g() {
        return false;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.k = kVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressStepVerticalLoadingV2Delegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f166929a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w40)) {
            return false;
        }
        w40 w40Var = (w40) obj2;
        return Intrinsics.f(this.f166929a, w40Var.f166929a) && this.f166930b == w40Var.f166930b && this.f166931c == w40Var.f166931c && this.d == w40Var.d && this.e == w40Var.e && Intrinsics.f(this.f, w40Var.f) && Intrinsics.f(this.f166932g, w40Var.f166932g) && Intrinsics.f(this.f166933h, w40Var.f166933h) && Intrinsics.f(this.i, w40Var.i) && Intrinsics.f(this.f166934j, w40Var.f166934j) && this.k == w40Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f166930b;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getU() {
        return this.k;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166930b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166931c, j6.a.b(this.f166930b, this.f166929a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f166932g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166933h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166934j;
        return this.k.hashCode() + ((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f166934j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.f166932g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166933h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f166931c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166931c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52017g() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52019j() {
        return this.f166933h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166934j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52022n() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166932g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return null;
    }
}
