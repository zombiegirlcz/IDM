package vmb;

import cli.y;
import com.revolut.feature.retail.savings.impl.creation.presentation.info.tiered_limits.TieredLimitsInfoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(TieredLimitsInfoScreenContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f83334a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
