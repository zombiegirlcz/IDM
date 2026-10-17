package com.revolut.feature.topup_screen.impl.data.network.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import oue.a;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/ExternalCardVerificationService;", "", "", "cardId", "", "launchAutomaticCardOwnerVerification", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loue/a;", "getCardVerificationStatus", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExternalCardVerificationService {
    @GET("card/{id}/verification-status")
    Object getCardVerificationStatus(@Path("id") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @POST("card/{id}/card-verification")
    Object launchAutomaticCardOwnerVerification(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
