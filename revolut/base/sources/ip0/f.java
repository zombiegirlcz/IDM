package ip0;

import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f164169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f164170c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164172h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164173j;

    public f(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp12;
        this.f164168a = listId;
        this.f164169b = c.d.f249513a;
        this.f164170c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164171g = i;
        this.f164172h = i;
        this.i = i;
        this.f164173j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ActionCardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51752a() {
        return this.f164168a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f164168a, fVar.f164168a) && Intrinsics.f(this.f164169b, fVar.f164169b) && Intrinsics.f(this.f164170c, fVar.f164170c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f164171g == fVar.f164171g && this.f164172h == fVar.f164172h && this.i == fVar.i && this.f164173j == fVar.f164173j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f164171g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164171g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164169b, this.f164168a.hashCode() * 31, 31);
        p31.c cVar = this.f164170c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f164173j) + j6.a.b(this.i, j6.a.b(this.f164172h, j6.a.b(this.f164171g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f164170c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164169b = cVar;
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
        return this.f164172h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f164173j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164172h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f164169b;
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
        this.f164170c = cVar;
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
