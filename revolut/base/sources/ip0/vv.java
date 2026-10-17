package ip0;

import com.revolut.core.ui_kit.delegates.LoadingChartTileDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class vv implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f166895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166896c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f166898h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f166899j;

    public vv(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp16;
        this.f166894a = listId;
        this.f166895b = null;
        this.f166896c = null;
        this.d = null;
        this.e = null;
        this.f = i;
        this.f166897g = i;
        this.f166898h = i;
        this.i = i;
        this.f166899j = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LoadingChartTileDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51903b() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52218a() {
        return this.f166894a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vv)) {
            return false;
        }
        vv vvVar = (vv) obj2;
        return Intrinsics.f(this.f166894a, vvVar.f166894a) && Intrinsics.f(this.f166895b, vvVar.f166895b) && Intrinsics.f(this.f166896c, vvVar.f166896c) && Intrinsics.f(this.d, vvVar.d) && Intrinsics.f(this.e, vvVar.e) && this.f == vvVar.f && this.f166897g == vvVar.f166897g && this.f166898h == vvVar.f166898h && this.i == vvVar.i && Intrinsics.f(this.f166899j, vvVar.f166899j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51906h() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int iHashCode = this.f166894a.hashCode() * 31;
        p31.c cVar = this.f166895b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166896c;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return h30.l.i(this.f166899j, j6.a.b(this.i, j6.a.b(this.f166898h, j6.a.b(this.f166897g, j6.a.b(this.f, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51909m() {
        return this.f166895b;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166899j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51910n() {
        return this.f166896c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getI() {
        return this.f166897g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getK() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166897g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51908l() {
        return this.f166899j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51911p() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166895b = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51907j() {
        return this.f166898h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166896c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof vv ? (vv) oldItem : null) != null) {
            return new wv(!Intrinsics.f(this.f166899j, r3.f166899j));
        }
        return null;
    }
}
