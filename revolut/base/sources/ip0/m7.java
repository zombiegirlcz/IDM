package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsInputDelegate;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class m7 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f165324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f165325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageClause f165326c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165328h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f165329j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f165330l;

    public m7(TextLocalisedClause title, String value, ImageClause imageClause, int i) {
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter("COLOR_INPUT_ID", "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f165324a = title;
        this.f165325b = value;
        this.f165326c = imageClause;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f165327g = null;
        this.f165328h = null;
        this.i = i2;
        this.f165329j = i;
        this.k = i3;
        this.f165330l = i3;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsInputDelegate(null);
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return "COLOR_INPUT_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj2;
        return this.f165324a.equals(m7Var.f165324a) && this.f165325b.equals(m7Var.f165325b) && Intrinsics.f(this.f165326c, m7Var.f165326c) && Intrinsics.f(this.d, m7Var.d) && Intrinsics.f(this.e, m7Var.e) && Intrinsics.f(this.f, m7Var.f) && Intrinsics.f(this.f165327g, m7Var.f165327g) && Intrinsics.f(this.f165328h, m7Var.f165328h) && this.i == m7Var.i && this.f165329j == m7Var.f165329j && this.k == m7Var.k && this.f165330l == m7Var.f165330l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.a(-889061836, 31, this.f165324a), 31, this.f165325b);
        ImageClause imageClause = this.f165326c;
        int i = h30.l.i(this.d, j6.a.c((iC + (imageClause == null ? 0 : imageClause.hashCode())) * 31, 31, true), 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165327g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165328h;
        return Integer.hashCode(this.f165330l) + j6.a.b(this.k, j6.a.b(this.f165329j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165327g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f165329j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f165330l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165329j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f165328h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f165327g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165328h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof m7 ? (m7) oldItem : null) == null) {
            return null;
        }
        m7 m7Var = (m7) oldItem;
        boolean z = true;
        boolean z3 = !m7Var.f165324a.equals(this.f165324a);
        if (m7Var.f165325b.equals(this.f165325b) && Intrinsics.f(m7Var.f165326c, this.f165326c)) {
            z = false;
        }
        return new n7(z3, z, or0.b.l(this, (qv0.i) oldItem));
    }
}
