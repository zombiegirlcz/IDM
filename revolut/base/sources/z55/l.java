package z55;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInsurancePolicyData;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInsuranceState;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.mappers.LoanRepaymentDetailsSectionMapper$RepaymentFromParcel;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.RepaymentDayParcel;
import com.revolut.feature.insurance_credit.api.navigation.Facility;
import com.revolut.feature.insurance_credit.api.navigation.InsuranceCreditNavigationDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.a1;
import ft3.f0;
import grl.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.a implements Function2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) obj2;
        t tVar = (t) this.receiver;
        KProperty[] kPropertyArr = LoanAccountDetailsScreen.Y;
        com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) tVar;
        LoanAccountDetailsScreenContract$InputData loanAccountDetailsScreenContract$InputData = aVar.f70353r;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.f51787l;
        if (obj4 instanceof LoanRepaymentDetailsSectionMapper$RepaymentFromParcel) {
            aVar.n2(new x(aVar, ((LoanRepaymentDetailsSectionMapper$RepaymentFromParcel) obj4).f70359a, null), new whi.b(6));
        }
        String str = model.f51781a;
        switch (str.hashCode()) {
            case -2141133105:
                if (str.equals("ID_INSURANCE_ACTIVE")) {
                    Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.credit.loan.api.models.rev10.LoanInsuranceState.Insured");
                    d8l.d.t(aVar, u0.f(new InsuranceCreditNavigationDestination(new Facility.Loan(loanAccountDetailsScreenContract$InputData.f70343a), ((LoanInsurancePolicyData) zhm.d0.b0(((LoanInsuranceState.Insured) obj4).f70163a)).f70159a, null)));
                }
                break;
            case -1160364059:
                if (str.equals("ID_CHANGE_REPAYMENT_DAY")) {
                    aVar.C1(new LoanKompotFeatureConfig.ChangeRepaymentDayFlowNavigationDestination(loanAccountDetailsScreenContract$InputData.f70343a));
                }
                break;
            case 1137664617:
                if (str.equals("ID_REPAYMENT_DAY_PENDING_INFO")) {
                    Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.RepaymentDayParcel");
                    aVar.K2(new LoanAccountDetailsScreenContract$ModalStep.RepaymentDayExplainer(((RepaymentDayParcel) obj4).f70387a));
                }
                break;
            case 1417138016:
                if (str.equals("ID_INSURANCE_ELIGIBLE")) {
                    d8l.d.t(aVar, new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.ACCOUNT_DETAILS, null, null, null, null, 30), new f0(loanAccountDetailsScreenContract$InputData.f70343a), null, null, null, null, null, null, null, null, 2044)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
