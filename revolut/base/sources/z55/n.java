package z55;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) obj2;
        t tVar = (t) this.receiver;
        KProperty[] kPropertyArr = LoanAccountDetailsScreen.Y;
        com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) tVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51822a;
        if (Intrinsics.f(str, "ID_GET_HELP")) {
            aVar.f70356w.O(aVar.v.a((q35.t) zi0.c.I(aVar.I2())));
        } else if (Intrinsics.f(str, "ID_REFURBISHMENT_REQUEST_FUNDS")) {
            aVar.C1(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.ACCOUNT_DETAILS, new ft3.d0(aVar.f70353r.f70343a, gt3.e.REFURBISHMENT), null, null, null, null, 16376))));
        }
        return Unit.f186387a;
    }
}
