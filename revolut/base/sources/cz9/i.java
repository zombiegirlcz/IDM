package cz9;

import cli.y;
import com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.SendFromClipboardSelectionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements g {
    public final y o;

    public i(k stateMapper, SendFromClipboardSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new e(inputData.f79713a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
