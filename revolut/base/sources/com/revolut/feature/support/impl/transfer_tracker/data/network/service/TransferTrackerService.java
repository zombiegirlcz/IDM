package com.revolut.feature.support.impl.transfer_tracker.data.network.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pde.d;
import pde.e;
import pde.f;
import pde.g;
import pde.h;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0006J.\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/data/network/service/TransferTrackerService;", "", "Lpde/e;", "request", "Lpde/d;", "estimateTransferArrival", "(Lpde/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lpde/g;", "getLocatedTransferTransactionsIds", "Lpde/h;", "getInboundTransferType", "", "transferType", "uetr", "paymentDate", "Lpde/f;", "getInboundTransferStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferTrackerService {
    @POST("/v2/estimate/inbound")
    Object estimateTransferArrival(@Body @NotNull e eVar, @NotNull Continuation<? super d> continuation);

    @GET("/v3/estimate/inbound/{transferType}")
    Object getInboundTransferStatus(@Path("transferType") @NotNull String str, @NotNull @Query("uetr") String str2, @NotNull @Query("paymentDate") String str3, @NotNull Continuation<? super f> continuation);

    @POST("/v3/estimate/inbound/transfer/type")
    Object getInboundTransferType(@Body @NotNull e eVar, @NotNull Continuation<? super h> continuation);

    @POST("/v3/estimate/inbound/transfer/transactions")
    Object getLocatedTransferTransactionsIds(@Body @NotNull e eVar, @NotNull Continuation<? super List<g>> continuation);
}
