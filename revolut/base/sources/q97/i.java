package q97;

import com.revolut.feature.apm.bills.bpay.api.navigation.BPayDestination;
import com.revolut.feature.apm.bills.f24.api.navigation.F24Destination;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFlowDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp1.f f243708a;

    public i(t97.c productCellProvider, fp1.f billsProductProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(billsProductProvider, "billsProductProvider");
        this.f243708a = billsProductProvider;
    }

    public static ufm.b d(KompotDestination kompotDestination) {
        ufm.b bVarM = efm.d0.m(new o97.d(kompotDestination));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        t97.d[] elements = {t97.d.APM_BILLS_TAXES, t97.d.APM_BILLS_BPAY, t97.d.APM_BILLS_PAGO_PA, t97.d.BILLS_AND_TAX_PAYMENTS, t97.d.BILLS_AND_TAXES_F24};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.T(kotlin.collections.d.y0(elements), id10);
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarX = new ufm.i(this.f243708a.a(), new q3d.c(23, new h(this, 0)), 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        if (bVar == t97.d.APM_BILLS_TAXES) {
            return d(new PayBillsAndTaxesDestination(new PayBillsAndTaxesNavigation$InputData((String) null, 3)));
        }
        if (bVar == t97.d.APM_BILLS_PAGO_PA) {
            return d(new PagoPAFlowDestination(PagoPAFlowDestination.StartType.BillManualInput.f61485a));
        }
        if (bVar == t97.d.BILLS_AND_TAXES_F24) {
            return d(F24Destination.f61466a);
        }
        if (bVar != t97.d.APM_BILLS_BPAY && bVar != t97.d.BILLS_AND_TAX_PAYMENTS) {
            throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
        }
        return d(new BPayDestination((PaymentCounterpartyInfo) null, 3));
    }
}
