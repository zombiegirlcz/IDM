package c3b;

import a2b.f;
import aii.r;
import aii.u;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.topup_screen.api.destination.CheckoutCustomAmountBridgeDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lxe.e;
import zh9.u0;
import zhm.q0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f20925b;

    public /* synthetic */ b(u uVar, int i) {
        this.f20924a = i;
        this.f20925b = uVar;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlowModel) {
        int i = this.f20924a;
        u uVar = this.f20925b;
        switch (i) {
            case 0:
                CfdTradingFeatureConfig.CfdTradingDestination cfdTradingDestination = (CfdTradingFeatureConfig.CfdTradingDestination) uVar;
                f result = (f) rVar;
                int i2 = c.f20926a;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                if (!Intrinsics.f(result, f.f724a)) {
                    throw new NoWhenBranchMatchedException();
                }
                knm.b.j(wrapperFlowModel.h1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((CfdTradingFeatureConfig.CfdRiskWarningFlowDestination) cfdTradingDestination).getF82137a())));
                return;
            default:
                e output = (e) rVar;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlow");
                knm.b.j(wrapperFlowModel.h1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair(((CheckoutCustomAmountBridgeDestination) uVar).getF90506c(), output.f())), null, 4)));
                return;
        }
    }
}
