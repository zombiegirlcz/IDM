package wa;

import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;
import w6h.f;
import zhm.h0;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements pa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvh.a f295789a;

    public a(jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.f295789a = workflowInteractor;
    }

    public final r a() {
        WorkflowName.INSTANCE.getClass();
        return nim.a.w(e.H(rd0.e.c(this.f295789a.e(WorkflowName.f105666c, true), g.f186406a), h0.f322473a, new f(14)), new f(15));
    }
}
