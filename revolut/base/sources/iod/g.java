package iod;

import cli.n;
import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.TripsDatePickerContract$InputData;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements dli.b {
    public final TripsDatePickerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f163228p;

    public g(TripsDatePickerContract$InputData inputData, l80.e dateProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        LocalDate localDate = inputData.f87606a;
        this.f163228p = mra.d.b(this, new a(localDate, inputData.f87607b, localDate == null ? ((l80.f) dateProvider).e() : localDate, inputData.f87606a != null && (inputData.f87608c || inputData.f87607b != null), inputData.d, inputData.f87608c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f163228p;
    }
}
