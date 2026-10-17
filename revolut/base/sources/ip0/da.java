package ip0;

import com.revolut.core.ui_kit.delegates.ChallengeMediumLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class da implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ca f163858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f163859c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163861h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163862j;
    public final int k;

    public da(String listId, ca mode) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = R$attr.uikit_dp0;
        this.f163857a = listId;
        this.f163858b = mode;
        this.f163859c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163860g = null;
        this.f163861h = i;
        this.i = i;
        this.f163862j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChallengeMediumLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f163857a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof da)) {
            return false;
        }
        da daVar = (da) obj2;
        return Intrinsics.f(this.f163857a, daVar.f163857a) && this.f163858b == daVar.f163858b && Intrinsics.f(this.f163859c, daVar.f163859c) && Intrinsics.f(this.d, daVar.d) && Intrinsics.f(this.e, daVar.e) && Intrinsics.f(this.f, daVar.f) && Intrinsics.f(this.f163860g, daVar.f163860g) && this.f163861h == daVar.f163861h && this.i == daVar.i && this.f163862j == daVar.f163862j && this.k == daVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f163861h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163861h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163859c, (this.f163858b.hashCode() + (this.f163857a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163860g;
        return Integer.hashCode(this.k) + j6.a.b(this.f163862j, j6.a.b(this.i, j6.a.b(this.f163861h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163859c = cVar;
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
        return this.f163859c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f163860g;
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
        return this.f163862j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163860g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof da ? (da) oldItem : null) != null) {
            return new ea(this.f163858b != ((da) oldItem).f163858b, or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
