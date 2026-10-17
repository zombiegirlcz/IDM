package ta9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements xki.c, bpg.b, tng.b, cai.a, aog.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingFlowContract$InputData f269259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f269260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f269261c = this;
    public final e4m.e d;
    public final e4m.e e;

    public o(m mVar, OnboardingFlowContract$InputData onboardingFlowContract$InputData) {
        this.f269260b = mVar;
        this.f269259a = onboardingFlowContract$InputData;
        int i = 22;
        this.d = e4m.b.b(new t0b.l(mVar, this, 0, i));
        this.e = e4m.b.b(new t0b.l(mVar, this, 1, i));
    }

    @Override // aog.b
    public final aog.a b() {
        return new oai.r(this.f269260b, this.f269261c, 2);
    }

    @Override // cai.a
    public final oai.b c() {
        return new oai.b(this.f269260b, this.f269261c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // bpg.b
    public final bpg.a j() {
        return new x(this.f269260b, this.f269261c);
    }

    @Override // tng.b
    public final tng.a q() {
        return new oai.h(this.f269260b, this.f269261c, 2);
    }
}
