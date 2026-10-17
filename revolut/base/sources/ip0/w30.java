package ip0;

import com.revolut.core.ui_kit.delegates.ProgressDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class w30 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f166921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f166922c;
    public final int d;
    public final int e;
    public final aw0.j0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f166923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166924h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166925j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f166926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f166927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f166928n;
    public final int o;

    public w30(TextLocalisedClause startLabel, TextLocalisedClause endLabel, int i, int i2) {
        int i3 = R$attr.uikit_dp8;
        Intrinsics.checkNotNullParameter("PROGRESS_ID", "listId");
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        aw0.j0 backgroundType = aw0.j0.DEFAULT;
        Intrinsics.checkNotNullParameter("PROGRESS_ID", "listId");
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166920a = "PROGRESS_ID";
        this.f166921b = startLabel;
        this.f166922c = endLabel;
        this.d = i;
        this.e = i2;
        this.f = backgroundType;
        this.f166923g = positionInBox;
        this.f166924h = null;
        this.i = null;
        this.f166925j = null;
        this.k = null;
        this.f166926l = i3;
        this.f166927m = i3;
        this.f166928n = i3;
        this.o = i3;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f166920a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w30)) {
            return false;
        }
        w30 w30Var = (w30) obj2;
        return Intrinsics.f(this.f166920a, w30Var.f166920a) && Intrinsics.f(this.f166921b, w30Var.f166921b) && Intrinsics.f(this.f166922c, w30Var.f166922c) && this.d == w30Var.d && this.e == w30Var.e && this.f == w30Var.f && Intrinsics.f(this.f166923g, w30Var.f166923g) && Intrinsics.f(this.f166924h, w30Var.f166924h) && Intrinsics.f(this.i, w30Var.i) && Intrinsics.f(this.f166925j, w30Var.f166925j) && Intrinsics.f(this.k, w30Var.k) && this.f166926l == w30Var.f166926l && this.f166927m == w30Var.f166927m && this.f166928n == w30Var.f166928n && this.o == w30Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53157m() {
        return this.f166926l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166926l = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166923g, (this.f.hashCode() + j6.a.b(this.e, j6.a.b(this.d, t61.a.a(t61.a.a(this.f166920a.hashCode() * 31, 31, this.f166921b), 31, this.f166922c), 31), 31)) * 31, 31);
        p31.c cVar = this.f166924h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166925j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f166928n, j6.a.b(this.f166927m, j6.a.b(this.f166926l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166923g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53155j() {
        return this.f166924h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53158n() {
        return this.f166927m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53159p() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166927m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53154h() {
        return this.f166923g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53156l() {
        return this.f166925j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f166928n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166924h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166925j = cVar;
    }
}
