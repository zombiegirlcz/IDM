package cke;

import cli.y;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.picker.CryptoAccountPickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(j mapper, CryptoAccountPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new e(inputData.f89823a, inputData.f89824b), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
