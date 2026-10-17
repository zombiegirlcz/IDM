package com.revolut.retail.feature.plan_rewards.impl.data.service;

import adk.v0;
import adk.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\u0004¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/data/service/MonthlyDrawsService;", "", "Ladk/v0;", "getMonthlyDrawHub", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladk/y0;", "getOptInStatus", "", "optInToMonthlyDraws", "optOutFromMonthlyDraws", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MonthlyDrawsService {
    @GET("monthly-draws")
    Object getMonthlyDrawHub(@NotNull Continuation<? super v0> continuation);

    @GET("monthly-draws/opt-in")
    Object getOptInStatus(@NotNull Continuation<? super y0> continuation);

    @POST("monthly-draws/opt-in")
    Object optInToMonthlyDraws(@NotNull Continuation<? super Unit> continuation);

    @POST("monthly-draws/opt-out")
    Object optOutFromMonthlyDraws(@NotNull Continuation<? super Unit> continuation);
}
