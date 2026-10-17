package c2j;

import cli.g;
import cli.y;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.selector.SavingsSelectorScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends h implements dli.b {
    public final y o;

    public d(e stateMapper, SavingsSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new b(inputData.f99525a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
