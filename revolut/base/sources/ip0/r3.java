package ip0;

import com.revolut.core.ui_kit.delegates.BarChartDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class r3 implements qv0.i, qv0.p {

    @NotNull
    public static final q3 Companion = new q3();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final List f166086r = zhm.v.k(Integer.valueOf(R$attr.uikit_colorBlue), Integer.valueOf(R$attr.uikit_colorCyan), Integer.valueOf(R$attr.uikit_colorIndigo));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3 f166088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f166089c;
    public final i3 d;
    public final Clause e;
    public final aw0.o1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d3 f166090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qsk.l f166091h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166092j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f166095n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f166096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f166097q;

    public r3(String listId, p3 dataset, i3 i3Var, i3 i3Var2, Clause clause, aw0.o1 legend, d3 style, qsk.l lVar, int i) {
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(dataset, "dataset");
        Intrinsics.checkNotNullParameter(legend, "legend");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f166087a = listId;
        this.f166088b = dataset;
        this.f166089c = i3Var;
        this.d = i3Var2;
        this.e = clause;
        this.f = legend;
        this.f166090g = style;
        this.f166091h = lVar;
        this.i = c.d.f249513a;
        this.f166092j = null;
        this.k = null;
        this.f166093l = null;
        this.f166094m = null;
        this.f166095n = i;
        this.o = i2;
        this.f166096p = i2;
        this.f166097q = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new BarChartDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this.f166091h;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f166087a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj2;
        return Intrinsics.f(this.f166087a, r3Var.f166087a) && Intrinsics.f(this.f166088b, r3Var.f166088b) && Intrinsics.f(this.f166089c, r3Var.f166089c) && Intrinsics.f(this.d, r3Var.d) && Intrinsics.f(this.e, r3Var.e) && Intrinsics.f(this.f, r3Var.f) && Intrinsics.f(this.f166090g, r3Var.f166090g) && Intrinsics.f(this.f166091h, r3Var.f166091h) && Intrinsics.f(this.i, r3Var.i) && Intrinsics.f(this.f166092j, r3Var.f166092j) && Intrinsics.f(this.k, r3Var.k) && Intrinsics.f(this.f166093l, r3Var.f166093l) && Intrinsics.f(this.f166094m, r3Var.f166094m) && this.f166095n == r3Var.f166095n && this.o == r3Var.o && this.f166096p == r3Var.f166096p && this.f166097q == r3Var.f166097q;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53157m() {
        return this.f166095n;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166095n = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f166088b.hashCode() + (this.f166087a.hashCode() * 31)) * 31;
        i3 i3Var = this.f166089c;
        int iHashCode2 = (iHashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31;
        i3 i3Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (i3Var2 == null ? 0 : i3Var2.hashCode())) * 31;
        Clause clause = this.e;
        int iHashCode4 = (this.f166090g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31;
        qsk.l lVar = this.f166091h;
        int i = h30.l.i(this.i, (iHashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31);
        p31.c cVar = this.f166092j;
        int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.k;
        int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166093l;
        int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166094m;
        return j6.a.b(this.f166097q, j6.a.b(this.f166096p, j6.a.b(this.o, j6.a.b(this.f166095n, (iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f166092j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53155j() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166093l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53158n() {
        return this.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53159p() {
        return this.f166097q;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.o = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53154h() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53156l() {
        return this.f166094m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f166093l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166092j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f166096p;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166094m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof r3 ? (r3) oldItem : null) == null) {
            return null;
        }
        r3 r3Var = (r3) oldItem;
        return new s3(!Intrinsics.f(r3Var.f166087a, this.f166087a), !Intrinsics.f(r3Var.f166088b, this.f166088b), !Intrinsics.f(r3Var.f166089c, this.f166089c), !Intrinsics.f(r3Var.d, this.d), !Intrinsics.f(r3Var.e, this.e), !Intrinsics.f(r3Var.f, this.f), !Intrinsics.f(r3Var.f166090g, this.f166090g), !true);
    }
}
