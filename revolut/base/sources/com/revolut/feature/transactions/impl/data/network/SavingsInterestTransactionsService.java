package com.revolut.feature.transactions.impl.data.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import xhf.d1;
import yhf.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\nJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/impl/data/network/SavingsInterestTransactionsService;", "", "", "sinceUpdatedTime", "", "count", "Lefm/d0;", "", "Lxhf/d1;", "getTransactionsAfterDate", "(JI)Lefm/d0;", "untilCreateDate", "getTransactionsBeforeDate", "getLastUserTransactions", "(I)Lefm/d0;", "", "groupId", "Lyhf/v;", "getTransactionDetails", "(Ljava/lang/String;)Lefm/d0;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsInterestTransactionsService {
    @GET("/money-boxes/deposits/earned-interests/last")
    @NotNull
    d0<List<d1>> getLastUserTransactions(@Query("count") int count);

    @GET("/money-boxes/deposits/earned-interests/{groupId}")
    @NotNull
    d0<v> getTransactionDetails(@Path("groupId") @NotNull String groupId);

    @GET("/money-boxes/deposits/earned-interests")
    @NotNull
    d0<List<d1>> getTransactionsAfterDate(@Query("from") long sinceUpdatedTime, @Query("limit") int count);

    @GET("/money-boxes/deposits/earned-interests/last")
    @NotNull
    d0<List<d1>> getTransactionsBeforeDate(@Query("to") long untilCreateDate, @Query("limit") int count);
}
