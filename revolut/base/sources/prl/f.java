package prl;

import com.revolut.trading.orders.data.network.services.TradingOrdersService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingOrdersService f239327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b80.c f239328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final krl.l f239329c;
    public final ne0.d d;

    public f(TradingOrdersService ordersService, b80.c networkStateRepository, krl.l investOrdersDao, ne0.d ordersMemoryCache) {
        Intrinsics.checkNotNullParameter(ordersService, "ordersService");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(investOrdersDao, "investOrdersDao");
        Intrinsics.checkNotNullParameter(ordersMemoryCache, "ordersMemoryCache");
        this.f239327a = ordersService;
        this.f239328b = networkStateRepository;
        this.f239329c = investOrdersDao;
        this.d = ordersMemoryCache;
    }
}
