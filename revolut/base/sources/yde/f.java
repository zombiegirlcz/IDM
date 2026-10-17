package yde;

import cli.n;
import cli.y;
import com.revolut.feature.support.impl.transfer_tracker.ui.date_picker.DatePickerScreenContract$InputData;
import java.time.Clock;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends oki.h implements dli.b {
    public final y o;

    public f(n stateMapper, DatePickerScreenContract$InputData inputData, Clock clock) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clock, "clock");
        LocalDate localDateNow = inputData.f89401a;
        localDateNow = localDateNow == null ? LocalDate.now(clock) : localDateNow;
        Intrinsics.h(localDateNow);
        this.o = mra.d.b(this, new d(localDateNow), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
