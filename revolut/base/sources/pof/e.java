package pof;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemLoadingDelegateModel;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$DepositLimitsReachedException;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlowContract$Step;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.overview.GoalsOverviewScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.overview.BudgetOverviewController;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlow;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.i4;
import nel.n;
import pp4.o;
import pp4.q;
import psk.j;
import yki.l;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237982a;

    public /* synthetic */ e(int i) {
        this.f237982a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        SetBudgetsFlowContract$InputData updateOverallBudget;
        int i = this.f237982a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                StatementUrlState statementUrlState = (StatementUrlState) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (statementUrlState == null) {
                    return error;
                }
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new o(new TextLocalisedClause(R$string.additional_cards_details_sections_cardholders_title, null, null, 14), (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), q.a());
            case 2:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new pp6.c(u.c(new SmallActionButtonDelegate.Model("RATE_ERROR_BUTTON_ID", h4.ACCENT, null, null, new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_retry, null, null, 14), null, new i4(), null, null, 0, 0, 0, 0, 32600)), new lw0.a(new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_error_network_connection_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_error_network_connection_description, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), null, false, 24));
            case 3:
                Throwable error2 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (fVar == null) {
                    return error2;
                }
                return null;
            case 4:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof pq0.a);
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof IconSelectorDelegate.SelectableIconModel);
            case 6:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SpinnerPickerItemDelegateModel);
            case 7:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SpinnerPickerItemLoadingDelegateModel);
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SuggestionDelegate.b);
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof pq0.o);
            case 10:
                Function1 defaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 11:
                Function1 defaultFactory = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, false, false, null));
            case 12:
                Throwable error3 = (Throwable) obj2;
                pqg.q qVar = (pqg.q) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                IllegalStateException illegalStateException = new IllegalStateException() { // from class: com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$FailToLoadDataException

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f83148a = "Could not load data";

                    public final boolean equals(Object obj3) {
                        if (this == obj3) {
                            return true;
                        }
                        return (obj3 instanceof SavingsErrorHandlingApi$FailToLoadDataException) && Intrinsics.f(this.f83148a, ((SavingsErrorHandlingApi$FailToLoadDataException) obj3).f83148a);
                    }

                    @Override // java.lang.Throwable
                    public final String getMessage() {
                        return this.f83148a;
                    }

                    public final int hashCode() {
                        String str = this.f83148a;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }
                };
                if (!(error3 instanceof SavingsServerErrorContract$DepositLimitsReachedException) && !(error3 instanceof ServerErrorException)) {
                    error3 = illegalStateException;
                }
                if (qVar == null) {
                    return error3;
                }
                return null;
            case 13:
                Throwable error4 = (Throwable) obj2;
                SavingsProductData savingsProductData = (SavingsProductData) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (savingsProductData == null) {
                    return error4;
                }
                return null;
            case 14:
                Throwable error5 = (Throwable) obj2;
                npg.b bVar = (npg.b) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bVar == null) {
                    return error5;
                }
                return null;
            case 15:
                Throwable th10 = (Throwable) obj2;
                if (((List) data) == null) {
                    return th10;
                }
                return null;
            case 16:
                Throwable th11 = (Throwable) data;
                if (((Boolean) obj2).booleanValue() || th11 != null) {
                    return null;
                }
                throw new NoSuchElementException("Received no terms");
            case 17:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                if (zBooleanValue) {
                    return null;
                }
                return iVar;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 19:
                Throwable th12 = (Throwable) data;
                if (((Boolean) obj2).booleanValue() || th12 != null) {
                    return null;
                }
                throw new NoSuchElementException("Received no accepted terms");
            case 20:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                if (zBooleanValue2) {
                    return null;
                }
                return iVar;
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 23:
                l FlowCoordinator = (l) obj2;
                BudgetingFlowContract$Step step = (BudgetingFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof BudgetingFlowContract$Step.Overview) {
                    return new BudgetOverviewController(new GoalsOverviewScreenContract$InputData(((BudgetingFlowContract$Step.Overview) step).f101510a));
                }
                if (!(step instanceof BudgetingFlowContract$Step.EditBudgetFlow)) {
                    if (step instanceof BudgetingFlowContract$Step.CreateBudgetFlow) {
                        return new SetBudgetsFlow(new SetBudgetsFlowContract$InputData.SetBudget(((BudgetingFlowContract$Step.CreateBudgetFlow) step).f101506a, true));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                BudgetingFlowContract$Step.EditBudgetFlow editBudgetFlow = (BudgetingFlowContract$Step.EditBudgetFlow) step;
                com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.c cVar = editBudgetFlow.f101509c;
                AccountId accountId = editBudgetFlow.f101508b;
                dj0.d dVar = editBudgetFlow.f101507a;
                int i2 = com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.d.f101516a[cVar.ordinal()];
                if (i2 == 1) {
                    updateOverallBudget = new SetBudgetsFlowContract$InputData.UpdateOverallBudget(dVar, accountId, true);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    updateOverallBudget = new SetBudgetsFlowContract$InputData.SetCategoriesBudget(dVar, accountId, true, true);
                }
                return new SetBudgetsFlow(updateOverallBudget);
            case 24:
                j.a aVar = psk.j.Companion;
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 25:
                Throwable error6 = (Throwable) obj2;
                tsl.f fVar2 = (tsl.f) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (fVar2 == null) {
                    return error6;
                }
                return null;
            case 26:
                Throwable error7 = (Throwable) obj2;
                Optional optional = (Optional) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (optional == null) {
                    return error7;
                }
                return null;
            case 27:
                Throwable th13 = (Throwable) obj2;
                if (((n) data) == null) {
                    return th13;
                }
                return null;
            case 28:
                Throwable th14 = (Throwable) obj2;
                if (((tsl.j) data) == null) {
                    return th14;
                }
                return null;
            default:
                Throwable th15 = (Throwable) obj2;
                if (((tsl.j) data) == null) {
                    return th15;
                }
                return null;
        }
    }

    public /* synthetic */ e(Object obj2, int i) {
        this.f237982a = i;
    }
}
