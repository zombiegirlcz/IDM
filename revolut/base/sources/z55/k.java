package z55;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) obj2;
        t tVar = (t) this.receiver;
        KProperty[] kPropertyArr = LoanAccountDetailsScreen.Y;
        com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) tVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51871a;
        if (Intrinsics.f(str, "ID_AUTO_PAY")) {
            LoanAccountDetailsScreenContract$InputData loanAccountDetailsScreenContract$InputData = aVar.f70353r;
            if (((q35.r) zi0.c.I(((q) ((j2) aVar.B.f22677a).getValue()).f319504c)) instanceof q35.o) {
                d8l.d.t(aVar, new FeatureCommand(new LoanKompotFeatureConfig.SelectAutoPay(loanAccountDetailsScreenContract$InputData.f70343a)));
            } else {
                d8l.d.t(aVar, new FeatureCommand(new LoanKompotFeatureConfig.AutoPay(loanAccountDetailsScreenContract$InputData.f70343a, false)));
            }
        } else if (Intrinsics.f(str, "ID_BACKUP_CARD")) {
            aVar.J2();
        }
        return Unit.f186387a;
    }
}
