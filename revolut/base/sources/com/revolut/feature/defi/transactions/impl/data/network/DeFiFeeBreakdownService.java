package com.revolut.feature.defi.transactions.impl.data.network;

import e8l.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/transactions/impl/data/network/DeFiFeeBreakdownService;", "", "", "feeBreakdownId", "displayCurrency", "Le8l/d;", "getFeeBreakdown", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_defi_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiFeeBreakdownService {
    @GET("/crypto/defi/fee-breakdowns/{feeBreakdownId}")
    Object getFeeBreakdown(@Path("feeBreakdownId") @NotNull String str, @NotNull @Query("displayCurrency") String str2, @NotNull Continuation<? super d> continuation);
}
