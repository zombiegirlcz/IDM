package ip0;

import com.revolut.core.ui_kit.delegates.MultiTargetFanChartLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class sx implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f166397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166398c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166400h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166401j;

    public sx(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp16;
        this.f166396a = listId;
        this.f166397b = c.d.f249513a;
        this.f166398c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166399g = i;
        this.f166400h = i;
        this.i = i;
        this.f166401j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new MultiTargetFanChartLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f166396a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj2;
        return Intrinsics.f(this.f166396a, sxVar.f166396a) && Intrinsics.f(this.f166397b, sxVar.f166397b) && Intrinsics.f(this.f166398c, sxVar.f166398c) && Intrinsics.f(this.d, sxVar.d) && Intrinsics.f(this.e, sxVar.e) && Intrinsics.f(this.f, sxVar.f) && this.f166399g == sxVar.f166399g && this.f166400h == sxVar.f166400h && this.i == sxVar.i && this.f166401j == sxVar.f166401j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f166399g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166399g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166397b, this.f166396a.hashCode() * 31, 31);
        p31.c cVar = this.f166398c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f166401j) + j6.a.b(this.i, j6.a.b(this.f166400h, j6.a.b(this.f166399g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166397b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.f166398c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f166400h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f166401j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166400h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f166397b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
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
        this.f166398c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }
}
