package ip0;

import com.revolut.core.ui_kit.delegates.RateNPSDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class y80 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f167279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f167280c;
    public final Integer d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167282h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f167283j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f167284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f167285m;

    public y80(String listId, Clause endText, Clause startText, Integer num) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(endText, "endText");
        Intrinsics.checkNotNullParameter(startText, "startText");
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp24;
        this.f167278a = listId;
        this.f167279b = endText;
        this.f167280c = startText;
        this.d = num;
        this.e = c.d.f249513a;
        this.f = null;
        this.f167281g = null;
        this.f167282h = null;
        this.i = null;
        this.f167283j = i;
        this.k = i2;
        this.f167284l = i;
        this.f167285m = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RateNPSDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getD() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55034b() {
        return this.f167278a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y80)) {
            return false;
        }
        y80 y80Var = (y80) obj2;
        return Intrinsics.f(this.f167278a, y80Var.f167278a) && this.f167279b.equals(y80Var.f167279b) && this.f167280c.equals(y80Var.f167280c) && Intrinsics.f(this.d, y80Var.d) && Intrinsics.f(this.e, y80Var.e) && Intrinsics.f(this.f, y80Var.f) && Intrinsics.f(this.f167281g, y80Var.f167281g) && Intrinsics.f(this.f167282h, y80Var.f167282h) && Intrinsics.f(this.i, y80Var.i) && this.f167283j == y80Var.f167283j && this.k == y80Var.k && this.f167284l == y80Var.f167284l && this.f167285m == y80Var.f167285m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF55039l() {
        return this.f167283j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167283j = i;
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(this.f167278a.hashCode() * 31, 31, this.f167279b), 31, this.f167280c);
        Integer num = this.d;
        int i = h30.l.i(this.e, (iA + (num == null ? 0 : num.hashCode())) * 961, 31);
        p31.c cVar = this.f;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f167281g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f167282h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f167285m) + j6.a.b(this.f167284l, j6.a.b(this.k, j6.a.b(this.f167283j, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF55036g() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF55037h() {
        return this.f167281g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167282h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF55040m() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.f167285m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF55038j() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getI() {
        return this.f167282h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF55041n() {
        return this.f167284l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167281g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof y80 ? (y80) oldItem : null) == null) {
            return null;
        }
        Clause clause = ((y80) oldItem).f167280c;
        Clause clause2 = this.f167280c;
        return new z80(!clause.equals(clause2), !r1.f167279b.equals(clause2), !Intrinsics.f(r1.d, this.d), or0.b.l(this, (qv0.i) oldItem));
    }
}
