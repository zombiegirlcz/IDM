package com.revolut.feature.security_hub.impl.network;

import auc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ\u001c\u0010\u000b\u001a\u00020\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000e\u001a\u00020\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\bJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\bJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/impl/network/SecurityDelayService;", "", "", "location", "transactionId", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getTransactionSecurityDelayPolling", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lauc/s;", "getTransactionSecurityDelay", "getWealthProtectionSecurityDelay", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "securityDelayId", "startSecurityDelay", "", "completeSecurityDelay", "cancelSecurityDelay", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecurityDelayService {
    @DELETE("security-delay/{id}")
    Object cancelSecurityDelay(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("security-delay/{id}/complete")
    Object completeSecurityDelay(@Header("X-Client-Geo-Location") String str, @Path("id") @NotNull String str2, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("security-delay/{transactionId}")
    Object getTransactionSecurityDelay(@Header("X-Client-Geo-Location") String str, @Path("transactionId") @NotNull String str2, @NotNull Continuation<? super s> continuation);

    @GET("security-delay/{transactionId}")
    Object getTransactionSecurityDelayPolling(@Header("X-Client-Geo-Location") String str, @Path("transactionId") @NotNull String str2, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("security-delay")
    Object getWealthProtectionSecurityDelay(@Header("X-Client-Geo-Location") String str, @NotNull Continuation<? super s> continuation);

    @POST("security-delay/{id}/start")
    Object startSecurityDelay(@Header("X-Client-Geo-Location") String str, @Path("id") @NotNull String str2, @NotNull Continuation<? super s> continuation);
}
