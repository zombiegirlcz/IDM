package com.revolut.feature.topup_screen.impl.data.network.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import xue.c;
import xue.g;
import yte.b;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J^\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/TopupMethodsService;", "", "Lyte/n;", "contextType", "", "googlePayAvailable", "applePayAvailable", "", "topUpAmount", "", "topUpCurrency", "Lyte/b;", "cardType", "planCode", "Lxue/g;", "getTopupMethods", "(Lyte/n;ZZLjava/lang/Long;Ljava/lang/String;Lyte/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectedCurrencyCode", "Lretrofit2/Response;", "Lxue/c;", "getCardSteeringSuggestedMethod", "(Ljava/lang/String;Lyte/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopupMethodsService {
    @GET("/topup/methods/default")
    Object getCardSteeringSuggestedMethod(@NotNull @Query("selectedCurrency") String str, @NotNull @Query("contextType") n nVar, @NotNull Continuation<? super Response<c>> continuation);

    @GET("/topup/methods")
    Object getTopupMethods(@NotNull @Query("contextType") n nVar, @Query("googlePayAvailable") boolean z, @Query("applePayAvailable") boolean z3, @Query("topupAmount") Long l2, @Query("topupCurrency") String str, @Query("cardType") b bVar, @Query("planCode") String str2, @NotNull Continuation<? super g> continuation);
}
