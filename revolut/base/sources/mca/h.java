package mca;

import cli.n;
import cli.y;
import com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.PixApmRecipientWarningContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements dli.b {
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f204336p;

    public h(n stateMapper, PixApmRecipientWarningContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f204336p = mra.d.b(this, new a(inputData.f80759a, inputData.f80760b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void P1() {
        if (this.o) {
            return;
        }
        this.o = true;
        C2(b.f204331a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f204336p;
    }
}
