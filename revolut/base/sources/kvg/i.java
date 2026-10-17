package kvg;

import cli.y;
import com.revolut.feature.wealth.analytics.benchmark.ui.PerformanceBenchmarkSelectionContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements a {
    public final zq.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f190120p;

    public i(PerformanceBenchmarkSelectionContract$InputData inputData, k stateMapper, zq.a performanceBenchmarkInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(performanceBenchmarkInteractor, "performanceBenchmarkInteractor");
        this.o = performanceBenchmarkInteractor;
        this.f190120p = mra.d.b(this, new b(null, inputData.f94972a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.t(), null, null, new krc.h(this, null, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f190120p;
    }
}
