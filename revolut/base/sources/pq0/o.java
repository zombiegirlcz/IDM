package pq0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f238660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f238661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f238662c;
    public final n d;
    public final int e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f238663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f238664h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f238665j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f238666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f238667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f238668n;
    public final int o;

    public o(q state, TextLocalisedClause title, int i, n arrowColors, int i2, Object obj2) {
        int i3 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("title", "listId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(arrowColors, "arrowColors");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f238660a = state;
        this.f238661b = title;
        this.f238662c = i;
        this.d = arrowColors;
        this.e = i2;
        this.f = obj2;
        this.f238663g = positionInBox;
        this.f238664h = null;
        this.i = null;
        this.f238665j = null;
        this.k = null;
        this.f238666l = i3;
        this.f238667m = i3;
        this.f238668n = i3;
        this.o = i3;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53016n() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53008a() {
        return "title";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f238660a == oVar.f238660a && this.f238661b.equals(oVar.f238661b) && this.f238662c == oVar.f238662c && this.d.equals(oVar.d) && this.e == oVar.e && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f238663g, oVar.f238663g) && Intrinsics.f(this.f238664h, oVar.f238664h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f238665j, oVar.f238665j) && Intrinsics.f(this.k, oVar.k) && this.f238666l == oVar.f238666l && this.f238667m == oVar.f238667m && this.f238668n == oVar.f238668n && this.o == oVar.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f238666l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f238666l = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, (this.d.hashCode() + j6.a.b(this.f238662c, t61.a.a((this.f238660a.hashCode() - 873453400) * 961, 961, this.f238661b), 31)) * 31, 31);
        Object obj2 = this.f;
        int i = h30.l.i(this.f238663g, (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f238664h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f238665j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f238668n, j6.a.b(this.f238667m, j6.a.b(this.f238666l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f238664h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f238663g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f238665j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f238667m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f238667m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f238663g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f238665j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f238664h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
        return this.f238668n;
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
        if ((oldItem instanceof o ? (o) oldItem : null) == null) {
            return null;
        }
        o oVar = (o) oldItem;
        return new p(oVar.f238660a != this.f238660a, oVar.e != this.e, !true);
    }
}
