package uok;

import cli.y;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error.WaitlistErrorScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends oki.h implements dli.b {
    public final y o;

    public f(h stateMapper, WaitlistErrorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f103696a, inputData.f103697b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
