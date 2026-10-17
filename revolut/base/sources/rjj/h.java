package rjj;

import cli.k;
import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends oki.h implements f {
    public final y o;

    public h(n stateMapper, EsimMobilePlanChooseNumberScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
