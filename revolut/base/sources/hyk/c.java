package hyk;

import com.revolut.retail.feature.trading_onboarding.impl.data.network.OnboardingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingService f156887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f156888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f156889c;

    public c(OnboardingService onboardingService, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(onboardingService, "onboardingService");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f156887a = onboardingService;
        this.f156888b = fileSystemRepository;
        this.f156889c = new w4l.f(new hw9.b(this, 9), null, null, null, null, null, null, null, 254);
    }
}
