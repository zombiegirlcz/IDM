package by2;

import cli.g;
import cli.y;
import com.revolut.feature.card_design.impl.card_limit_controller.CardLimitControllerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends h implements dli.b {
    public final y o;

    public c(e stateMapper, CardLimitControllerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new b(inputData.f64737a, inputData.f64738b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
