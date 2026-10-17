package nea;

import cli.y;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet.VirtualIbanBottomSheetScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends h implements f {
    public final y o;

    public g(VirtualIbanBottomSheetScreenContract$InputData inputData, a stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f80877b, inputData.f80876a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
