package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements xki.c, hv7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCoverageActivationFlowContract$InputData f200123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f200125c = this;
    public final e4m.e d = e4m.b.b(new ljl.n(this, 17));

    public k(s sVar, InsuranceCoverageActivationFlowContract$InputData insuranceCoverageActivationFlowContract$InputData) {
        this.f200124b = sVar;
        this.f200123a = insuranceCoverageActivationFlowContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // hv7.b
    public final hv7.a s() {
        return new g0(this.f200124b, this.f200125c, 2);
    }
}
