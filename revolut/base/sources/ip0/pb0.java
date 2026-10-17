package ip0;

import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class pb0 implements tw0.y, qv0.p, qv0.q, qv0.l {

    @NotNull
    public static final nb0 Companion = new nb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob0 f165805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165806c;
    public final boolean d;
    public final Object e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165808h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165809j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f165810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f165811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f165812n;
    public qv0.k o;

    public pb0(String str, ob0 ob0Var, boolean z, boolean z3, Object obj2, int i, int i2, int i3, int i5, int i6) {
        z3 = (i6 & 8) != 0 ? true : z3;
        obj2 = (i6 & 16) != 0 ? null : obj2;
        qv0.k kVar = qv0.k.OutOfGroup;
        this.f165804a = str;
        this.f165805b = ob0Var;
        this.f165806c = z;
        this.d = z3;
        this.e = obj2;
        this.f = c.d.f249513a;
        this.f165807g = null;
        this.f165808h = null;
        this.i = null;
        this.f165809j = null;
        this.k = i;
        this.f165810l = i2;
        this.f165811m = i3;
        this.f165812n = i5;
        this.o = kVar;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getE() {
        return false;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.o = kVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RowLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53496h() {
        return this.e;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53492a() {
        return this.f165804a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pb0)) {
            return false;
        }
        pb0 pb0Var = (pb0) obj2;
        return Intrinsics.f(this.f165804a, pb0Var.f165804a) && this.f165805b == pb0Var.f165805b && this.f165806c == pb0Var.f165806c && this.d == pb0Var.d && Intrinsics.f(this.e, pb0Var.e) && Intrinsics.f(this.f, pb0Var.f) && Intrinsics.f(this.f165807g, pb0Var.f165807g) && Intrinsics.f(this.f165808h, pb0Var.f165808h) && Intrinsics.f(this.i, pb0Var.i) && Intrinsics.f(this.f165809j, pb0Var.f165809j) && this.k == pb0Var.k && this.f165810l == pb0Var.f165810l && this.f165811m == pb0Var.f165811m && this.f165812n == pb0Var.f165812n && this.o == pb0Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52384r() {
        return this.k;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getV() {
        return this.o;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.k = i;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f165805b.hashCode() + (this.f165804a.hashCode() * 31)) * 31, 31, this.f165806c), 31, this.d);
        Object obj2 = this.e;
        int i = h30.l.i(this.f, (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f165807g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165808h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165809j;
        return this.o.hashCode() + j6.a.b(this.f165812n, j6.a.b(this.f165811m, j6.a.b(this.f165810l, j6.a.b(this.k, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52381n() {
        return this.f165809j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f165807g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165808h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52385s() {
        return this.f165810l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f165812n;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165810l = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52380m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52383q() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52382p() {
        return this.f165808h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165809j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52386t() {
        return this.f165811m;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165807g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        qb0 qb0Var = null;
        if ((oldItem instanceof pb0 ? (pb0) oldItem : null) != null) {
            pb0 pb0Var = (pb0) oldItem;
            qb0Var = new qb0(this.f165805b != pb0Var.f165805b, this.d != pb0Var.d, this.f165806c != pb0Var.f165806c, or0.b.m(this, (qv0.l) oldItem));
        }
        return qb0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pb0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ob0 ob0Var = ob0.DP_40;
        int i = R$attr.uikit_dp18;
        int i2 = R$attr.uikit_dp16;
        this(listId, ob0Var, true, false, null, i, i, i2, i2, 17368);
    }
}
