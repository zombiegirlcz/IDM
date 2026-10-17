package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements xki.c, ujj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData f4544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f4546c = this;
    public final e4m.e d;

    public z(b bVar, EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData) {
        this.f4545b = bVar;
        this.f4544a = esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 8));
    }

    @Override // ujj.a
    public final u1 N() {
        return new u1(this.f4545b, this.f4546c, 5);
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
