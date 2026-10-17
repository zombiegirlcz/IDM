package s20;

import aw0.e;
import aw0.m6;
import aw0.n6;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2ScreenContract$ModalStep;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import s2e.h;
import s2g.z;
import s4f.k;
import s65.j;
import s65.m;
import w4l.f;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259237a;

    public /* synthetic */ c(int i) {
        this.f259237a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f259237a) {
            case 0:
                Throwable error = (Throwable) obj2;
                AgentInfo agentInfo = (AgentInfo) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (agentInfo == null) {
                    return error;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 2:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            case 3:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new h((List) defaultErrorItemsProvider.invoke(new iii.d(8, null, true, true, "STORE_BRAND_DETAIL_DISCOUNT_ERROR_STATE_ID")));
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return z.c();
            case 5:
                f DataObservableDelegate = (f) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 6:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List value = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(value, "value");
                throw null;
            case 7:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 8:
                Throwable th11 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th11;
                }
                return null;
            case 9:
                return Boolean.valueOf(((Boolean) obj2).booleanValue() && ((Boolean) obj3).booleanValue());
            case 10:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "error");
                return null;
            case 12:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "error");
                return null;
            case 14:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 15:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), new lw0.a(new TextLocalisedClause(R$string.wealth_screen_trade_cfds_title, null, null, 14), null, null, null, false, 30));
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 17:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return k.f259860a;
            case 20:
                Throwable error3 = (Throwable) obj2;
                wi0.b bVar = (wi0.b) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bVar == null) {
                    return error3;
                }
                return null;
            case 21:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 22:
                Throwable error4 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool2 == null) {
                    return error4;
                }
                return null;
            case 23:
                Throwable error5 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list == null) {
                    return error5;
                }
                return null;
            case 24:
                Throwable error6 = (Throwable) obj2;
                Boolean bool3 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool3 == null) {
                    return error6;
                }
                return null;
            case 25:
                Throwable error7 = (Throwable) obj2;
                i iVar = (i) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (iVar == null) {
                    return error7;
                }
                return null;
            case 26:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                LoanSelectNewRepaymentDayV2ScreenContract$ModalStep step = (LoanSelectNewRepaymentDayV2ScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof LoanSelectNewRepaymentDayV2ScreenContract$ModalStep.ShowNewAmountExplainer) {
                    return dy4.a.a(ActionsBottomSheetController.INSTANCE, new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_change_payday_explainer_new_amount_title, null, null, 14), ((LoanSelectNewRepaymentDayV2ScreenContract$ModalStep.ShowNewAmountExplainer) step).f70410a, null, null, false, 28), new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_change_payday_explainer_new_amount_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_change_payday_summary_new_repayment_amount_description, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10));
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new m(j.f260141a, false, false, (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)));
            case 28:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return hx7.a.p(getDefaultErrorItems6);
            default:
                Throwable th12 = (Throwable) obj2;
                if (((k6d.j) obj3) == null) {
                    return th12;
                }
                return null;
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f259237a = i;
    }
}
