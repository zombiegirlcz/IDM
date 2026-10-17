package dhi;

import cli.n;
import cli.y;
import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends oki.h implements dli.b {
    public final jvh.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Clock f114819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f114820q;

    public i(n stateMapper, jvh.a workflowInteractor, Clock clock) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.o = workflowInteractor;
        this.f114819p = clock;
        this.f114820q = mra.d.b(this, c.f114815a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f114820q;
    }
}
