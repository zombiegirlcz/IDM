package ycf;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogContract$InputData;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof scf.a)) {
            return null;
        }
        scf.a aVar = (scf.a) descriptor;
        return aVar.a(new TotalExchangeFeesDialogController(new TotalExchangeFeesDialogContract$InputData(aVar.f261745a, aVar.f261746b, aVar.f261747c)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
