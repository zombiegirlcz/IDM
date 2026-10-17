package nni;

import cli.y;
import com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(OtpResendMethodsBottomSheetContract$InputData inputData, f stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(inputData.f98508a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
