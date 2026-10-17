package com.revolut.feature.transaction.troubleshooter.impl.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rff.a;
import sff.c;
import sff.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/impl/network/TransactionTroubleshooterService;", "", "Lrff/a;", "request", "", "Lsff/c;", "getTroubleshooter", "(Lrff/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "scenario", "Lsff/d;", "getTroubleshooterIdsByScenario", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPendingTransactionTroubleshooters", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionTroubleshooterService {
    @GET("support/pending-transaction/troubleshooters")
    Object getPendingTransactionTroubleshooters(@NotNull Continuation<Object> continuation);

    @POST("troubleshoot")
    Object getTroubleshooter(@Body @NotNull a aVar, @NotNull Continuation<? super List<c>> continuation);

    @GET("support/{scenario}/troubleshooters")
    Object getTroubleshooterIdsByScenario(@Path("scenario") @NotNull String str, @NotNull Continuation<? super d> continuation);
}
