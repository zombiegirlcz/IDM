package ip0;

import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class u40 implements tw0.y, qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166591c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166593h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166594j;

    public u40(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f166589a = listId;
        this.f166590b = i;
        this.f166591c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
        this.f166592g = null;
        this.f166593h = null;
        this.i = null;
        this.f166594j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressStepVerticalLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f166589a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj2;
        return Intrinsics.f(this.f166589a, u40Var.f166589a) && this.f166590b == u40Var.f166590b && this.f166591c == u40Var.f166591c && this.d == u40Var.d && this.e == u40Var.e && Intrinsics.f(this.f, u40Var.f) && Intrinsics.f(this.f166592g, u40Var.f166592g) && Intrinsics.f(this.f166593h, u40Var.f166593h) && Intrinsics.f(this.i, u40Var.i) && Intrinsics.f(this.f166594j, u40Var.f166594j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f166590b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166590b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166591c, j6.a.b(this.f166590b, this.f166589a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f166592g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166593h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166594j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f166594j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.f166592g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166593h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f166591c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166591c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.f166593h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166594j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166592g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }
}
