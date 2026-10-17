package ip0;

import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sg0 implements qv0.i, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f166350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f166351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166352c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166354h;
    public int i;

    @Override // koi.j
    public final koi.k T1() {
        return new SmartTileSendMoneyLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55203g() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return "send_money_tile";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sg0)) {
            return false;
        }
        sg0 sg0Var = (sg0) obj2;
        return Intrinsics.f(this.f166350a, sg0Var.f166350a) && Intrinsics.f(this.f166351b, sg0Var.f166351b) && Intrinsics.f(this.f166352c, sg0Var.f166352c) && Intrinsics.f(this.d, sg0Var.d) && Intrinsics.f(this.e, sg0Var.e) && this.f == sg0Var.f && this.f166353g == sg0Var.f166353g && this.f166354h == sg0Var.f166354h && this.i == sg0Var.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166350a, -2022172516, 31);
        p31.c cVar = this.f166351b;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166352c;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return j6.a.b(this.i, j6.a.b(this.f166354h, j6.a.b(this.f166353g, j6.a.b(this.f, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f166351b;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166350a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.f166352c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f166353g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166353g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f166350a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166351b = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.f166354h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166352c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }
}
