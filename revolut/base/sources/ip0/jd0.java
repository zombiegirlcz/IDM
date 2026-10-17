package ip0;

import com.revolut.core.ui_kit.delegates.SegmentedLinearGaugeDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class jd0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f164821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f164822c;
    public final CompositeClause d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164824h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164825j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f164826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f164827m;

    public jd0(String listId, float f, float f4, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f164820a = listId;
        this.f164821b = f;
        this.f164822c = f4;
        this.d = compositeClause;
        this.e = null;
        this.f = null;
        this.f164823g = null;
        this.f164824h = null;
        this.i = c.d.f249513a;
        int i = R$attr.uikit_dp16;
        this.f164825j = i;
        this.k = i;
        this.f164826l = i;
        this.f164827m = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SegmentedLinearGaugeDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52244a() {
        return this.f164820a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jd0)) {
            return false;
        }
        jd0 jd0Var = (jd0) obj2;
        return this.f164820a.equals(jd0Var.f164820a) && Float.compare(this.f164821b, jd0Var.f164821b) == 0 && Float.compare(this.f164822c, jd0Var.f164822c) == 0 && this.d.equals(jd0Var.d) && Intrinsics.f(this.e, jd0Var.e) && Intrinsics.f(this.f, jd0Var.f) && Intrinsics.f(this.f164823g, jd0Var.f164823g) && Intrinsics.f(this.f164824h, jd0Var.f164824h) && Intrinsics.f(this.i, jd0Var.i);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.f164825j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164825j = i;
    }

    public final int hashCode() {
        int iC = h30.l.c(this.d, m72.b.b(this.f164822c, m72.b.b(this.f164821b, this.f164820a.hashCode() * 31, 31), 31), 31);
        p31.c cVar = this.e;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164823g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164824h;
        return this.i.hashCode() + ((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52250l() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52251m() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164823g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52247g() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.f164827m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52253p() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f164824h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52252n() {
        return this.f164823g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52248h() {
        return this.f164826l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164824h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof jd0 ? (jd0) oldItem : null) == null) {
            return null;
        }
        jd0 jd0Var = (jd0) oldItem;
        return new kd0(!(jd0Var.f164821b == this.f164821b), !(jd0Var.f164822c == this.f164822c), !jd0Var.d.equals(this.d));
    }
}
