package qb2;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.additionalinfo.AdditionalInfoDialogScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements b {
    public final y o;

    public c(n stateMapper, AdditionalInfoDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new a(inputData.f62751a, inputData.f62752b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
