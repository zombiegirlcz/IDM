package com.revolut.feature.crypto.onboarding.impl.service;

import com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ni5.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import yhm.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/onboarding/impl/service/CryptoOnboardingService;", "", "", "product", "Lcom/revolut/feature/crypto/account/api/model/dto/CryptoAccountOnboardingDto;", "startProcess", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lni5/b;", "request", "Lyhm/m;", "", "resumeProcess-gIAlu-s", "(Lni5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeProcess", "feature_crypto_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoOnboardingService {
    @POST("/crypto-onboarding/process/entrypoint")
    /* JADX INFO: renamed from: resumeProcess-gIAlu-s, reason: not valid java name */
    Object m3760resumeProcessgIAlus(@Body @NotNull b bVar, @NotNull Continuation<? super m<Unit>> continuation);

    @POST("/crypto-onboarding/process/start")
    Object startProcess(@Query("product") String str, @NotNull Continuation<? super CryptoAccountOnboardingDto> continuation);
}
