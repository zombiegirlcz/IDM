package pwf;

import cli.y;
import com.revolut.feature.transport.impl.ui.timer_dialog.TimerDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements dli.b {
    public final TimerDialogContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvf.c f240445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f240446q;

    public g(TimerDialogContract$InputData inputData, jvf.c transitPollingExtension, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transitPollingExtension, "transitPollingExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f240445p = transitPollingExtension;
        this.f240446q = mra.d.b(this, new a(inputData.f92557a, inputData.f92558b, inputData.f92559c, inputData.d, inputData.e), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f240445p.b3(this.o.f92557a, new pgk.f(this, 25), new pui.a(29));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f240446q;
    }
}
