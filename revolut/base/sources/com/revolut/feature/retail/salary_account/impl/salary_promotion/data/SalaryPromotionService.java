package com.revolut.feature.retail.salary_account.impl.salary_promotion.data;

import egb.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_promotion/data/SalaryPromotionService;", "", "", "code", "campaignType", "Legb/c;", "getSalaryPromotion", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalaryPromotionService {
    @GET("incentives/plan-salary-promotion")
    Object getSalaryPromotion(@Query("code") String str, @Query("campaignType") String str2, @NotNull Continuation<? super c> continuation);
}
