package com.revolut.retail.feature.esim.impl.network;

import kfj.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lfj.q;
import mfj.g;
import mfj.h;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0006J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0006J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0006¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimProfilesService;", "", "", "mobilePlanType", "Lmfj/h;", "getProfiles", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "simProfileId", "Lkfj/l;", "getConnectivityTroubleshootingInfo", "Lmfj/g;", "getConnectivityTroubleshootingScopes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfj/q;", "request", "", "trackInstallationProgress", "(Ljava/lang/String;Llfj/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlockProfile", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "reissueProfile", "transferProfileToCurrentDevice", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimProfilesService {
    @GET("/connect/sim-profile-troubleshooting")
    Object getConnectivityTroubleshootingInfo(@Query("simProfileId") String str, @NotNull Continuation<? super l> continuation);

    @GET("/connect/sim-profile-troubleshooting-scopes")
    Object getConnectivityTroubleshootingScopes(@NotNull Continuation<? super g> continuation);

    @GET("/connect/sim-profiles")
    Object getProfiles(@Query("mobilePlanType") String str, @NotNull Continuation<? super h> continuation);

    @POST("/connect/sim-profiles/{simProfileId}/re-issue")
    Object reissueProfile(@Path("simProfileId") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("/connect/sim-profiles/{simProfileId}/installation-progress")
    Object trackInstallationProgress(@Path("simProfileId") @NotNull String str, @Body @NotNull q qVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/connect/sim-profiles/{simProfileId}/transfer-to-current-device")
    Object transferProfileToCurrentDevice(@Path("simProfileId") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("/connect/sim-profiles/{simProfileId}/unlock")
    Object unlockProfile(@Path("simProfileId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
