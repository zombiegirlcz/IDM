package q36;

import aii.p;
import aii.u;
import com.revolut.feature.defi.exchange.api.DeFiExchangeApi$Toggles$CryptoCeFiToDeFi;
import com.revolut.feature.defi.exchange.api.DeFiExchangeApi$Toggles$CryptoDeFiToCeFi;
import com.revolut.feature.defi.exchange.api.navigation.CeFiToDeFiDestination;
import com.revolut.feature.defi.exchange.api.navigation.DeFiExchangeDestination;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.CeFiToDeFiFlow;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.CeFiToDeFiFlowContract$InputData;
import com.revolut.feature.defi.exchange.impl.ui.flow.DeFiExchangeFlowContract$InputData;
import com.revolut.feature.defi.exchange.impl.ui.flow.DeFiExchangeFlowController;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wd6.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p, nte.a {
    @Override // nte.a
    public final List e() {
        return v.k(DeFiExchangeApi$Toggles$CryptoCeFiToDeFi.f71717c, DeFiExchangeApi$Toggles$CryptoDeFiToCeFi.f71718c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof DeFiExchangeDestination)) {
            if (destination instanceof CeFiToDeFiDestination) {
                return new CeFiToDeFiFlow(new CeFiToDeFiFlowContract$InputData(((CeFiToDeFiDestination) destination).f71719a));
            }
            return null;
        }
        DeFiExchangeDestination deFiExchangeDestination = (DeFiExchangeDestination) destination;
        e eVar = deFiExchangeDestination.f71720a;
        xi0.b bVar = deFiExchangeDestination.f71721b;
        return new DeFiExchangeFlowController(new DeFiExchangeFlowContract$InputData(null, h46.a.DEFAULT, deFiExchangeDestination.f71722c, eVar, bVar));
    }
}
