package ip0;

import com.revolut.core.ui_kit.delegates.ComparisonLineChartDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class nb implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.y1 f165480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.r1 f165481c;
    public final aw0.n2 d;
    public final aw0.x1 e;
    public final lnd.a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f165482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165483h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165484j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uw0.i f165485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f165486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f165487n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f165488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public qv0.c f165489q;

    public nb(String listId, aw0.y1 lineData, aw0.r1 r1Var, aw0.n2 style, aw0.x1 heightMode, lnd.a0 a0Var, ind.f fVar, int i, int i2, int i3) {
        heightMode = (i3 & 16) != 0 ? aw0.x1.REGULAR : heightMode;
        a0Var = (i3 & 32) != 0 ? null : a0Var;
        fVar = (i3 & 64) != 0 ? null : fVar;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.f165479a = listId;
        this.f165480b = lineData;
        this.f165481c = r1Var;
        this.d = style;
        this.e = heightMode;
        this.f = a0Var;
        this.f165482g = fVar;
        this.f165483h = i5;
        this.i = i5;
        this.f165484j = i;
        this.k = i2;
        this.f165485l = new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, false);
        this.f165489q = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ComparisonLineChartDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this.f165482g;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f165479a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nb)) {
            return false;
        }
        nb nbVar = (nb) obj2;
        return Intrinsics.f(this.f165479a, nbVar.f165479a) && Intrinsics.f(this.f165480b, nbVar.f165480b) && Intrinsics.f(this.f165481c, nbVar.f165481c) && Intrinsics.f(this.d, nbVar.d) && this.e == nbVar.e && Intrinsics.f(this.f, nbVar.f) && Intrinsics.f(this.f165482g, nbVar.f165482g) && this.f165483h == nbVar.f165483h && this.i == nbVar.i && this.f165484j == nbVar.f165484j && this.k == nbVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53157m() {
        return this.f165483h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165483h = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f165480b.hashCode() + (this.f165479a.hashCode() * 31)) * 31;
        aw0.r1 r1Var = this.f165481c;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (r1Var == null ? 0 : r1Var.hashCode())) * 31)) * 31)) * 31;
        lnd.a0 a0Var = this.f;
        int iHashCode3 = (iHashCode2 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        Object obj2 = this.f165482g;
        return Integer.hashCode(this.k) + j6.a.b(this.f165484j, j6.a.b(this.i, j6.a.b(this.f165483h, (iHashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f165486m;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165489q = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53155j() {
        return this.f165487n;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53158n() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53159p() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53154h() {
        return this.f165489q;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53156l() {
        return this.f165488p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.o;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165486m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f165484j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165487n = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165488p = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof nb)) {
            return null;
        }
        return new ob(!Intrinsics.f(this.f165480b, r1.f165480b), !Intrinsics.f(this.f165481c, r1.f165481c), !Intrinsics.f(this.f, r1.f), this.e != ((nb) oldItem).e, !Intrinsics.f(this.d, r1.d), or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(this.f165485l, r1.f165485l));
    }
}
