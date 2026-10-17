package ip0;

import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class zg implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg f167459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f167460c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f167462h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167463j;
    public final int k;

    public zg(String listId, yg headerType) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(headerType, "headerType");
        this.f167458a = listId;
        this.f167459b = headerType;
        this.f167460c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f167461g = null;
        this.f167462h = i;
        this.i = i;
        this.f167463j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ExtraLargeListingCardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52438a() {
        return this.f167458a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zg)) {
            return false;
        }
        zg zgVar = (zg) obj2;
        return Intrinsics.f(this.f167458a, zgVar.f167458a) && this.f167459b == zgVar.f167459b && Intrinsics.f(this.f167460c, zgVar.f167460c) && Intrinsics.f(this.d, zgVar.d) && Intrinsics.f(this.e, zgVar.e) && Intrinsics.f(this.f, zgVar.f) && Intrinsics.f(this.f167461g, zgVar.f167461g) && this.f167462h == zgVar.f167462h && this.i == zgVar.i && this.f167463j == zgVar.f167463j && this.k == zgVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f167462h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167462h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f167460c, (this.f167459b.hashCode() + (this.f167458a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f167461g;
        return Integer.hashCode(this.k) + j6.a.b(this.f167463j, j6.a.b(this.i, j6.a.b(this.f167462h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52447p() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167460c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52448q() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52444l() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52446n() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f167460c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52450s() {
        return this.f167461g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52449r() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52445m() {
        return this.f167463j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f167461g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof zg ? (zg) oldItem : null) == null) {
            return null;
        }
        return new ah(this.f167459b != ((zg) oldItem).f167459b, !Intrinsics.f(this.f167460c, r5.f167460c));
    }
}
