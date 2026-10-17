package ip0;

import com.revolut.core.ui_kit.delegates.BannerLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class a3 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f163373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f163374c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163376h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163377j;

    public a3(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listId, "listId");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f163372a = listId;
        this.f163373b = positionInBox;
        this.f163374c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163375g = i;
        this.f163376h = i;
        this.i = i;
        this.f163377j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new BannerLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59198a() {
        return this.f163372a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f163372a, a3Var.f163372a) && Intrinsics.f(this.f163373b, a3Var.f163373b) && Intrinsics.f(this.f163374c, a3Var.f163374c) && Intrinsics.f(this.d, a3Var.d) && Intrinsics.f(this.e, a3Var.e) && Intrinsics.f(this.f, a3Var.f) && this.f163375g == a3Var.f163375g && this.f163376h == a3Var.f163376h && this.i == a3Var.i && this.f163377j == a3Var.f163377j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52606g() {
        return this.f163375g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163375g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163373b, this.f163372a.hashCode() * 31, 31);
        p31.c cVar = this.f163374c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f163377j) + j6.a.b(this.i, j6.a.b(this.f163376h, j6.a.b(this.f163375g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52610m() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163373b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52611n() {
        return this.f163374c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52607h() {
        return this.f163376h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52608j() {
        return this.f163377j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163376h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52609l() {
        return this.f163373b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52612p() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163374c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }
}
