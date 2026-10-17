package dii;

import cli.y;
import cli.z;
import com.revolut.biometric_verification.impl.ui.step.nfc.reader.v2.NfcReadingController;
import com.revolut.biometric_verification.impl.ui.step.nfc.reader.v2.NfcReadyToScanController;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends oki.h implements z {
    public final /* synthetic */ int o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f115073p;

    public m(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f115073p = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public void I1() {
        switch (this.o) {
            case 1:
                fii.g gVar = ((fii.a) ((j2) this.f115073p.f22677a).getValue()).f135423a;
                break;
        }
    }

    public void I2(n1 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C2(new fii.b(null, result));
    }

    @Override // cli.z
    public final cli.g getState() {
        switch (this.o) {
        }
        return this.f115073p;
    }

    public m(fii.g inputData, fii.h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f115073p = mra.d.b(this, new fii.a(inputData), stateMapper, null, false, 12);
    }

    public m(NfcReadingController nfcReadingController) {
        this.f115073p = mra.d.b(this, cli.k.f25028a, new hog.d(nfcReadingController, 1), null, false, 12);
    }

    public m(NfcReadyToScanController nfcReadyToScanController) {
        this.f115073p = mra.d.b(this, cli.k.f25028a, new hog.d(nfcReadyToScanController, 2), null, false, 12);
    }
}
