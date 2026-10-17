package com.revolut.feature.transaction.workflow.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transaction/workflow/impl/network/TransactionWorkflowService;", "", "getTransactionWorkflow", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "transactionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_transaction_workflow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionWorkflowService {
    @GET("suspicious-transactions/{transactionId}/workflows")
    Object getTransactionWorkflow(@Path("transactionId") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);
}
