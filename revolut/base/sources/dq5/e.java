package dq5;

import at.r;
import cli.g;
import cli.y;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.recipienttypedialog.CryptoRecipientTypeDialogControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(r stateMapper, CryptoRecipientTypeDialogControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f71242a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
