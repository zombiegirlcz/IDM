package qm2;

import aii.r;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import em2.g;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements qii.a {
    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlowModel) {
        g result = (g) rVar;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
        knm.b.j(wrapperFlowModel.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("ARG_SELECTED_BACKGROUND", result.f127587a)), null, 4)));
    }
}
