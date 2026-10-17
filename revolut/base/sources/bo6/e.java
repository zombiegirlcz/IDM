package bo6;

import cli.g;
import cli.y;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection.ExpirationSelectionBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(f stateMapper, ExpirationSelectionBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new a(inputData.f73066b, inputData.f73065a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
