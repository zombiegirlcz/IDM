package z55;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.credit.loan.api.mapper.LoanInterestRateTypeInfo;
import com.revolut.feature.credit.loan.api.mapper.LoanStampDutyParcel;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
        t tVar = (t) this.receiver;
        KProperty[] kPropertyArr = LoanAccountDetailsScreen.Y;
        com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) tVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.o;
        if (obj4 instanceof LoanStampDutyParcel) {
            aVar.K2(new LoanAccountDetailsScreenContract$ModalStep.RepaymentStampDutyExplainer(((LoanStampDutyParcel) obj4).f70073a));
        } else if (obj4 instanceof LoanInterestRateTypeInfo) {
            aVar.K2(new LoanAccountDetailsScreenContract$ModalStep.InterestRateTypeExplainer((LoanInterestRateTypeInfo) obj4));
        } else {
            aVar.K2(new LoanAccountDetailsScreenContract$ModalStep.RepaymentAmountExplainer(model.f51832a));
        }
        return Unit.f186387a;
    }
}
