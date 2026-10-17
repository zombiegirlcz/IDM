package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class r00 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f166073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166074c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166076h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166077j;

    public r00(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f166072a = listId;
        this.f166073b = c.d.f249513a;
        this.f166074c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        int i = R$attr.uikit_dp0;
        this.f166075g = i;
        this.f166076h = i;
        this.i = i;
        this.f166077j = i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53482a() {
        return this.f166072a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r00)) {
            return false;
        }
        r00 r00Var = (r00) obj2;
        return Intrinsics.f(this.f166072a, r00Var.f166072a) && Intrinsics.f(this.f166073b, r00Var.f166073b) && Intrinsics.f(this.f166074c, r00Var.f166074c) && Intrinsics.f(this.d, r00Var.d) && Intrinsics.f(this.e, r00Var.e) && Intrinsics.f(this.f, r00Var.f);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f166075g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166075g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166073b, this.f166072a.hashCode() * 31, 31);
        p31.c cVar = this.f166074c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f166074c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166073b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.f166076h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.f166077j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166076h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f166073b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166074c = cVar;
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
        r00 r00Var = oldItem instanceof r00 ? (r00) oldItem : null;
        if (r00Var != null) {
            return new s00(or0.b.l(this, r00Var));
        }
        return null;
    }
}
