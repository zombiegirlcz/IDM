package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements xki.c, wlj.a, llj.a, ujj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData f4217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f4219c = this;
    public final e4m.e d;

    public e0(b bVar, EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData) {
        this.f4218b = bVar;
        this.f4217a = esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 11));
    }

    @Override // ujj.a
    public final u1 N() {
        return new u1(this.f4218b, this.f4219c, 3);
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
        return new u2(this.f4218b, this.f4219c, 0);
    }

    @Override // wlj.a
    public final y2 q() {
        return new y2(this.f4218b, this.f4219c, 0);
    }
}
