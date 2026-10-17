package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class t6 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f166462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166463c;
    public final v6 d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f166464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166465h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166466j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f166467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f166468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f166469n;
    public final int o;

    public t6(String listId, Clause title, int i, Clause endText, Object obj2, v6 progressBarColors, int i2) {
        obj2 = (i2 & 16) != 0 ? null : obj2;
        int i3 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(endText, "endText");
        Intrinsics.checkNotNullParameter(progressBarColors, "progressBarColors");
        this.f166461a = listId;
        this.f166462b = title;
        this.f166463c = i;
        this.d = progressBarColors;
        this.e = endText;
        this.f = obj2;
        this.f166464g = c.d.f249513a;
        this.f166465h = null;
        this.i = null;
        this.f166466j = null;
        this.k = null;
        this.f166467l = i3;
        this.f166468m = i3;
        this.f166469n = i3;
        this.o = i3;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsBarRatingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f166461a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj2;
        return Intrinsics.f(this.f166461a, t6Var.f166461a) && this.f166462b.equals(t6Var.f166462b) && this.f166463c == t6Var.f166463c && this.d.equals(t6Var.d) && this.e.equals(t6Var.e) && Intrinsics.f(this.f, t6Var.f) && Intrinsics.f(this.f166464g, t6Var.f166464g) && Intrinsics.f(this.f166465h, t6Var.f166465h) && Intrinsics.f(this.i, t6Var.i) && Intrinsics.f(this.f166466j, t6Var.f166466j) && Intrinsics.f(this.k, t6Var.k) && this.f166467l == t6Var.f166467l && this.f166468m == t6Var.f166468m && this.f166469n == t6Var.f166469n && this.o == t6Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f166467l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166467l = i;
    }

    public final int hashCode() {
        int iB = p.a.b((this.d.hashCode() + j6.a.b(this.f166463c, p.a.a(this.f166461a.hashCode() * 31, 31, this.f166462b), 31)) * 31, 31, this.e);
        Object obj2 = this.f;
        int i = h30.l.i(this.f166464g, (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f166465h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166466j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f166469n, j6.a.b(this.f166468m, j6.a.b(this.f166467l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f166465h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166464g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166466j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f166468m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166468m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f166464g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f166466j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166465h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f166469n;
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
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof t6 ? (t6) oldItem : null) == null) {
            return null;
        }
        t6 t6Var = (t6) oldItem;
        boolean z3 = !t6Var.f166462b.equals(this.f166462b);
        boolean z4 = false;
        if (t6Var.f166463c != this.f166463c) {
            z = false;
            z4 = true;
        } else {
            z = false;
        }
        return new u6(z3, z4, !this.d.equals(t6Var.d), !t6Var.e.equals(this.e), (Intrinsics.f(t6Var.f166465h, this.f166465h) && Intrinsics.f(t6Var.i, this.i) && Intrinsics.f(t6Var.f166466j, this.f166466j) && Intrinsics.f(t6Var.k, this.k)) ? z : true);
    }
}
