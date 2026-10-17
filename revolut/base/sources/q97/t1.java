package q97;

import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksBridgeFeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureInputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class t1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw9.d f243791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(t97.c productCellProvider, cw9.d paymentsProductFeatureChecker) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f243791b = paymentsProductFeatureChecker;
        this.f243792c = t97.d.PAYMENT_LINK;
    }

    @Override // r97.b
    public final Flow d() {
        return this.f243791b.f109573b.A("PAYMENT_LINKS.p2p");
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243792c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.d(new PaymentLinksBridgeFeatureConfig.BridgeDestination(new PaymentLinksFeatureInputData(hrf.f.OUTGOING)));
    }
}
