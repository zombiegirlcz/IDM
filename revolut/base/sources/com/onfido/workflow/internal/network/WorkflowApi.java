package com.onfido.workflow.internal.network;

import al.a;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import jl.l;
import jl.o;
import jl.o1;
import jl.x;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/onfido/workflow/internal/network/WorkflowApi;", "", "", "acceptLanguageHeader", "workflowRunId", "Lio/reactivex/rxjava3/core/Single;", "Lretrofit2/Response;", "Ljl/o1;", "getNextTask", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "taskId", "Ljl/l;", "completeTaskRequest", "Lio/reactivex/rxjava3/core/Completable;", "completeTask", "(Ljava/lang/String;Ljava/lang/String;Ljl/l;)Lio/reactivex/rxjava3/core/Completable;", "Ljl/o;", "completeTaskCustomBody", "(Ljava/lang/String;Ljava/lang/String;Ljl/o;)Lio/reactivex/rxjava3/core/Completable;", "Ljl/x;", "request", "completeDocumentCaptureTask", "(Ljava/lang/String;Ljl/x;)Lio/reactivex/rxjava3/core/Completable;", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface WorkflowApi {
    @POST("documents_capture_task/complete")
    @a(version = "v3.6")
    @NotNull
    Completable completeDocumentCaptureTask(@Header("X-ONFIDO-WORKFLOW-TASK-ID") @NotNull String taskId, @Body @NotNull x request);

    @POST("workflow_runs/{workflow_run_id}/tasks/{task_id}/complete")
    @a(version = "v3.6")
    @NotNull
    Completable completeTask(@Path("workflow_run_id") @NotNull String workflowRunId, @Path("task_id") @NotNull String taskId, @Body @NotNull l completeTaskRequest);

    @POST("workflow_runs/{workflow_run_id}/tasks/{task_id}/complete")
    @a(version = "v3.6")
    @NotNull
    Completable completeTaskCustomBody(@Path("workflow_run_id") @NotNull String workflowRunId, @Path("task_id") @NotNull String taskId, @Body @NotNull o completeTaskRequest);

    @GET("workflow_runs/{workflow_run_id}")
    @a(version = "v3.6")
    @NotNull
    Single<Response<o1>> getNextTask(@Header("Accept-Language") @NotNull String acceptLanguageHeader, @Path("workflow_run_id") @NotNull String workflowRunId);
}
