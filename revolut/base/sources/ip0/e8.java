package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class e8 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f164032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f164033c;
    public final nw0.a d;
    public final Object e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164035h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164036j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f164037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f164038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f164039n;

    public e8(String listId, TextLocalisedClause title, ResourceImage resourceImage, nw0.a revPointsPrice, Object obj2, int i, int i2, int i3) {
        resourceImage = (i3 & 4) != 0 ? null : resourceImage;
        obj2 = (i3 & 16) != 0 ? null : obj2;
        i = (i3 & 32) != 0 ? R$attr.uikit_dp12 : i;
        i2 = (i3 & 64) != 0 ? R$attr.uikit_dp12 : i2;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(revPointsPrice, "revPointsPrice");
        this.f164031a = listId;
        this.f164032b = title;
        this.f164033c = resourceImage;
        this.d = revPointsPrice;
        this.e = obj2;
        this.f = c.d.f249513a;
        this.f164034g = null;
        this.f164035h = null;
        this.i = null;
        this.f164036j = null;
        this.k = i;
        this.f164037l = i2;
        this.f164038m = i5;
        this.f164039n = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsRevPointsDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52328h() {
        return this.e;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59201a() {
        return this.f164031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj2;
        return Intrinsics.f(this.f164031a, e8Var.f164031a) && this.f164032b.equals(e8Var.f164032b) && Intrinsics.f(this.f164033c, e8Var.f164033c) && this.d.equals(e8Var.d) && Intrinsics.f(this.e, e8Var.e) && Intrinsics.f(this.f, e8Var.f) && Intrinsics.f(this.f164034g, e8Var.f164034g) && Intrinsics.f(this.f164035h, e8Var.f164035h) && Intrinsics.f(this.i, e8Var.i) && Intrinsics.f(this.f164036j, e8Var.f164036j) && this.k == e8Var.k && this.f164037l == e8Var.f164037l && this.f164038m == e8Var.f164038m && this.f164039n == e8Var.f164039n;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getO() {
        return this.k;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.k = i;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f164031a.hashCode() * 31, 31, this.f164032b);
        Image image = this.f164033c;
        int iHashCode = (this.d.hashCode() + ((iA + (image == null ? 0 : image.hashCode())) * 31)) * 31;
        Object obj2 = this.e;
        int i = h30.l.i(this.f, (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f164034g;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164035h;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164036j;
        return Integer.hashCode(this.f164039n) + j6.a.b(this.f164038m, j6.a.b(this.f164037l, j6.a.b(this.k, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.f164034g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52330l() {
        return this.f164035h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52333p() {
        return this.f164037l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52335r() {
        return this.f164039n;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164037l = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52329j() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52332n() {
        return this.f164036j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52331m() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164034g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52334q() {
        return this.f164038m;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164035h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164036j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof e8 ? (e8) oldItem : null) == null) {
            return null;
        }
        e8 e8Var = (e8) oldItem;
        boolean z = true;
        boolean z3 = !e8Var.d.equals(this.d);
        boolean z4 = !e8Var.f164032b.equals(this.f164032b);
        boolean z6 = !Intrinsics.f(e8Var.f164033c, this.f164033c);
        if (Intrinsics.f(e8Var.f164034g, this.f164034g) && Intrinsics.f(e8Var.f164035h, this.f164035h) && Intrinsics.f(e8Var.i, this.i) && Intrinsics.f(e8Var.f164036j, this.f164036j)) {
            z = false;
        }
        return new f8(z3, z4, z6, z);
    }
}
