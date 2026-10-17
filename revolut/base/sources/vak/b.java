package vak;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.pending_payments.api.PendingPaymentsToggles$ApmConsent;
import com.revolut.retail.feature.pending_payments.api.PendingPaymentsToggles$Blik;
import com.revolut.retail.feature.pending_payments.api.PendingPaymentsToggles$Multibanco;
import com.revolut.retail.feature.pending_payments.api.PendingPaymentsToggles$Wero;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetDestination;
import com.revolut.retail.feature.pending_payments.impl.ui.PendingPaymentFlow;
import com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.PendingPaymentBottomSheetFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof tak.a)) {
            return null;
        }
        tak.a aVar = (tak.a) descriptor;
        return aVar.a(new PendingPaymentFlow(aVar.f269354a, aVar.f269355b));
    }

    @Override // nte.a
    public final List e() {
        return v.k(PendingPaymentsToggles$ApmConsent.f102393c, PendingPaymentsToggles$Blik.f102394c, PendingPaymentsToggles$Multibanco.f102395c, PendingPaymentsToggles$Wero.f102396c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PendingPaymentBottomSheetDestination) {
            return new PendingPaymentBottomSheetFlow(((PendingPaymentBottomSheetDestination) destination).f102418a);
        }
        return null;
    }
}
