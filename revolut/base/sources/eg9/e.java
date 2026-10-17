package eg9;

import a3e.u;
import cli.g;
import cli.y;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details.SectionDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(u stateMapper, SectionDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f78705a, inputData.f78706b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
