package com.revolut.feature.retail.salary_account.impl.salary_hub.data.service;

import igb.f0;
import igb.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qgb.m0;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub/data/service/SalaryHubService;", "", "Ligb/f0;", "getSalaryHub", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ligb/i;", "getSalaryHubAvailability", "Lqgb/m0;", "getSalaryHubV3", "Lqgb/i;", "getSalaryHubV3Availability", "", "optIn", "", "rewardType", "claimReward", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalaryHubService {
    @POST("salary-hub/claim/{rewardType}")
    Object claimReward(@Path("rewardType") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("salary-hub")
    Object getSalaryHub(@NotNull Continuation<? super f0> continuation);

    @GET("salary-hub/availability")
    Object getSalaryHubAvailability(@NotNull Continuation<? super i> continuation);

    @GET("salary-hub?version=3")
    Object getSalaryHubV3(@NotNull Continuation<? super m0> continuation);

    @GET("salary-hub/availability?version=3")
    Object getSalaryHubV3Availability(@NotNull Continuation<? super qgb.i> continuation);

    @POST("salary-hub/opt-in")
    Object optIn(@NotNull Continuation<? super Unit> continuation);
}
