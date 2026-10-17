package vu4;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.revpoints.CreditCardRevPointsMigrationBottomDialogScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(CreditCardRevPointsMigrationBottomDialogScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f69627b, inputData.f69626a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
