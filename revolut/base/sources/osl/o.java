package osl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ndf.f f229377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wul.o f229378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xul.l f229379c;

    public o(msl.a badgeMapper, j investMutualFundOrderDetailsCellBuilder, ndf.f investSecuritiesOrderDetailsMapper, nbh.a instrumentImageProvider, wul.o ordersMapper, xul.l stockOrderUnifiedInfoGroupMapper) {
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        Intrinsics.checkNotNullParameter(investMutualFundOrderDetailsCellBuilder, "investMutualFundOrderDetailsCellBuilder");
        Intrinsics.checkNotNullParameter(investSecuritiesOrderDetailsMapper, "investSecuritiesOrderDetailsMapper");
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        Intrinsics.checkNotNullParameter(stockOrderUnifiedInfoGroupMapper, "stockOrderUnifiedInfoGroupMapper");
        this.f229377a = investSecuritiesOrderDetailsMapper;
        this.f229378b = ordersMapper;
        this.f229379c = stockOrderUnifiedInfoGroupMapper;
    }
}
