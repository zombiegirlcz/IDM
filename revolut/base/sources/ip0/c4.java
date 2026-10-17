package ip0;

import com.revolut.core.ui_kit.delegates.BigRadialGaugeDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class c4 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.o0 f163676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f163677c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f163678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f163679h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163680j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f163681l;

    public c4(String listId, aw0.o0 gaugeData, TextLocalisedClause bottomLabel) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(gaugeData, "gaugeData");
        Intrinsics.checkNotNullParameter(bottomLabel, "bottomLabel");
        int i = R$attr.uikit_dp16;
        c.e eVar = new c.e((qv0.h) null, 3);
        this.f163675a = listId;
        this.f163676b = gaugeData;
        this.f163677c = bottomLabel;
        this.d = i;
        this.e = i;
        this.f = i;
        this.f163678g = i;
        this.f163679h = eVar;
        this.i = null;
        this.f163680j = null;
        this.k = null;
        this.f163681l = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new BigRadialGaugeDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51938a() {
        return this.f163675a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj2;
        return Intrinsics.f(this.f163675a, c4Var.f163675a) && Intrinsics.f(this.f163676b, c4Var.f163676b) && Intrinsics.f(this.f163677c, c4Var.f163677c) && this.d == c4Var.d && this.e == c4Var.e && this.f == c4Var.f && this.f163678g == c4Var.f163678g && Intrinsics.f(this.f163679h, c4Var.f163679h) && Intrinsics.f(this.i, c4Var.i) && Intrinsics.f(this.f163680j, c4Var.f163680j) && Intrinsics.f(this.k, c4Var.k) && Intrinsics.f(this.f163681l, c4Var.f163681l);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51945m() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163679h, j6.a.b(this.f163678g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, t61.a.a((this.f163676b.hashCode() + (this.f163675a.hashCode() * 31)) * 31, 961, this.f163677c), 31), 31), 31), 31), 31);
        p31.c cVar = this.i;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163680j;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.k;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163681l;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163679h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51943j() {
        return this.f163680j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51946n() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51947p() {
        return this.f163678g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51941g() {
        return this.f163679h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51944l() {
        return this.f163681l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.k;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163680j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163681l = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        c4 c4Var = oldItem instanceof c4 ? (c4) oldItem : null;
        if (c4Var == null) {
            return null;
        }
        aw0.o0 o0Var = c4Var.f163676b;
        aw0.o0 o0Var2 = this.f163676b;
        return new d4(!Intrinsics.f(o0Var2, o0Var), !Intrinsics.f(this.f163677c, c4Var.f163677c), !true, !Intrinsics.f(o0Var2.f10446c, o0Var.f10446c), !Intrinsics.f(o0Var2.d, o0Var.d), !Intrinsics.f(o0Var2.e, o0Var.e), !Intrinsics.f(o0Var2.f, o0Var.f), !Intrinsics.f(o0Var2.f10447g, o0Var.f10447g), !Intrinsics.f(this.f163679h, c4Var.f163679h));
    }
}
