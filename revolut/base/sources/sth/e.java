package sth;

import cli.g;
import cli.y;
import com.revolut.feature.workflow.engine.polling.PollingControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rth.j;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends h implements dli.b {
    public final jvh.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f265601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kvh.h f265602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f265603r;

    public e(f mapper, PollingControllerContract$InputData inputData, jvh.a workflowInteractor, j workflowStepMapper, kvh.h serverErrorHelper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowStepMapper, "workflowStepMapper");
        Intrinsics.checkNotNullParameter(serverErrorHelper, "serverErrorHelper");
        this.o = workflowInteractor;
        this.f265601p = workflowStepMapper;
        this.f265602q = serverErrorHelper;
        this.f265603r = mra.d.b(this, new b(inputData.f96500a, inputData.f96501b, inputData.f96502c), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new d(this, null), new sl5.a(this, 16));
    }

    @Override // cli.z
    public final g getState() {
        return this.f265603r;
    }
}
