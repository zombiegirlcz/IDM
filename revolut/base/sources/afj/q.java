package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.EsimMobilePlanCheckoutFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements xki.c, kjj.a, kmj.a, nhj.a, yij.a, ujj.a, qmj.a, bkj.a, ihj.a, omj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCheckoutFlowContract$InputData f4396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f4398c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q(b bVar, ViewController viewController, EsimMobilePlanCheckoutFlowContract$InputData esimMobilePlanCheckoutFlowContract$InputData) {
        this.f4397b = bVar;
        this.f4396a = esimMobilePlanCheckoutFlowContract$InputData;
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, 16));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new a1e.c(bVar, this, 1, 16));
    }

    @Override // omj.a
    public final m2 A() {
        return new m2(this.f4397b, this.f4398c, 0);
    }

    @Override // ujj.a
    public final u1 N() {
        return new u1(this.f4397b, this.f4398c, 0);
    }

    @Override // ihj.a
    public final b1 O() {
        return new b1(this.f4397b, this.f4398c, 2);
    }

    @Override // bkj.a
    public final a2 T() {
        return new a2(this.f4397b, this.f4398c, 0);
    }

    @Override // nhj.a
    public final e1 V() {
        return new e1(this.f4397b, this.f4398c, 1);
    }

    @Override // yij.a
    public final o1 b() {
        return new o1(this.f4397b, this.f4398c, 1);
    }

    @Override // kmj.a
    public final k2 c() {
        return new k2(this.f4397b, this.f4398c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // kjj.a
    public final q1 s() {
        return new q1(this.f4397b, this.f4398c, 1);
    }

    @Override // qmj.a
    public final o2 y() {
        return new o2(this.f4397b, this.f4398c, 1);
    }
}
