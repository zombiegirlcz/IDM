package ip0;

import com.revolut.core.ui_kit.delegates.AvatarGroupDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class y1 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.i0 f167231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f167232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f167233c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f167234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f167235h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167236j;

    public y1(aw0.i0 data) {
        Intrinsics.checkNotNullParameter("compact_highlighted_benefit_subscriptions_group", "listId");
        Intrinsics.checkNotNullParameter(data, "data");
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        this.f167231a = data;
        this.f167232b = c.d.f249513a;
        this.f167233c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f167234g = i;
        this.f167235h = i;
        this.i = i2;
        this.f167236j = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new AvatarGroupDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53016n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getD() {
        return "compact_highlighted_benefit_subscriptions_group";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return this.f167231a.equals(y1Var.f167231a) && Intrinsics.f(this.f167232b, y1Var.f167232b) && Intrinsics.f(this.f167233c, y1Var.f167233c) && Intrinsics.f(this.d, y1Var.d) && Intrinsics.f(this.e, y1Var.e) && Intrinsics.f(this.f, y1Var.f) && this.f167234g == y1Var.f167234g && this.f167235h == y1Var.f167235h && this.i == y1Var.i && this.f167236j == y1Var.f167236j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f167234g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167234g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f167232b, (this.f167231a.hashCode() - 1681328262) * 31, 31);
        p31.c cVar = this.f167233c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return j6.a.b(this.f167236j, j6.a.b(this.i, j6.a.b(this.f167235h, j6.a.b(this.f167234g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167232b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.f167233c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f167235h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.f167236j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167235h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f167232b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167233c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        y1 y1Var = oldItem instanceof y1 ? (y1) oldItem : null;
        if (y1Var != null) {
            return new z1(!y1Var.f167231a.equals(this.f167231a), or0.b.l(y1Var, this));
        }
        return null;
    }
}
