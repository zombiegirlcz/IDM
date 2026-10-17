package ip0;

import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.checkout.models.CheckoutOrder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class m00 implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f165288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f165289c;
    public final Image d;
    public final Clause e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f165290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f165291h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165292j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f165294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f165295n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f165296p;

    public m00(String listId, Clause clause, Clause subtitle, Image image, TextLocalisedClause textLocalisedClause, List actions, CheckoutOrder checkoutOrder, int i) {
        textLocalisedClause = (i & 16) != 0 ? null : textLocalisedClause;
        actions = (i & 32) != 0 ? zhm.f0.f322471a : actions;
        checkoutOrder = (i & 64) != 0 ? null : checkoutOrder;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(actions, "actions");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f165287a = listId;
        this.f165288b = clause;
        this.f165289c = subtitle;
        this.d = image;
        this.e = textLocalisedClause;
        this.f = actions;
        this.f165290g = checkoutOrder;
        this.f165291h = positionInBox;
        this.i = null;
        this.f165292j = null;
        this.k = null;
        this.f165293l = null;
        this.f165294m = i2;
        this.f165295n = i2;
        this.o = i2;
        this.f165296p = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PermissionDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getE() {
        return this.f165290g;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53634a() {
        return this.f165287a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj2;
        return Intrinsics.f(this.f165287a, m00Var.f165287a) && Intrinsics.f(this.f165288b, m00Var.f165288b) && Intrinsics.f(this.f165289c, m00Var.f165289c) && Intrinsics.f(this.d, m00Var.d) && Intrinsics.f(this.e, m00Var.e) && Intrinsics.f(this.f, m00Var.f) && Intrinsics.f(this.f165290g, m00Var.f165290g) && Intrinsics.f(this.f165291h, m00Var.f165291h) && Intrinsics.f(this.i, m00Var.i) && Intrinsics.f(this.f165292j, m00Var.f165292j) && Intrinsics.f(this.k, m00Var.k) && Intrinsics.f(this.f165293l, m00Var.f165293l) && this.f165294m == m00Var.f165294m && this.f165295n == m00Var.f165295n && this.o == m00Var.o && this.f165296p == m00Var.f165296p;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.f165294m;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165294m = i;
    }

    public final int hashCode() {
        int iHashCode = this.f165287a.hashCode() * 31;
        Clause clause = this.f165288b;
        int iC = a10.b.c(this.d, p.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f165289c), 31);
        Clause clause2 = this.e;
        int iD = p.a.d((iC + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f);
        Object obj2 = this.f165290g;
        int i = h30.l.i(this.f165291h, (iD + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.i;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165292j;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.k;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165293l;
        return Integer.hashCode(this.f165296p) + j6.a.b(this.o, j6.a.b(this.f165295n, j6.a.b(this.f165294m, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165291h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51852g() {
        return this.f165292j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53897g() {
        return this.f165295n;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.f165296p;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165295n = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getE() {
        return this.f165291h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f165293l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51853h() {
        return this.k;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53898h() {
        return this.o;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165292j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165293l = cVar;
    }
}
