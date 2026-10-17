package ede;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ea2.p;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDeliveryDetailsContract$InputData f125002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f125003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f125004c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f125005g;

    public d(e eVar, ViewController viewController, CardDeliveryDetailsContract$InputData cardDeliveryDetailsContract$InputData) {
        this.f125003b = eVar;
        this.f125002a = cardDeliveryDetailsContract$InputData;
        this.f125004c = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.d = e4m.b.b(new p(eVar, this, 2, i));
        this.e = e4m.b.b(new p(eVar, this, 1, i));
        this.f = e4m.b.b(new p(eVar, this, 0, i));
        this.f125005g = e4m.b.b(new p(eVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
