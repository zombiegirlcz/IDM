package ip0;

import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.core.ui_kit.delegates.u f163663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f163664c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163666h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163667j;
    public final int k;

    public c0(String listId, com.revolut.core.ui_kit.delegates.u type, int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? R$attr.uikit_dp16 : i;
        i2 = (i3 & 8) != 0 ? R$attr.uikit_dp16 : i2;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(type, "type");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f163662a = listId;
        this.f163663b = type;
        this.f163664c = positionInBox;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163665g = null;
        this.f163666h = i;
        this.i = i2;
        this.f163667j = i5;
        this.k = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ActionsLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52903a() {
        return this.f163662a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f163662a, c0Var.f163662a) && Intrinsics.f(this.f163663b, c0Var.f163663b) && Intrinsics.f(this.f163664c, c0Var.f163664c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f163665g, c0Var.f163665g) && this.f163666h == c0Var.f163666h && this.i == c0Var.i && this.f163667j == c0Var.f163667j && this.k == c0Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52913q() {
        return this.f163666h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163666h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163664c, (this.f163663b.hashCode() + (this.f163662a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163665g;
        return Integer.hashCode(this.k) + j6.a.b(this.f163667j, j6.a.b(this.i, j6.a.b(this.f163666h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.f163665g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163664c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52909l() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52914r() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52916t() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52908j() {
        return this.f163664c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52911n() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52910m() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163665g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52915s() {
        return this.f163667j;
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
