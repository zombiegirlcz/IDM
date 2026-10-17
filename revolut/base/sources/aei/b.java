package aei;

import cli.g;
import cli.y;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.thresholds_breakdown.RevPointsPocketThresholdsBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements dli.b {
    public final y o;

    public b(c stateMapper, RevPointsPocketThresholdsBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.b(this, new a(inputData.f97827a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
