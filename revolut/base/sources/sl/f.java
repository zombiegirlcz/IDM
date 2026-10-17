package sl;

import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.network.WorkflowApi;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class f {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowApi f264034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowConfig f264035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulersProvider f264036c;

    public f(WorkflowApi workflowApi, WorkflowConfig workflowConfig, SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.f264034a = workflowApi;
        this.f264035b = workflowConfig;
        this.f264036c = schedulersProvider;
    }

    public final Completable a(x task, String uploadId) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(uploadId, "uploadId");
        return c(task, zhm.u.c(uploadId));
    }

    public final Completable b(x task, String requestBody) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Completable completableCompleteTaskCustomBody = this.f264034a.completeTaskCustomBody(this.f264035b.getWorkflowRunId(), task.getId(), new jl.o(Json.d.d(requestBody)));
        c cVar = c.d;
        completableCompleteTaskCustomBody.getClass();
        he2.b bVar = kgm.j.d;
        kgm.b bVar2 = kgm.j.f184027c;
        Observable observableK = new ogm.m(completableCompleteTaskCustomBody, bVar, cVar, bVar2, bVar2).k();
        Intrinsics.checkNotNullExpressionValue(observableK, "toObservable(...)");
        Completable completableIgnoreElements = RxExtensionsKt.retryWithExponentialBackOff$default(observableK, 2, 5, this.f264036c.getTimer(), null, 8, null).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "ignoreElements(...)");
        return completableIgnoreElements;
    }

    public final Completable c(x xVar, List list) {
        String workflowRunId = this.f264035b.getWorkflowRunId();
        String id10 = xVar.getId();
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new jl.k((String) it8.next(), null));
        }
        Completable completableCompleteTask = this.f264034a.completeTask(workflowRunId, id10, new jl.l(arrayList));
        c cVar = c.f264029c;
        completableCompleteTask.getClass();
        he2.b bVar = kgm.j.d;
        kgm.b bVar2 = kgm.j.f184027c;
        Observable observableK = new ogm.m(completableCompleteTask, bVar, cVar, bVar2, bVar2).k();
        Intrinsics.checkNotNullExpressionValue(observableK, "toObservable(...)");
        Completable completableIgnoreElements = RxExtensionsKt.retryWithExponentialBackOff$default(observableK, 2, 5, this.f264036c.getTimer(), null, 8, null).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "ignoreElements(...)");
        return completableIgnoreElements;
    }
}
