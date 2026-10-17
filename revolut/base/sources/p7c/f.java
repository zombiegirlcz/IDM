package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeliveryMethodsContract$InputData f233606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233608c;

    public f(r rVar, x xVar, DeliveryMethodsContract$InputData deliveryMethodsContract$InputData) {
        this.f233606a = deliveryMethodsContract$InputData;
        int i = 18;
        this.f233607b = e4m.b.b(new p12.f0(rVar, this, 1, i));
        this.f233608c = e4m.b.b(new p12.f0(rVar, this, 0, i));
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
