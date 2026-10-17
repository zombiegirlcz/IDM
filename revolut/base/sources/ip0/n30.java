package ip0;

import com.revolut.core.ui_kit.delegates.ProfileCardDelegate;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class n30 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileCardModel f165451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f165452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165453c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165455h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165456j;

    public n30(ProfileCardModel cardModel) {
        Intrinsics.checkNotNullParameter("PAYMENT_LINK_CARD", "listId");
        Intrinsics.checkNotNullParameter(cardModel, "cardModel");
        this.f165451a = cardModel;
        this.f165452b = c.d.f249513a;
        this.f165453c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        int i = R$attr.uikit_dp0;
        this.f165454g = i;
        this.f165455h = i;
        this.i = i;
        this.f165456j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProfileCardDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return "PAYMENT_LINK_CARD";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n30)) {
            return false;
        }
        n30 n30Var = (n30) obj2;
        return this.f165451a.equals(n30Var.f165451a) && Intrinsics.f(this.f165452b, n30Var.f165452b) && Intrinsics.f(this.f165453c, n30Var.f165453c) && Intrinsics.f(this.d, n30Var.d) && Intrinsics.f(this.e, n30Var.e) && Intrinsics.f(this.f, n30Var.f);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52815m() {
        return this.f165454g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165454g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165452b, (this.f165451a.hashCode() + 1217700452) * 961, 31);
        p31.c cVar = this.f165453c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f165453c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165452b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52816n() {
        return this.f165455h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52817p() {
        return this.f165456j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165455h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f165452b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165453c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof n30 ? (n30) oldItem : null) != null) {
            return new o30(!this.f165451a.equals(r0.f165451a), or0.b.l((qv0.i) oldItem, this));
        }
        return null;
    }
}
