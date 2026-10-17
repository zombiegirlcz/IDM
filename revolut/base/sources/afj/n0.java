package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 implements xki.c, jlj.a, ukj.a, llj.a, wlj.a, hlj.a, ujj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData f4354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f4356c = this;
    public final e4m.e d;

    public n0(b bVar, EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData) {
        this.f4355b = bVar;
        this.f4354a = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 12));
    }

    @Override // ujj.a
    public final u1 N() {
        return new u1(this.f4355b, this.f4356c, 1);
    }

    @Override // jlj.a
    public final w2 b() {
        return new w2(this.f4355b, this.f4356c, 1);
    }

    @Override // hlj.a
    public final s2 c() {
        return new s2(this.f4355b, this.f4356c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // llj.a
    public final u2 j() {
        return new u2(this.f4355b, this.f4356c, 2);
    }

    @Override // wlj.a
    public final y2 q() {
        return new y2(this.f4355b, this.f4356c, 2);
    }

    @Override // ukj.a
    public final s1 s() {
        return new s1(this.f4355b, this.f4356c, 1);
    }
}
