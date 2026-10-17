package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 implements xki.c, omj.a, kmj.a, nhj.a, qkj.a, gkj.a, ujj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData f4309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f4311c = this;
    public final e4m.e d = e4m.b.b(new a0b.c(this, 20));

    public k0(b bVar, EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData esimMobilePlanPhoneNumberPurchaseFlowContract$InputData) {
        this.f4310b = bVar;
        this.f4309a = esimMobilePlanPhoneNumberPurchaseFlowContract$InputData;
    }

    @Override // omj.a
    public final m2 A() {
        return new m2(this.f4310b, this.f4311c, 1);
    }

    @Override // qkj.a
    public final g2 B() {
        return new g2(this.f4310b, this.f4311c, 3);
    }

    @Override // gkj.a
    public final c2 D() {
        return new c2(this.f4310b, this.f4311c, 0);
    }

    @Override // ujj.a
    public final u1 N() {
        return new u1(this.f4310b, this.f4311c, 2);
    }

    @Override // nhj.a
    public final e1 V() {
        return new e1(this.f4310b, this.f4311c, 2);
    }

    @Override // kmj.a
    public final k2 c() {
        return new k2(this.f4310b, this.f4311c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
