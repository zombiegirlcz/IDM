package com.revolut.feature.transfer_reasons.impl.data.network.service;

import gsf.g;
import gsf.h;
import gsf.j;
import gsf.k;
import gsf.o;
import gsf.p;
import gsf.s;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/data/network/service/TransferReasonsService;", "", "Lgsf/o;", "body", "Lretrofit2/Response;", "Lgsf/p;", "getTransferReasons", "(Lgsf/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgsf/g;", "Lgsf/h;", "postAdditionalInfo", "(Lgsf/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transactionId", "Lgsf/j;", "Lgsf/k;", "createTransferReasons", "(Ljava/lang/String;Lgsf/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgsf/s;", "updateTransferReasons", "(Ljava/lang/String;Lgsf/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferReasonsService {
    @POST("/transaction/{id}/reasons")
    Object createTransferReasons(@Path("id") @NotNull String str, @Body @NotNull j jVar, @NotNull Continuation<? super k> continuation);

    @POST("/payments/reasons")
    Object getTransferReasons(@Body @NotNull o oVar, @NotNull Continuation<? super Response<p>> continuation);

    @POST("/payments/reasons/additional-info")
    Object postAdditionalInfo(@Body @NotNull g gVar, @NotNull Continuation<? super h> continuation);

    @PUT("/transaction/{id}/reasons")
    Object updateTransferReasons(@Path("id") @NotNull String str, @Body @NotNull s sVar, @NotNull Continuation<? super k> continuation);
}
