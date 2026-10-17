package op0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class b4 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f227191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f227192c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f227193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f227194h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f227195j;

    public b4(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp12;
        int i2 = R$attr.uikit_dp16;
        this.f227190a = listId;
        this.f227191b = c.d.f249513a;
        this.f227192c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f227193g = i;
        this.f227194h = i;
        this.i = i2;
        this.f227195j = i2;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51552a() {
        return this.f227190a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f227190a, b4Var.f227190a) && Intrinsics.f(this.f227191b, b4Var.f227191b) && Intrinsics.f(this.f227192c, b4Var.f227192c) && Intrinsics.f(this.d, b4Var.d) && Intrinsics.f(this.e, b4Var.e) && Intrinsics.f(this.f, b4Var.f) && this.f227193g == b4Var.f227193g && this.f227194h == b4Var.f227194h && this.i == b4Var.i && this.f227195j == b4Var.f227195j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51561p() {
        return this.f227193g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f227193g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f227191b, this.f227190a.hashCode() * 31, 31);
        p31.c cVar = this.f227192c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f227195j) + j6.a.b(this.i, j6.a.b(this.f227194h, j6.a.b(this.f227193g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51558l() {
        return this.f227192c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f227191b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51559m() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51562q() {
        return this.f227194h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51564s() {
        return this.f227195j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f227194h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f227191b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51560n() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f227192c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51563r() {
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
}
