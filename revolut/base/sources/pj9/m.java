package pj9;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreen;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionContract$ModalStep;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$ModalStep;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pmk.q;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236717a;

    public /* synthetic */ m(int i) {
        this.f236717a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f236717a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(o.a());
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(o.a());
            case 2:
                return Integer.valueOf(((((qv0.i) obj2) instanceof hg) && (((qv0.i) obj3) instanceof ActionWidgetDelegate.Model)) ? -1 : 1);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 5:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, true, 0, 0, 31684);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 7:
                Throwable error = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (nVar == null) {
                    return error;
                }
                return null;
            case 8:
                Throwable error2 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (iVar == null) {
                    return error2;
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 11:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List stats = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(stats, "stats");
                throw new NoWhenBranchMatchedException();
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 13:
                Throwable error3 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool == null) {
                    return error3;
                }
                return null;
            case 14:
                Throwable error4 = (Throwable) obj2;
                WealthAccount wealthAccount = (WealthAccount) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (wealthAccount == null) {
                    return error4;
                }
                return null;
            case 15:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 16:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SavingsProductSelectionContract$ModalStep step = (SavingsProductSelectionContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof SavingsProductSelectionContract$ModalStep.SavingsCalculator) {
                    return new SavingsCalculatorScreen(new SavingsCalculatorScreenContract$InputData(((SavingsProductSelectionContract$ModalStep.SavingsCalculator) step).f83328a));
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 18:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanSummaryScreenContract$ModalStep step2 = (EsimMobilePlanSummaryScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof EsimMobilePlanSummaryScreenContract$ModalStep.IncludedCountries) {
                    return new EsimCountryPickerScreen(new EsimCountryPickerScreenContract$InputData.DisplayCountries(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_details_included_countries_title, null, null, 14), null, ((EsimMobilePlanSummaryScreenContract$ModalStep.IncludedCountries) step2).f101407a.f100208a));
                }
                if (!(step2 instanceof EsimMobilePlanSummaryScreenContract$ModalStep.PerkInfoBottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimMobilePlanSummaryScreenContract$ModalStep.PerkInfoBottomSheet perkInfoBottomSheet = (EsimMobilePlanSummaryScreenContract$ModalStep.PerkInfoBottomSheet) step2;
                return new EsimInfoBottomSheetScreen(new EsimInfoBottomSheetScreenContract$InputData(perkInfoBottomSheet.f101409b, perkInfoBottomSheet.f101408a));
            case 19:
                Throwable th10 = (Throwable) obj2;
                if (((lha.g) obj3) == null) {
                    return th10;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new q(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_manage_screen_billing_title, null, null, 14), f0.f322471a);
            case 21:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new pn6.i((List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)), false);
            case 22:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 23:
                Throwable error5 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar2 == null) {
                    return error5;
                }
                return null;
            case 24:
                Throwable th11 = (Throwable) obj2;
                if (((StatementUrlState) obj3) == null) {
                    return th11;
                }
                return null;
            case 25:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new pnh.q((List) getDefaultErrorItems6.invoke(new iii.d(14, null, false, false, null)), pnh.o.f237794a);
            case 26:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new iii.d(12, null, true, true, null));
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 28:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return new poe.i((List) getDefaultErrorItems8.invoke(new iii.d(14, null, true, false, null)), false);
            default:
                Throwable error6 = (Throwable) obj2;
                StatementUrlState statementUrlState = (StatementUrlState) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (statementUrlState == null) {
                    return error6;
                }
                return null;
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f236717a = i;
    }
}
