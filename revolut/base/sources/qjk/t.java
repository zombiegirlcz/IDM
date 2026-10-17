package qjk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgc.e f246914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final egk.e f246915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffk.t f246916c;
    public final p d;
    public final vf5.d e;
    public final buf.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ang.f f246917g;

    public t(bgc.e rewardsInteractor, egk.e pricingPlansUiInteractor, ffk.t pricingPlanInteractor, p dataBuilder, vf5.d cryptoExchangeFeesInteractor, buf.n cryptoFooterInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesInteractor, "cryptoExchangeFeesInteractor");
        Intrinsics.checkNotNullParameter(cryptoFooterInteractor, "cryptoFooterInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f246914a = rewardsInteractor;
        this.f246915b = pricingPlansUiInteractor;
        this.f246916c = pricingPlanInteractor;
        this.d = dataBuilder;
        this.e = cryptoExchangeFeesInteractor;
        this.f = cryptoFooterInteractor;
        this.f246917g = userInteractor;
    }
}
