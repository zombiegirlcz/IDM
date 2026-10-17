package jt7;

import cli.n;
import cli.y;
import com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.CancellationConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements f {
    public final CancellationConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f178423p;

    public h(CancellationConfirmationScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f178423p = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f178423p;
    }
}
