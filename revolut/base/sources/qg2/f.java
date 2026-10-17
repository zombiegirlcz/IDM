package qg2;

import cli.n;
import cli.y;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.ConfirmedScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(ConfirmedScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f63014a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
