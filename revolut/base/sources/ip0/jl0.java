package ip0;

import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class jl0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f164871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f164872c;
    public final aw0.oa d;
    public qv0.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f164874h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164875j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f164876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f164877m;

    public jl0(String listId, ResourceImage image, Clause title) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        aw0.oa oaVar = aw0.oa.LEGACY_CONTENT_COLOR;
        int i = R$attr.uikit_dp16;
        this.f164870a = listId;
        this.f164871b = image;
        this.f164872c = title;
        this.d = oaVar;
        this.e = c.d.f249513a;
        this.f = i;
        this.f164873g = i;
        this.f164874h = i;
        this.i = i;
        this.f164875j = null;
        this.k = null;
        this.f164876l = null;
        this.f164877m = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ToDoItemDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52903a() {
        return this.f164870a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jl0)) {
            return false;
        }
        jl0 jl0Var = (jl0) obj2;
        return Intrinsics.f(this.f164870a, jl0Var.f164870a) && Intrinsics.f(this.f164871b, jl0Var.f164871b) && Intrinsics.f(this.f164872c, jl0Var.f164872c) && this.d == jl0Var.d && Intrinsics.f(this.e, jl0Var.e) && this.f == jl0Var.f && this.f164873g == jl0Var.f164873g && this.f164874h == jl0Var.f164874h && this.i == jl0Var.i && Intrinsics.f(this.f164875j, jl0Var.f164875j) && Intrinsics.f(this.k, jl0Var.k) && Intrinsics.f(this.f164876l, jl0Var.f164876l) && Intrinsics.f(this.f164877m, jl0Var.f164877m);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52913q() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.i, j6.a.b(this.f164874h, j6.a.b(this.f164873g, j6.a.b(this.f, h30.l.i(this.e, (this.d.hashCode() + p.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f164871b, this.f164870a.hashCode() * 31, 31), 31, this.f164872c)) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f164875j;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.k;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164876l;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164877m;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.f164875j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52909l() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164876l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52914r() {
        return this.f164873g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52916t() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164873g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52908j() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52911n() {
        return this.f164877m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52910m() {
        return this.f164876l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164875j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52915s() {
        return this.f164874h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164877m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof jl0 ? (jl0) oldItem : null) == null) {
            return null;
        }
        boolean zL = or0.b.l(this, (qv0.i) oldItem);
        jl0 jl0Var = (jl0) oldItem;
        return new il0(zL, !Intrinsics.f(this.f164871b, jl0Var.f164871b), !Intrinsics.f(this.f164872c, jl0Var.f164872c));
    }
}
