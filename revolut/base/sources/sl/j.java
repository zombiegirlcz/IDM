package sl;

import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.api.client.token.sdk.ApplicantId;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.network.WorkflowApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f264038g = zhm.u.c(400);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowApi f264039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowConfig f264040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f264041c;
    public final SchedulersProvider d;
    public final k7i.i e;
    public final ApplicantId f;

    public j(WorkflowApi workflowApi, WorkflowConfig workflowConfig, a0 workflowTaskMapper, SchedulersProvider schedulersProvider, k7i.i workflowPollerLocaleProvider, ApplicantId applicantId) {
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        Intrinsics.checkNotNullParameter(workflowTaskMapper, "workflowTaskMapper");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(workflowPollerLocaleProvider, "workflowPollerLocaleProvider");
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        this.f264039a = workflowApi;
        this.f264040b = workflowConfig;
        this.f264041c = workflowTaskMapper;
        this.d = schedulersProvider;
        this.e = workflowPollerLocaleProvider;
        this.f = applicantId;
    }
}
