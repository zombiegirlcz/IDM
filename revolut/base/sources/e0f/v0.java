package e0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 implements vte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f121693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f121694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w71.b f121695c;
    public final mt8.d d;

    public v0(y51.a externalCardsInteractor, fk3.a configurationInteractor, wsg.n walletInteractor, ng0.b googlePayInteractor, w71.b topUpRepository, mt8.d kycInteractor, gte.a featureToggleInteractor, ang.f userInteractor, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(googlePayInteractor, "googlePayInteractor");
        Intrinsics.checkNotNullParameter(topUpRepository, "topUpRepository");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f121693a = configurationInteractor;
        this.f121694b = walletInteractor;
        this.f121695c = topUpRepository;
        this.d = kycInteractor;
    }
}
