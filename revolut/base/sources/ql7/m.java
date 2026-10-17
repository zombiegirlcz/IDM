package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarManualInputScreenContract$InputData f247379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247381c;

    public m(k0 k0Var, q qVar, CarManualInputScreenContract$InputData carManualInputScreenContract$InputData) {
        this.f247379a = carManualInputScreenContract$InputData;
        int i = 0;
        this.f247380b = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247381c = e4m.b.b(new l(k0Var, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
