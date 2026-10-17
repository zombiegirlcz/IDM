package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4l.c f288069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4l.c f288070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingAccountsService f288071c;

    public y0(x4l.c tradingProductDetailsDod, x4l.c tradingAccountsDod, TradingAccountsService service) {
        Intrinsics.checkNotNullParameter(tradingProductDetailsDod, "tradingProductDetailsDod");
        Intrinsics.checkNotNullParameter(tradingAccountsDod, "tradingAccountsDod");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f288069a = tradingProductDetailsDod;
        this.f288070b = tradingAccountsDod;
        this.f288071c = service;
    }
}
