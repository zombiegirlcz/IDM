package rwf;

import cli.n;
import cli.y;
import com.revolut.feature.transport.impl.ui.transit_checkout.date_input.DateInputScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements g {
    public final y o;

    public i(n stateMapper, DateInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f92567a, inputData.f92568b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
