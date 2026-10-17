package com.revolut.core.backend_flow.repository.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import q90.j;
import q90.p;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/repository/service/BackendFlowEntitiesService;", "", "", "formId", "mode", "Lq90/p;", "body", "Lq90/j;", "getEntities", "(Ljava/lang/String;Ljava/lang/String;Lq90/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BackendFlowEntitiesService {
    @POST("forms/{formId}/searchEntities")
    Object getEntities(@Path("formId") @NotNull String str, @Query("mode") String str2, @Body @NotNull p pVar, @NotNull Continuation<? super j> continuation);
}
