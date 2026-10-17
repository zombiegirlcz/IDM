package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements xki.c, mnj.a, cij.b, qnj.a, gnj.a, knj.a, onj.a, enj.a, inj.a, kjj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCancellationFlowContract$InputData f4381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f4383c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public p(b bVar, ViewController viewController, EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData) {
        this.f4382b = bVar;
        this.f4381a = esimMobilePlanCancellationFlowContract$InputData;
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, 15));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new a1e.c(bVar, this, 1, 15));
    }

    @Override // inj.a
    public final e3 A() {
        return new e3(this.f4382b, this.f4383c, 1);
    }

    @Override // qnj.a
    public final q3 J() {
        return new q3(this.f4382b, this.f4383c, 4);
    }

    @Override // cij.b
    public final cij.a M() {
        return new r10.v(this.f4382b, this.f4383c, 3);
    }

    @Override // gnj.a
    public final g3 b() {
        return new g3(this.f4382b, this.f4383c, 1);
    }

    @Override // enj.a
    public final c3 c() {
        return new c3(this.f4382b, this.f4383c, 0);
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
        return new i3(this.f4382b, this.f4383c, 2);
    }

    @Override // onj.a
    public final m3 q() {
        return new m3(this.f4382b, this.f4383c, 0);
    }

    @Override // kjj.a
    public final q1 s() {
        return new q1(this.f4382b, this.f4383c, 0);
    }

    @Override // mnj.a
    public final o3 y() {
        return new o3(this.f4382b, this.f4383c, 1);
    }
}
