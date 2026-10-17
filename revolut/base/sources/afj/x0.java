package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.subscription.EsimSubscriptionFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class x0 implements qji.a, anj.a, ihj.a, mnj.a, knj.a, gnj.a, wjj.a, qnj.a, cij.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionFlowContract$InputData f4516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f4518c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public x0(b bVar, BaseFlow baseFlow, EsimSubscriptionFlowContract$InputData esimSubscriptionFlowContract$InputData) {
        this.f4517b = bVar;
        this.f4516a = esimSubscriptionFlowContract$InputData;
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, 29));
        this.e = e4m.b.b(e4m.c.a(baseFlow));
        this.f = e4m.b.b(new a1e.c(bVar, this, 1, 29));
    }

    @Override // anj.a
    public final k3 G() {
        return new k3(this.f4517b, this.f4518c, 0);
    }

    @Override // qnj.a
    public final q3 J() {
        return new q3(this.f4517b, this.f4518c, 1);
    }

    @Override // cij.b
    public final cij.a M() {
        return new mp.p(this.f4517b, this.f4518c, 3);
    }

    @Override // ihj.a
    public final b1 O() {
        return new b1(this.f4517b, this.f4518c, 3);
    }

    @Override // gnj.a
    public final g3 b() {
        return new g3(this.f4517b, this.f4518c, 2);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // knj.a
    public final i3 j() {
        return new i3(this.f4517b, this.f4518c, 0);
    }

    @Override // wjj.a
    public final y1 s() {
        return new y1(this.f4517b, this.f4518c, 0);
    }

    @Override // mnj.a
    public final o3 y() {
        return new o3(this.f4517b, this.f4518c, 2);
    }
}
