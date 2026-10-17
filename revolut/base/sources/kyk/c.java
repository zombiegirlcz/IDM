package kyk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$InputData;
import java.util.Set;
import jm4.c3;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GiaOnboardingFailedFlowContract$InputData f190931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f190932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f190933c = this;
    public final e4m.e d;

    public c(v vVar, GiaOnboardingFailedFlowContract$InputData giaOnboardingFailedFlowContract$InputData) {
        this.f190932b = vVar;
        this.f190931a = giaOnboardingFailedFlowContract$InputData;
        this.d = e4m.b.b(new c3(vVar, this, 20));
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
