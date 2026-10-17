package ip0;

import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class we0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve0 f166995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166997c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166999h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167000j;
    public qv0.c k;

    public we0(String listId, ve0 content) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(content, "content");
        int i = R$attr.uikit_dp0;
        this.f166995a = content;
        this.f166996b = listId;
        this.f166997c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166998g = i;
        this.f166999h = i;
        this.i = i;
        this.f167000j = i;
        this.k = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SimpleMediaDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52973a() {
        return this.f166996b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof we0)) {
            return false;
        }
        we0 we0Var = (we0) obj2;
        return Intrinsics.f(this.f166995a, we0Var.f166995a) && Intrinsics.f(this.f166996b, we0Var.f166996b) && Intrinsics.f(this.f166997c, we0Var.f166997c) && Intrinsics.f(this.d, we0Var.d) && Intrinsics.f(this.e, we0Var.e) && Intrinsics.f(this.f, we0Var.f) && this.f166998g == we0Var.f166998g && this.f166999h == we0Var.f166999h && this.i == we0Var.i && this.f167000j == we0Var.f167000j && Intrinsics.f(this.k, we0Var.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.f166998g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166998g = i;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f166995a.hashCode() * 31, 31, this.f166996b);
        p31.c cVar = this.f166997c;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return this.k.hashCode() + j6.a.b(this.f167000j, j6.a.b(this.i, j6.a.b(this.f166999h, j6.a.b(this.f166998g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.f166997c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.k = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        return this.f166999h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.f167000j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166999h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166997c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
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
        if ((oldItem instanceof we0 ? (we0) oldItem : null) != null) {
            return new xe0(!((we0) oldItem).f166995a.equals(this.f166995a), or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
