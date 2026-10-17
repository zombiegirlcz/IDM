package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsImageDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class i7 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f164646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f164647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f164648c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164650h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164651j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f164652l;

    public i7(TextClause title, TextClause subtitle, UrlImage urlImage) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("CONFIRM_RESERVATION_RESTAURANT", "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f164646a = title;
        this.f164647b = subtitle;
        this.f164648c = urlImage;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f164649g = null;
        this.f164650h = null;
        this.i = i;
        this.f164651j = i;
        this.k = i;
        this.f164652l = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsImageDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51674g() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51671a() {
        return "CONFIRM_RESERVATION_RESTAURANT";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj2;
        return this.f164646a.equals(i7Var.f164646a) && this.f164647b.equals(i7Var.f164647b) && Intrinsics.f(this.f164648c, i7Var.f164648c) && Intrinsics.f(this.d, i7Var.d) && Intrinsics.f(this.e, i7Var.e) && Intrinsics.f(this.f, i7Var.f) && Intrinsics.f(this.f164649g, i7Var.f164649g) && Intrinsics.f(this.f164650h, i7Var.f164650h) && this.i == i7Var.i && this.f164651j == i7Var.f164651j && this.k == i7Var.k && this.f164652l == i7Var.f164652l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51678m() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int iB = v7.b(v7.b(-698328143, 31, this.f164646a), 31, this.f164647b);
        Image image = this.f164648c;
        int i = h30.l.i(this.d, (iB + (image == null ? 0 : image.hashCode())) * 961, 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164649g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164650h;
        return Integer.hashCode(this.f164652l) + j6.a.b(this.k, j6.a.b(this.f164651j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51676j() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164649g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51679n() {
        return this.f164651j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51680p() {
        return this.f164652l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164651j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51675h() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51677l() {
        return this.f164650h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f164649g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164650h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof i7 ? (i7) oldItem : null) == null) {
            return null;
        }
        i7 i7Var = (i7) oldItem;
        boolean z = true;
        boolean z3 = !i7Var.f164646a.equals(this.f164646a);
        boolean z4 = !i7Var.f164647b.equals(this.f164647b);
        boolean z6 = !Intrinsics.f(i7Var.f164648c, this.f164648c);
        if (Intrinsics.f(i7Var.e, this.e) && Intrinsics.f(i7Var.f, this.f) && Intrinsics.f(i7Var.f164649g, this.f164649g) && Intrinsics.f(i7Var.f164650h, this.f164650h)) {
            z = false;
        }
        return new j7(z3, z4, z6, z);
    }
}
