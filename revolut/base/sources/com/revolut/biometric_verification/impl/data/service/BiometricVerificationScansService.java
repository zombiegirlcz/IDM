package com.revolut.biometric_verification.impl.data.service;

import j21.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody$Part;
import org.jetbrains.annotations.NotNull;
import qm0.h;
import retrofit2.Response;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u0017\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/biometric_verification/impl/data/service/BiometricVerificationScansService;", "", "", "verificationToken", "Lokhttp3/MultipartBody$Part;", "scan", "info", "Lj21/c;", "progressCallback", "", "uploadMedia", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lj21/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "uploadNfcRawData", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/util/List;Lj21/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "submit", "uploadFaceEmbeddings", "(ZLjava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lj21/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "uploadDeferredSelfie", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadCompactSelfie", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationScansService {
    @h
    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("scans")
    @Multipart
    Object uploadCompactSelfie(@Query("submit") boolean z, @Header("X-Verification-Token") @NotNull String str, @NotNull @Part MultipartBody$Part multipartBody$Part, @NotNull @Part MultipartBody$Part multipartBody$Part2, @Tag @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @h
    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("/post-verification/scans")
    @Multipart
    Object uploadDeferredSelfie(@Header("X-Verification-Token") @NotNull String str, @NotNull @Part MultipartBody$Part multipartBody$Part, @NotNull @Part MultipartBody$Part multipartBody$Part2, @NotNull Continuation<? super Response<Unit>> continuation);

    @h
    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("scans")
    @Multipart
    Object uploadFaceEmbeddings(@Query("submit") boolean z, @Header("X-Verification-Token") @NotNull String str, @NotNull @Part MultipartBody$Part multipartBody$Part, @NotNull @Part MultipartBody$Part multipartBody$Part2, @Tag @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @h
    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("scans")
    @Multipart
    Object uploadMedia(@Header("X-Verification-Token") @NotNull String str, @NotNull @Part MultipartBody$Part multipartBody$Part, @NotNull @Part MultipartBody$Part multipartBody$Part2, @Tag @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @h
    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("scans")
    @Multipart
    Object uploadNfcRawData(@Header("X-Verification-Token") @NotNull String str, @NotNull @Part MultipartBody$Part multipartBody$Part, @NotNull @Part List<MultipartBody$Part> list, @Tag @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);
}
