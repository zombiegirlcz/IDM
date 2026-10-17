package xs2;

import cli.n;
import cli.y;
import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(n stateMapper, EligibilityCriteriaScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f64342a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
