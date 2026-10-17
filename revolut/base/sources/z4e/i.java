package z4e;

import ael.d0;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$Destination;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import z1i.l;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f319380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f319381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f319382n;

    public i(e inputData, d0 stocksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.f319380l = inputData;
        this.f319381m = stocksInteractor;
        this.f319382n = pyd.c.a(this, new d(null));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, nim.a.v(rd0.e.b(this.f319381m.a(this.f319380l.f319377a, false)), new l(24)), null, new yy6.f(this, null, 10), 3);
    }

    @Override // z4e.b
    public final void Z2() {
        A2(new PerformanceTrackerFlowContract$Destination(new PerformanceTrackerFlowContract$InputData(this.f319380l.f319377a)));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f319382n;
    }
}
