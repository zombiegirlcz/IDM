package u22;

import cli.y;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.select_account.ApmSelectAccountContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends h implements a {
    public final y o;

    public e(g stateMapper, ApmSelectAccountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new b(inputData.f62356a, null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
