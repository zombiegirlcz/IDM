package y7i;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$OutputData;
import com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode;
import com.revolut.feature_move_money.impl.automation.flow.MoveMoneyAutomationFlowContract$InputData;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step;
import com.revolut.feature_move_money.impl.flow.delegate.QuoteLoadingException;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.flow.e f311523b;

    public /* synthetic */ c(com.revolut.feature_move_money.impl.flow.e eVar, int i) {
        this.f311522a = i;
        this.f311523b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f311522a) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                boolean z = false;
                if (throwable instanceof QuoteLoadingException) {
                    this.f311523b.X1(new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                MoveAmountScreenContract$OutputData result = (MoveAmountScreenContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z3 = result instanceof MoveAmountScreenContract$OutputData.ExecuteMoveMoney;
                com.revolut.feature_move_money.impl.flow.e eVar = this.f311523b;
                if (z3) {
                    MoveAmountScreenContract$OutputData.ExecuteMoveMoney executeMoveMoney = (MoveAmountScreenContract$OutputData.ExecuteMoveMoney) result;
                    String str = executeMoveMoney.f97279b;
                    MoveMoneyOrderInfo moveMoneyOrderInfo = executeMoveMoney.f97278a;
                    Action action = eVar.f97391p.f104833a;
                    eVar.K2(str, new MoveMoneyFlowContract$MoveMoneyProcessState(moveMoneyOrderInfo, action instanceof Action.MoveMoney ? ((Action.MoveMoney) action).f104819c : action instanceof Action.MoveMoneyWithAccountPair ? ((Action.MoveMoneyWithAccountPair) action).e : action instanceof Action.Topup ? ((Action.Topup) action).e : true, 56));
                } else {
                    if (!(result instanceof MoveAmountScreenContract$OutputData.OpenAutomationScreen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MoveAmountScreenContract$OutputData.OpenAutomationScreen openAutomationScreen = (MoveAmountScreenContract$OutputData.OpenAutomationScreen) result;
                    oki.h.u2(eVar, eVar.A, new MoveMoneyFlowContract$Step.Automation(new MoveMoneyAutomationFlowContract$InputData(new AutomationLaunchMode.NewAutomation(openAutomationScreen.f97281b, openAutomationScreen.f97282c, openAutomationScreen.f97280a))), null, 6);
                }
                return Unit.f186387a;
            case 2:
                a7i.d result2 = (a7i.d) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof a7i.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f311523b.K2("MOVE_MONEY_AUTOMATION_CTA_BUTTON_TAG", new MoveMoneyFlowContract$MoveMoneyProcessState(((a7i.c) result2).f1909a, false, 60));
                return Unit.f186387a;
            default:
                dpf.c result3 = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean zF = Intrinsics.f(result3, dpf.a.f116875a);
                com.revolut.feature_move_money.impl.flow.e eVar2 = this.f311523b;
                if (zF) {
                    oki.h.D2(eVar2.A);
                } else {
                    if (!(result3 instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i iVar = eVar2.A;
                    TransferScheduleData transferScheduleData = ((dpf.b) result3).f116876a;
                    Action action2 = eVar2.f97391p.f104833a;
                    boolean z4 = action2 instanceof Action.AddNewScheduledPayment;
                    Action.AddNewScheduledPayment addNewScheduledPayment = z4 ? (Action.AddNewScheduledPayment) action2 : null;
                    Long l2 = addNewScheduledPayment != null ? addNewScheduledPayment.f104812b : null;
                    Action.AddNewScheduledPayment addNewScheduledPayment2 = z4 ? (Action.AddNewScheduledPayment) action2 : null;
                    oki.h.t2(eVar2, iVar, new MoveMoneyFlowContract$Step.MoveAmount(new MoveAmountScreenContract$InputData.AddNewScheduledPayment(addNewScheduledPayment2 != null ? addNewScheduledPayment2.f104811a : null, transferScheduleData, l2)), true, null, false, 12);
                }
                return Unit.f186387a;
        }
    }
}
