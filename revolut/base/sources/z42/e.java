package z42;

import cli.n;
import cli.y;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.details.TransferAccountDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends oki.h implements dli.b {
    public final y o;

    public e(n stateMapper, TransferAccountDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f62452a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
