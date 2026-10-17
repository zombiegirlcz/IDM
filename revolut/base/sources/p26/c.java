package p26;

import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e26.a f232079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t46.a f232080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv5.c f232081c;
    public final DeFiAssetDetailsScreenContract$InputData d;

    public c(e26.a chartRepository, t46.a ratesRepository, xv5.c baseCurrencyInteractor, DeFiAssetDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(chartRepository, "chartRepository");
        Intrinsics.checkNotNullParameter(ratesRepository, "ratesRepository");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f232079a = chartRepository;
        this.f232080b = ratesRepository;
        this.f232081c = baseCurrencyInteractor;
        this.d = inputData;
    }
}
