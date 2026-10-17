package ip0;

import com.revolut.core.ui_kit.delegates.PassCardLoadingDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class e00 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CdnImage f163986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i00 f163987c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163989h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163990j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f163991l;

    public e00(String listId, CdnImage logo, i00 variant) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(variant, "variant");
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        this.f163985a = listId;
        this.f163986b = logo;
        this.f163987c = variant;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f163988g = null;
        this.f163989h = null;
        this.i = i;
        this.f163990j = i;
        this.k = i2;
        this.f163991l = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PassCardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51913a() {
        return this.f163985a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e00)) {
            return false;
        }
        e00 e00Var = (e00) obj2;
        return this.f163985a.equals(e00Var.f163985a) && this.f163986b.equals(e00Var.f163986b) && Intrinsics.f(this.f163987c, e00Var.f163987c) && Intrinsics.f(this.d, e00Var.d) && Intrinsics.f(this.e, e00Var.e) && Intrinsics.f(this.f, e00Var.f) && Intrinsics.f(this.f163988g, e00Var.f163988g) && Intrinsics.f(this.f163989h, e00Var.f163989h) && this.i == e00Var.i && this.f163990j == e00Var.f163990j && this.k == e00Var.k && this.f163991l == e00Var.f163991l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getO() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, (this.f163987c.hashCode() + ((this.f163986b.hashCode() + (this.f163985a.hashCode() * 31)) * 31)) * 31, 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163988g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163989h;
        return Integer.hashCode(this.f163991l) + j6.a.b(this.k, j6.a.b(this.f163990j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51919l() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163988g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51922p() {
        return this.f163990j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51924r() {
        return this.f163991l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163990j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51918j() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51921n() {
        return this.f163989h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51920m() {
        return this.f163988g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51923q() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163989h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof e00 ? (e00) oldItem : null) == null) {
            return null;
        }
        e00 e00Var = (e00) oldItem;
        return new f00(!e00Var.f163986b.equals(this.f163986b), !Intrinsics.f(e00Var.f163987c, this.f163987c), or0.b.l(this, (qv0.i) oldItem));
    }
}
