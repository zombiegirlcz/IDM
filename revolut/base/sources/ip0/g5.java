package ip0;

import com.revolut.core.ui_kit.models.k0;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class g5 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.z8 f164339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164340c;
    public final com.revolut.core.ui_kit.models.k0 d;
    public final e5 e;
    public final i5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f164341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164342h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164343j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f164344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f164345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f164346n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uw0.i f164347p;

    public g5(String listId, aw0.z8 z8Var, boolean z, com.revolut.core.ui_kit.models.k0 selectedCandleFormat, e5 e5Var, i5 i5Var, int i) {
        z8Var = (i & 2) != 0 ? null : z8Var;
        selectedCandleFormat = (i & 16) != 0 ? k0.b.d : selectedCandleFormat;
        e5Var = (i & 32) != 0 ? null : e5Var;
        i5Var = (i & 64) != 0 ? null : i5Var;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedCandleFormat, "selectedCandleFormat");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedCandleFormat, "selectedCandleFormat");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f164338a = listId;
        this.f164339b = z8Var;
        this.f164340c = z;
        this.d = selectedCandleFormat;
        this.e = e5Var;
        this.f = i5Var;
        this.f164341g = positionInBox;
        this.f164342h = null;
        this.i = null;
        this.f164343j = null;
        this.k = null;
        this.f164344l = i2;
        this.f164345m = i2;
        this.f164346n = i2;
        this.o = i2;
        this.f164347p = new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, false);
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53071x() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53056a() {
        return this.f164338a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj2;
        return Intrinsics.f(this.f164338a, g5Var.f164338a) && Intrinsics.f(this.f164339b, g5Var.f164339b) && this.f164340c == g5Var.f164340c && Intrinsics.f(this.d, g5Var.d) && Intrinsics.f(this.e, g5Var.e) && Intrinsics.f(this.f, g5Var.f) && Intrinsics.f(this.f164341g, g5Var.f164341g) && Intrinsics.f(this.f164342h, g5Var.f164342h) && Intrinsics.f(this.i, g5Var.i) && Intrinsics.f(this.f164343j, g5Var.f164343j) && Intrinsics.f(this.k, g5Var.k) && this.f164344l == g5Var.f164344l && this.f164345m == g5Var.f164345m && this.f164346n == g5Var.f164346n && this.o == g5Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52020l() {
        return this.f164344l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164344l = i;
    }

    public final int hashCode() {
        int iHashCode = this.f164338a.hashCode() * 31;
        aw0.z8 z8Var = this.f164339b;
        int iHashCode2 = (this.d.hashCode() + j6.a.c(j6.a.c((iHashCode + (z8Var == null ? 0 : z8Var.hashCode())) * 31, 31, this.f164340c), 31, false)) * 31;
        e5 e5Var = this.e;
        int iHashCode3 = (iHashCode2 + (e5Var == null ? 0 : e5Var.hashCode())) * 31;
        i5 i5Var = this.f;
        int i = h30.l.i(this.f164341g, (iHashCode3 + (i5Var == null ? 0 : i5Var.hashCode())) * 29791, 31);
        p31.c cVar = this.f164342h;
        int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164343j;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f164346n, j6.a.b(this.f164345m, j6.a.b(this.f164344l, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52018h() {
        return this.f164342h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164341g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164343j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52021m() {
        return this.f164345m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164345m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52017g() {
        return this.f164341g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52019j() {
        return this.f164343j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164342h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52022n() {
        return this.f164346n;
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
