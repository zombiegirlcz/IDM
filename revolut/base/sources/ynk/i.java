package ynk;

import cli.y;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_status.StudentStatusScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends oki.h implements f {
    public final y o;

    public i(h stateMapper, StudentStatusScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f103643a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
