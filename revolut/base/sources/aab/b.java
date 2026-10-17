package aab;

import aii.o;
import aii.q;
import aii.r;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$OutputData;
import com.revolut.core.backend_flow.domain.model.PermissionFlowResult;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$OutputData;
import com.revolut.feature.card_add_to_googlepay.impl.credit_activation.GooglePayCreditActivationDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardRevPointsLockedDestination;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveBridgeDestination;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import d67.u;
import dii.f;
import dii.g;
import grl.b4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nqh.h;
import xu4.d;
import xu4.e;
import zh9.u0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2796a;

    public /* synthetic */ b(int i) {
        this.f2796a = i;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlow) {
        Object output;
        switch (this.f2796a) {
            case 0:
                int i = c.f2797a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                return;
            case 1:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapper");
                return;
            case 2:
                int i2 = ah3.a.f4878a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, ib.b.Flow);
                return;
            case 3:
                int i3 = ah3.a.f4878a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, ib.b.Flow);
                return;
            case 4:
                e output2 = (e) rVar;
                Intrinsics.checkNotNullParameter(output2, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                if (output2 instanceof d) {
                    o oVarL1 = wrapperFlow.l1();
                    Integer numValueOf = Integer.valueOf(b4.INVALID_PAYLOAD_VALUE);
                    CreditCardRevPointsLockedDestination.Companion companion = CreditCardRevPointsLockedDestination.INSTANCE;
                    String facilityId = ((d) output2).f308957a;
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    knm.b.j(oVarL1, new BridgeDestination(new FinishCommand(numValueOf, q0.c(new Pair("CREDIT_CARD_REV_POINTS_LOCKED_BRIDGE_ARGS", facilityId)), null, 4)));
                    return;
                }
                return;
            case 5:
                Intrinsics.checkNotNullParameter((qc4.e) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                knm.b.j(wrapperFlow.l1(), u0.b(new FinishCommand(null, null, null, 7)));
                return;
            case 6:
                pv3.b output3 = (pv3.b) rVar;
                Intrinsics.checkNotNullParameter(output3, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                if (!(output3 instanceof pv3.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((pv3.a) output3).f239976a)));
                return;
            case 7:
                AutoInvestMoveControllerApi$Result output4 = (AutoInvestMoveControllerApi$Result) rVar;
                int i5 = cwh.a.f109609a;
                Intrinsics.checkNotNullParameter(output4, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                o oVarL12 = wrapperFlow.l1();
                AutoInvestMoveBridgeDestination.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(output4, "output");
                knm.b.j(oVarL12, new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("AUTO_INVEST_MOVE_BRIDGE_ARG", output4)), null, 4)));
                return;
            case 8:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlow");
                return;
            case 9:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlow");
                return;
            case 10:
                s0i.c output5 = (s0i.c) rVar;
                int i6 = e1i.a.f121991a;
                Intrinsics.checkNotNullParameter(output5, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                wrapperFlow.I2(output5);
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(new FinishCommand(-1, r0.k(new Pair("ARG_HIGHEST_LIMIT", output5.f258959a), new Pair("ARG_LOWEST_LIMIT", output5.f258960b)), null, 4)));
                return;
            case 11:
                int i21 = e1i.a.f121991a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlow");
                return;
            case 12:
                FormPermissionFlowContract$OutputData result = (FormPermissionFlowContract$OutputData) rVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                o oVarL13 = wrapperFlow.l1();
                if (Intrinsics.f(result, FormPermissionFlowContract$OutputData.Skip.f51233a)) {
                    knm.b.j(oVarL13, new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("PERMISSION_FLOW_RESULT_KEY", PermissionFlowResult.Skipped.f51225a)), null, 4)));
                    return;
                } else {
                    if (!(result instanceof FormPermissionFlowContract$OutputData.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FormPermissionFlowContract$OutputData.Success success = (FormPermissionFlowContract$OutputData.Success) result;
                    knm.b.j(oVarL13, new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("PERMISSION_FLOW_RESULT_KEY", new PermissionFlowResult.Success(success.f51236c, success.f51234a, success.f51235b, success.d, success.e))), null, 4)));
                    return;
                }
            case 13:
                int i22 = fp5.a.f137048a;
                Intrinsics.checkNotNullParameter((u) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                wrapperFlow.J2();
                return;
            case 14:
                int i32 = h1a.b.f148486a;
                Intrinsics.checkNotNullParameter((com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.a) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                wrapperFlow.J2();
                return;
            case 15:
                g output6 = (g) rVar;
                Intrinsics.checkNotNullParameter(output6, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                if ((output6 instanceof dii.b) || (output6 instanceof dii.c) || (output6 instanceof dii.d)) {
                    output = null;
                } else if (output6 instanceof dii.e) {
                    output = GooglePayCreditActivationDestination.Result.ProceedWithGPay.f64470a;
                } else {
                    if (!(output6 instanceof f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    output = GooglePayCreditActivationDestination.Result.ContinueWithout.f64469a;
                }
                if (output == null) {
                    wrapperFlow.J2();
                    return;
                }
                o oVarL14 = wrapperFlow.l1();
                GooglePayCreditActivationDestination.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(output, "output");
                knm.b.j(oVarL14, new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("GPAY_CREDIT_ACTIVATION_ARG", output)), null, 4)));
                return;
            case 16:
                BarcodeReaderFlowContract$OutputData output7 = (BarcodeReaderFlowContract$OutputData) rVar;
                int i33 = hz.a.f156931a;
                Intrinsics.checkNotNullParameter(output7, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "model");
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("RESULT_DATA", output7)), null, 4)));
                return;
            case 17:
                q result2 = (q) rVar;
                Intrinsics.checkNotNullParameter(result2, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "flowModel");
                if (Intrinsics.f(result2, q.f5292a)) {
                    wrapperFlow.J2();
                    return;
                }
                return;
            case 18:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                return;
            case 19:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                return;
            case 20:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                return;
            case 21:
                Intrinsics.checkNotNullParameter((h) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                wrapperFlow.J2();
                return;
            case 22:
                int i43 = lfl.a.f195035a;
                Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "<unused var>");
                return;
            case 23:
                r result3 = (h15.c) rVar;
                int i59 = m15.b.f201235a;
                Intrinsics.checkNotNullParameter(result3, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                wrapperFlow.I2(result3);
                return;
            case 24:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapper");
                return;
            case 25:
                r output8 = (ste.o) rVar;
                Intrinsics.checkNotNullParameter(output8, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                wrapperFlow.I2(output8);
                return;
            case 26:
                int i66 = mx2.a.f210154a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, ib.b.Flow);
                return;
            case 27:
                int i74 = ni9.a.f215661a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, ib.b.Flow);
                return;
            case 28:
                int i92 = ni9.a.f215661a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, ib.b.Flow);
                return;
            default:
                int i96 = ni9.a.f215661a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, ib.b.Flow);
                return;
        }
    }

    public /* synthetic */ b(com.revolut.feature.card_add_to_googlepay.impl.credit_activation.a aVar) {
        this.f2796a = 15;
    }
}
