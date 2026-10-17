package nsl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ndf.f f218928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wul.o f218929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xul.l f218930c;

    public s(msl.a badgeMapper, k investFundOrderDetailsCellBuilder, ndf.f investSecuritiesOrderDetailsMapper, nbh.a instrumentImageProvider, wul.o ordersMapper, xul.l stockOrderUnifiedInfoGroupMapper) {
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        Intrinsics.checkNotNullParameter(investFundOrderDetailsCellBuilder, "investFundOrderDetailsCellBuilder");
        Intrinsics.checkNotNullParameter(investSecuritiesOrderDetailsMapper, "investSecuritiesOrderDetailsMapper");
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        Intrinsics.checkNotNullParameter(stockOrderUnifiedInfoGroupMapper, "stockOrderUnifiedInfoGroupMapper");
        this.f218928a = investSecuritiesOrderDetailsMapper;
        this.f218929b = ordersMapper;
        this.f218930c = stockOrderUnifiedInfoGroupMapper;
    }
}
