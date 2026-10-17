package ip0;

import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class t80 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f166479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s80 f166480c;
    public final Integer d;
    public final boolean e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166482h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166483j;
    public qv0.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f166486n;
    public p31.c o;

    public t80(String listId, Clause clause, s80 options, Integer num, boolean z, zb7.g gVar, int i) {
        clause = (i & 2) != 0 ? null : clause;
        z = (i & 16) != 0 ? false : z;
        gVar = (i & 32) != 0 ? null : gVar;
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f166478a = listId;
        this.f166479b = clause;
        this.f166480c = options;
        this.d = num;
        this.e = z;
        this.f = gVar;
        this.f166481g = i2;
        this.f166482h = i3;
        this.i = i3;
        this.f166483j = i2;
        this.k = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RateEmojiDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f166478a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj2;
        return Intrinsics.f(this.f166478a, t80Var.f166478a) && Intrinsics.f(this.f166479b, t80Var.f166479b) && Intrinsics.f(this.f166480c, t80Var.f166480c) && Intrinsics.f(this.d, t80Var.d) && this.e == t80Var.e && Intrinsics.f(this.f, t80Var.f) && this.f166481g == t80Var.f166481g && this.f166482h == t80Var.f166482h && this.i == t80Var.i && this.f166483j == t80Var.f166483j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f166481g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166481g = i;
    }

    public final int hashCode() {
        int iHashCode = this.f166478a.hashCode() * 31;
        Clause clause = this.f166479b;
        int iHashCode2 = (this.f166480c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int iC = j6.a.c((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        Object obj2 = this.f;
        return Integer.hashCode(this.f166483j) + j6.a.b(this.i, j6.a.b(this.f166482h, j6.a.b(this.f166481g, (iC + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f166484l;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.k = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f166485m;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166486n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f166482h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f166483j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166482h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f166486n;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166484l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166485m = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.o = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof t80 ? (t80) oldItem : null) == null) {
            return null;
        }
        return new v80(!Intrinsics.f(r0.f166479b, this.f166479b), !r0.f166480c.equals(this.f166480c), !Intrinsics.f(r0.d, this.d), ((t80) oldItem).e != this.e, or0.b.l(this, (qv0.i) oldItem));
    }
}
