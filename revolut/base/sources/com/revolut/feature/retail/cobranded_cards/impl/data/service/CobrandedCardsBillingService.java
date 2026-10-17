package com.revolut.feature.retail.cobranded_cards.impl.data.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import w5b.u;
import w5b.z6;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0004¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/data/service/CobrandedCardsBillingService;", "", "Lw5b/u;", "getBilling", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "planId", "tier", "Lw5b/z6;", "getValueReminder", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardId", "getTerminationValueReminder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cancelPlanTermination", "schedulePlanTermination", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsBillingService {
    @POST("co-brands/plan-terminate/current/cancel")
    Object cancelPlanTermination(@NotNull Continuation<? super Unit> continuation);

    @GET("co-brands/billing")
    Object getBilling(@NotNull Continuation<? super u> continuation);

    @GET("co-brands/plan-terminate/current")
    Object getTerminationValueReminder(@NotNull @Query("cardId") String str, @NotNull Continuation<? super z6> continuation);

    @GET("co-brands/plan-downgrade/{planId}/{tier}")
    Object getValueReminder(@Path("planId") @NotNull String str, @Path("tier") @NotNull String str2, @NotNull Continuation<? super z6> continuation);

    @POST("co-brands/plan-terminate/current/schedule")
    Object schedulePlanTermination(@NotNull Continuation<? super Unit> continuation);
}
