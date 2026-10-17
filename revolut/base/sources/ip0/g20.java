package ip0;

import com.revolut.core.ui_kit.delegates.PlanLargeDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class g20 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f164328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f164329c;
    public final Media d;
    public final boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f164331h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f164332j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f164333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f164334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f164335n;

    public g20(String listId, TextClause title, TextClause subtitle, Media background, int i) {
        boolean z = (i & 256) != 0;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f164327a = listId;
        this.f164328b = title;
        this.f164329c = subtitle;
        this.d = background;
        this.e = z;
        this.f = i2;
        this.f164330g = i2;
        this.f164331h = i2;
        this.i = i2;
        this.f164332j = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PlanLargeDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f164327a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g20)) {
            return false;
        }
        g20 g20Var = (g20) obj2;
        return this.f164327a.equals(g20Var.f164327a) && this.f164328b.equals(g20Var.f164328b) && this.f164329c.equals(g20Var.f164329c) && this.d.equals(g20Var.d) && this.e == g20Var.e && this.f == g20Var.f && this.f164330g == g20Var.f164330g && this.f164331h == g20Var.f164331h && this.i == g20Var.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + j6.a.b(this.f164331h, j6.a.b(this.f164330g, j6.a.b(this.f, j6.a.c((this.d.hashCode() + j6.a.c(v7.b(v7.b(this.f164327a.hashCode() * 31, 31, this.f164328b), 31, this.f164329c), 961, false)) * 29791, 961, this.e), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164332j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f164333l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164334m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f164330g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164330g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f164332j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f164335n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f164334m;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f164331h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164333l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164335n = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof g20 ? (g20) oldItem : null) == null) {
            return null;
        }
        return new h20(!r11.f164328b.equals(this.f164328b), !r11.f164329c.equals(this.f164329c), !true, !r11.d.equals(this.d), !true, !true, ((g20) oldItem).e != this.e);
    }
}
