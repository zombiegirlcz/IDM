package ip0;

import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ij implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj f164700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f164701c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164703h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164704j;
    public final int k;

    public ij(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        hj style = hj.f164567a;
        Intrinsics.checkNotNullParameter(style, "style");
        int i = FooterTextLoadingDelegate.f52368c;
        int i2 = FooterTextLoadingDelegate.d;
        int i3 = FooterTextLoadingDelegate.e;
        int i5 = FooterTextLoadingDelegate.f;
        this.f164699a = listId;
        this.f164700b = style;
        this.f164701c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164702g = null;
        this.f164703h = i;
        this.i = i2;
        this.f164704j = i3;
        this.k = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FooterTextLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55132b() {
        return this.f164699a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ij)) {
            return false;
        }
        ij ijVar = (ij) obj2;
        return Intrinsics.f(this.f164699a, ijVar.f164699a) && Intrinsics.f(this.f164700b, ijVar.f164700b) && Intrinsics.f(this.f164701c, ijVar.f164701c) && Intrinsics.f(this.d, ijVar.d) && Intrinsics.f(this.e, ijVar.e) && Intrinsics.f(this.f, ijVar.f) && Intrinsics.f(this.f164702g, ijVar.f164702g) && this.f164703h == ijVar.f164703h && this.i == ijVar.i && this.f164704j == ijVar.f164704j && this.k == ijVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f164703h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164703h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164701c, (this.f164700b.hashCode() + (this.f164699a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164702g;
        return Integer.hashCode(this.k) + j6.a.b(this.f164704j, j6.a.b(this.i, j6.a.b(this.f164703h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f164702g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164701c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f164701c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164702g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f164704j;
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
        if ((oldItem instanceof ij ? (ij) oldItem : null) != null) {
            return new jj(!Intrinsics.f(this.f164700b, ((ij) oldItem).f164700b), !Intrinsics.f(this.f164701c, r0.f164701c));
        }
        return null;
    }
}
