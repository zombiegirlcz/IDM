package ip0;

import com.revolut.core.ui_kit.delegates.LimitProgressBarWithTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class dt implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.j1 f163942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.s6 f163943c;
    public final aw0.r6 d;
    public final Clause e;
    public final ft f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163945h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163946j;
    public final uw0.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f163947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f163948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f163949n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f163950p;

    public dt(String listId, aw0.j1 header, aw0.s6 progress, aw0.r6 r6Var, Clause clause, ft state, int i) {
        r6Var = (i & 8) != 0 ? null : r6Var;
        clause = (i & 16) != 0 ? null : clause;
        state = (i & 32) != 0 ? ft.ENABLED : state;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f163941a = listId;
        this.f163942b = header;
        this.f163943c = progress;
        this.d = r6Var;
        this.e = clause;
        this.f = state;
        this.f163944g = i2;
        this.f163945h = i2;
        this.i = i2;
        this.f163946j = i2;
        this.k = new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, false);
        this.f163947l = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LimitProgressBarWithTextDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52424a() {
        return this.f163941a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dt)) {
            return false;
        }
        dt dtVar = (dt) obj2;
        return Intrinsics.f(this.f163941a, dtVar.f163941a) && Intrinsics.f(this.f163942b, dtVar.f163942b) && Intrinsics.f(this.f163943c, dtVar.f163943c) && Intrinsics.f(this.d, dtVar.d) && Intrinsics.f(this.e, dtVar.e) && this.f == dtVar.f && this.f163944g == dtVar.f163944g && this.f163945h == dtVar.f163945h && this.i == dtVar.i && this.f163946j == dtVar.f163946j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f163944g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163944g = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f163943c.hashCode() + ((this.f163942b.hashCode() + (this.f163941a.hashCode() * 31)) * 31)) * 31;
        aw0.r6 r6Var = this.d;
        int iHashCode2 = (iHashCode + (r6Var == null ? 0 : r6Var.hashCode())) * 31;
        Clause clause = this.e;
        return Integer.hashCode(this.f163946j) + j6.a.b(this.i, j6.a.b(this.f163945h, j6.a.b(this.f163944g, (this.f.hashCode() + ((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52435r() {
        return this.f163948m;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163947l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f163949n;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52430l() {
        return this.f163945h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52432n() {
        return this.f163946j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163945h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52436s() {
        return this.f163947l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52434q() {
        return this.f163950p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52433p() {
        return this.o;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163948m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52431m() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163949n = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163950p = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof dt ? (dt) oldItem : null) == null) {
            return null;
        }
        return new et(!Intrinsics.f(r11.f163942b, this.f163942b), !Intrinsics.f(r11.d, this.d), !Intrinsics.f(r11.e, this.e), ((dt) oldItem).f != this.f, !Intrinsics.f(r11.f163947l, this.f163947l), !Intrinsics.f(r11.f163943c, this.f163943c), !Intrinsics.f(r11.k, this.k));
    }
}
