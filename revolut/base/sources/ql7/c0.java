package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.DriverNumberInputScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DriverNumberInputScreenContract$InputData f247255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247257c;

    public c0(k0 k0Var, e1 e1Var, DriverNumberInputScreenContract$InputData driverNumberInputScreenContract$InputData) {
        this.f247255a = driverNumberInputScreenContract$InputData;
        int i = 10;
        this.f247256b = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247257c = e4m.b.b(new l(k0Var, this, 0, i));
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
