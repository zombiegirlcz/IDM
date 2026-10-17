package com.revolut.feature.kyc.core.impl.kyc;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody$Part;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import rt8.a;
import st8.b;
import ut8.c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u0005J\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0005J.\u0010\u001c\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010 \u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u00192\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\b\u0001\u0010\"\u001a\u00020\u0003H§@¢\u0006\u0004\b$\u0010\u000b¨\u0006%À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/kyc/core/impl/kyc/UserKycService;", "", "", "", "getSelfieConsents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwt8/a;", "selfieCheck", "checkId", "", "submitDocument", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvt8/a;", "getKycState", "Lut8/b;", "body", "Lut8/c;", "initKyc", "(Lut8/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lxt8/a;", "submitKycRequestDto", "submitKycDocument", "(Lxt8/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrt8/a;", "getAddresses", "Lokhttp3/MultipartBody$Part;", "scanFilePart", "infoPart", "uploadKycInhouseDocument", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj21/c;", "progressCallback", "uploadKycInhouseDocumentWithProgress", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lj21/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataPointName", "Lst8/b;", "fetchCitizenshipFromDeclarations", "feature_kyc_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserKycService {
    @GET("/kyc/declarations")
    Object fetchCitizenshipFromDeclarations(@NotNull @Query("name") String str, @NotNull Continuation<? super b> continuation);

    @GET("kyc/address-status")
    Object getAddresses(@NotNull Continuation<? super a> continuation);

    @GET("user/current/kyc")
    Object getKycState(@NotNull Continuation<? super vt8.a> continuation);

    @GET("/kyc/selfie/consents")
    Object getSelfieConsents(@NotNull Continuation<? super Set<String>> continuation);

    @POST("kyc/documented/init")
    Object initKyc(@Body @NotNull ut8.b bVar, @NotNull Continuation<? super c> continuation);

    @Headers({"X-Integrity-Check: none"})
    @POST("kyc/selfie/check")
    Object selfieCheck(@NotNull Continuation<? super wt8.a> continuation);

    @POST("/kyc/selfie/check/{checkId}/submit")
    Object submitDocument(@Path("checkId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("kyc/documented/submit")
    Object submitKycDocument(@Body @NotNull xt8.a aVar, @NotNull Continuation<? super Unit> continuation);

    @Headers({"X-Integrity-Check: none"})
    @POST("/kyc/checks/{checkId}/scans")
    @Multipart
    Object uploadKycInhouseDocument(@Path("checkId") @NotNull String str, @NotNull @Part MultipartBody$Part multipartBody$Part, @NotNull @Part MultipartBody$Part multipartBody$Part2, @NotNull Continuation<? super Unit> continuation);

    @Headers({"X-Integrity-Check: none"})
    @POST("/kyc/checks/{checkId}/scans")
    @Multipart
    Object uploadKycInhouseDocumentWithProgress(@Path("checkId") @NotNull String str, @NotNull @Part MultipartBody$Part multipartBody$Part, @NotNull @Part MultipartBody$Part multipartBody$Part2, @Tag @NotNull j21.c cVar, @NotNull Continuation<? super Unit> continuation);
}
