package bdg;

import cli.g;
import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.TravelHotelsChildAgePickerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends h implements dli.b {
    public final y o;

    public d(TravelHotelsChildAgePickerContract$InputData inputData, e stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f93966b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
