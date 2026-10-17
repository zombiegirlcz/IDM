package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.DeliveryToFormScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeliveryToFormScreenContract$InputData f302215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302217c;
    public final e4m.e d = e4m.b.b(new wak.d(this, 17));

    public y(p pVar, q qVar, DeliveryToFormScreenContract$InputData deliveryToFormScreenContract$InputData) {
        this.f302216b = pVar;
        this.f302217c = qVar;
        this.f302215a = deliveryToFormScreenContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302216b.V.get(), (yji.n) this.f302217c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
