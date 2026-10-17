package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements zo7.a, fp7.a, kn7.a, z7a.c, qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarOnboardingFlowContract$InputData f247398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f247400c = this;
    public final l d;
    public final e4m.e e;

    public n(k0 k0Var, CarOnboardingFlowContract$InputData carOnboardingFlowContract$InputData) {
        this.f247399b = k0Var;
        this.f247398a = carOnboardingFlowContract$InputData;
        int i = 1;
        this.d = new l(k0Var, this, 1, i);
        this.e = e4m.b.b(new l(k0Var, this, 0, i));
    }

    @Override // fp7.a
    public final x1 b() {
        return new x1(this.f247399b, this.f247400c, 1);
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247399b, this.f247400c, 15);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // kn7.a
    public final o1 j() {
        return new o1(this.f247399b, this.f247400c, 1);
    }

    @Override // zo7.a
    public final u1 q() {
        return new u1(this.f247399b, this.f247400c, 1);
    }
}
