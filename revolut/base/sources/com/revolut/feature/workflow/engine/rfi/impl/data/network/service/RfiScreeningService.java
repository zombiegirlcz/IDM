package com.revolut.feature.workflow.engine.rfi.impl.data.network.service;

import buh.a;
import buh.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/data/network/service/RfiScreeningService;", "", "", "stepId", "Lbuh/a;", "answers", "", "sendAnswers", "(Ljava/lang/String;Lbuh/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbuh/b;", "getCheckId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RfiScreeningService {
    @POST("workflows/steps/{stepId}/documents/init")
    Object getCheckId(@Path("stepId") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @POST("workflows/steps/{stepId}/questionnaire")
    Object sendAnswers(@Path("stepId") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);
}
