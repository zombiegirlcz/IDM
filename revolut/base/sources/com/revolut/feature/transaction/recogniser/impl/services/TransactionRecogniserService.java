package com.revolut.feature.transaction.recogniser.impl.services;

import efm.d0;
import kotlin.Metadata;
import kotlin.Unit;
import lef.a;
import lef.b;
import lef.c;
import lef.f;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u0007J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/services/TransactionRecogniserService;", "", "", "transactionId", "Lefm/d0;", "Llef/f;", "getDetails", "(Ljava/lang/String;)Lefm/d0;", "", "createdBefore", "Llef/c;", "getMerchantTransactions", "(Ljava/lang/String;J)Lefm/d0;", "Llef/a;", "getBeforeAfterTransactions", "id", "Llef/b;", "body", "", "updateTransactionNote", "(Ljava/lang/String;Llef/b;)Lefm/d0;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionRecogniserService {
    @GET("transaction-recognitions/{id}/before-after-transactions")
    @NotNull
    d0<a> getBeforeAfterTransactions(@Path("id") @NotNull String transactionId);

    @GET("transaction-recognitions/{id}/details")
    @NotNull
    d0<f> getDetails(@Path("id") @NotNull String transactionId);

    @GET("transaction-recognitions/{id}/merchant-transactions")
    @NotNull
    d0<c> getMerchantTransactions(@Path("id") @NotNull String transactionId, @Query("createdBefore") long createdBefore);

    @PATCH("transaction/{id}")
    @NotNull
    d0<Unit> updateTransactionNote(@Path("id") @NotNull String id10, @Body @NotNull b body);
}
