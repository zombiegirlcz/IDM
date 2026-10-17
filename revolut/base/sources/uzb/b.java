package uzb;

import cli.g;
import cli.k;
import cli.y;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements a {
    public final y o;

    public b(c stateMapper, RevPointsExpiryDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
