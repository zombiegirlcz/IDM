package com.revolut.feature.retail.cobranded_cards.impl.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import w5b.v0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/data/service/CobrandedCardsPlanAdditionalValueService;", "", "", "id", "tier", "Lw5b/v0;", "getPlanBenefits", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentPlanBenefits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsPlanAdditionalValueService {
    @GET("co-brands/plan-benefits/current")
    Object getCurrentPlanBenefits(@NotNull Continuation<? super v0> continuation);

    @GET("co-brands/plan-benefits/{id}/{tier}")
    Object getPlanBenefits(@Path("id") @NotNull String str, @Path("tier") @NotNull String str2, @NotNull Continuation<? super v0> continuation);
}
