package com.revolut.feature.staking.impl.service.consent;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import vvd.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/staking/impl/service/consent/AutoStakingConsentService;", "", "", "Lvvd/c;", "getAutoStakingConsent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "updateConsent", "(Lvvd/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljwd/c;", "requestBody", "", "updateGlobalConsent", "(Ljwd/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AutoStakingConsentService {
    @GET("crypto-staking/auto/consent")
    Object getAutoStakingConsent(@NotNull Continuation<? super List<c>> continuation);

    @POST("crypto-staking/auto/consent")
    Object updateConsent(@Body @NotNull c cVar, @NotNull Continuation<? super List<c>> continuation);

    @PUT("crypto-staking/auto-earn")
    Object updateGlobalConsent(@Body @NotNull jwd.c cVar, @NotNull Continuation<? super Unit> continuation);
}
