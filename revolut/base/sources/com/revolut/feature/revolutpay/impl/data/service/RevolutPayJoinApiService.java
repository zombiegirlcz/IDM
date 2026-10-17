package com.revolut.feature.revolutpay.impl.data.service;

import e7c.k;
import e7c.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/data/service/RevolutPayJoinApiService;", "", "Le7c/l;", "enrollCashbackRequest", "", "enrollOrderCashback", "(Le7c/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c/k;", "enrollMerchantCashback", "(Le7c/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPayJoinApiService {
    @POST("/revolut-pay/cashback-enrollment")
    Object enrollMerchantCashback(@Body @NotNull k kVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/revolut-pay/cashback-enrollment")
    Object enrollOrderCashback(@Body @NotNull l lVar, @NotNull Continuation<? super Unit> continuation);
}
