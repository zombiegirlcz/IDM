package com.revolut.retail.feature.esim.impl.network;

import kfj.a4;
import kfj.e1;
import kfj.f1;
import kfj.f4;
import kfj.g1;
import kfj.o2;
import kfj.r2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lfj.n;
import lfj.o;
import lfj.p;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u000e2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\u0014\b\u0001\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u001e\"\u00020\u000bH§@¢\u0006\u0004\b!\u0010\"J$\u0010&\u001a\u00020%2\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b&\u0010'¨\u0006(À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimPhoneNumberPortingService;", "", "Llfj/n;", "request", "Lkfj/e1;", "postPhoneNumberPortingRequest", "(Llfj/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfj/p;", "Lkfj/f4;", "createPorting", "(Llfj/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "portingId", "Lretrofit2/Response;", "Lkfj/r2;", "createPortingAuthorization", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfj/o;", "", "submitPortingAuthorizationCode", "(Ljava/lang/String;Llfj/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authorizationId", "getPortingAuthorization", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phoneNumberId", "Lkfj/g1;", "portOutCredentialsRequestBody", "Lokhttp3/ResponseBody;", "postPortOutCredentials", "(Ljava/lang/String;Lkfj/g1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "credentialType", "Lkfj/f1;", "getPortOutCredentials", "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkfj/o2;", "portOutOptInRequestBody", "Lkfj/a4;", "putPortOutEligibility", "(Ljava/lang/String;Lkfj/o2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimPhoneNumberPortingService {
    @POST("/connect/porting-create")
    Object createPorting(@Body @NotNull p pVar, @NotNull Continuation<? super f4> continuation);

    @POST("/connect/porting/{portingId}/authorization")
    Object createPortingAuthorization(@Path("portingId") @NotNull String str, @NotNull Continuation<? super Response<r2>> continuation);

    @GET("/connect/sim-phones/{phoneNumberId}/portout-credentials")
    Object getPortOutCredentials(@Path("phoneNumberId") @NotNull String str, @NotNull @Query("credentialType") String[] strArr, @NotNull Continuation<? super f1> continuation);

    @GET("/connect/porting/{portingId}/authorizations/{authorizationId}")
    Object getPortingAuthorization(@Path("portingId") @NotNull String str, @Path("authorizationId") @NotNull String str2, @NotNull Continuation<? super r2> continuation);

    @POST("/connect/port-in")
    Object postPhoneNumberPortingRequest(@Body @NotNull n nVar, @NotNull Continuation<? super e1> continuation);

    @POST("/connect/sim-phones/{phoneNumberId}/portout-credentials")
    Object postPortOutCredentials(@Path("phoneNumberId") @NotNull String str, @Body @NotNull g1 g1Var, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @PUT("/connect/sim-phones/{phoneNumberId}/portout-eligibility")
    Object putPortOutEligibility(@Path("phoneNumberId") @NotNull String str, @Body @NotNull o2 o2Var, @NotNull Continuation<? super a4> continuation);

    @POST("/connect/porting/{portingId}/authorize")
    Object submitPortingAuthorizationCode(@Path("portingId") @NotNull String str, @Body @NotNull o oVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
