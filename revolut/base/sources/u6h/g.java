package u6h;

import cli.y;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info.MarginStatusInfoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(j stateMapper, MarginStatusInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f95478a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
