package yx2;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.card_design.impl.card_design.rev_points_price_breakdown.RevPointsPriceBreakdownControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends h implements dli.b {
    public final y o;

    public c(n stateMapper, RevPointsPriceBreakdownControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new b(inputData.f64734a, inputData.f64735b, inputData.f64736c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
