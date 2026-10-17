package ip0;

import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class a10 implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f163364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f163365c;
    public final int d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163367h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163368j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f163369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f163370m;

    public a10(String listId, List values, int i) {
        int size = values.size() - 1;
        int i2 = R$attr.uikit_dp16;
        int i3 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(values, "values");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f163363a = listId;
        this.f163364b = values;
        this.f163365c = i;
        this.d = size;
        this.e = positionInBox;
        this.f = null;
        this.f163366g = null;
        this.f163367h = null;
        this.i = null;
        this.f163368j = i2;
        this.k = i2;
        this.f163369l = i3;
        this.f163370m = i3;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PickerDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52256a() {
        return this.f163363a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj2;
        return Intrinsics.f(this.f163363a, a10Var.f163363a) && Intrinsics.f(this.f163364b, a10Var.f163364b) && this.f163365c == a10Var.f163365c && this.d == a10Var.d && Intrinsics.f(this.e, a10Var.e) && Intrinsics.f(this.f, a10Var.f) && Intrinsics.f(this.f163366g, a10Var.f163366g) && Intrinsics.f(this.f163367h, a10Var.f163367h) && Intrinsics.f(this.i, a10Var.i) && this.f163368j == a10Var.f163368j && this.k == a10Var.k && this.f163369l == a10Var.f163369l && this.f163370m == a10Var.f163370m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52263m() {
        return this.f163368j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163368j = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.e, j6.a.b(0, j6.a.b(this.d, j6.a.b(this.f163365c, p.a.d(this.f163363a.hashCode() * 31, 31, this.f163364b), 31), 31), 961), 31);
        p31.c cVar = this.f;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163366g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163367h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f163370m) + j6.a.b(this.f163369l, j6.a.b(this.k, j6.a.b(this.f163368j, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52261j() {
        return this.f163366g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163367h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52264n() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52265p() {
        return this.f163370m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52260h() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52262l() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f163367h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f163369l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163366g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof a10 ? (a10) oldItem : null) == null) {
            return null;
        }
        a10 a10Var = (a10) oldItem;
        return new b10(a10Var.f163365c != this.f163365c, a10Var.d != this.d, false, !Intrinsics.f(a10Var.f163364b, this.f163364b));
    }
}
