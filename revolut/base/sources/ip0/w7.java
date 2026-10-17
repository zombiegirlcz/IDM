package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class w7 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f166940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f166941c;
    public final UrlImage d;
    public final Object e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166943h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166944j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f166945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f166946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f166947n;

    public w7(String listId, TextLocalisedClause cellTitle, TextClause textClause, UrlImage image, String str, int i) {
        str = (i & 16) != 0 ? null : str;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(image, "image");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166939a = listId;
        this.f166940b = cellTitle;
        this.f166941c = textClause;
        this.d = image;
        this.e = str;
        this.f = positionInBox;
        this.f166942g = null;
        this.f166943h = null;
        this.i = null;
        this.f166944j = null;
        this.k = i2;
        this.f166945l = i2;
        this.f166946m = i2;
        this.f166947n = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsPhotoDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51674g() {
        return this.e;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51671a() {
        return this.f166939a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj2;
        return this.f166939a.equals(w7Var.f166939a) && this.f166940b.equals(w7Var.f166940b) && Intrinsics.f(this.f166941c, w7Var.f166941c) && this.d.equals(w7Var.d) && Intrinsics.f(this.e, w7Var.e) && Intrinsics.f(this.f, w7Var.f) && Intrinsics.f(this.f166942g, w7Var.f166942g) && Intrinsics.f(this.f166943h, w7Var.f166943h) && Intrinsics.f(this.i, w7Var.i) && Intrinsics.f(this.f166944j, w7Var.f166944j) && this.k == w7Var.k && this.f166945l == w7Var.f166945l && this.f166946m == w7Var.f166946m && this.f166947n == w7Var.f166947n;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51678m() {
        return this.k;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.k = i;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f166939a.hashCode() * 31, 31, this.f166940b);
        TextClause textClause = this.f166941c;
        int iG = v7.g(this.d, (iA + (textClause == null ? 0 : textClause.hashCode())) * 31, 31);
        Object obj2 = this.e;
        int i = h30.l.i(this.f, (iG + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f166942g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166943h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166944j;
        return Integer.hashCode(this.f166947n) + j6.a.b(this.f166946m, j6.a.b(this.f166945l, j6.a.b(this.k, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f166942g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51676j() {
        return this.f166943h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51679n() {
        return this.f166945l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51680p() {
        return this.f166947n;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166945l = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51675h() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51677l() {
        return this.f166944j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166942g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f166946m;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166943h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166944j = cVar;
    }
}
