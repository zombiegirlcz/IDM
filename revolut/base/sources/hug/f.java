package hug;

import cli.y;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.backend_reason.AccountClosureBackendReasonScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(g stateMapper, AccountClosureBackendReasonScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f94925a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
