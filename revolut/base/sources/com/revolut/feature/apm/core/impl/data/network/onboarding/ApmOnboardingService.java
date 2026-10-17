package com.revolut.feature.apm.core.impl.data.network.onboarding;

import bz1.a;
import bz1.c;
import bz1.f;
import bz1.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0006¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/onboarding/ApmOnboardingService;", "", "", "product", "Lbz1/h;", "getOnboardingStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbz1/c;", "body", "postOnboardingStatus", "(Ljava/lang/String;Lbz1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwj0/b;", "idempotencyTag", "Lbz1/f;", "postOnboardingRegister", "(Ljava/lang/String;Lbz1/c;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbz1/a;", "postDeregister", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmOnboardingService {
    @GET("/apms/{product}/status")
    Object getOnboardingStatus(@Path("product") @NotNull String str, @NotNull Continuation<? super h> continuation);

    @POST("/apms/{product}/deregister")
    Object postDeregister(@Path("product") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @POST("/apms/{product}/register")
    Object postOnboardingRegister(@Path("product") @NotNull String str, @Body @NotNull c cVar, @Tag @NotNull b bVar, @NotNull Continuation<? super f> continuation);

    @POST("/apms/{product}/status")
    Object postOnboardingStatus(@Path("product") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super h> continuation);
}
