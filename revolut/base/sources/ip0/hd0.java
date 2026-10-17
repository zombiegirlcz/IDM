package ip0;

import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class hd0 implements qv0.q, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f164535c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164537h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164538j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f164539l;

    public hd0(String listId, ind.f fVar, int i) {
        boolean z = (i & 2) == 0;
        fVar = (i & 4) != 0 ? null : fVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i2 = R$attr.uikit_dp0;
        this.f164533a = listId;
        this.f164534b = z;
        this.f164535c = fVar;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164536g = null;
        this.f164537h = i2;
        this.i = i2;
        this.f164538j = i2;
        this.k = i2;
        this.f164539l = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SegmentedGaugeChartLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.f164535c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53304a() {
        return this.f164533a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hd0)) {
            return false;
        }
        hd0 hd0Var = (hd0) obj2;
        return Intrinsics.f(this.f164533a, hd0Var.f164533a) && this.f164534b == hd0Var.f164534b && Intrinsics.f(this.f164535c, hd0Var.f164535c) && Intrinsics.f(this.d, hd0Var.d) && Intrinsics.f(this.e, hd0Var.e) && Intrinsics.f(this.f, hd0Var.f) && Intrinsics.f(this.f164536g, hd0Var.f164536g) && this.f164537h == hd0Var.f164537h && this.i == hd0Var.i && this.f164538j == hd0Var.f164538j && this.k == hd0Var.k && Intrinsics.f(this.f164539l, hd0Var.f164539l);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53315r() {
        return this.f164537h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164537h = i;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f164533a.hashCode() * 31, 31, this.f164534b);
        Object obj2 = this.f164535c;
        int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        p31.c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164536g;
        return this.f164539l.hashCode() + j6.a.b(this.k, j6.a.b(this.f164538j, j6.a.b(this.i, j6.a.b(this.f164537h, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53314q() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164539l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53312n() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53316s() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53310l() {
        return this.f164539l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53313p() {
        return this.f164536g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53317t() {
        return this.f164538j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164536g = cVar;
    }
}
