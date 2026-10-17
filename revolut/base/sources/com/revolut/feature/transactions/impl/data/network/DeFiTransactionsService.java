package com.revolut.feature.transactions.impl.data.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import xhf.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011J=\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/impl/data/network/DeFiTransactionsService;", "", "", "to", "", "count", "", "displayCurrency", "Lefm/d0;", "", "Lxhf/d1;", "getLastTransactions", "(Ljava/lang/Long;ILjava/lang/String;)Lefm/d0;", "from", "getTransactionsAfterDate", "(JILjava/lang/String;)Lefm/d0;", "Companion", "a", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiTransactionsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f92031a;

    /* JADX INFO: renamed from: com.revolut.feature.transactions.impl.data.network.DeFiTransactionsService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f92031a = new Companion();

        private Companion() {
        }
    }

    @GET("/crypto/defi/transactions/last")
    @NotNull
    d0<List<d1>> getLastTransactions(@Query("to") Long to6, @Query("count") int count, @Query("displayCurrency") String displayCurrency);

    @GET("/crypto/defi/transactions")
    @NotNull
    d0<List<d1>> getTransactionsAfterDate(@Query("from") long from, @Query("count") int count, @Query("displayCurrency") String displayCurrency);
}
