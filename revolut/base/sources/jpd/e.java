package jpd;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.DatePickerContract$InputData;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(DatePickerContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        LocalDate localDate = inputData.f87666b;
        this.o = mra.d.b(this, new a(localDate, localDate, inputData.f87667c, inputData.d), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
