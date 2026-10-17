package f23;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.p f131388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xh9.a f131389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.e f131390c;
    public final gr6.a d;
    public final r0 e;
    public final jla.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ld5.b f131391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xh5.a f131392h;

    public l0(al4.p creditCardProductFeatureTogglesInteractor, xh9.a payLaterInteractor, gr6.e freelancerAvailabilityInteractor, gr6.a freelancerAccountDetailsInteractor, r0 jointAccountsInteractor, jla.h productCatalogueInteractor, ld5.b cryptoCardsAvailabilityInteractor, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(cryptoCardsAvailabilityInteractor, "cryptoCardsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f131388a = creditCardProductFeatureTogglesInteractor;
        this.f131389b = payLaterInteractor;
        this.f131390c = freelancerAvailabilityInteractor;
        this.d = freelancerAccountDetailsInteractor;
        this.e = jointAccountsInteractor;
        this.f = productCatalogueInteractor;
        this.f131391g = cryptoCardsAvailabilityInteractor;
        this.f131392h = cryptoFeatureEnabledInteractor;
    }
}
