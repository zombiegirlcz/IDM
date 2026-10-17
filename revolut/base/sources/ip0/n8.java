package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class n8 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f165465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f165466c;
    public final aw0.j0 d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165468h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f165469j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f165470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f165471m;

    public n8(Clause cellTitle, Clause endText, String listId) {
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(endText, "endText");
        aw0.j0 backgroundType = aw0.j0.DEFAULT;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(endText, "endText");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f165464a = listId;
        this.f165465b = cellTitle;
        this.f165466c = endText;
        this.d = backgroundType;
        this.e = positionInBox;
        this.f = null;
        this.f165467g = null;
        this.f165468h = null;
        this.i = null;
        this.f165469j = i;
        this.k = i;
        this.f165470l = i;
        this.f165471m = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsTotalDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f165464a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj2;
        return Intrinsics.f(this.f165464a, n8Var.f165464a) && Intrinsics.f(this.f165465b, n8Var.f165465b) && Intrinsics.f(this.f165466c, n8Var.f165466c) && this.d == n8Var.d && Intrinsics.f(this.e, n8Var.e) && Intrinsics.f(this.f, n8Var.f) && Intrinsics.f(this.f165467g, n8Var.f165467g) && Intrinsics.f(this.f165468h, n8Var.f165468h) && Intrinsics.f(this.i, n8Var.i) && this.f165469j == n8Var.f165469j && this.k == n8Var.k && this.f165470l == n8Var.f165470l && this.f165471m == n8Var.f165471m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f165469j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165469j = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.e, (this.d.hashCode() + p.a.a(p.a.b(this.f165464a.hashCode() * 31, 31, this.f165465b), 31, this.f165466c)) * 31, 31);
        p31.c cVar = this.f;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165467g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165468h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f165471m) + j6.a.b(this.f165470l, j6.a.b(this.k, j6.a.b(this.f165469j, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f165467g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165468h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f165471m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f165468h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f165470l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165467g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof n8 ? (n8) oldItem : null) == null) {
            return null;
        }
        n8 n8Var = (n8) oldItem;
        boolean z = true;
        boolean z3 = !Intrinsics.f(n8Var.f165465b, this.f165465b);
        boolean z4 = !Intrinsics.f(n8Var.f165466c, this.f165466c);
        if (Intrinsics.f(n8Var.f, this.f) && Intrinsics.f(n8Var.f165467g, this.f165467g) && Intrinsics.f(n8Var.f165468h, this.f165468h) && Intrinsics.f(n8Var.i, this.i)) {
            z = false;
        }
        return new o8(z3, z4, z);
    }
}
