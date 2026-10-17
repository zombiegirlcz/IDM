package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 implements xki.c, bkj.a, wjj.a, ihj.a, cij.b, qnj.a, qkj.a, gjj.a, ylj.a, yij.a, ikj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanSubscriptionFlowContract$InputData f4399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f4401c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q0(b bVar, ViewController viewController, EsimMobilePlanSubscriptionFlowContract$InputData esimMobilePlanSubscriptionFlowContract$InputData) {
        this.f4400b = bVar;
        this.f4399a = esimMobilePlanSubscriptionFlowContract$InputData;
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, 26));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new a1e.c(bVar, this, 1, 26));
    }

    @Override // qkj.a
    public final g2 B() {
        return new g2(this.f4400b, this.f4401c, 1);
    }

    @Override // gjj.a
    public final w1 I() {
        return new w1(this.f4400b, this.f4401c, 0);
    }

    @Override // qnj.a
    public final q3 J() {
        return new q3(this.f4400b, this.f4401c, 3);
    }

    @Override // cij.b
    public final cij.a M() {
        r10.r rVar = new r10.r();
        rVar.f250851a = this.f4400b;
        rVar.f250852b = this.f4401c;
        return rVar;
    }

    @Override // ihj.a
    public final b1 O() {
        return new b1(this.f4400b, this.f4401c, 4);
    }

    @Override // ylj.a
    public final i2 Q() {
        return new i2(this.f4400b, this.f4401c, 0);
    }

    @Override // bkj.a
    public final a2 T() {
        return new a2(this.f4400b, this.f4401c, 1);
    }

    @Override // yij.a
    public final o1 b() {
        return new o1(this.f4400b, this.f4401c, 2);
    }

    @Override // ikj.a
    public final e2 c() {
        return new e2(this.f4400b, this.f4401c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // wjj.a
    public final y1 s() {
        return new y1(this.f4400b, this.f4401c, 1);
    }
}
