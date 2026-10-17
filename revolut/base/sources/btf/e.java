package btf;

import cli.g;
import cli.y;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.AdditionalInfoDropdownSelectionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(f stateMapper, AdditionalInfoDropdownSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f92384a, inputData.f92386c, inputData.f92385b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
