package ft;

import cli.y;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.impl.ui.step.document.document_picker.BiometricVerificationDocumentSelectionScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes17.dex */
public final class m extends oki.h implements k {
    public final y o;

    public m(BiometricVerificationDocumentSelectionScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new f(null, inputData.f50540a), stateMapper, null, false, 12);
    }

    public final void I2(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof g;
        y yVar = this.o;
        if (!z) {
            if (!(event instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new fs2.k(event, 2));
        } else {
            BiometricVerificationDocument biometricVerificationDocument = ((f) ((j2) yVar.f22677a).getValue()).f137746b;
            if (biometricVerificationDocument == null) {
                return;
            }
            C2(new j(biometricVerificationDocument));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
