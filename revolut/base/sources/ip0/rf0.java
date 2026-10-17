package ip0;

import com.revolut.core.ui_kit.delegates.SmallRadialGaugeDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class rf0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.s9 f166174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f166175c;
    public final Clause d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f166176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f166177h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166178j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166180m;

    public rf0(String listId, aw0.s9 gaugeData, Clause label, Clause clause) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(gaugeData, "gaugeData");
        Intrinsics.checkNotNullParameter(label, "label");
        int i = R$attr.uikit_dp16;
        c.e eVar = new c.e((qv0.h) null, 3);
        this.f166173a = listId;
        this.f166174b = gaugeData;
        this.f166175c = label;
        this.d = clause;
        this.e = i;
        this.f = i;
        this.f166176g = i;
        this.f166177h = i;
        this.i = eVar;
        this.f166178j = null;
        this.k = null;
        this.f166179l = null;
        this.f166180m = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SmallRadialGaugeDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getD() {
        return this.f166173a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rf0)) {
            return false;
        }
        rf0 rf0Var = (rf0) obj2;
        return Intrinsics.f(this.f166173a, rf0Var.f166173a) && Intrinsics.f(this.f166174b, rf0Var.f166174b) && Intrinsics.f(this.f166175c, rf0Var.f166175c) && Intrinsics.f(this.d, rf0Var.d) && this.e == rf0Var.e && this.f == rf0Var.f && this.f166176g == rf0Var.f166176g && this.f166177h == rf0Var.f166177h && Intrinsics.f(this.i, rf0Var.i) && Intrinsics.f(this.f166178j, rf0Var.f166178j) && Intrinsics.f(this.k, rf0Var.k) && Intrinsics.f(this.f166179l, rf0Var.f166179l) && Intrinsics.f(this.f166180m, rf0Var.f166180m);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.e;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.e = i;
    }

    public final int hashCode() {
        int iA = p.a.a((this.f166174b.hashCode() + (this.f166173a.hashCode() * 31)) * 31, 31, this.f166175c);
        Clause clause = this.d;
        int i = h30.l.i(this.i, j6.a.b(this.f166177h, j6.a.b(this.f166176g, j6.a.b(this.f, j6.a.b(this.e, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f166178j;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.k;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166179l;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166180m;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f166178j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166179l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.f166177h;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f166180m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f166179l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166178j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
        return this.f166176g;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166180m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof rf0 ? (rf0) oldItem : null) != null) {
            return new sf0(!Intrinsics.f(this.f166174b, r6.f166174b), !Intrinsics.f(this.f166175c, r6.f166175c), !Intrinsics.f(this.d, r6.d), !Intrinsics.f(this.i, r6.i));
        }
        return null;
    }
}
