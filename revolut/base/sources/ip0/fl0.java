package ip0;

import com.revolut.core.ui_kit.delegates.TitleDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class fl0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.na f164277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f164278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164279c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f164280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164281h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164282j;
    public p31.c k;

    public fl0(aw0.na titleViewModel, String listId) {
        Intrinsics.checkNotNullParameter(titleViewModel, "titleViewModel");
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp16;
        this.f164277a = titleViewModel;
        this.f164278b = listId;
        this.f164279c = i;
        this.d = i;
        this.e = i;
        this.f = i;
        this.f164280g = c.d.f249513a;
        this.f164281h = null;
        this.i = null;
        this.f164282j = null;
        this.k = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TitleDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f164278b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fl0)) {
            return false;
        }
        fl0 fl0Var = (fl0) obj2;
        return Intrinsics.f(this.f164277a, fl0Var.f164277a) && Intrinsics.f(this.f164278b, fl0Var.f164278b) && this.f164279c == fl0Var.f164279c && this.d == fl0Var.d && this.e == fl0Var.e && this.f == fl0Var.f && Intrinsics.f(this.f164280g, fl0Var.f164280g) && Intrinsics.f(this.f164281h, fl0Var.f164281h) && Intrinsics.f(this.i, fl0Var.i) && Intrinsics.f(this.f164282j, fl0Var.f164282j) && Intrinsics.f(this.k, fl0Var.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53157m() {
        return this.f164279c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164279c = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164280g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f164279c, p.a.c(this.f164277a.hashCode() * 31, 31, this.f164278b), 31), 31), 31), 31), 31);
        p31.c cVar = this.f164281h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164282j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f164281h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164280g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53155j() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164282j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53158n() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53159p() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53154h() {
        return this.f164280g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53156l() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f164282j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164281h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof fl0 ? (fl0) oldItem : null) != null) {
            return new gl0(!this.f164277a.equals(((fl0) oldItem).f164277a), or0.b.l((qv0.i) oldItem, this));
        }
        return null;
    }
}
