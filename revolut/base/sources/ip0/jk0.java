package ip0;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class jk0 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f164857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f164858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f164859c;
    public final TextLocalisedClause d;
    public final boolean e;
    public final AnalyticsContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsContext f164860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164861h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164862j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f164863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f164864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f164865n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f164866p;

    public jk0(ik0 selected, TextLocalisedClause dayLabel, TextLocalisedClause nightLabel, TextLocalisedClause systemLabel, boolean z, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2, int i) {
        int i2 = R$attr.uikit_dp32;
        Intrinsics.checkNotNullParameter("ID_THEME_MODE_SWITCHER", "listId");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(dayLabel, "dayLabel");
        Intrinsics.checkNotNullParameter(nightLabel, "nightLabel");
        Intrinsics.checkNotNullParameter(systemLabel, "systemLabel");
        this.f164857a = selected;
        this.f164858b = dayLabel;
        this.f164859c = nightLabel;
        this.d = systemLabel;
        this.e = z;
        this.f = analyticsContext;
        this.f164860g = analyticsContext2;
        this.f164861h = i2;
        this.i = i;
        this.f164862j = i2;
        this.k = i2;
        this.f164863l = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ThemeSwitcherDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52872l() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52866a() {
        return "ID_THEME_MODE_SWITCHER";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jk0)) {
            return false;
        }
        jk0 jk0Var = (jk0) obj2;
        return this.f164857a == jk0Var.f164857a && this.f164858b.equals(jk0Var.f164858b) && this.f164859c.equals(jk0Var.f164859c) && this.d.equals(jk0Var.d) && this.e == jk0Var.e && this.f.equals(jk0Var.f) && this.f164860g.equals(jk0Var.f164860g) && this.f164861h == jk0Var.f164861h && this.i == jk0Var.i && this.f164862j == jk0Var.f164862j && this.k == jk0Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52878s() {
        return this.f164861h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164861h = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + j6.a.b(this.f164862j, j6.a.b(this.i, j6.a.b(this.f164861h, (AnalyticsContext.a(this.f164860g.f50296a) + ((AnalyticsContext.a(this.f.f50296a) + j6.a.c(t61.a.a(t61.a.a(t61.a.a((this.f164857a.hashCode() + 861539229) * 31, 31, this.f164858b), 31, this.f164859c), 31, this.d), 31, this.e)) * 31)) * 29791, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.f164864m;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164863l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52875p() {
        return this.f164865n;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52879t() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getV() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52874n() {
        return this.f164863l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52877r() {
        return this.f164866p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52876q() {
        return this.o;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164864m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getU() {
        return this.f164862j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164865n = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164866p = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof jk0 ? (jk0) oldItem : null) == null) {
            return null;
        }
        return new kk0(((jk0) oldItem).f164857a != this.f164857a, !r7.f164858b.equals(this.f164858b), !r7.f164859c.equals(this.f164859c), !r7.d.equals(this.d));
    }
}
