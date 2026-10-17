package ip0;

import com.revolut.core.ui_kit.delegates.SeparatorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ae0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f163427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f163428c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163430h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163431j;
    public int k;

    public ae0(TextLocalisedClause textLocalisedClause, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f163426a = listId;
        this.f163427b = textLocalisedClause;
        this.f163428c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163429g = null;
        int i = R$attr.uikit_dp0;
        this.f163430h = i;
        this.i = i;
        this.f163431j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SeparatorDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f163426a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ae0)) {
            return false;
        }
        ae0 ae0Var = (ae0) obj2;
        return Intrinsics.f(this.f163426a, ae0Var.f163426a) && Intrinsics.f(this.f163427b, ae0Var.f163427b) && Intrinsics.f(this.f163428c, ae0Var.f163428c) && Intrinsics.f(this.d, ae0Var.d) && Intrinsics.f(this.e, ae0Var.e) && Intrinsics.f(this.f, ae0Var.f) && Intrinsics.f(this.f163429g, ae0Var.f163429g);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f163430h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163430h = i;
    }

    public final int hashCode() {
        int iHashCode = this.f163426a.hashCode() * 31;
        Clause clause = this.f163427b;
        int i = h30.l.i(this.f163428c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163429g;
        return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163428c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f163428c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f163429g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f163431j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163429g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        ae0 ae0Var = oldItem instanceof ae0 ? (ae0) oldItem : null;
        if (ae0Var != null) {
            return new be0(!Intrinsics.f(((ae0) oldItem).f163427b, this.f163427b), or0.b.l(this, ae0Var));
        }
        return null;
    }
}
