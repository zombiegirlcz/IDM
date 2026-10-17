package v66;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.defi.trade.api.navigation.DefiTradeDestination;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerContract$InputData;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerScreen;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeContract$InputData;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof r66.b)) {
            return null;
        }
        r66.b bVar = (r66.b) descriptor;
        return bVar.a(new DeFiAssetPickerScreen(new DeFiAssetPickerContract$InputData(bVar.f251646a, bVar.f251647b, bVar.f251648c, bVar.d)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DefiTradeDestination) {
            return new DefiTradeScreen(new DefiTradeContract$InputData(((DefiTradeDestination) destination).f71879a));
        }
        return null;
    }
}
