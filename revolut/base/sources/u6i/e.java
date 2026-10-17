package u6i;

import cli.y;
import com.revolut.feature_move_money.impl.amount.order_options.OrderOptionsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(OrderOptionsScreenContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f97303a, inputData.f97304b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
