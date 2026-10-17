package com.revolut.feature.transactions.impl.data.network;

import com.revolut.data.network.models.merchant.RateMerchantDto;
import efm.b;
import efm.d0;
import java.util.List;
import jif.a;
import jif.d;
import jif.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import xhf.d1;
import yhf.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 42\u00020\u0001:\u00015J_\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0012\u0010\u0013Jk\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0016\u0010\u0017Ja\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001a2\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010 \u001a\u00020\u001a2\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J#\u0010%\u001a\u00020\u001a2\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&JG\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00062\n\b\u0001\u0010$\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b-\u0010.J)\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0003\u0010$\u001a\u00020\u0001H'¢\u0006\u0004\b-\u0010/J\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u000b2\b\b\u0001\u00100\u001a\u00020\u0006H'¢\u0006\u0004\b2\u00103¨\u00066À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/impl/data/network/TransactionsService;", "", "", "sinceUpdatedTime", "", "count", "", "walletId", "pocketId", "pocketType", "enabledExperiments", "Lefm/d0;", "", "Lxhf/d1;", "getTransactionsAfterDate", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "groupId", "Lyhf/v;", "getTransactionDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "untilCreatedDate", "internalPocketId", "getTransactionsBeforeDate", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "getLastUserTransactions", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lefm/b;", "confirmSuspiciousTransaction", "(Ljava/lang/String;)Lefm/b;", "denySuspiciousTransaction", "Ljif/b;", "comment", "saveComment", "(Ljava/lang/String;Ljif/b;)Lefm/b;", "id", "Lcom/revolut/data/network/models/merchant/RateMerchantDto;", "body", "rateTransaction", "(Ljava/lang/String;Lcom/revolut/data/network/models/merchant/RateMerchantDto;)Lefm/b;", "getTransactionsForWallet", "(Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;)Lefm/d0;", "Ljif/d;", "Lwj0/b;", "idempotencyTag", "Ljif/e;", "revertTransaction", "(Ljava/lang/String;Ljif/d;Lwj0/b;)Lefm/d0;", "(Ljava/lang/String;Ljava/lang/Object;)Lefm/d0;", "transactionId", "Ljif/a;", "retryTransaction", "(Ljava/lang/String;)Lefm/d0;", "Companion", "a", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f92032a;

    /* JADX INFO: renamed from: com.revolut.feature.transactions.impl.data.network.TransactionsService$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes8.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f92032a = new Companion();

        private Companion() {
        }
    }

    @POST("transaction/{groupId}/confirm")
    @NotNull
    b confirmSuspiciousTransaction(@Path("groupId") @NotNull String groupId);

    @POST("transaction/{groupId}/deny")
    @NotNull
    b denySuspiciousTransaction(@Path("groupId") @NotNull String groupId);

    @GET("user/current/transactions/last")
    @NotNull
    d0<List<d1>> getLastUserTransactions(@Query("count") int count, @Query("walletId") String walletId, @Query("pocketId") String pocketId, @Query("internalPocketId") String internalPocketId, @Query("pocketType") String pocketType, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("transaction/{groupId}")
    @NotNull
    d0<List<v>> getTransactionDetails(@Path("groupId") @NotNull String groupId, @Query("walletId") String walletId, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("/user/current/transactions")
    @NotNull
    d0<List<d1>> getTransactionsAfterDate(@Query("from") long sinceUpdatedTime, @Query("count") int count, @Query("walletId") String walletId, @Query("pocketId") String pocketId, @Query("pocketType") String pocketType, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("user/current/transactions/last")
    @NotNull
    d0<List<d1>> getTransactionsBeforeDate(@Query("to") long untilCreatedDate, @Query("count") int count, @Query("walletId") String walletId, @Query("pocketId") String pocketId, @Query("internalPocketId") String internalPocketId, @Query("pocketType") String pocketType, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("/wallet/{walletId}/transactions")
    @NotNull
    d0<List<d1>> getTransactionsForWallet(@Path("walletId") @NotNull String walletId, @Query("count") int count, @Query("from") Long sinceUpdatedTime, @Query("to") Long untilCreatedDate);

    @POST("/transaction/{id}/rate")
    @NotNull
    b rateTransaction(@Path("id") @NotNull String id10, @Body @NotNull RateMerchantDto body);

    @POST("transaction/{transactionId}/retry")
    @NotNull
    d0<a> retryTransaction(@Path("transactionId") @NotNull String transactionId);

    @POST("transaction/{id}/revert")
    @NotNull
    d0<e> revertTransaction(@Path("id") @NotNull String groupId, @Body @NotNull Object body);

    @POST("transaction/{id}/revert")
    @NotNull
    d0<e> revertTransaction(@Path("id") @NotNull String groupId, @Body d body, @Tag @NotNull wj0.b idempotencyTag);

    @PATCH("transaction/{groupId}")
    @NotNull
    b saveComment(@Path("groupId") @NotNull String groupId, @Body @NotNull jif.b comment);
}
