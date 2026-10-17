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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bJ_\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'¢\u0006\u0004\b\u0012\u0010\u0013Ji\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0003\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0016\u0010\u0017JU\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/impl/data/network/CryptoExchangeTransactionsService;", "", "", "updatedFrom", "", "limit", "", "type", "state", "currency", "ledger", "Lefm/d0;", "", "Lxhf/d1;", "getTransactionsAfterDate", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "groupId", "Lyhf/v;", "getTransactionDetails", "(Ljava/lang/String;)Lefm/d0;", "createdTo", "createdFrom", "getTransactionsBeforeDate", "(JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "getLastUserTransactions", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Companion", "a", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoExchangeTransactionsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f92030a;

    /* JADX INFO: renamed from: com.revolut.feature.transactions.impl.data.network.CryptoExchangeTransactionsService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f92030a = new Companion();

        private Companion() {
        }
    }

    @GET("/crypto-exchange/v2/transactions")
    @NotNull
    d0<List<d1>> getLastUserTransactions(@Query("limit") int limit, @Query("type") String type, @Query("state") String state, @Query("currency") String currency, @Query("ledger") String ledger);

    @GET("/crypto-exchange/transactions/{groupId}")
    @NotNull
    d0<v> getTransactionDetails(@Path("groupId") @NotNull String groupId);

    @GET("/crypto-exchange/v2/transactions")
    @NotNull
    d0<List<d1>> getTransactionsAfterDate(@Query("updatedFrom") long updatedFrom, @Query("limit") int limit, @Query("type") String type, @Query("state") String state, @Query("currency") String currency, @Query("ledger") String ledger);

    @GET("/crypto-exchange/v2/transactions")
    @NotNull
    d0<List<d1>> getTransactionsBeforeDate(@Query("createdTo") long createdTo, @Query("createdFrom") long createdFrom, @Query("limit") int limit, @Query("type") String type, @Query("state") String state, @Query("currency") String currency, @Query("ledger") String ledger);
}
