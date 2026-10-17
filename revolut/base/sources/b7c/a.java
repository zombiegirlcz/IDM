package b7c;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$InStoreDestination;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayDeferredPaymentDestination;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeTopUpDestination;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayPendingCashbackDestination;
import com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreen;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreenContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.PayWithAnyFlow;
import com.revolut.feature.revolutpay.impl.ui.flow.payment_breakdown.PaymentBreakdownFlow;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlow;
import com.revolut.feature.revolutpay.impl.ui.instore.flow.InStorePaymentFlow;
import com.revolut.feature.revolutpay.impl.ui.native_move_money.RevolutPayMoveMoneyFlow;
import com.revolut.feature.revolutpay.impl.ui.native_move_money.RevolutPayMoveMoneyFlowContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.nativetopup.RevolutPayTopUpScreen;
import com.revolut.feature.revolutpay.impl.ui.nativetopup.RevolutPayTopUpScreenContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.pending_cashback_screen.PendingCashbackScreen;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oec.d;
import w6c.i;
import w6c.k;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof i) {
            i iVar = (i) descriptor;
            return iVar.a(new PayWithAnyFlow(iVar.b()));
        }
        if (descriptor instanceof k) {
            k kVar = (k) descriptor;
            return kVar.a(new PaymentBreakdownFlow(kVar.b()));
        }
        if (descriptor instanceof d) {
            d dVar = (d) descriptor;
            return dVar.a(new ShippingContactsScreen(dVar.b()));
        }
        if (!(descriptor instanceof gdc.c)) {
            return null;
        }
        gdc.c cVar = (gdc.c) descriptor;
        return cVar.a(new AddPaymentMethodScreen(cVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return RevolutPayApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination) {
            return new SummaryFlow(((RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination) destination).getF84291a());
        }
        if (destination instanceof RevolutPayFeatureConfig$RevolutPayDeferredPaymentDestination) {
            return new DeferredPaymentScreen(new DeferredPaymentScreenContract$InputData(((RevolutPayFeatureConfig$RevolutPayDeferredPaymentDestination) destination).getF84278a()));
        }
        if (destination instanceof RevolutPayFeatureConfig$RevolutPayNativeTopUpDestination) {
            RevolutPayFeatureConfig$RevolutPayNativeTopUpDestination revolutPayFeatureConfig$RevolutPayNativeTopUpDestination = (RevolutPayFeatureConfig$RevolutPayNativeTopUpDestination) destination;
            return new RevolutPayTopUpScreen(new RevolutPayTopUpScreenContract$InputData(revolutPayFeatureConfig$RevolutPayNativeTopUpDestination.getF84289a(), revolutPayFeatureConfig$RevolutPayNativeTopUpDestination.getF84290b()));
        }
        if (destination instanceof RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination) {
            RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination = (RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination) destination;
            return new RevolutPayMoveMoneyFlow(new RevolutPayMoveMoneyFlowContract$InputData(revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.getF84284a(), revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.getF84285b(), revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.getF84286c(), revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.getD(), revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.getE()));
        }
        if (Intrinsics.f(destination, RevolutPayFeatureConfig$RevolutPayPendingCashbackDestination.f84293a)) {
            return new PendingCashbackScreen();
        }
        if (Intrinsics.f(destination, RevolutPayFeatureConfig$InStoreDestination.f84277a)) {
            return new InStorePaymentFlow();
        }
        return null;
    }
}
