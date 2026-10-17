package qg9;

import cli.y;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.FormNameScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(i stateMapper, FormNameScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new e(inputData.f78714a, inputData.f78715b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
