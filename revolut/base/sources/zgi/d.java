package zgi;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_workflow_reminder_impl.ui.timer.WorkflowTimerControllerContract$InputData;
import java.util.Set;
import vzc.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowTimerControllerContract$InputData f322133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f322134b;

    public d(a aVar, c cVar, WorkflowTimerControllerContract$InputData workflowTimerControllerContract$InputData) {
        this.f322133a = workflowTimerControllerContract$InputData;
        this.f322134b = e4m.b.b(new h(aVar, 6, cVar, this));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
