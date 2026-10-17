package w4i;

import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f294567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f294568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tga.k f294569c;
    public final Breakdown.Transaction d;

    public c(TransactionBreakdownScreenContract$InputData inputData, o7.b orderQuoteInteractor, ybl.b instrumentTickerInteractor, m5i.a entryPointsTypeResolver, tga.k entryPointItemProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(entryPointsTypeResolver, "entryPointsTypeResolver");
        Intrinsics.checkNotNullParameter(entryPointItemProvider, "entryPointItemProvider");
        this.f294567a = orderQuoteInteractor;
        this.f294568b = instrumentTickerInteractor;
        this.f294569c = entryPointItemProvider;
        this.d = inputData.f97175a;
    }
}
