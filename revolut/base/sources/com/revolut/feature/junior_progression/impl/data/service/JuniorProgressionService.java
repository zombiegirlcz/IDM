package com.revolut.feature.junior_progression.impl.data.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lk8.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_progression/impl/data/service/JuniorProgressionService;", "", "Lretrofit2/Response;", "Llk8/c;", "getProgression", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "triggerProgression", "feature_junior_progression_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorProgressionService {
    @GET("progression")
    Object getProgression(@NotNull Continuation<? super Response<c>> continuation);

    @POST("progression/complete")
    Object triggerProgression(@NotNull Continuation<? super Unit> continuation);
}
