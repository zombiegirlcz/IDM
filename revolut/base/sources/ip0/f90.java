package ip0;

import com.revolut.core.ui_kit.delegates.RateOneClickDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class f90 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d90 f164221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f164222c;
    public final boolean d;
    public final b90 e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f164223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164224h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164225j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f164226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f164227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f164228n;
    public final int o;

    public /* synthetic */ f90(String str, d90 d90Var, Clause clause, fkd.x xVar, int i) {
        this(str, d90Var, clause, (i & 8) == 0, null, (i & 32) != 0 ? null : xVar);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RateOneClickDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getO() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59488a() {
        return this.f164220a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f90)) {
            return false;
        }
        f90 f90Var = (f90) obj2;
        return Intrinsics.f(this.f164220a, f90Var.f164220a) && Intrinsics.f(this.f164221b, f90Var.f164221b) && Intrinsics.f(this.f164222c, f90Var.f164222c) && this.d == f90Var.d && Intrinsics.f(this.e, f90Var.e) && Intrinsics.f(this.f, f90Var.f) && Intrinsics.f(this.f164223g, f90Var.f164223g) && Intrinsics.f(this.f164224h, f90Var.f164224h) && Intrinsics.f(this.i, f90Var.i) && Intrinsics.f(this.f164225j, f90Var.f164225j) && Intrinsics.f(this.k, f90Var.k) && this.f164226l == f90Var.f164226l && this.f164227m == f90Var.f164227m && this.f164228n == f90Var.f164228n && this.o == f90Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51846w() {
        return this.f164226l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164226l = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f164221b.hashCode() + (this.f164220a.hashCode() * 31)) * 31;
        Clause clause = this.f164222c;
        int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        b90 b90Var = this.e;
        int iHashCode2 = (iC + (b90Var == null ? 0 : b90Var.hashCode())) * 31;
        Object obj2 = this.f;
        int i = h30.l.i(this.f164223g, (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f164224h;
        int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164225j;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f164228n, j6.a.b(this.f164227m, j6.a.b(this.f164226l, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51843r() {
        return this.f164224h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164223g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51844s() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164225j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51847x() {
        return this.f164227m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getZ() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164227m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51841p() {
        return this.f164223g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getU() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51845t() {
        return this.f164225j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164224h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51848y() {
        return this.f164228n;
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
        if (!(oldItem instanceof f90)) {
            return null;
        }
        return new g90(or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(r8.f164222c, this.f164222c), ((f90) oldItem).d != this.d, !Intrinsics.f(r8.f164221b, this.f164221b), !Intrinsics.f(r8.e, this.e));
    }

    public f90(String listId, d90 content, Clause clause, boolean z, b90 b90Var, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(content, "content");
        int i = clause == null ? R$attr.uikit_dp0 : R$attr.uikit_dp12;
        int i2 = R$attr.uikit_dp12;
        int i3 = R$attr.uikit_dp0;
        this.f164220a = listId;
        this.f164221b = content;
        this.f164222c = clause;
        this.d = z;
        this.e = b90Var;
        this.f = obj2;
        this.f164223g = c.d.f249513a;
        this.f164224h = null;
        this.i = null;
        this.f164225j = null;
        this.k = null;
        this.f164226l = i;
        this.f164227m = i2;
        this.f164228n = i3;
        this.o = i3;
    }
}
