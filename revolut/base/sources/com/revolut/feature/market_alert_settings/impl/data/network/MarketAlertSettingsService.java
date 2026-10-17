package com.revolut.feature.market_alert_settings.impl.data.network;

import c59.f;
import c59.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/market_alert_settings/impl/data/network/MarketAlertSettingsService;", "", "Lc59/f;", "getMarketAlertSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc59/i;", "dto", "", "updateMarketAlertSettings", "(Lc59/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_market_alert_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MarketAlertSettingsService {
    @GET("/trading/market-alert-settings")
    Object getMarketAlertSettings(@NotNull Continuation<? super f> continuation);

    @PATCH("/trading/market-alert-settings")
    Object updateMarketAlertSettings(@Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);
}
