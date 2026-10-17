package nyg;

import cli.y;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.TimeframePickerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(TimeframePickerContract$InputData inputData, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f95075a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
