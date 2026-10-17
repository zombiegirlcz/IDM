package v1c;

import aii.q;
import aii.r;
import aii.v;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$BridgeDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$OutputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pi6.l;
import pi6.m;
import pi6.n;
import wgb.j;
import zh9.u0;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285290a;

    public /* synthetic */ c(int i) {
        this.f285290a = i;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlow) {
        switch (this.f285290a) {
            case 0:
                RevPointsSpareChangeControllerApi$Result output = (RevPointsSpareChangeControllerApi$Result) rVar;
                int i = d.f285291a;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(output, "output");
                RevPointsSpareChangeControllerApi$BridgeDestination.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(output, "output");
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("REV_POINTS_SPARE_CHANGE_BRIDGE_ARGS", output)), null, 4)));
                return;
            case 1:
                n result = (n) rVar;
                int i2 = vf6.b.f288527a;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                wrapperFlow.J2();
                if (result instanceof l) {
                    wrapperFlow.l1().M0(new v(u0.c(((l) result).f236448a)));
                    return;
                } else {
                    if (!(result instanceof m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wrapperFlow.l1().M0(new v(new ExternalDestination.Browser(((m) result).f236449a, null)));
                    return;
                }
            case 2:
                Intrinsics.checkNotNullParameter((j) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapper");
                wrapperFlow.J2();
                return;
            case 3:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapper");
                return;
            case 4:
                Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "<unused var>");
                return;
            case 5:
                int i3 = wj2.a.f297954a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                return;
            case 6:
                int i5 = wj2.a.f297954a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                return;
            case 7:
                AddressFlowContract$OutputData result2 = (AddressFlowContract$OutputData) rVar;
                Intrinsics.checkNotNullParameter(result2, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("ADDRESS_FLOW_RESULT", result2)), null, 4)));
                return;
            case 8:
                int i6 = xkd.a.f306660a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, ib.b.Flow);
                return;
            case 9:
                int i21 = xkd.a.f306660a;
                Intrinsics.checkNotNullParameter((kkd.d) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "flow");
                wrapperFlow.J2();
                return;
            case 10:
                hub.b result3 = (hub.b) rVar;
                Intrinsics.checkNotNullParameter(result3, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                wrapperFlow.I2(result3);
                return;
            case 11:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlow");
                return;
            case 12:
                Intrinsics.checkNotNullParameter((uul.a) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                wrapperFlow.J2();
                return;
            case 13:
                InvestAccountSelectorContract$OutputData output2 = (InvestAccountSelectorContract$OutputData) rVar;
                Intrinsics.checkNotNullParameter(output2, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("RESULT_KEY", output2)), null, 4)));
                return;
            case 14:
                Intrinsics.checkNotNullParameter((atl.b) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                wrapperFlow.J2();
                return;
            default:
                Intrinsics.checkNotNullParameter((ldf.b) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wf");
                wrapperFlow.J2();
                return;
        }
    }
}
