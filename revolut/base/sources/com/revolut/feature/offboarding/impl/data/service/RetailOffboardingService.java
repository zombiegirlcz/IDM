package com.revolut.feature.offboarding.impl.data.service;

import efm.d0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import q8l.b;
import q8l.e;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/offboarding/impl/data/service/RetailOffboardingService;", "", "Lefm/d0;", "Lq8l/e;", "getOffboardingScreenContent", "()Lefm/d0;", "", "registeredIdentityId", "Lq8l/b;", "getOffboardingDeeplink", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RetailOffboardingService {
    @GET("/self-serve/home/flows/self-offboarding")
    Object getOffboardingDeeplink(@Header("X-Registered-Identity") String str, @NotNull Continuation<? super b> continuation);

    @GET("/self-serve/home/flows/offboarding")
    @NotNull
    d0<e> getOffboardingScreenContent();
}
