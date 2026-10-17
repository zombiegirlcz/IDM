package ox5;

import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements b {
    public final cli.y o;

    public h(CryptoSortingPickerInputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f71514a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
