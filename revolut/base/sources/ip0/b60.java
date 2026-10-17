package ip0;

import com.revolut.core.ui_kit.delegates.ProgressTimelineLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class b60 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f163539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d60 f163540c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163542h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163543j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f163544l;

    public b60(d60 style) {
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("PROGRESS_TIMELINE_LOADING_ID", "listId");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f163538a = "PROGRESS_TIMELINE_LOADING_ID";
        this.f163539b = 52;
        this.f163540c = style;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163541g = null;
        this.f163542h = i;
        this.i = i;
        this.f163543j = i2;
        this.k = i2;
        this.f163544l = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressTimelineLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53853a() {
        return this.f163538a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b60)) {
            return false;
        }
        b60 b60Var = (b60) obj2;
        return Intrinsics.f(this.f163538a, b60Var.f163538a) && this.f163539b == b60Var.f163539b && this.f163540c == b60Var.f163540c && Intrinsics.f(this.d, b60Var.d) && Intrinsics.f(this.e, b60Var.e) && Intrinsics.f(this.f, b60Var.f) && Intrinsics.f(this.f163541g, b60Var.f163541g) && this.f163542h == b60Var.f163542h && this.i == b60Var.i && this.f163543j == b60Var.f163543j && this.k == b60Var.k && Intrinsics.f(this.f163544l, b60Var.f163544l);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.f163542h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163542h = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f163540c.hashCode() + j6.a.b(this.f163539b, this.f163538a.hashCode() * 31, 961)) * 961;
        p31.c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163541g;
        return this.f163544l.hashCode() + j6.a.b(this.k, j6.a.b(this.f163543j, j6.a.b(this.i, j6.a.b(this.f163542h, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163544l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53856g() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f163544l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.f163541g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53857h() {
        return this.f163543j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163541g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof b60 ? (b60) oldItem : null) == null) {
            return null;
        }
        b60 b60Var = (b60) oldItem;
        return new c60(this.f163539b != b60Var.f163539b, !true, this.f163540c != b60Var.f163540c, or0.b.l(this, (qv0.i) oldItem));
    }
}
