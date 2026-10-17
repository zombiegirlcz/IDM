package cfd;

import cli.n;
import cli.y;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector.SimpleSelectorControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(n stateMapper, SimpleSelectorControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f86755a, inputData.f86756b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
