package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class f6 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f164197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f164198c;
    public final Object d;
    public final boolean e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f164199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164200h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164201j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f164202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f164203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f164204n;
    public final int o;

    public f6(String listId, TextLocalisedClause cellTitle, Clause endText, Image endTextIcon, Object obj2, int i) {
        boolean z = (i & 16) != 0;
        obj2 = (i & 32) != 0 ? null : obj2;
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        int i5 = R$attr.uikit_dp8;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(endText, "endText");
        Intrinsics.checkNotNullParameter(endTextIcon, "endTextIcon");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(endText, "endText");
        Intrinsics.checkNotNullParameter(endTextIcon, "endTextIcon");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f164196a = listId;
        this.f164197b = cellTitle;
        this.f164198c = endText;
        this.d = endTextIcon;
        this.e = z;
        this.f = obj2;
        this.f164199g = positionInBox;
        this.f164200h = null;
        this.i = null;
        this.f164201j = null;
        this.k = null;
        this.f164202l = i2;
        this.f164203m = i2;
        this.f164204n = i3;
        this.o = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsActionableIconDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52674b() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52673a() {
        return this.f164196a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj2;
        return this.f164196a.equals(f6Var.f164196a) && this.f164197b.equals(f6Var.f164197b) && this.f164198c.equals(f6Var.f164198c) && this.d.equals(f6Var.d) && this.e == f6Var.e && Intrinsics.f(this.f, f6Var.f) && Intrinsics.f(this.f164199g, f6Var.f164199g) && Intrinsics.f(this.f164200h, f6Var.f164200h) && Intrinsics.f(this.i, f6Var.i) && Intrinsics.f(this.f164201j, f6Var.f164201j) && Intrinsics.f(this.k, f6Var.k) && this.f164202l == f6Var.f164202l && this.f164203m == f6Var.f164203m && this.f164204n == f6Var.f164204n && this.o == f6Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52683q() {
        return this.f164202l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164202l = i;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.b(p.a.b(t61.a.a(this.f164196a.hashCode() * 31, 31, this.f164197b), 31, this.f164198c), 31, this.d), 31, this.e);
        Object obj2 = this.f;
        int i = h30.l.i(this.f164199g, (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f164200h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164201j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f164204n, j6.a.b(this.f164203m, j6.a.b(this.f164202l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52680m() {
        return this.f164200h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164199g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52681n() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164201j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52684r() {
        return this.f164203m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52686t() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164203m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52679l() {
        return this.f164199g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52682p() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.f164201j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164200h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52685s() {
        return this.f164204n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }
}
