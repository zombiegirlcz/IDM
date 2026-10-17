package com.revolut.feature.tax_residency.impl.stamp_duty.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import zoe.a;
import zoe.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/stamp_duty/service/StampDutyService;", "", "", "walletId", "Lzoe/d;", "getStampDutyToPay", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProStampDutyToPay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzoe/a;", "payment", "", "payStampDuty", "(Ljava/lang/String;Lzoe/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payProStampDuty", "(Lzoe/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StampDutyService {
    @GET("acquiring/merchant/tax/stamp-duty")
    Object getProStampDutyToPay(@NotNull Continuation<? super d> continuation);

    @GET("stamp-duty")
    Object getStampDutyToPay(@NotNull @Query("walletId") String str, @NotNull Continuation<? super d> continuation);

    @POST("acquiring/merchant/tax/stamp-duty")
    Object payProStampDuty(@Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);

    @POST("stamp-duty")
    Object payStampDuty(@NotNull @Query("walletId") String str, @Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);
}
