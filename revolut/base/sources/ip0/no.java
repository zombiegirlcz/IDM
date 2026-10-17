package ip0;

import com.revolut.core.ui_kit.delegates.HorizontalHistogramTileLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class no implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f165551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165552c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165554h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165555j;

    public no(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f165550a = listId;
        this.f165551b = c.d.f249513a;
        this.f165552c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f165553g = i;
        this.f165554h = i;
        this.i = i;
        this.f165555j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HorizontalHistogramTileLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53008a() {
        return this.f165550a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof no)) {
            return false;
        }
        no noVar = (no) obj2;
        return Intrinsics.f(this.f165550a, noVar.f165550a) && Intrinsics.f(this.f165551b, noVar.f165551b) && Intrinsics.f(this.f165552c, noVar.f165552c) && Intrinsics.f(this.d, noVar.d) && Intrinsics.f(this.e, noVar.e) && Intrinsics.f(this.f, noVar.f) && this.f165553g == noVar.f165553g && this.f165554h == noVar.f165554h && this.i == noVar.i && this.f165555j == noVar.f165555j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f165553g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165553g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165551b, this.f165550a.hashCode() * 31, 31);
        p31.c cVar = this.f165552c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f165555j) + j6.a.b(this.i, j6.a.b(this.f165554h, j6.a.b(this.f165553g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f165552c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165551b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f165554h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.f165555j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165554h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f165551b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165552c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        no noVar = oldItem instanceof no ? (no) oldItem : null;
        if (noVar != null) {
            return new oo(or0.b.l(this, noVar));
        }
        return null;
    }
}
