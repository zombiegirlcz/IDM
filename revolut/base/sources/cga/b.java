package cga;

import bt6.r;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.UnlockBenefitsFlowContract$InputData;
import e4m.e;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnlockBenefitsFlowContract$InputData f23892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f23893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f23894c = this;
    public final e d;

    public b(a aVar, UnlockBenefitsFlowContract$InputData unlockBenefitsFlowContract$InputData) {
        this.f23893b = aVar;
        this.f23892a = unlockBenefitsFlowContract$InputData;
        this.d = e4m.b.b(new r(aVar, this, 16));
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
