package com.revolut.feature.credit.tiles.impl.network.services;

import gb5.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/tiles/impl/network/services/CreditTilesService;", "", "", "Lgb5/a;", "getCreditOnboardingStatusesTiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_tiles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditTilesService {
    @GET("/credit-application/tile/account-switcher")
    Object getCreditOnboardingStatusesTiles(@NotNull Continuation<? super List<a>> continuation);
}
