package z55;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
        t tVar = (t) this.receiver;
        KProperty[] kPropertyArr = LoanAccountDetailsScreen.Y;
        com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) tVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "ID_REPAYMENT_METHODS_SUBHEADER")) {
            aVar.n2(new yzb.c(aVar, null, 2), new whi.b(6));
        } else if (Intrinsics.f(str, "ID_MANAGE_REPAYMENTS_SUBHEADER")) {
            aVar.C1(new LoanKompotFeatureConfig.PaymentManagementDestination(aVar.f70353r.f70343a));
        }
        return Unit.f186387a;
    }
}
