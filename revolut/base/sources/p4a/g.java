package p4a;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreenContract$Step;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.additionalinfo.AdditionalInfoDialogScreen;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.additionalinfo.AdditionalInfoDialogScreenContract$InputData;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotDestination;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p7f.n;
import whf.p;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232869a;

    public /* synthetic */ g(int i) {
        this.f232869a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f232869a) {
            case 0:
                Throwable error = (Throwable) obj2;
                qla.a aVar = (qla.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(8, null, true, true, "ERROR_ACQUIRING_CP_PRICING_LIST_ID"));
            case 2:
                Throwable error2 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (iVar == null) {
                    return error2;
                }
                return null;
            case 3:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 5:
                Throwable error3 = (Throwable) obj2;
                LoanKompotFeatureConfig.ManageRepaymentsDestination manageRepaymentsDestination = (LoanKompotFeatureConfig.ManageRepaymentsDestination) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (manageRepaymentsDestination == null) {
                    return error3;
                }
                return null;
            case 6:
                Throwable error4 = (Throwable) obj2;
                LoanKompotDestination loanKompotDestination = (LoanKompotDestination) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (loanKompotDestination == null) {
                    return error4;
                }
                return null;
            case 7:
                Throwable error5 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (fVar == null) {
                    return error5;
                }
                return null;
            case 8:
                Throwable error6 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list == null) {
                    return error6;
                }
                return null;
            case 9:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 10:
                Throwable error7 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (iVar2 == null) {
                    return error7;
                }
                return null;
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 12:
                Throwable error8 = (Throwable) obj2;
                OnboardingTerms onboardingTerms = (OnboardingTerms) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (onboardingTerms == null) {
                    return error8;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return e6a.b.a((Throwable) obj2);
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                Throwable error9 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list2 == null) {
                    return error9;
                }
                return null;
            case 16:
                Throwable error10 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list3 == null) {
                    return error10;
                }
                return null;
            case 17:
                Throwable error11 = (Throwable) obj2;
                SavingsProduct savingsProduct = (SavingsProduct) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (savingsProduct == null) {
                    return error11;
                }
                return null;
            case 18:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 20:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new n(new p7f.k(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.wealth_robo_investor_update_strategy_report_title, null, null, 14)), (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)));
            case 21:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(6, "TacticalAllocationsControllerContract", true, false, null));
            case 22:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new pa8.k((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), pa8.g.f234441a);
            case 23:
                Throwable error12 = (Throwable) obj2;
                p pVar = (p) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (pVar == null) {
                    return error12;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PayToConfirmationScreenContract$Step step = (PayToConfirmationScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof PayToConfirmationScreenContract$Step.AdditionalInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                PayToConfirmationScreenContract$Step.AdditionalInfo additionalInfo = (PayToConfirmationScreenContract$Step.AdditionalInfo) step;
                return new AdditionalInfoDialogScreen(new AdditionalInfoDialogScreenContract$InputData(additionalInfo.f62749a, additionalInfo.f62750b));
            case 26:
                Throwable error13 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (list4 == null) {
                    return error13;
                }
                return null;
            case 27:
                Throwable error14 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (list5 == null) {
                    return error14;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Throwable error15 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (list6 == null) {
                    return error15;
                }
                return null;
        }
    }

    public /* synthetic */ g(cli.n nVar, int i) {
        this.f232869a = i;
    }
}
