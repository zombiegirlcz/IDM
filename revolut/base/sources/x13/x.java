package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeliveryMethodsScreenContract$InputData f302212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302214c;
    public final e4m.e d;
    public final e4m.e e;

    public x(p pVar, q qVar, DeliveryMethodsScreenContract$InputData deliveryMethodsScreenContract$InputData) {
        this.f302213b = pVar;
        this.f302214c = qVar;
        this.f302212a = deliveryMethodsScreenContract$InputData;
        this.d = e4m.b.b(new wpg.g(pVar, qVar, this, 1, 6));
        this.e = e4m.b.b(new wpg.g(pVar, qVar, this, 0, 6));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302213b.V.get(), (yji.n) this.f302214c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
