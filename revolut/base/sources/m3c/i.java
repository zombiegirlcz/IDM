package m3c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolut_shop.ui.screen.payment_method.PaymentMethodScreenContract$InputData;
import java.util.Set;
import ljl.y;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethodScreenContract$InputData f202343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f202344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f202345c;

    public i(j jVar, e eVar, PaymentMethodScreenContract$InputData paymentMethodScreenContract$InputData) {
        this.f202343a = paymentMethodScreenContract$InputData;
        int i = 25;
        this.f202344b = e4m.b.b(new y(this, 1, i));
        this.f202345c = e4m.b.b(new y(this, 0, i));
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
