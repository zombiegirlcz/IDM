package com.revolut.core.backend_flow.repository.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import q90.k;
import q90.l;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/repository/service/BackendFlowEntitiesSummaryService;", "", "", "formId", "Lq90/l;", "body", "Lq90/k;", "getEntitiesSummary", "(Ljava/lang/String;Lq90/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BackendFlowEntitiesSummaryService {
    @POST("forms/{formId}/entitiesSummary")
    Object getEntitiesSummary(@Path("formId") @NotNull String str, @Body @NotNull l lVar, @NotNull Continuation<? super k> continuation);
}
