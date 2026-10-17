package com.revolut.feature.junior_tasks.impl.services;

import jp8.a;
import jp8.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/services/JuniorTasksRewardsQuoteService;", "", "Ljp8/a;", "payableTasks", "Ljp8/h;", "quoteForTasks", "(Ljp8/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorTasksRewardsQuoteService {
    @POST("youth/tasks/rewards/quote")
    Object quoteForTasks(@Body @NotNull a aVar, @NotNull Continuation<? super h> continuation);
}
