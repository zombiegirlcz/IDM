package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressFormScreenContract$InputData f302133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302135c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302137h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f302138j;
    public final wpg.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f302139l;

    public k(p pVar, q qVar, ViewController viewController, AddressFormScreenContract$InputData addressFormScreenContract$InputData) {
        this.f302134b = pVar;
        this.f302135c = qVar;
        this.f302133a = addressFormScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.e = e4m.b.b(new wpg.g(pVar, qVar, this, 2, i));
        this.f = e4m.b.b(new wpg.g(pVar, qVar, this, 1, i));
        this.f302136g = e4m.b.b(new wpg.g(pVar, qVar, this, 0, i));
        this.f302137h = e4m.b.b(new wpg.g(pVar, qVar, this, 4, i));
        this.i = e4m.b.b(new wpg.g(pVar, qVar, this, 3, i));
        this.f302138j = e4m.b.b(new wpg.g(pVar, qVar, this, 6, i));
        this.k = new wpg.g(pVar, qVar, this, 7, i);
        this.f302139l = e4m.b.b(new wpg.g(pVar, qVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302134b.V.get(), (yji.n) this.f302135c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f302136g.get(), (yji.d) this.i.get());
    }
}
