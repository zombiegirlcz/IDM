package com.revolut.feature.topup_screen.impl.data.network.service;

import aue.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import uue.a;
import uue.d;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ&\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/TopUpLimitsService;", "", "", "topUpCurrencyCode", "Laue/c;", "type", "", "Luue/a;", "getTopUpLimits", "(Ljava/lang/String;Laue/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardId", "Luue/c;", "getTopUpLimitsByCard", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyte/n;", "contextType", "Luue/d;", "getCountryLimits", "(Ljava/lang/String;Lyte/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storedMethodId", "getAkahuLimits", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopUpLimitsService {
    @GET("/topup/limits/akahu/{storedMethodId}")
    Object getAkahuLimits(@Path("storedMethodId") @NotNull String str, @NotNull Continuation<? super d> continuation);

    @GET("/topup/country-limits")
    Object getCountryLimits(@Query("topupCurrency") String str, @Query("contextType") n nVar, @NotNull Continuation<? super d> continuation);

    @GET("/topup/limits")
    Object getTopUpLimits(@NotNull @Query("topupCurrency") String str, @Query("type") c cVar, @NotNull Continuation<? super List<a>> continuation);

    @GET("/topup/limits/card/{cardId}")
    Object getTopUpLimitsByCard(@Path("cardId") @NotNull String str, @Query("topupCurrency") String str2, @NotNull Continuation<? super uue.c> continuation);
}
