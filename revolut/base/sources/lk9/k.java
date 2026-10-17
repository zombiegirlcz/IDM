package lk9;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vi9.e0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) obj2;
        o oVar = (o) this.receiver;
        KProperty[] kPropertyArr = PayLaterRepaymentDetailsScreen.f78910k0;
        y yVar = (y) oVar;
        e0 e0Var = yVar.f196337s;
        j60.a aVar = yVar.u;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.f51787l;
        String str = model.f51781a;
        if (obj4 instanceof bi9.c) {
            aVar.x(e0Var.d("LATE_INTEREST_DIALOG_DELEGATES_KEY_PAY_LATER_REPAYMENT_DETAILS", ((bi9.c) obj4).f15448a));
        } else if (Intrinsics.f(str, "ID_FEE_AMOUNT_CELL")) {
            aVar.x(e0Var.b("FEE_DIALOG_PAY_LATER_REPAYMENT_DELEGATES_KEY", ((m) zi0.c.I(((n) yVar.t2()).f196316a)).f196314b));
        } else if (Intrinsics.f(str, "ID_INSTALLMENT_ROW")) {
            yVar.F1(new PayLaterKompotFeatureConfig.PlanDetailsNavigationDestination(yVar.f196334p.f78916a));
        }
        return Unit.f186387a;
    }
}
