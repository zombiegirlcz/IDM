package ip0;

import com.revolut.core.ui_kit.delegates.LargeSliderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class es implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f164135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f164136c;
    public final MoneyClause d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f164137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f164138h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aw0.j0 f164139j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f164140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f164141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f164142n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qv0.c f164143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p31.c f164144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p31.c f164145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p31.c f164146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p31.c f164147t;

    public es(String listId, MoneyClause moneyClause, MoneyClause moneyClause2, MoneyClause moneyClause3, int i, int i2, int i3, List stickyValues, int i5) {
        moneyClause2 = (i5 & 4) != 0 ? null : moneyClause2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(stickyValues, "stickyValues");
        int i6 = R$attr.uikit_dp16;
        aw0.j0 j0Var = aw0.j0.DEFAULT;
        this.f164134a = listId;
        this.f164135b = moneyClause;
        this.f164136c = moneyClause2;
        this.d = moneyClause3;
        this.e = i;
        this.f = i2;
        this.f164137g = i3;
        this.f164138h = stickyValues;
        this.i = true;
        this.f164139j = j0Var;
        this.k = 2.0f;
        this.f164140l = i6;
        this.f164141m = i6;
        this.f164142n = i6;
        this.o = i6;
        this.f164143p = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LargeSliderDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getO() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59488a() {
        return this.f164134a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof es)) {
            return false;
        }
        es esVar = (es) obj2;
        return Intrinsics.f(this.f164134a, esVar.f164134a) && Intrinsics.f(this.f164135b, esVar.f164135b) && Intrinsics.f(this.f164136c, esVar.f164136c) && Intrinsics.f(this.d, esVar.d) && this.e == esVar.e && this.f == esVar.f && this.f164137g == esVar.f164137g && Intrinsics.f(this.f164138h, esVar.f164138h) && this.i == esVar.i && this.f164139j == esVar.f164139j && Float.compare(this.k, esVar.k) == 0 && this.f164140l == esVar.f164140l && this.f164141m == esVar.f164141m && this.f164142n == esVar.f164142n && this.o == esVar.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51846w() {
        return this.f164140l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164140l = i;
    }

    public final int hashCode() {
        int iHashCode = this.f164134a.hashCode() * 31;
        MoneyClause moneyClause = this.f164135b;
        int iHashCode2 = (iHashCode + (moneyClause == null ? 0 : moneyClause.hashCode())) * 31;
        Clause clause = this.f164136c;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        MoneyClause moneyClause2 = this.d;
        return Integer.hashCode(this.o) + j6.a.b(this.f164142n, j6.a.b(this.f164141m, j6.a.b(this.f164140l, m72.b.b(this.k, (this.f164139j.hashCode() + j6.a.c(p.a.d(j6.a.b(this.f164137g, j6.a.b(this.f, j6.a.b(this.e, (iHashCode3 + (moneyClause2 != null ? moneyClause2.hashCode() : 0)) * 31, 31), 31), 31), 31, this.f164138h), 31, this.i)) * 31, 961), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51843r() {
        return this.f164144q;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164143p = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51844s() {
        return this.f164145r;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164146s = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51847x() {
        return this.f164141m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getZ() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164141m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51841p() {
        return this.f164143p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getU() {
        return this.f164147t;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51845t() {
        return this.f164146s;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164144q = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51848y() {
        return this.f164142n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164145r = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164147t = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof es ? (es) oldItem : null) == null) {
            return null;
        }
        es esVar = (es) oldItem;
        boolean z3 = false;
        if (esVar.f164137g != this.f164137g) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        boolean z4 = !Intrinsics.f(esVar.d, this.d);
        boolean z6 = !Intrinsics.f(esVar.f164136c, this.f164136c);
        boolean z11 = !Intrinsics.f(esVar.f164135b, this.f164135b);
        boolean z12 = esVar.e != this.e ? true : z;
        boolean z29 = esVar.f != this.f ? true : z;
        boolean z31 = esVar.i != this.i ? true : z;
        boolean z41 = !Intrinsics.f(esVar.f164138h, this.f164138h);
        if (esVar.k == this.k) {
            z = true;
        }
        return new fs(z3, z4, z6, z11, z12, z29, z31, z41, !z);
    }
}
