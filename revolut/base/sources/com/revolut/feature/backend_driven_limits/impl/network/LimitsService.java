package com.revolut.feature.backend_driven_limits.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backend_driven_limits/impl/network/LimitsService;", "", "getLimits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_backend_driven_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LimitsService {
    @GET("/self-serve/home/flows/limits")
    Object getLimits(@NotNull Continuation<Object> continuation);
}
