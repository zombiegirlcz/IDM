package com.revolut.feature.referrals.code.data.impl.service;

import fwa.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/code/data/impl/service/ReferralCodeService;", "", "", "code", "campaignType", "Lfwa/a;", "bindReferralCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateReferralCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_referrals_code_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReferralCodeService {
    @POST("/referrals/referral-codes/{code}/bind")
    Object bindReferralCode(@Path("code") @NotNull String str, @Query("campaignType") String str2, @NotNull Continuation<? super a> continuation);

    @GET("/referrals/referral-codes/{code}")
    Object validateReferralCode(@Path("code") @NotNull String str, @NotNull Continuation<? super a> continuation);
}
