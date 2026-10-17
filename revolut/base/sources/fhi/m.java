package fhi;

import cli.y;
import com.revolut.feature_workflow_reminder_impl.ui.timer.WorkflowTimerControllerContract$InputData;
import java.time.Clock;
import java.time.LocalTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends oki.h implements dli.b {
    public final jvh.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WorkflowTimerControllerContract$InputData f135249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Clock f135250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f135251r;

    public m(i stateMapper, jvh.a workflowInteractor, WorkflowTimerControllerContract$InputData inputData, Clock clock) {
        LocalTime localTimeOf;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.o = workflowInteractor;
        this.f135249p = inputData;
        this.f135250q = clock;
        wgi.a aVar = inputData.f98189a;
        int i = k.f135247a[aVar.ordinal()];
        if (i == 1) {
            LocalTime localTimeNow = LocalTime.now(clock);
            localTimeOf = localTimeNow.compareTo(LocalTime.of(16, 0)) <= 0 ? LocalTime.of(18, 0) : localTimeNow.plusHours(2L);
            Intrinsics.h(localTimeOf);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            localTimeOf = LocalTime.of(9, 0);
            Intrinsics.h(localTimeOf);
        }
        this.f135251r = mra.d.b(this, new d(aVar, localTimeOf), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f135251r;
    }
}
