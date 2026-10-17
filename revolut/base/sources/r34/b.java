package r34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dr3.g;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import o14.h;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f251147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f251148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f251149c;
    public final g d;
    public final gte.a e;

    public b(h mortgageOfferValidationResultDtoMapper, p creditApplicationDtoMapper, CreditPluginsService creditPluginsService, g promptMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(mortgageOfferValidationResultDtoMapper, "mortgageOfferValidationResultDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(promptMapper, "promptMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f251147a = mortgageOfferValidationResultDtoMapper;
        this.f251148b = creditApplicationDtoMapper;
        this.f251149c = creditPluginsService;
        this.d = promptMapper;
        this.e = featureToggleInteractor;
    }
}
