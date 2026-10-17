package cr8;

import aii.r;
import com.revolut.feature.junior_transfer.api.navigation.JuniorTransferKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import d67.p;
import d67.q;
import d67.s;
import d67.t;
import d67.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f108205b;

    public b(String walletId, boolean z) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f108204a = walletId;
        this.f108205b = z;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlowModel) {
        u result = (u) rVar;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
        CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new JuniorTransferKompotFeatureConfig.TopUp(this.f108204a, this.f108205b, null, 4)));
        if ((result instanceof p) || Intrinsics.f(result, q.f111462a) || Intrinsics.f(result, d67.r.f111463a)) {
            return;
        }
        if (Intrinsics.f(result, s.f111464a)) {
            knm.b.j(wrapperFlowModel.l1(), new BridgeDestination(compositeCommandC));
        } else {
            if (!Intrinsics.f(result, t.f111465a)) {
                throw new NoWhenBranchMatchedException();
            }
            wrapperFlowModel.B2();
        }
    }
}
