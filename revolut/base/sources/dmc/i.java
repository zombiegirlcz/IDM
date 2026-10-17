package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements xki.c, enc.b, knc.b, mnc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingFlowContract$Input f115967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f115968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f115969c = this;
    public final e4m.e d;
    public final e4m.e e;

    public i(r rVar, OnboardingFlowContract$Input onboardingFlowContract$Input) {
        this.f115968b = rVar;
        this.f115967a = onboardingFlowContract$Input;
        int i = 17;
        this.d = e4m.b.b(new db1.f(rVar, this, 1, i));
        this.e = e4m.b.b(new db1.f(rVar, this, 0, i));
    }

    @Override // mnc.b
    public final mnc.a b() {
        return new y(this.f115968b, this.f115969c);
    }

    @Override // enc.b
    public final enc.a c() {
        return new u(this.f115968b, this.f115969c);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // knc.b
    public final knc.a j() {
        return new r10.a(this.f115968b, this.f115969c);
    }
}
