package u4i;

import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeeBreakdownScreenContract$InputData f277348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.b f277349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1j.b f277350c;
    public final kgm.c d;

    public c(FeeBreakdownScreenContract$InputData inputData, o7.b orderQuoteInteractor, t1j.b transferQuoteInteractor, kgm.c orderQuoteFeeAndLimitsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(transferQuoteInteractor, "transferQuoteInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        this.f277348a = inputData;
        this.f277349b = orderQuoteInteractor;
        this.f277350c = transferQuoteInteractor;
        this.d = orderQuoteFeeAndLimitsInteractor;
    }
}
