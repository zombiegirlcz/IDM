package eo9;

import com.revolut.feature.apm.bills.bpay.api.navigation.BPayDestination;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyAttributes;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.youTransactor.uCube.rpc.Constants;
import dj0.d;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements un9.a {
    /* JADX WARN: Multi-variable type inference failed */
    public final KompotDestination b(PaymentCounterpartyInfo paymentCounterparty, m1l.a scheduleMode) {
        Intrinsics.checkNotNullParameter(paymentCounterparty, "paymentCounterparty");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        int i = a.f127873a[paymentCounterparty.f79061b.ordinal()];
        if (i == 1) {
            return new BPayDestination(paymentCounterparty, 1);
        }
        if (i == 2) {
            PaymentCounterpartyAttributes paymentCounterpartyAttributes = paymentCounterparty.i;
            return new PayBillsAndTaxesDestination(new PayBillsAndTaxesNavigation$InputData(paymentCounterpartyAttributes != null ? paymentCounterpartyAttributes.f79058a : null, 2));
        }
        if (i == 3) {
            return new PayBillsAndTaxesDestination(new PayBillsAndTaxesNavigation$InputData(paymentCounterparty.f79060a, 2));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String strA = paymentCounterparty.a("UPI_ID");
        if (strA == null) {
            strA = "";
        }
        return new UpiFeatureConfig.Destination.Transfer(new UpiFeatureConfig.Destination.Transfer.InputData.ToAlias(paymentCounterparty, strA, (d) null, (String) null, (String) null, (String) null, (Map) null, Constants.TAG_FC_SPEED_MODE), null, scheduleMode, 0 == true ? 1 : 0, 10);
    }
}
