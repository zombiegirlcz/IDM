package com.revolut.feature.payments_migration.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import w5a.f;
import y5a.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/network/PaymentsMigrationService;", "", "Lw5a/f;", "getPaymentsMigrationDetails", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "query", "blockId", "Ly5a/d;", "searchProviders", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentsMigrationService {
    @GET("/incentives/payments-migration")
    Object getPaymentsMigrationDetails(@NotNull Continuation<? super f> continuation);

    @GET("/incentives/payments-migration/providers")
    Object searchProviders(@NotNull @Query("query") String str, @Query("blockId") String str2, @NotNull Continuation<? super d> continuation);
}
