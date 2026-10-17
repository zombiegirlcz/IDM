package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 implements z7a.c, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProofOfDrivingNumberFlowContract$InputData f247284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f247286c = this;
    public final e4m.e d = e4m.b.b(new qgk.f1(this, 6));

    public e1(k0 k0Var, ProofOfDrivingNumberFlowContract$InputData proofOfDrivingNumberFlowContract$InputData) {
        this.f247285b = k0Var;
        this.f247284a = proofOfDrivingNumberFlowContract$InputData;
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247285b, this.f247286c, 6);
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
