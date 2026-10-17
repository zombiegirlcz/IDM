package com.revolut.feature.trading.transfer.investments.impl.data.network;

import g9f.c;
import g9f.f;
import g9f.g;
import g9f.j;
import g9f.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/data/network/TransferService;", "", "", "accountId", "Lg9f/g;", "direction", "", "Lg9f/c;", "getBrokersList", "(Ljava/lang/String;Lg9f/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg9f/p;", "getTransferInstrumentsList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransferOutAssetsList", "Lg9f/f;", "transferCreateRequestDto", "Lretrofit2/Response;", "", "createTransferRequest", "(Lg9f/f;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferId", "instrumentRef", "Lg9f/j;", "priceUpdateRequest", "updatePurchasePrice", "(Ljava/lang/String;Ljava/lang/String;Lg9f/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferService {
    @POST("/trading/stocks/transfer")
    Object createTransferRequest(@Body @NotNull f fVar, @NotNull @Query("accountId") String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("/trading/stocks/transfer/providers")
    Object getBrokersList(@NotNull @Query("accountId") String str, @NotNull @Query("direction") g gVar, @NotNull Continuation<? super List<c>> continuation);

    @GET("/trading/stocks/transfer/instruments")
    Object getTransferInstrumentsList(@NotNull @Query("accountId") String str, @NotNull Continuation<? super List<p>> continuation);

    @GET("/trading/stocks/transfer/transferable-assets")
    Object getTransferOutAssetsList(@NotNull @Query("accountId") String str, @NotNull Continuation<? super List<p>> continuation);

    @PUT("/trading/stocks/transfer/{transferId}/position/{ref}/price")
    Object updatePurchasePrice(@Path("transferId") @NotNull String str, @Path("ref") @NotNull String str2, @Body @NotNull j jVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
