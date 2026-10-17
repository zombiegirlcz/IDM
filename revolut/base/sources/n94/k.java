package n94;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub.DebtsV3HubControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements dli.b {
    public final y o;

    public k(DebtsV3HubControllerContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f67523b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
