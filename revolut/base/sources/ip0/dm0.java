package ip0;

import com.revolut.core.ui_kit.delegates.TrendPreviewLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class dm0 implements qv0.i, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f163928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f163929c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163931h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163932j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f163933l;

    public dm0(String listId) {
        aw0.ab.Companion.getClass();
        List items = aw0.ab.f10236c;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        int i = R$attr.uikit_dp0;
        this.f163927a = listId;
        this.f163928b = items;
        this.f163929c = 1.0f;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f163930g = null;
        this.f163931h = null;
        this.i = i;
        this.f163932j = i;
        this.k = i;
        this.f163933l = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TrendPreviewLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51674g() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51671a() {
        return this.f163927a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dm0)) {
            return false;
        }
        dm0 dm0Var = (dm0) obj2;
        return Intrinsics.f(this.f163927a, dm0Var.f163927a) && Intrinsics.f(this.f163928b, dm0Var.f163928b) && Float.compare(this.f163929c, dm0Var.f163929c) == 0 && Intrinsics.f(this.d, dm0Var.d) && Intrinsics.f(this.e, dm0Var.e) && Intrinsics.f(this.f, dm0Var.f) && Intrinsics.f(this.f163930g, dm0Var.f163930g) && Intrinsics.f(this.f163931h, dm0Var.f163931h) && this.i == dm0Var.i && this.f163932j == dm0Var.f163932j && this.k == dm0Var.k && this.f163933l == dm0Var.f163933l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51678m() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, m72.b.b(this.f163929c, p.a.d(this.f163927a.hashCode() * 31, 31, this.f163928b), 961), 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163930g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163931h;
        return Integer.hashCode(this.f163933l) + j6.a.b(this.k, j6.a.b(this.f163932j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51676j() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163930g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51679n() {
        return this.f163932j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51680p() {
        return this.f163933l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163932j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51675h() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51677l() {
        return this.f163931h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f163930g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163931h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof dm0 ? (dm0) oldItem : null) == null) {
            return null;
        }
        return new em0(!Intrinsics.f(r6.f163928b, this.f163928b), !Intrinsics.f(r6.d, this.d), !(((dm0) oldItem).f163929c == this.f163929c));
    }
}
