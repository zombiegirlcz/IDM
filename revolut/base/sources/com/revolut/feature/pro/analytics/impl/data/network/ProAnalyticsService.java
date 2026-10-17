package com.revolut.feature.pro.analytics.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J8\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pro/analytics/impl/data/network/ProAnalyticsService;", "", "", "toDate", "fromDate", "period", "timezoneId", "getSalesAnalytics", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductsAnalytics", "feature_pro_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProAnalyticsService {
    @GET("acquiring/merchant/analytics/products")
    Object getProductsAnalytics(@NotNull @Query("toDate") String str, @NotNull @Query("fromDate") String str2, @NotNull @Query("period") String str3, @NotNull @Query("timezoneId") String str4, @NotNull Continuation<Object> continuation);

    @GET("acquiring/merchant/analytics/sales")
    Object getSalesAnalytics(@NotNull @Query("toDate") String str, @NotNull @Query("fromDate") String str2, @NotNull @Query("period") String str3, @NotNull @Query("timezoneId") String str4, @NotNull Continuation<Object> continuation);
}
