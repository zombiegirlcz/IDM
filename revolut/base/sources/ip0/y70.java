package ip0;

import com.revolut.core.ui_kit.delegates.RateDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class y70 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x70 f167269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f167270c;
    public final AccountClosureFeedbackFeature d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167272h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f167273j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f167274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f167275m;

    public y70(String listId, x70 content, TextClause textClause, AccountClosureFeedbackFeature accountClosureFeedbackFeature) {
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(content, "content");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f167268a = listId;
        this.f167269b = content;
        this.f167270c = textClause;
        this.d = accountClosureFeedbackFeature;
        this.e = positionInBox;
        this.f = null;
        this.f167271g = null;
        this.f167272h = null;
        this.i = null;
        this.f167273j = i;
        this.k = i2;
        this.f167274l = i2;
        this.f167275m = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RateDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return this.f167268a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y70)) {
            return false;
        }
        y70 y70Var = (y70) obj2;
        return Intrinsics.f(this.f167268a, y70Var.f167268a) && this.f167269b.equals(y70Var.f167269b) && this.f167270c.equals(y70Var.f167270c) && this.d.equals(y70Var.d) && Intrinsics.f(this.e, y70Var.e) && Intrinsics.f(this.f, y70Var.f) && Intrinsics.f(this.f167271g, y70Var.f167271g) && Intrinsics.f(this.f167272h, y70Var.f167272h) && Intrinsics.f(this.i, y70Var.i) && this.f167273j == y70Var.f167273j && this.k == y70Var.k && this.f167274l == y70Var.f167274l && this.f167275m == y70Var.f167275m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52815m() {
        return this.f167273j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167273j = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.e, (this.d.hashCode() + j6.a.c(j6.a.c(v7.b((this.f167269b.hashCode() + (this.f167268a.hashCode() * 31)) * 31, 961, this.f167270c), 31, true), 31, false)) * 31, 31);
        p31.c cVar = this.f;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f167271g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f167272h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f167275m) + j6.a.b(this.f167274l, j6.a.b(this.k, j6.a.b(this.f167273j, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.f167271g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167272h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52816n() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52817p() {
        return this.f167275m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f167272h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f167274l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167271g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof y70 ? (y70) oldItem : null) == null) {
            return null;
        }
        y70 y70Var = (y70) oldItem;
        return new z70(!y70Var.f167270c.equals(this.f167270c), !true, !y70Var.f167269b.equals(this.f167269b), false, false);
    }
}
