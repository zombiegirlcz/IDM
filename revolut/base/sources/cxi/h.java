package cxi;

import cli.n;
import cli.y;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.AirportLoungePassCheckoutEntriesScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import svi.i0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(AirportLoungePassCheckoutEntriesScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        i0 i0Var = inputData.f99067b;
        this.o = mra.d.b(this, new d(i0Var.f265921a, inputData.f99066a, i0Var), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
