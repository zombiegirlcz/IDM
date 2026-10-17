package i57;

import cli.g;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.summary.FreelancerVatSummaryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements dli.b {
    public final y o;

    public c(FreelancerVatSummaryScreenContract$InputData inputData, e stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new b(inputData.f74446a, inputData.f74447b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
