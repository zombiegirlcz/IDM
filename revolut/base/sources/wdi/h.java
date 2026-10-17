package wdi;

import cli.n;
import cli.y;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(n stateMapper, RevPointsPocketDowngradeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, e.f296560a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
