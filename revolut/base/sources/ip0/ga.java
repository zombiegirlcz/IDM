package ip0;

import com.revolut.core.ui_kit.delegates.ChartEmptyStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ga implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f164376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f164377c;
    public final ResourceImage d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f164378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f164379h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f164380j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f164381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f164382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f164383n;

    public ga(String listId, TextLocalisedClause title, Clause subtitle, ResourceImage image, int i, int i2, ind.f fVar, int i3) {
        i = (i3 & 16) != 0 ? R$attr.uikit_dp2 : i;
        i2 = (i3 & 32) != 0 ? R$attr.uikit_dp0 : i2;
        fVar = (i3 & 64) != 0 ? null : fVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        int i5 = R$attr.uikit_dp0;
        this.f164375a = listId;
        this.f164376b = title;
        this.f164377c = subtitle;
        this.d = image;
        this.e = i;
        this.f = i2;
        this.f164378g = i5;
        this.f164379h = i5;
        this.i = fVar;
        this.f164380j = c.d.f249513a;
        this.k = null;
        this.f164381l = null;
        this.f164382m = null;
        this.f164383n = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChartEmptyStateDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return this.i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f164375a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj2;
        return Intrinsics.f(this.f164375a, gaVar.f164375a) && this.f164376b.equals(gaVar.f164376b) && this.f164377c.equals(gaVar.f164377c) && this.d.equals(gaVar.d) && this.e == gaVar.e && this.f == gaVar.f && this.f164378g == gaVar.f164378g && this.f164379h == gaVar.f164379h && Intrinsics.f(this.i, gaVar.i) && Intrinsics.f(this.f164380j, gaVar.f164380j) && Intrinsics.f(this.k, gaVar.k) && Intrinsics.f(this.f164381l, gaVar.f164381l) && Intrinsics.f(this.f164382m, gaVar.f164382m) && Intrinsics.f(this.f164383n, gaVar.f164383n);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.e;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.e = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f164379h, j6.a.b(this.f164378g, j6.a.b(this.f, j6.a.b(this.e, org.bouncycastle.jcajce.provider.digest.a.b(this.d, p.a.a(t61.a.a(this.f164375a.hashCode() * 31, 31, this.f164376b), 31, this.f164377c), 31), 31), 31), 31), 31);
        Object obj2 = this.i;
        int i = h30.l.i(this.f164380j, (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.k;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164381l;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164382m;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164383n;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164380j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f164381l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164382m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f164379h;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f164380j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f164383n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f164382m;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f164378g;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164381l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164383n = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof ga)) {
            return null;
        }
        ga gaVar = (ga) oldItem;
        return new ha(!gaVar.f164376b.equals(this.f164376b), !gaVar.f164377c.equals(this.f164377c), !gaVar.d.equals(this.d), or0.b.l(this, (qv0.i) oldItem));
    }
}
