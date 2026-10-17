package zsf;

import cli.n;
import cli.y;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.AdditionalInfoDisclosureScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements e {
    public final y o;

    public g(n stateMapper, AdditionalInfoDisclosureScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f92383a.f92416b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
