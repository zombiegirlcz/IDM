package com.revolut.feature.trading.transfer.investments.impl.data.network;

import efm.d0;
import ib.b;
import kotlin.Metadata;
import okhttp3.c;
import org.jetbrains.annotations.NotNull;
import q90.i;
import q90.l1;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00062\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/data/network/TransferOutFlowService;", "", "", "transferType", "accountId", "Lefm/d0;", "Lq90/i;", "getFlow", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", b.Flow, "postFlow", "(Ljava/lang/String;Lq90/i;Ljava/lang/String;)Lefm/d0;", "Lokhttp3/c;", "body", "Lq90/l1;", "uploadFile", "(Ljava/lang/String;Lokhttp3/c;)Lefm/d0;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferOutFlowService {
    @GET("/trading/stocks/transfer/{transfer_type}/flow")
    @NotNull
    d0<i> getFlow(@Path("transfer_type") @NotNull String transferType, @Query("accountId") String accountId);

    @POST("/trading/stocks/transfer/{transfer_type}/flow")
    @NotNull
    d0<i> postFlow(@Path("transfer_type") @NotNull String transferType, @Body @NotNull i flow, @Query("accountId") String accountId);

    @POST("/trading/stocks/transfer/{transfer_type}/upload")
    @NotNull
    d0<l1> uploadFile(@Path("transfer_type") @NotNull String transferType, @Body @NotNull c body);
}
