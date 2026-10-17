package xr3;

import com.revolut.feature.credit.application.impl.network.CreditOnboardingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditOnboardingService f308231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr3.i f308232b;

    public p(CreditOnboardingService creditOnboardingService, cr3.i creditHealthConfigDtoMapper) {
        Intrinsics.checkNotNullParameter(creditOnboardingService, "creditOnboardingService");
        Intrinsics.checkNotNullParameter(creditHealthConfigDtoMapper, "creditHealthConfigDtoMapper");
        this.f308231a = creditOnboardingService;
        this.f308232b = creditHealthConfigDtoMapper;
    }
}
