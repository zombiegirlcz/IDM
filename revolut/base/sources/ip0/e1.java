package ip0;

import com.revolut.core.ui_kit.delegates.AnalysisMultiChartDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f163992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f163993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f163994c;
    public final Clause d;
    public final List e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f163995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163996h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163997j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f163998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f163999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f164000n;
    public final int o;

    public e1(TextLocalisedClause title, CompositeClause description, List horizontalBars, h1 h1Var) {
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter("analysts-ratings-chart-listId", "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(horizontalBars, "horizontalBars");
        TextLocalisedClause textLocalisedClause = h1Var != null ? h1Var.f164488a : null;
        ArrayList arrayList = h1Var != null ? h1Var.f164489b : null;
        int i2 = h1Var != null ? h1Var.f164490c : -1;
        this.f163992a = title;
        this.f163993b = description;
        this.f163994c = horizontalBars;
        this.d = textLocalisedClause;
        this.e = arrayList;
        this.f = i2;
        this.f163995g = c.d.f249513a;
        this.f163996h = null;
        this.i = null;
        this.f163997j = null;
        this.k = null;
        this.f163998l = i;
        this.f163999m = i;
        this.f164000n = i;
        this.o = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new AnalysisMultiChartDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getE() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53894a() {
        return "analysts-ratings-chart-listId";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return this.f163992a.equals(e1Var.f163992a) && this.f163993b.equals(e1Var.f163993b) && Intrinsics.f(this.f163994c, e1Var.f163994c) && Intrinsics.f(this.d, e1Var.d) && Intrinsics.f(this.e, e1Var.e) && this.f == e1Var.f && Intrinsics.f(this.f163995g, e1Var.f163995g) && Intrinsics.f(this.f163996h, e1Var.f163996h) && Intrinsics.f(this.i, e1Var.i) && Intrinsics.f(this.f163997j, e1Var.f163997j) && Intrinsics.f(this.k, e1Var.k) && this.f163998l == e1Var.f163998l && this.f163999m == e1Var.f163999m && this.f164000n == e1Var.f164000n && this.o == e1Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.f163998l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163998l = i;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.b(100, h30.l.c(this.f163993b, t61.a.a(-1788345819, 31, this.f163992a), 31), 31), 31, this.f163994c);
        Clause clause = this.d;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        List list = this.e;
        int i = h30.l.i(this.f163995g, j6.a.b(this.f, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 961), 31);
        p31.c cVar = this.f163996h;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163997j;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f164000n, j6.a.b(this.f163999m, j6.a.b(this.f163998l, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f163996h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163995g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51852g() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163997j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53897g() {
        return this.f163999m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163999m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getE() {
        return this.f163995g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51853h() {
        return this.f163997j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163996h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53898h() {
        return this.f164000n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        f1 f1Var = null;
        e1 e1Var = oldItem instanceof e1 ? (e1) oldItem : null;
        if (e1Var != null) {
            List list = e1Var.e;
            boolean z = true;
            boolean z3 = !e1Var.f163992a.equals(this.f163992a);
            boolean z4 = !e1Var.f163993b.equals(this.f163993b);
            boolean z6 = !Intrinsics.f(e1Var.f163994c, this.f163994c);
            boolean z11 = !Intrinsics.f(e1Var.d, this.d);
            List list2 = this.e;
            boolean z12 = !Intrinsics.f(list, list2);
            if (e1Var.f == this.f && Intrinsics.f(list, list2)) {
                z = false;
            }
            f1Var = new f1(z3, z4, z6, z11, z12, z, or0.b.l(this, e1Var));
        }
        return f1Var;
    }
}
