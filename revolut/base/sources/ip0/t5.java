package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class t5 implements qv0.l, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f166448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f166449c;
    public final int d;
    public final Object e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f166450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f166451h;
    public qv0.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166452j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f166455n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f166456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f166457q;

    public t5(String listId, Clause titleClause, Clause subtitleClause, Object obj2, Integer num, Integer num2, int i, int i2, int i3, int i5, int i6) {
        obj2 = (i6 & 16) != 0 ? null : obj2;
        num = (i6 & 32) != 0 ? null : num;
        num2 = (i6 & 64) != 0 ? null : num2;
        i = (i6 & 128) != 0 ? R$attr.uikit_dp0 : i;
        i2 = (i6 & 256) != 0 ? R$attr.uikit_dp0 : i2;
        i3 = (i6 & 512) != 0 ? R$attr.uikit_dp16 : i3;
        i5 = (i6 & 1024) != 0 ? R$attr.uikit_dp0 : i5;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        qv0.k positionInGroup = qv0.k.OutOfGroup;
        Intrinsics.checkNotNullParameter(listId, "listId");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        this.f166447a = listId;
        this.f166448b = titleClause;
        this.f166449c = subtitleClause;
        this.d = Integer.MAX_VALUE;
        this.e = obj2;
        this.f = num;
        this.f166450g = num2;
        this.f166451h = positionInBox;
        this.i = positionInGroup;
        this.f166452j = null;
        this.k = null;
        this.f166453l = null;
        this.f166454m = null;
        this.f166455n = i;
        this.o = i2;
        this.f166456p = i3;
        this.f166457q = i5;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getE() {
        return false;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.i = kVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsAccountDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.e;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return this.f166447a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj2;
        return Intrinsics.f(this.f166447a, t5Var.f166447a) && Intrinsics.f(this.f166448b, t5Var.f166448b) && Intrinsics.f(this.f166449c, t5Var.f166449c) && this.d == t5Var.d && Intrinsics.f(this.e, t5Var.e) && Intrinsics.f(this.f, t5Var.f) && Intrinsics.f(this.f166450g, t5Var.f166450g) && Intrinsics.f(this.f166451h, t5Var.f166451h) && this.i == t5Var.i && Intrinsics.f(this.f166452j, t5Var.f166452j) && Intrinsics.f(this.k, t5Var.k) && Intrinsics.f(this.f166453l, t5Var.f166453l) && Intrinsics.f(this.f166454m, t5Var.f166454m) && this.f166455n == t5Var.f166455n && this.o == t5Var.o && this.f166456p == t5Var.f166456p && this.f166457q == t5Var.f166457q;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52815m() {
        return this.f166455n;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getU() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166455n = i;
    }

    public final int hashCode() {
        int iHashCode = this.f166447a.hashCode() * 31;
        Clause clause = this.f166448b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f166449c;
        int iB = j6.a.b(this.d, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        Object obj2 = this.e;
        int iHashCode3 = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f166450g;
        int iHashCode5 = (this.i.hashCode() + h30.l.i(this.f166451h, (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31)) * 31;
        p31.c cVar = this.f166452j;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.k;
        int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166453l;
        int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166454m;
        return Integer.hashCode(this.f166457q) + j6.a.b(this.f166456p, j6.a.b(this.o, j6.a.b(this.f166455n, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f166452j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166451h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166453l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52816n() {
        return this.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52817p() {
        return this.f166457q;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.o = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f166451h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f166454m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f166453l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166452j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f166456p;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166454m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return null;
    }
}
