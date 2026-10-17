package mg1;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.add_card_to_google_pay_shared.impl.add_to_google.AddToGooglePayBottomSheetControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends h implements b {
    public final y o;

    public d(AddToGooglePayBottomSheetControllerContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f60865a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
