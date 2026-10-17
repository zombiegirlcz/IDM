package hyk;

import com.revolut.retail.feature.trading_onboarding.impl.data.network.BackendFlowOnboardingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowOnboardingService f156881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t90.g f156882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f156883c;

    public a(BackendFlowOnboardingService onboardingService, t90.g backendFlowMapper) {
        Intrinsics.checkNotNullParameter(onboardingService, "onboardingService");
        Intrinsics.checkNotNullParameter(backendFlowMapper, "backendFlowMapper");
        this.f156881a = onboardingService;
        this.f156882b = backendFlowMapper;
        this.f156883c = new w4l.f(new hw9.b(this, 8), null, null, null, null, null, null, null, 254);
    }
}
