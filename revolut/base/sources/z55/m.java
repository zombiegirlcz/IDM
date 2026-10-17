package z55;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        t tVar = (t) this.receiver;
        KProperty[] kPropertyArr = LoanAccountDetailsScreen.Y;
        com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) tVar;
        LoanAccountDetailsScreenContract$InputData loanAccountDetailsScreenContract$InputData = aVar.f70353r;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!aVar.f70356w.O1(model)) {
            Object obj4 = model.u;
            String str = model.f53228a;
            if (obj4 instanceof ux4.d) {
                aVar.n2(new yv1.k(aVar, (ux4.d) obj4, null, 21), new whi.b(6));
            } else if (Intrinsics.f(str, "ID_REFINANCED_CREDITS")) {
                aVar.C1(new LoanKompotFeatureConfig.RefinancedCreditsListV2Destination(loanAccountDetailsScreenContract$InputData.f70343a));
            } else if (Intrinsics.f(str, "ID_BACKUP_CARD_ITEM") || Intrinsics.f(str, "ID_BACKUP_CARD_SETUP_ITEM")) {
                aVar.J2();
            } else if (Intrinsics.f(str, "ID_MORTGAGE_DOCUMENTS")) {
                aVar.C1(new LoanKompotFeatureConfig.DocumentsNavigationDestination(loanAccountDetailsScreenContract$InputData.f70343a));
            } else if (Intrinsics.f(str, "ID_PAYMENT_SETTINGS")) {
                aVar.C1(new LoanKompotFeatureConfig.PaymentManagementDestination(aVar.f70353r.f70343a));
            }
        }
        return Unit.f186387a;
    }
}
