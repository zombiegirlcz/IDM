package g9j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f141945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f141946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mu5.f f141947c;
    public final yud.g d;
    public final jul.o e;
    public final r8j.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xv5.c f141948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oh5.e f141949h;

    public w(wsg.n walletInteractor, ppk.f ratesInteractor, mu5.f cryptoInvestmentsInteractor, yud.g stakingInteractor, jul.o cryptoPocketBalanceWithMidPriceInteractor, r8j.d cryptoAssetDetailsPocketProvider, xv5.c baseCurrencyInteractor, oh5.e cryptoLockedGiftBalanceInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(cryptoPocketBalanceWithMidPriceInteractor, "cryptoPocketBalanceWithMidPriceInteractor");
        Intrinsics.checkNotNullParameter(cryptoAssetDetailsPocketProvider, "cryptoAssetDetailsPocketProvider");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(cryptoLockedGiftBalanceInteractor, "cryptoLockedGiftBalanceInteractor");
        this.f141945a = walletInteractor;
        this.f141946b = ratesInteractor;
        this.f141947c = cryptoInvestmentsInteractor;
        this.d = stakingInteractor;
        this.e = cryptoPocketBalanceWithMidPriceInteractor;
        this.f = cryptoAssetDetailsPocketProvider;
        this.f141948g = baseCurrencyInteractor;
        this.f141949h = cryptoLockedGiftBalanceInteractor;
    }

    public final efm.r a(xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        efm.r rVarFlatMap = te0.w.l(r8j.d.a(this.f, pocketCurrency), this.f141948g.a()).flatMap(new v(new u(this, 1), 0));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }
}
