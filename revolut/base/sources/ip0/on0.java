package ip0;

import com.revolut.core.ui_kit.delegates.VaultsProgressLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class on0 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165697c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165699h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165700j;

    public on0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f165695a = listId;
        this.f165696b = i;
        this.f165697c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
        this.f165698g = null;
        this.f165699h = null;
        this.i = null;
        this.f165700j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new VaultsProgressLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f165695a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof on0)) {
            return false;
        }
        on0 on0Var = (on0) obj2;
        return Intrinsics.f(this.f165695a, on0Var.f165695a) && this.f165696b == on0Var.f165696b && this.f165697c == on0Var.f165697c && this.d == on0Var.d && this.e == on0Var.e && Intrinsics.f(this.f, on0Var.f) && Intrinsics.f(this.f165698g, on0Var.f165698g) && Intrinsics.f(this.f165699h, on0Var.f165699h) && Intrinsics.f(this.i, on0Var.i) && Intrinsics.f(this.f165700j, on0Var.f165700j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f165696b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165696b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f165697c, j6.a.b(this.f165696b, this.f165695a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f165698g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165699h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165700j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f165698g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.f165699h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f165697c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165697c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f165700j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165698g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165699h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165700j = cVar;
    }
}
