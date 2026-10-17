package e8h;

import com.revolut.feature.wealth.impl.data.network.stock_lending.StockLendingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StockLendingService f123677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t90.g f123678b;

    public d0(StockLendingService service, t90.g mapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f123677a = service;
        this.f123678b = mapper;
    }
}
