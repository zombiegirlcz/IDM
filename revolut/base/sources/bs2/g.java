package bs2;

import cli.n;
import cli.y;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed.MerchantBlockDisallowedControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements a {
    public final y o;

    public g(n stateMapper, MerchantBlockDisallowedControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        kr2.c cVar = inputData.f64243b;
        this.o = mra.d.b(this, cVar != null ? new b(cVar) : new c(inputData.f64242a, inputData.f64244c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
