package com.revolut.feature.blocked_merchants.impl.data.network;

import efm.b;
import efm.d0;
import efm.k;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pr2.a;
import qr2.l;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/data/network/BlockedMerchantsService;", "", "", "enabledExperiments", "Lefm/d0;", "", "Lqr2/l;", "getBlockedMerchantsList", "(Ljava/lang/String;)Lefm/d0;", "Lpr2/a;", "body", "blockMerchant", "(Lpr2/a;Ljava/lang/String;)Lefm/d0;", "blockageId", "Lefm/b;", "deleteBlockedMerchant", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "transactionId", "Lefm/k;", "Lqr2/k;", "getBlockDisallowedBottomSheet", "(Ljava/lang/String;)Lefm/k;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BlockedMerchantsService {
    @POST("/blocked-merchant")
    @NotNull
    d0<l> blockMerchant(@Body @NotNull a body, @Header("X-Enabled-Experiments") String enabledExperiments);

    @DELETE("/blocked-merchant/{blockageId}")
    @NotNull
    b deleteBlockedMerchant(@Path("blockageId") @NotNull String blockageId, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("/blocked-merchant/disallowed/bottom-sheet")
    @NotNull
    k<qr2.k> getBlockDisallowedBottomSheet(@NotNull @Query("transactionId") String transactionId);

    @GET("/blocked-merchants")
    @NotNull
    d0<List<l>> getBlockedMerchantsList(@Header("X-Enabled-Experiments") String enabledExperiments);
}
