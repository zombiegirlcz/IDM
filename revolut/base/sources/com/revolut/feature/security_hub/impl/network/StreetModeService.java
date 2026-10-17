package com.revolut.feature.security_hub.impl.network;

import auc.d0;
import auc.j0;
import auc.p0;
import auc.w0;
import auc.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\u0004J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0014\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0001\u0010\t\u001a\u00020\u00182\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/impl/network/StreetModeService;", "", "Lauc/d0;", "getStreetModeInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "disableStreetMode", "enableStreetMode", "Lauc/j0;", "body", "createTrustedLocation", "(Lauc/j0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lauc/p0;", "createTrustedWifi", "(Lauc/p0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lretrofit2/Response;", "deleteTrustedLocation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTrustedWifi", "Lauc/z0;", "updateTrustedLocation", "(Ljava/lang/String;Lauc/z0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lauc/w0;", "Lwj0/b;", "idempotencyTag", "updateDeviceLocation", "(Lauc/w0;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StreetModeService {
    @POST("street-mode/locations")
    Object createTrustedLocation(@Body @NotNull j0 j0Var, @NotNull Continuation<? super Unit> continuation);

    @POST("street-mode/wifis")
    Object createTrustedWifi(@Body @NotNull p0 p0Var, @NotNull Continuation<? super Unit> continuation);

    @DELETE("street-mode/locations/{id}")
    Object deleteTrustedLocation(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @DELETE("street-mode/wifis/{id}")
    Object deleteTrustedWifi(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @DELETE("street-mode")
    Object disableStreetMode(@NotNull Continuation<? super Unit> continuation);

    @POST("street-mode")
    Object enableStreetMode(@NotNull Continuation<? super Unit> continuation);

    @GET("street-mode")
    Object getStreetModeInfo(@NotNull Continuation<? super d0> continuation);

    @POST("street-mode/locations/current")
    Object updateDeviceLocation(@Body @NotNull w0 w0Var, @Tag b bVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @PUT("street-mode/locations/{id}")
    Object updateTrustedLocation(@Path("id") @NotNull String str, @Body @NotNull z0 z0Var, @NotNull Continuation<? super Response<Unit>> continuation);
}
