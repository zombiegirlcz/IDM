package q24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f241536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b14.e f241537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f241538c;
    public final gte.a d;

    public e(p creditApplicationDtoMapper, b14.e eSignConfigurationDtoMapper, CreditPluginsService creditApplicationService, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(eSignConfigurationDtoMapper, "eSignConfigurationDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationService, "creditApplicationService");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f241536a = creditApplicationDtoMapper;
        this.f241537b = eSignConfigurationDtoMapper;
        this.f241538c = creditApplicationService;
        this.d = featureToggleInteractor;
    }
}
