package lb3;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.cash_topup.api.declaration.CashTopUpBarcodeDestination;
import com.revolut.feature.cash_topup.api.declaration.CashTopUpFlowDestination;
import com.revolut.feature.cash_topup.api.declaration.CashTopUpMapDestination;
import com.revolut.feature.cash_topup.api.declaration.CashTopUpReportIssueDestination;
import com.revolut.feature.cash_topup.impl.ui.flow.CashTopUpFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.CashTopUpFlowContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.CashTopUpFlowContract$Step;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$Step;
import com.revolut.feature.cash_topup.impl.ui.flow.map.CashTopUpMapFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.select.SelectCashTopUpFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof cb3.b)) {
            return null;
        }
        cb3.b bVar = (cb3.b) descriptor;
        return bVar.a(new SelectCashTopUpFlow(new gc3.c(bVar.b())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CashTopUpFlowDestination) {
            CashTopUpFlowDestination cashTopUpFlowDestination = (CashTopUpFlowDestination) destination;
            return new CashTopUpFlow(new CashTopUpFlowContract$InputData(cashTopUpFlowDestination.getF65580a(), cashTopUpFlowDestination.getF65581b() ? CashTopUpFlowContract$Step.SelectLocation.f65638a : CashTopUpFlowContract$Step.Entry.f65636a));
        }
        if (destination instanceof CashTopUpBarcodeDestination) {
            return new CashTopUpBarcodeFlow(new CashTopUpBarcodeFlowContract$InputData(0));
        }
        if (destination instanceof CashTopUpMapDestination) {
            return new CashTopUpMapFlow();
        }
        if (destination instanceof CashTopUpReportIssueDestination) {
            return new CashTopUpBarcodeFlow(new CashTopUpBarcodeFlowContract$InputData(new CashTopUpBarcodeFlowContract$Step.ModalStep.ReportIssue(((CashTopUpReportIssueDestination) destination).getF65583a())));
        }
        return null;
    }
}
