package d0i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f110364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f110365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2i.d f110366c;

    public h(l4i.c convertedOrderQuoteCalculator, d cryptoMarketOrderSummaryMapper, e orderSummaryItemsMapper, q2i.d takeProfitStopLossMapper, by5.a stopLimitSummaryMapper, hzh.a stopLimitDetailsMapper) {
        Intrinsics.checkNotNullParameter(convertedOrderQuoteCalculator, "convertedOrderQuoteCalculator");
        Intrinsics.checkNotNullParameter(cryptoMarketOrderSummaryMapper, "cryptoMarketOrderSummaryMapper");
        Intrinsics.checkNotNullParameter(orderSummaryItemsMapper, "orderSummaryItemsMapper");
        Intrinsics.checkNotNullParameter(takeProfitStopLossMapper, "takeProfitStopLossMapper");
        Intrinsics.checkNotNullParameter(stopLimitSummaryMapper, "stopLimitSummaryMapper");
        Intrinsics.checkNotNullParameter(stopLimitDetailsMapper, "stopLimitDetailsMapper");
        this.f110364a = cryptoMarketOrderSummaryMapper;
        this.f110365b = orderSummaryItemsMapper;
        this.f110366c = takeProfitStopLossMapper;
    }
}
