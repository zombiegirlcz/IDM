package com.revolut.feature.junior_rewards.impl.data.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lm8.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_rewards/impl/data/service/JuniorRewardsService;", "", "", "perkId", "juniorId", "Lretrofit2/Response;", "", "notify", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llm8/c;", "getPartnershipsEligibility", "feature_junior_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorRewardsService {
    @GET("youth/users/{juniorId}/partnerships/eligibility")
    Object getPartnershipsEligibility(@Path("juniorId") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @POST("youth/users/{juniorId}/partnerships/{perkId}/notify")
    Object notify(@Path("perkId") @NotNull String str, @Path("juniorId") @NotNull String str2, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("youth/users/{juniorId}/partnerships/notify")
    Object notify(@Path("juniorId") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);
}
