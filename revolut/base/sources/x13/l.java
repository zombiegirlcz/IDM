package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDeliveryAddressVerificationScreenContract$InputData f302140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302142c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302144h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f302145j;
    public final e4m.e k;

    public l(p pVar, q qVar, ViewController viewController, CardDeliveryAddressVerificationScreenContract$InputData cardDeliveryAddressVerificationScreenContract$InputData) {
        this.f302141b = pVar;
        this.f302142c = qVar;
        this.f302140a = cardDeliveryAddressVerificationScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.e = e4m.b.b(new wpg.g(pVar, qVar, this, 2, i));
        this.f = e4m.b.b(new wpg.g(pVar, qVar, this, 1, i));
        this.f302143g = e4m.b.b(new wpg.g(pVar, qVar, this, 0, i));
        this.f302144h = e4m.b.b(new wpg.g(pVar, qVar, this, 4, i));
        this.i = e4m.b.b(new wpg.g(pVar, qVar, this, 3, i));
        this.f302145j = e4m.b.b(new wpg.g(pVar, qVar, this, 6, i));
        this.k = e4m.b.b(new wpg.g(pVar, qVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302141b.V.get(), (yji.n) this.f302142c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f302143g.get(), (yji.d) this.i.get());
    }
}
