package tx5;

import cli.n;
import cli.y;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.TimeframePickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements f {
    public final y o;

    public h(TimeframePickerScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f71579a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
