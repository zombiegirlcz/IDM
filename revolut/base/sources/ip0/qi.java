package ip0;

import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class qi implements qv0.i, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f165981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f165982c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165984h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165985j;
    public final int k;

    public qi(String listId, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i2 = R$attr.uikit_dp16;
        this.f165980a = listId;
        this.f165981b = i;
        this.f165982c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f165983g = null;
        this.f165984h = i2;
        this.i = i2;
        this.f165985j = i2;
        this.k = i2;
        if (i != 0 && i <= 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.m("selectedTabIndex ", 0, i, " must be in range [0, ", ")").toString());
        }
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FixedTabsLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f165980a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) obj2;
        return this.f165980a.equals(qiVar.f165980a) && this.f165981b == qiVar.f165981b && Intrinsics.f(this.f165982c, qiVar.f165982c) && Intrinsics.f(this.d, qiVar.d) && Intrinsics.f(this.e, qiVar.e) && Intrinsics.f(this.f, qiVar.f) && Intrinsics.f(this.f165983g, qiVar.f165983g) && this.f165984h == qiVar.f165984h && this.i == qiVar.i && this.f165985j == qiVar.f165985j && this.k == qiVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f165984h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165984h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165982c, j6.a.b(0, j6.a.b(this.f165981b, this.f165980a.hashCode() * 31, 31), 961), 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165983g;
        return Integer.hashCode(this.k) + j6.a.b(this.f165985j, j6.a.b(this.i, j6.a.b(this.f165984h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165982c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f165982c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f165983g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f165985j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165983g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        qi qiVar = oldItem instanceof qi ? (qi) oldItem : null;
        if (qiVar != null) {
            return new ri(qiVar.f165981b != this.f165981b, false);
        }
        return null;
    }
}
