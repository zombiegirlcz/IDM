package ip0;

import com.revolut.core.ui_kit.delegates.CardDesignCatalogueLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class m5 implements koi.j, tw0.y, qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f165313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165314c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165316h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165317j;

    public m5(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f165312a = listId;
        this.f165313b = positionInBox;
        this.f165314c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f165315g = i;
        this.f165316h = i;
        this.i = i;
        this.f165317j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CardDesignCatalogueLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55201b() {
        return this.f165312a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj2;
        return Intrinsics.f(this.f165312a, m5Var.f165312a) && Intrinsics.f(this.f165313b, m5Var.f165313b) && Intrinsics.f(this.f165314c, m5Var.f165314c) && Intrinsics.f(this.d, m5Var.d) && Intrinsics.f(this.e, m5Var.e) && Intrinsics.f(this.f, m5Var.f) && this.f165315g == m5Var.f165315g && this.f165316h == m5Var.f165316h && this.i == m5Var.i && this.f165317j == m5Var.f165317j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f165315g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165315g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165313b, this.f165312a.hashCode() * 31, 31);
        p31.c cVar = this.f165314c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f165317j) + j6.a.b(this.i, j6.a.b(this.f165316h, j6.a.b(this.f165315g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f165314c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165313b = cVar;
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
        return this.f165316h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f165317j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165316h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f165313b;
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
        this.f165314c = cVar;
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
