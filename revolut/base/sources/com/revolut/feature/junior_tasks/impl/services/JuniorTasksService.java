package com.revolut.feature.junior_tasks.impl.services;

import efm.d0;
import java.util.List;
import jp8.a;
import jp8.b;
import jp8.c;
import jp8.d;
import jp8.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u00042\b\b\u0001\u0010\u0010\u001a\u00020\bH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0014\u0010\u0012J\u0019\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\r0\u00042\b\b\u0001\u0010\u0010\u001a\u00020\bH'¢\u0006\u0004\b\u001d\u0010\u0012¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/services/JuniorTasksService;", "", "Ljp8/b;", "request", "Lefm/d0;", "Ljp8/c;", "createTask", "(Ljp8/b;)Lefm/d0;", "", "taskId", "Ljp8/e;", "updateTask", "(Ljava/lang/String;Ljp8/e;)Lefm/d0;", "", "getAllTasks", "()Lefm/d0;", "juniorId", "getTasks", "(Ljava/lang/String;)Lefm/d0;", "markAsCompleted", "markAsPlanned", "Ljp8/a;", "payableTasks", "Lefm/b;", "payForTasks", "(Ljp8/a;)Lefm/b;", "deleteTask", "(Ljava/lang/String;)Lefm/b;", "Ljp8/d;", "getRewardSuggestions", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorTasksService {
    @POST("youth/tasks")
    @NotNull
    d0<c> createTask(@Body @NotNull b request);

    @DELETE("youth/tasks/{taskId}")
    @NotNull
    efm.b deleteTask(@Path("taskId") @NotNull String taskId);

    @GET("youth/tasks")
    @NotNull
    d0<List<c>> getAllTasks();

    @GET("youth/tasks/rewards/suggestions")
    @NotNull
    d0<List<d>> getRewardSuggestions(@NotNull @Query("youthId") String juniorId);

    @GET("youth/tasks")
    @NotNull
    d0<List<c>> getTasks(@NotNull @Query("youthId") String juniorId);

    @POST("youth/tasks/{taskId}/mark-as-completed")
    @NotNull
    d0<c> markAsCompleted(@Path("taskId") @NotNull String taskId);

    @POST("youth/tasks/{taskId}/mark-as-planned")
    @NotNull
    d0<c> markAsPlanned(@Path("taskId") @NotNull String taskId);

    @POST("youth/tasks/rewards/pay")
    @NotNull
    efm.b payForTasks(@Body @NotNull a payableTasks);

    @PATCH("/youth/tasks/{taskId}")
    @NotNull
    d0<c> updateTask(@Path("taskId") @NotNull String taskId, @Body @NotNull e request);
}
