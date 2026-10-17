package com.revolut.feature.revpro.pro_merchant.toggles.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import ufc.b;
import ufc.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revpro/pro_merchant/toggles/impl/data/network/ProMerchantFeatureToggleService;", "", "Lufc/d;", "getFeatureToggles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lufc/b;", "getCardReaderUsageToggles", "feature_revpro_pro_merchant_toggles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProMerchantFeatureToggleService {
    @GET("acquiring/merchant/card-present/terminal-orders/card-reader-usage")
    Object getCardReaderUsageToggles(@NotNull Continuation<? super b> continuation);

    @GET("acquiring/merchant/features")
    Object getFeatureToggles(@NotNull Continuation<? super d> continuation);
}
