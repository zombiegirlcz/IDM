package sul;

import cli.y;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends oki.h implements dli.b {
    public final TutorialScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f265802p;

    public i(TutorialScreenContract$InputData inputData, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f265802p = mra.d.b(this, new d(inputData.f107014a, inputData.f107015b, inputData.f107016c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f265802p;
    }
}
