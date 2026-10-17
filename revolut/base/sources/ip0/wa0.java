package ip0;

import com.revolut.core.ui_kit.delegates.RewardProgressLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class wa0 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166970c;
    public final int d;
    public final int e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166972h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f166973j;

    public wa0() {
        Intrinsics.checkNotNullParameter("REWARD_PROGRESS_LOADING_ID", "listId");
        int i = R$attr.uikit_dp16;
        c.e eVar = new c.e((qv0.h) null, 3);
        this.f166968a = "REWARD_PROGRESS_LOADING_ID";
        this.f166969b = i;
        this.f166970c = i;
        this.d = i;
        this.e = i;
        this.f = null;
        this.f166971g = null;
        this.f166972h = null;
        this.i = null;
        this.f166973j = eVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RewardProgressLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58273a() {
        return this.f166968a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj2;
        return Intrinsics.f(this.f166968a, wa0Var.f166968a) && this.f166969b == wa0Var.f166969b && this.f166970c == wa0Var.f166970c && this.d == wa0Var.d && this.e == wa0Var.e && Intrinsics.f(this.f, wa0Var.f) && Intrinsics.f(this.f166971g, wa0Var.f166971g) && Intrinsics.f(this.f166972h, wa0Var.f166972h) && Intrinsics.f(this.i, wa0Var.i) && Intrinsics.f(this.f166973j, wa0Var.f166973j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52065l() {
        return this.f166969b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166969b = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166970c, j6.a.b(this.f166969b, this.f166968a.hashCode() * 31, 31), 31), 31), 31);
        p31.c cVar = this.f;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166971g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166972h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return this.f166973j.hashCode() + ((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166973j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166971g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52066m() {
        return this.f166970c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166970c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f166973j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f166972h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.f166971g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52067n() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166972h = cVar;
    }
}
