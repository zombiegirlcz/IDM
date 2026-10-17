package og2;

import cli.y;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements dli.b {
    public final kgm.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f225006p;

    public m(ConfirmationScreenContract$InputData inputData, kgm.i upiMandateInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(upiMandateInteractor, "upiMandateInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = upiMandateInteractor;
        this.f225006p = mra.d.b(this, new d(zi0.c.P(inputData.f63013a, false, null, 3)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f225006p;
    }
}
