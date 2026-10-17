package ip0;

import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class t10 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s10 f166416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166417c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166419h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166420j;
    public final int k;

    public t10(String str, s10 s10Var, int i) {
        int i2 = R$attr.uikit_dp0;
        this.f166415a = str;
        this.f166416b = s10Var;
        this.f166417c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166418g = null;
        this.f166419h = i2;
        this.i = i2;
        this.f166420j = i2;
        this.k = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PlainTextLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55132b() {
        return this.f166415a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj2;
        return Intrinsics.f(this.f166415a, t10Var.f166415a) && Intrinsics.f(this.f166416b, t10Var.f166416b) && Intrinsics.f(this.f166417c, t10Var.f166417c) && Intrinsics.f(this.d, t10Var.d) && Intrinsics.f(this.e, t10Var.e) && Intrinsics.f(this.f, t10Var.f) && Intrinsics.f(this.f166418g, t10Var.f166418g) && this.f166419h == t10Var.f166419h && this.i == t10Var.i && this.f166420j == t10Var.f166420j && this.k == t10Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f166419h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166419h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166417c, (this.f166416b.hashCode() + (this.f166415a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166418g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166420j, j6.a.b(this.i, j6.a.b(this.f166419h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f166418g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166417c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f166417c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166418g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f166420j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    public /* synthetic */ t10(String str) {
        this(str, p10.f165755a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t10(String listId, s10 mode) {
        this(listId, mode, 0);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(mode, "mode");
    }
}
