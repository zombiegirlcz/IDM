package com.revolut.feature.transactions.impl.data.network;

import efm.b;
import efm.d0;
import jif.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/impl/data/network/RecallableService;", "", "", "groupId", "Lefm/b;", "recallTransactionById", "(Ljava/lang/String;)Lefm/b;", "Lefm/d0;", "Ljif/c;", "isTransactionRecallableById", "(Ljava/lang/String;)Lefm/d0;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecallableService {
    @GET("transaction/{groupId}/cancel")
    @NotNull
    d0<c> isTransactionRecallableById(@Path("groupId") @NotNull String groupId);

    @POST("transaction/{groupId}/cancel")
    @NotNull
    b recallTransactionById(@Path("groupId") @NotNull String groupId);
}
