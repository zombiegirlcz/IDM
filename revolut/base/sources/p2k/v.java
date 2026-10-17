package p2k;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.PaymentVendorsBeneCreationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentVendorsBeneCreationFlowContract$InputData f232495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f232496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f232497c;
    public final v d = this;
    public final e4m.e e;

    public v(x xVar, ViewController viewController, PaymentVendorsBeneCreationFlowContract$InputData paymentVendorsBeneCreationFlowContract$InputData) {
        this.f232497c = xVar;
        this.f232495a = paymentVendorsBeneCreationFlowContract$InputData;
        this.f232496b = viewController;
        this.e = e4m.b.b(new ogf.b(xVar, this));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
