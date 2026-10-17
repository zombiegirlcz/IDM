package ip0;

import com.revolut.core.ui_kit.delegates.LargeVoucherLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ls implements qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f165253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165254c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165256h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165257j;

    public ls(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f165252a = listId;
        this.f165253b = c.d.f249513a;
        this.f165254c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f165255g = i;
        this.f165256h = i;
        this.i = i;
        this.f165257j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LargeVoucherLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51752a() {
        return this.f165252a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ls)) {
            return false;
        }
        ls lsVar = (ls) obj2;
        return Intrinsics.f(this.f165252a, lsVar.f165252a) && Intrinsics.f(this.f165253b, lsVar.f165253b) && Intrinsics.f(this.f165254c, lsVar.f165254c) && Intrinsics.f(this.d, lsVar.d) && Intrinsics.f(this.e, lsVar.e) && Intrinsics.f(this.f, lsVar.f) && this.f165255g == lsVar.f165255g && this.f165256h == lsVar.f165256h && this.i == lsVar.i && this.f165257j == lsVar.f165257j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f165255g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165255g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165253b, this.f165252a.hashCode() * 31, 31);
        p31.c cVar = this.f165254c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f165257j) + j6.a.b(this.i, j6.a.b(this.f165256h, j6.a.b(this.f165255g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165253b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.f165254c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f165256h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f165257j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165256h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f165253b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165254c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }
}
