package ip0;

import com.revolut.core.ui_kit.delegates.AttributeSelectorIconLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class p1 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f165750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165751c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165753h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165754j;

    public p1(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f165749a = listId;
        this.f165750b = c.d.f249513a;
        this.f165751c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f165752g = i;
        this.f165753h = i;
        this.i = i;
        this.f165754j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new AttributeSelectorIconLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55201b() {
        return this.f165749a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f165749a, p1Var.f165749a) && Intrinsics.f(this.f165750b, p1Var.f165750b) && Intrinsics.f(this.f165751c, p1Var.f165751c) && Intrinsics.f(this.d, p1Var.d) && Intrinsics.f(this.e, p1Var.e) && Intrinsics.f(this.f, p1Var.f) && this.f165752g == p1Var.f165752g && this.f165753h == p1Var.f165753h && this.i == p1Var.i && this.f165754j == p1Var.f165754j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f165752g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165752g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165750b, this.f165749a.hashCode() * 31, 31);
        p31.c cVar = this.f165751c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f165754j) + j6.a.b(this.i, j6.a.b(this.f165753h, j6.a.b(this.f165752g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f165751c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165750b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f165753h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f165754j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165753h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f165750b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165751c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
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
