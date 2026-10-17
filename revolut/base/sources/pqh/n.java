package pqh;

import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreenContract$Input;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends oki.h implements dli.b {
    public final ScreenerSortingPickerScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f238790p;

    public n(ScreenerSortingPickerScreenContract$Input inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        ScreenerSortingOptions screenerSortingOptions = inputData.f96274a;
        this.f238790p = mra.d.b(this, new f(screenerSortingOptions.f105173b, screenerSortingOptions.f105174c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f238790p;
    }
}
