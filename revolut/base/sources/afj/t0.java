package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 implements xki.c, mnj.a, cij.b, qnj.a, gnj.a, knj.a, onj.a, enj.a, inj.a, tmj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimRefundFlowContract$InputData f4447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f4449c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public t0(b bVar, ViewController viewController, EsimRefundFlowContract$InputData esimRefundFlowContract$InputData) {
        this.f4448b = bVar;
        this.f4447a = esimRefundFlowContract$InputData;
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, 28));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new a1e.c(bVar, this, 1, 28));
    }

    @Override // inj.a
    public final e3 A() {
        return new e3(this.f4448b, this.f4449c, 0);
    }

    @Override // qnj.a
    public final q3 J() {
        return new q3(this.f4448b, this.f4449c, 2);
    }

    @Override // cij.b
    public final cij.a M() {
        return new r10.q(this.f4448b, this.f4449c, 3);
    }

    @Override // gnj.a
    public final g3 b() {
        return new g3(this.f4448b, this.f4449c, 0);
    }

    @Override // enj.a
    public final c3 c() {
        return new c3(this.f4448b, this.f4449c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // knj.a
    public final i3 j() {
        return new i3(this.f4448b, this.f4449c, 1);
    }

    @Override // onj.a
    public final m3 q() {
        return new m3(this.f4448b, this.f4449c, 1);
    }

    @Override // tmj.a
    public final a3 s() {
        return new a3(this.f4448b, this.f4449c, 0);
    }

    @Override // mnj.a
    public final o3 y() {
        return new o3(this.f4448b, this.f4449c, 0);
    }
}
