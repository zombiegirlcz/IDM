package tyh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen.OrderPriceScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderPriceScreenContract$InputData f275621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f275622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f275623c;

    public f(b bVar, c cVar, OrderPriceScreenContract$InputData orderPriceScreenContract$InputData) {
        this.f275621a = orderPriceScreenContract$InputData;
        int i = 14;
        this.f275622b = e4m.b.b(new tg5.h(bVar, this, 1, i));
        this.f275623c = e4m.b.b(new tg5.h(bVar, this, 0, i));
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
