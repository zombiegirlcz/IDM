package com.revolut.biometric_verification.impl.data.service;

import gr.i;
import gr.m;
import hr.c;
import hr.f;
import ir.a;
import jr.h0;
import jr.s;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\tJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\tJ$\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\t¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/biometric_verification/impl/data/service/BiometricVerificationService;", "", "", "verificationToken", "Lgr/f;", "body", "Lgr/i;", "submitBiometricVerification", "(Ljava/lang/String;Lgr/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljr/s;", "getBiometricVerificationInstructions", "Ljr/h0;", "input", "Lir/a;", "getVerificationInstruction", "(Ljava/lang/String;Ljr/h0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhr/f;", "Lhr/c;", "getActiveLivenessCode", "(Ljava/lang/String;Lhr/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollToken", "Lgr/c;", "getBiometricVerificationReport", "Lgr/m;", "refreshDeferredUploadToken", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationService {
    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("/secrets/active-liveness-code")
    Object getActiveLivenessCode(@Header("X-Verification-Token") @NotNull String str, @Body @NotNull f fVar, @NotNull Continuation<? super c> continuation);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @GET("verifications/instructions")
    Object getBiometricVerificationInstructions(@Header("X-Verification-Token") @NotNull String str, @NotNull Continuation<? super s> continuation);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @GET("/verifications/report")
    Object getBiometricVerificationReport(@Header("X-Verification-Token") @NotNull String str, @NotNull Continuation<? super gr.c> continuation);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("verifications/instructions")
    Object getVerificationInstruction(@Header("X-Verification-Token") @NotNull String str, @Body @NotNull h0 h0Var, @NotNull Continuation<? super a> continuation);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("verifications/instructions")
    Object getVerificationInstruction(@Header("X-Verification-Token") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("/post-verification/token/refresh")
    Object refreshDeferredUploadToken(@Header("X-Verification-Token") @NotNull String str, @NotNull Continuation<? super m> continuation);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("verifications/submit")
    Object submitBiometricVerification(@Header("X-Verification-Token") @NotNull String str, @Body @NotNull gr.f fVar, @NotNull Continuation<? super i> continuation);

    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @POST("verifications/submit")
    Object submitBiometricVerification(@Header("X-Verification-Token") @NotNull String str, @NotNull Continuation<? super i> continuation);
}
