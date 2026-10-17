package ip0;

import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class k10 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f164936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c8g.a f164937c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164939h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164940j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f164941l;

    public k10(String listId, Image image, c8g.a type) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = R$attr.uikit_dp16;
        this.f164935a = listId;
        this.f164936b = image;
        this.f164937c = type;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f164938g = null;
        this.f164939h = null;
        this.i = i;
        this.f164940j = i;
        this.k = i;
        this.f164941l = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PlaceholderRowDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59198a() {
        return this.f164935a;
    }

    public final boolean e() {
        c8g.a aVar = this.f164937c;
        if (aVar instanceof i10) {
            return false;
        }
        if (aVar instanceof j10) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k10)) {
            return false;
        }
        k10 k10Var = (k10) obj2;
        return Intrinsics.f(this.f164935a, k10Var.f164935a) && Intrinsics.f(this.f164936b, k10Var.f164936b) && Intrinsics.f(this.f164937c, k10Var.f164937c) && Intrinsics.f(this.d, k10Var.d) && Intrinsics.f(this.e, k10Var.e) && Intrinsics.f(this.f, k10Var.f) && Intrinsics.f(this.f164938g, k10Var.f164938g) && Intrinsics.f(this.f164939h, k10Var.f164939h) && this.i == k10Var.i && this.f164940j == k10Var.f164940j && this.k == k10Var.k && this.f164941l == k10Var.f164941l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, (this.f164937c.hashCode() + a10.b.c(this.f164936b, this.f164935a.hashCode() * 31, 31)) * 961, 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164938g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164939h;
        return Integer.hashCode(this.f164941l) + j6.a.b(this.k, j6.a.b(this.f164940j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.f164939h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        return this.f164940j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.f164941l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164940j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f164938g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164939h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164938g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof k10 ? (k10) oldItem : null) == null) {
            return null;
        }
        k10 k10Var = (k10) oldItem;
        Image image = k10Var.f164936b;
        c8g.a aVar = k10Var.f164937c;
        return new l10(!Intrinsics.f(image, this.f164936b), !Intrinsics.f(aVar.u(), aVar.u()), !Intrinsics.f(aVar, this.f164937c), !Intrinsics.f(k10Var.d, this.d));
    }
}
