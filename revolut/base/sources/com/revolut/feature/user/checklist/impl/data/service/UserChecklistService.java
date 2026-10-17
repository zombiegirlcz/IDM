package com.revolut.feature.user.checklist.impl.data.service;

import gmg.a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/user/checklist/impl/data/service/UserChecklistService;", "", "Lretrofit2/Response;", "Lgmg/a0;", "getUserChecklist", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_user_checklist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserChecklistService {
    @GET("/user-checklist")
    Object getUserChecklist(@NotNull Continuation<? super Response<a0>> continuation);
}
