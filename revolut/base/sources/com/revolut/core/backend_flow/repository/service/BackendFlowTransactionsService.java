package com.revolut.core.backend_flow.repository.service;

import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import q90.r;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JX\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/repository/service/BackendFlowTransactionsService;", "", "", "formId", "itemId", "", "createdBefore", "searchKeyword", "transactionId", "", "excludeTransactionIds", "Lq90/r;", "getTransactions", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BackendFlowTransactionsService {
    @GET("forms/{formId}/transactions")
    Object getTransactions(@Path("formId") @NotNull String str, @NotNull @Query("itemId") String str2, @Query("createdBefore") long j2, @Query("searchKeyword") String str3, @Query("transactionId") String str4, @Query("excludeTransactionIds") Set<String> set, @NotNull Continuation<? super r> continuation);
}
