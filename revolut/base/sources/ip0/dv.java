package ip0;

import com.revolut.core.ui_kit.delegates.ListingCardSmallLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class dv implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f163958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f163959c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163961h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163962j;

    public dv(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f163957a = listId;
        this.f163958b = c.d.f249513a;
        this.f163959c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163960g = i;
        this.f163961h = i;
        this.i = i;
        this.f163962j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ListingCardSmallLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f163957a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj2;
        return Intrinsics.f(this.f163957a, dvVar.f163957a) && Intrinsics.f(this.f163958b, dvVar.f163958b) && Intrinsics.f(this.f163959c, dvVar.f163959c) && Intrinsics.f(this.d, dvVar.d) && Intrinsics.f(this.e, dvVar.e) && Intrinsics.f(this.f, dvVar.f) && this.f163960g == dvVar.f163960g && this.f163961h == dvVar.f163961h && this.i == dvVar.i && this.f163962j == dvVar.f163962j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f163960g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163960g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163958b, this.f163957a.hashCode() * 31, 31);
        p31.c cVar = this.f163959c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f163962j) + j6.a.b(this.i, j6.a.b(this.f163961h, j6.a.b(this.f163960g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f163959c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163958b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f163961h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f163962j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163961h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f163958b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163959c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
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
}
