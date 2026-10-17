package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements xki.c, gij.a, kij.a, ihj.a, cij.b, qnj.a, qmj.a, nhj.a, yij.a, mij.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimGetPlanFlowContract$InputData f4293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f4295c = this;
    public final e4m.e d;

    public j(b bVar, EsimGetPlanFlowContract$InputData esimGetPlanFlowContract$InputData) {
        this.f4294b = bVar;
        this.f4293a = esimGetPlanFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 5));
    }

    @Override // qnj.a
    public final q3 J() {
        return new q3(this.f4294b, this.f4295c, 0);
    }

    @Override // cij.b
    public final cij.a M() {
        return new r10.v(this.f4294b, this.f4295c, 2);
    }

    @Override // ihj.a
    public final b1 O() {
        return new b1(this.f4294b, this.f4295c, 0);
    }

    @Override // kij.a
    public final k1 R() {
        return new k1(this.f4294b, this.f4295c, 0);
    }

    @Override // nhj.a
    public final e1 V() {
        return new e1(this.f4294b, this.f4295c, 0);
    }

    @Override // gij.a
    public final i1 W() {
        return new i1(this.f4294b, this.f4295c, 0);
    }

    @Override // yij.a
    public final o1 b() {
        return new o1(this.f4294b, this.f4295c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // mij.a
    public final m1 q() {
        return new m1(this.f4294b, this.f4295c, 0);
    }

    @Override // qmj.a
    public final o2 y() {
        return new o2(this.f4294b, this.f4295c, 0);
    }
}
