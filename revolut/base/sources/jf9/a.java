package jf9;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles;
import com.revolut.feature.pay_bills_taxes.api.navigation.FormDetailsDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.PhoneTopUpsDestination;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.FormFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.FormFlowContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.PaymentFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlow;
import ef9.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xo1.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ef9.e) {
            ef9.e eVar = (ef9.e) descriptor;
            return eVar.a(new FormFlow(new FormFlowContract$InputData(eVar.b().getF78678a(), eVar.b().getF78679b())));
        }
        if (descriptor instanceof c) {
            c cVar = (c) descriptor;
            return cVar.a(new FormDetailsScreen(new FormDetailsScreenContract$InputData(cVar.b().getF78677a())));
        }
        if (descriptor instanceof ef9.a) {
            ef9.a aVar = (ef9.a) descriptor;
            return aVar.a(new PaymentFlow(aVar.b()));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return PayBillsAndTaxesApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PayBillsAndTaxesDestination) {
            return new BillsRoutingFlow(((PayBillsAndTaxesDestination) destination).getF78680b());
        }
        if (destination instanceof PhoneTopUpsDestination) {
            PhoneTopUpsDestination phoneTopUpsDestination = (PhoneTopUpsDestination) destination;
            return new BillsCatalogueFlow(new BillsCatalogueFlowContract$InputData(phoneTopUpsDestination.getF78683b().getF78684a(), b.MOBILE_TOPUP, phoneTopUpsDestination.getF78683b().getF78685b()));
        }
        if (destination instanceof FormDetailsDestination) {
            return new FormDetailsScreen(new FormDetailsScreenContract$InputData(((FormDetailsDestination) destination).getF78676a().getF78677a()));
        }
        return null;
    }
}
