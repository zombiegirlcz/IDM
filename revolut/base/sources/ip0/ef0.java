package ip0;

import com.revolut.core.ui_kit.delegates.SliderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ef0 implements qv0.i, s31.c, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f164080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f164081c;
    public final int d;
    public final int e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cy0.c f164083h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f164084j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f164085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final aw0.j0 f164086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f164087n;
    public qv0.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f164088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p31.c f164089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p31.c f164090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p31.c f164091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f164092t;
    public int u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f164093w;

    public ef0(String listId, MoneyClause endLabel, MoneyClause startLabel, int i, int i2, ArrayList stickyValues, cy0.c cVar, Clause clause, Clause clause2, boolean z) {
        int i3 = R$attr.uikit_dp16;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(stickyValues, "stickyValues");
        aw0.j0 backgroundType = aw0.j0.DEFAULT;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(stickyValues, "stickyValues");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f164079a = listId;
        this.f164080b = endLabel;
        this.f164081c = startLabel;
        this.d = i;
        this.e = i2;
        this.f = stickyValues;
        this.f164082g = true;
        this.f164083h = cVar;
        this.i = clause;
        this.f164084j = clause2;
        this.k = z;
        this.f164085l = 2;
        this.f164086m = backgroundType;
        this.f164087n = 2.0f;
        this.o = positionInBox;
        this.f164088p = null;
        this.f164089q = null;
        this.f164090r = null;
        this.f164091s = null;
        this.f164092t = i3;
        this.u = i3;
        this.v = i5;
        this.f164093w = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SliderDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getD() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55034b() {
        return this.f164079a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ef0)) {
            return false;
        }
        ef0 ef0Var = (ef0) obj2;
        return Intrinsics.f(this.f164079a, ef0Var.f164079a) && Intrinsics.f(this.f164080b, ef0Var.f164080b) && Intrinsics.f(this.f164081c, ef0Var.f164081c) && this.d == ef0Var.d && this.e == ef0Var.e && Intrinsics.f(this.f, ef0Var.f) && this.f164082g == ef0Var.f164082g && Intrinsics.f(this.f164083h, ef0Var.f164083h) && Intrinsics.f(this.i, ef0Var.i) && Intrinsics.f(this.f164084j, ef0Var.f164084j) && this.k == ef0Var.k && Intrinsics.f(this.f164085l, ef0Var.f164085l) && this.f164086m == ef0Var.f164086m && Float.compare(this.f164087n, ef0Var.f164087n) == 0 && Intrinsics.f(this.o, ef0Var.o) && Intrinsics.f(this.f164088p, ef0Var.f164088p) && Intrinsics.f(this.f164089q, ef0Var.f164089q) && Intrinsics.f(this.f164090r, ef0Var.f164090r) && Intrinsics.f(this.f164091s, ef0Var.f164091s) && Intrinsics.f(null, null) && this.f164092t == ef0Var.f164092t && this.u == ef0Var.u && this.v == ef0Var.v && this.f164093w == ef0Var.f164093w;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF55039l() {
        return this.f164092t;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164092t = i;
    }

    public final int hashCode() {
        int iC = j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(0, v7.a(v7.a(this.f164079a.hashCode() * 31, 31, this.f164080b), 31, this.f164081c), 31), 31), 31), 31), 31, this.f164082g);
        cy0.c cVar = this.f164083h;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Clause clause = this.i;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f164084j;
        int iC2 = j6.a.c((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.k);
        Integer num = this.f164085l;
        int i = h30.l.i(this.o, m72.b.b(this.f164087n, (this.f164086m.hashCode() + ((iC2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 961), 31);
        p31.c cVar2 = this.f164088p;
        int iHashCode3 = (i + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164089q;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164090r;
        int iHashCode5 = (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
        p31.c cVar5 = this.f164091s;
        return Integer.hashCode(this.f164093w) + j6.a.b(this.v, j6.a.b(this.u, j6.a.b(this.f164092t, (((iHashCode5 + (cVar5 != null ? cVar5.hashCode() : 0)) * 31) + 0) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF55036g() {
        return this.f164088p;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.o = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF55037h() {
        return this.f164089q;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164090r = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF55040m() {
        return this.u;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.f164093w;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.u = i;
    }

    @Override // s31.c
    public final hx7.i p() {
        return null;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF55038j() {
        return this.f164091s;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getI() {
        return this.f164090r;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164088p = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF55041n() {
        return this.v;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164089q = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164091s = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ef0 ? (ef0) oldItem : null) == null) {
            return null;
        }
        ef0 ef0Var = (ef0) oldItem;
        boolean z3 = false;
        if (ef0Var.e != this.e) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        boolean z4 = !Intrinsics.f(ef0Var.f, this.f);
        boolean z6 = !Intrinsics.f(ef0Var.f164081c, this.f164081c);
        boolean z11 = !Intrinsics.f(ef0Var.f164080b, this.f164080b);
        boolean z12 = ef0Var.d != this.d ? true : z;
        boolean z29 = ef0Var.f164082g != this.f164082g ? true : z;
        boolean z31 = !Intrinsics.f(ef0Var.f164083h, this.f164083h);
        boolean z41 = !Intrinsics.f(ef0Var.i, this.i);
        boolean z49 = !Intrinsics.f(ef0Var.f164084j, this.f164084j);
        boolean z54 = ef0Var.k != this.k ? true : z;
        if (ef0Var.f164087n == this.f164087n) {
            z = true;
        }
        return new ff0(z3, z4, z6, z11, false, z12, z29, z31, z41, z49, z54, !z);
    }
}
