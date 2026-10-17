package com.revolut.feature.apm.swish.impl.data.network;

import ee2.a;
import ee2.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/data/network/SwishService;", "", "Lee2/a;", "getLimits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lee2/b;", "body", "updateLimits", "(Lee2/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SwishService {
    @GET("/apms/swish/limits")
    Object getLimits(@NotNull Continuation<? super a> continuation);

    @POST("/apms/swish/limits")
    Object updateLimits(@Body @NotNull b bVar, @NotNull Continuation<? super a> continuation);
}
