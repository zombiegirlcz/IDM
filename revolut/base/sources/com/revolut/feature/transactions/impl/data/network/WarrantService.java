package com.revolut.feature.transactions.impl.data.network;

import efm.d0;
import jif.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/impl/data/network/WarrantService;", "", "", "warrantId", "subjectId", "transactionId", "Lefm/d0;", "Ljif/g;", "getTransactionWarrantBannerBySubjectId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "confiscationId", "getTransactionWarrantBannerByConfiscationId", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WarrantService {
    @GET("warrant/{warrantId}/confiscation/{confiscationId}/banner")
    @NotNull
    d0<g> getTransactionWarrantBannerByConfiscationId(@Path("warrantId") @NotNull String warrantId, @Path("confiscationId") @NotNull String confiscationId, @NotNull @Query("transactionId") String transactionId);

    @GET("warrant/{warrantId}/subject/{subjectId}/banner")
    @NotNull
    d0<g> getTransactionWarrantBannerBySubjectId(@Path("warrantId") @NotNull String warrantId, @Path("subjectId") @NotNull String subjectId, @NotNull @Query("transactionId") String transactionId);
}
