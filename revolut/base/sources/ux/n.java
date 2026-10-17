package ux;

import cli.y;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$OutputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import up2.q;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends oki.h implements g {
    public final xv.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xv.c f283716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f283717q;

    public n(xv.h cameraKitDetector, xv.c cameraCoreDelegate, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(cameraKitDetector, "cameraKitDetector");
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = cameraKitDetector;
        this.f283716p = cameraCoreDelegate;
        this.f283717q = mra.d.b(this, new c(xv.a.DISABLED), stateMapper, null, false, 12);
    }

    public final void I2(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, d.f283707a)) {
            C2(BarcodeReaderFlowContract$OutputData.ActionButtonClicked.f50755a);
        } else {
            if (!Intrinsics.f(event, e.f283708a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f283716p.k();
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.o.a(), null, new l(this, null), 3);
        yji.l.b1(this, this.f283716p.a(), null, new q(this, null, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f283717q;
    }
}
