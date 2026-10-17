package ip0;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class t1 implements qv0.q, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f166410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166411c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166413h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166414j;
    public final int k;

    public t1(String listId, s1 contentMode, int i) {
        contentMode = (i & 2) != 0 ? s1.TEXT : contentMode;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(contentMode, "contentMode");
        int i2 = R$attr.uikit_dp0;
        this.f166409a = listId;
        this.f166410b = contentMode;
        this.f166411c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166412g = null;
        this.f166413h = i2;
        this.i = i2;
        this.f166414j = i2;
        this.k = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new AttributeSelectorSmallLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52567m() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52560a() {
        return this.f166409a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f166409a, t1Var.f166409a) && this.f166410b == t1Var.f166410b && Intrinsics.f(this.f166411c, t1Var.f166411c) && Intrinsics.f(this.d, t1Var.d) && Intrinsics.f(this.e, t1Var.e) && Intrinsics.f(this.f, t1Var.f) && Intrinsics.f(this.f166412g, t1Var.f166412g) && this.f166413h == t1Var.f166413h && this.i == t1Var.i && this.f166414j == t1Var.f166414j && this.k == t1Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52568n() {
        return this.f166413h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166413h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166411c, (this.f166410b.hashCode() + (this.f166409a.hashCode() * 31)) * 961, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166412g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166414j, j6.a.b(this.i, j6.a.b(this.f166413h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52572s() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166411c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52573t() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getO() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52570q() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52571r() {
        return this.f166411c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return this.f166412g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52569p() {
        return this.f166414j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166412g = cVar;
    }
}
