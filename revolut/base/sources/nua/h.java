package nua;

import cli.y;
import com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.FrequencyPickerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(FrequencyPickerContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f81649a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
