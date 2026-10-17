package oeb;

import cli.y;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker.ReservationTimePickerContract$InputData;
import java.time.LocalTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h implements dli.b {
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f224575p;

    public f(ReservationTimePickerContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        List list = inputData.f82871b;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Available time slots must not be empty");
        }
        this.o = list;
        LocalTime localTime = inputData.f82870a;
        if (!list.contains(localTime)) {
            throw new IllegalArgumentException("Selected time must be available");
        }
        this.f224575p = mra.d.b(this, new a(localTime, list, list.indexOf(localTime)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f224575p;
    }
}
