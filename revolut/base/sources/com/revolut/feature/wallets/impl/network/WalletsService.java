package com.revolut.feature.wallets.impl.network;

import efm.d0;
import java.util.List;
import java.util.Map;
import jj0.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ro3.k;
import zsg.c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\bJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00100\u00042\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wallets/impl/network/WalletsService;", "", "", "registeredIdentityId", "Lefm/d0;", "", "Lzsg/d;", "getWalletProfiles", "(Ljava/lang/String;)Lefm/d0;", "walletId", "Lzsg/c;", "getWalletLimits", "endpointName", "Lro3/k;", "getWallet", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "", "getWallets", "feature_wallets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WalletsService {
    @d(tokenId = "Widget")
    @GET("{endpointName}/{walletId}")
    @NotNull
    d0<k> getWallet(@Path(encoded = true, value = "endpointName") @NotNull String endpointName, @Path("walletId") @NotNull String walletId);

    @GET("/wallet-limits")
    @NotNull
    d0<c> getWalletLimits(@Query("walletId") String walletId);

    @GET("/wallet-profiles")
    @NotNull
    d0<List<zsg.d>> getWalletProfiles(@Header("X-Registered-Identity") @NotNull String registeredIdentityId);

    @d(tokenId = "Widget")
    @GET("{endpointName}")
    @NotNull
    d0<Map<String, List<k>>> getWallets(@Path(encoded = true, value = "endpointName") @NotNull String endpointName);
}
