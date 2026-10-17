package mk1;

import aii.e;
import aii.g;
import aii.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.alipay.api.AlipayApi$Toggles$AlipayPlus;
import com.revolut.feature.alipay.api.navigation.AlipayDestination;
import com.revolut.feature.alipay.api.navigation.SupportedQRsControllerDescriptor;
import com.revolut.feature.alipay.impl.ui.PaymentFlow;
import com.revolut.feature.alipay.impl.ui.PaymentFlowContract$InputData;
import com.revolut.feature.alipay.impl.ui.PaymentFlowContract$StartType;
import com.revolut.feature.alipay.impl.ui.confirmation.AlipayPlusPendingPaymentDestination;
import com.revolut.feature.alipay.impl.ui.supportedqrs.SupportedQRsScreen;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerDestination;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerFlow;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f206172a;

    public a(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f206172a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        SupportedQRsControllerDescriptor supportedQRsControllerDescriptor = SupportedQRsControllerDescriptor.f61061a;
        if (Intrinsics.f(descriptor, supportedQRsControllerDescriptor)) {
            return supportedQRsControllerDescriptor.a(new SupportedQRsScreen());
        }
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(AlipayApi$Toggles$AlipayPlus.f61059c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, AlipayDestination.f61060a)) {
            return new PaymentFlow(0);
        }
        if (destination instanceof AlipayPlusWebContainerDestination) {
            return new AlipayPlusWebContainerFlow(((AlipayPlusWebContainerDestination) destination).f61098a);
        }
        if (destination instanceof AlipayPlusPendingPaymentDestination) {
            return new PaymentFlow(new PaymentFlowContract$InputData(new PaymentFlowContract$StartType.PendingPayment(((AlipayPlusPendingPaymentDestination) destination).f61070a)));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f206172a;
    }
}
