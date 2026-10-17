package com.revolut.feature.defi.remittances.impl.data.network;

import d56.c;
import d56.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/data/network/DeFiRemittancesService;", "", "Ld56/c;", "request", "Ld56/o;", "getQuote", "(Ld56/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fiatCurrency", "getDeFiToCeFiAssets", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiRemittancesService {
    @GET("/crypto/defi/assets/compatible-with-cefi-topup")
    Object getDeFiToCeFiAssets(@NotNull @Query("fiatCurrency") String str, @NotNull Continuation<Object> continuation);

    @POST("/crypto/defi/transfer/quote")
    Object getQuote(@Body @NotNull c cVar, @NotNull Continuation<? super o> continuation);
}
