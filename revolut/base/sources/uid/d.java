package uid;

import cli.y;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends oki.h implements dli.b {
    public final y o;

    public d(BidCustomInputContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(Double.valueOf(inputData.f87129c), inputData.f87128b, inputData.d, inputData.e, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
